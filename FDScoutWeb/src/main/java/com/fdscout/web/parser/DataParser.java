package com.fdscout.web.parser;

import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import com.fdscout.core.context.CoreContext;
import com.fdscout.core.model.bean.AddressBean;
import com.fdscout.core.model.bean.MetaDataBean;
import com.fdscout.core.model.bean.ProductBean;
import com.fdscout.core.model.bean.RecallBean;
import com.fdscout.core.model.bean.RecallXrefBean;
import com.fdscout.core.model.service.AddressService;
import com.fdscout.core.model.service.MetaDataService;
import com.fdscout.core.model.service.ProductService;
import com.fdscout.core.model.service.RecallService;
import com.fdscout.core.model.service.RecallXrefService;
import com.fdscout.core.util.CoreUtility;

import uk.ltd.getahead.dwr.util.Logger;

public abstract class DataParser {
	protected abstract MetaDataBean getMetaData();
	private MetaDataBean saveMetaData(org.json.simple.JSONObject metaDataObject) {
		MetaDataBean metaData = getMetaData();
		metaData.setLastUpdateDate(CoreUtility.getStrToSqlDate((String)metaDataObject.get("last_updated"), "yyyy-MM-dd"));
		metaData.setTerms((String)metaDataObject.get("terms"));
		metaData.setLicense((String)metaDataObject.get("license"));
		metaData.setDisclaimer((String)metaDataObject.get("disclaimer"));
		org.json.simple.JSONObject resultCounts = (org.json.simple.JSONObject)metaDataObject.get("results");
		metaData.setTotalRecordCount((Long)resultCounts.get("total"));
		metaData.setSkippedRecordCount((Long)resultCounts.get("skip"));
		metaData.setLimitRecordCount((Long)resultCounts.get("limit"));
		
		((MetaDataService)CoreContext.getBean("metaDataService")).save(metaData);
		return metaData;
	}

	private AddressBean saveAddress(org.json.simple.JSONObject resultObject) {
		AddressBean address = new AddressBean();
		address.setAddress1((String)resultObject.get("address_1"));
		address.setAddress2((String)resultObject.get("address_2"));
		address.setCity((String)resultObject.get("city"));
		address.setState((String)resultObject.get("state"));
		address.setCountry((String)resultObject.get("country"));
		address.setPostalCode((String)resultObject.get("postal_code"));
		((AddressService)CoreContext.getBean("addressService")).save(address);
		return address;
	}

	private ProductBean saveProduct(org.json.simple.JSONObject resultObject) {
		ProductBean product = new ProductBean();
		product.setDescription((String)resultObject.get("product_description"));
		product.setQuantity((String)resultObject.get("product_quantity"));
		product.setType((String)resultObject.get("product_type"));

		((ProductService)CoreContext.getBean("productService")).save(product);
		return product;
	}
	
	private RecallBean saveRecall (org.json.simple.JSONObject resultObject) {
		RecallBean recall = new RecallBean();
		System.out.print(resultObject.get("code_info").toString().length() + "...");
		recall.setRecallNumber((String)resultObject.get("recall_number"));
		recall.setRecallingFirm((String)resultObject.get("recalling_firm"));
		recall.setReasonForRecall((String)resultObject.get("reason_for_recall"));
		recall.setVoluntaryOrMandated((String)resultObject.get("voluntary_mandated"));
		recall.setInitialFirmNotification((String)resultObject.get("initial_firm_notification"));
		recall.setStatus((String)resultObject.get("status"));
		recall.setClassification((String)resultObject.get("classification"));
		recall.setCenterClassificatonDate(CoreUtility.getStrToSqlDate((String)resultObject.get("center_classification_date"), "yyyyMMdd"));
		recall.setReportDate(CoreUtility.getStrToSqlDate((String)resultObject.get("report_date"), "yyyyMMdd"));
		recall.setTerminationDate(CoreUtility.getStrToSqlDate((String)resultObject.get("termination_date"), "yyyyMMdd"));
		recall.setRecallInitiationDate(CoreUtility.getStrToSqlDate((String)resultObject.get("recall_initiation_date"), "yyyyMMdd"));
		recall.setEventId((String)resultObject.get("event_id"));
		if (resultObject.get("code_info").toString().length() > 25000) {
			recall.setCodeInfo(resultObject.get("code_info").toString().substring(0, 25000));
			recall.setMoreCodeInfo(resultObject.get("code_info").toString().substring(25000));
			if (resultObject.get("more_code_info") != null) {
				recall.setMoreCodeInfo(recall.getMoreCodeInfo() + resultObject.get("more_code_info").toString());
			}
		}
		else {
			recall.setCodeInfo((String)resultObject.get("code_info"));
			recall.setMoreCodeInfo((String)resultObject.get("more_code_info"));
		}	
		recall.setDistributionPattern((String)resultObject.get("distribution_pattern"));
		((RecallService)CoreContext.getBean("recallService")).save(recall);
		return recall;
	}
	
	@SuppressWarnings("unchecked")
	public int parse(String fullFileName) {
		JSONParser parser = new JSONParser();
		int size = 0;
		try {
//			JSONObject jsonFile = (JSONObject)parser.parse(new FileReader("c:\\resource\\sample.json"));
			JSONObject jsonFile = (JSONObject)parser.parse(new FileReader(fullFileName));

			JSONArray metaArray = new JSONArray();
			metaArray.add(jsonFile.get("meta"));
			
			org.json.simple.JSONObject metaDataObject = (org.json.simple.JSONObject) metaArray.get(0);
			MetaDataBean metaData = saveMetaData(metaDataObject);
			
			JSONArray resultArray = new JSONArray();
			resultArray.add(jsonFile.get("results"));
			org.json.simple.JSONArray resultDataArray = (org.json.simple.JSONArray) resultArray.get(0);
			int i = 0;
			for (Object result : resultDataArray) {
				RecallXrefBean recallXref = new RecallXrefBean();
				org.json.simple.JSONObject resultObject = (org.json.simple.JSONObject) result;
				AddressBean address = saveAddress(resultObject);
				ProductBean product = saveProduct(resultObject);
				RecallBean recall = saveRecall(resultObject);
				
				recallXref.setMetaDataId(metaData.getBeanId());
				recallXref.setAddressId(address.getBeanId());
				recallXref.setProductId(product.getBeanId());
				recallXref.setRecallId(recall.getBeanId());
				((RecallXrefService)CoreContext.getBean("recallXrefService")).save(recallXref);
				
				System.out.println(i++ + ": "  + recall.getRecallNumber() + " - " + product.getDescription());
			}
			size = resultDataArray.size();

		} catch (IOException | ParseException e) {
			e.printStackTrace();
			Logger.getLogger(this.getClass()).error(e.toString());
		}
		return size;
	}
}
