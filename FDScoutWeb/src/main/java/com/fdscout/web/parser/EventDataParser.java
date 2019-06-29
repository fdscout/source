package com.fdscout.web.parser;

import java.io.FileReader;
import java.io.IOException;
import java.util.List;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import com.fdscout.core.context.CoreContext;
import com.fdscout.core.model.bean.FoodEventBean;
import com.fdscout.core.model.bean.FoodEventOutcomeXrefBean;
import com.fdscout.core.model.bean.FoodEventProductBean;
import com.fdscout.core.model.bean.FoodEventReactionXrefBean;
import com.fdscout.core.model.bean.MetaDataBean;
import com.fdscout.core.model.service.FoodEventOutcomeService;
import com.fdscout.core.model.service.FoodEventOutcomeXrefService;
import com.fdscout.core.model.service.FoodEventProductService;
import com.fdscout.core.model.service.FoodEventReactionService;
import com.fdscout.core.model.service.FoodEventReactionXrefService;
import com.fdscout.core.model.service.FoodEventService;
import com.fdscout.core.model.service.MetaDataService;
import com.fdscout.core.util.CoreUtility;

import uk.ltd.getahead.dwr.util.Logger;

public abstract class EventDataParser {
	abstract protected MetaDataBean getMetaData();
	abstract protected List<String> getEventNumberSet();
	
	@SuppressWarnings("unchecked")
	public int parse(String fullFileName) {
		
		JSONParser parser = new JSONParser();
		int size = 0;
		int newRecord = 0;
		int updatededRecord = 0;
		int skippedRecord = 0;
		try {
//			JSONObject jsonFile = (JSONObject)parser.parse(new FileReader("c:\\resource\\sample.json"));
			JSONObject jsonFile = (JSONObject)parser.parse(new FileReader(fullFileName));
			List<String> eventNumberSet = ((FoodEventService)CoreContext.getBean("foodEventService")).getReportNumberSet();

			JSONArray metaArray = new JSONArray();
			metaArray.add(jsonFile.get("meta"));
			
			org.json.simple.JSONObject metaDataObject = (org.json.simple.JSONObject) metaArray.get(0);
			MetaDataBean metaData = saveMetaData(metaDataObject);
			
			JSONArray resultArray = new JSONArray();
			resultArray.add(jsonFile.get("results"));
			org.json.simple.JSONArray resultDataArray = (org.json.simple.JSONArray) resultArray.get(0);
	
			for (Object result : resultDataArray) {
				org.json.simple.JSONObject resultObject = (org.json.simple.JSONObject) result;
				
				String reportNumber = (String) resultObject.get("report_number");
				
				if (!CoreUtility.isEmpty(reportNumber) && !eventNumberSet.contains(reportNumber)){
					// food event
					FoodEventBean foodEvent = new FoodEventBean();
					foodEvent.setMetaDataId(metaData.getBeanId());
					foodEvent.setReportNumber(reportNumber);	
					foodEvent.setCreateDate(CoreUtility.getStrToSqlDate((String)resultObject.get("date_created"), "yyyyMMdd"));
					foodEvent.setStartDate(CoreUtility.getStrToSqlDate((String)resultObject.get("date_started"), "yyyyMMdd"));
					JSONObject consumer = (JSONObject) resultObject.get("consumer");
					if (consumer != null) {
						foodEvent.setConsumerGender((String)consumer.get("gender"));
						Object age = consumer.get("age");
						if (age != null) {
							foodEvent.setConsumerAge(Integer.parseInt(age.toString()));
						}
						foodEvent.setConsumerAgeUnit((String)consumer.get("age_unit"));
					}
					((FoodEventService)CoreContext.getBean("foodEventService")).save(foodEvent);
					
					// reactions
					JSONArray reactionArray = (JSONArray) resultObject.get("reactions");
					for (Object reaction : reactionArray) {
						System.out.println(reaction.toString());
						 FoodEventReactionXrefBean foodEventReactionXref = new FoodEventReactionXrefBean();
						 foodEventReactionXref.setFoodEventReactionId(((FoodEventReactionService)CoreContext.getBean("foodEventReactionService")).getFoodEventReactionId(reaction.toString()));
						 foodEventReactionXref.setFoodEventId(foodEvent.getBeanId());
						 ((FoodEventReactionXrefService)CoreContext.getBean("foodEventReactionXrefService")).save(foodEventReactionXref);
					}
					
					// outcomes
					JSONArray outcomeArray = (JSONArray) resultObject.get("outcomes");
					for (Object outcome : outcomeArray) {
						System.out.println(outcome.toString());
						 FoodEventOutcomeXrefBean foodEventOutcomeXref = new FoodEventOutcomeXrefBean();
						 foodEventOutcomeXref.setFoodEventOutcomeId(((FoodEventOutcomeService)CoreContext.getBean("foodEventOutcomeService")).getFoodEventOutcomeId(outcome.toString()));
						 foodEventOutcomeXref.setFoodEventId(foodEvent.getBeanId());
						 ((FoodEventOutcomeXrefService)CoreContext.getBean("foodEventOutcomeXrefService")).save(foodEventOutcomeXref);
					}					
					
					// products
					((FoodEventProductService)CoreContext.getBean("foodEventProductService")).deleteFoodEventProducts(foodEvent.getBeanId());
					JSONArray productArray = (JSONArray) resultObject.get("products");
					for (Object product : productArray) {
						org.json.simple.JSONObject productObject = (org.json.simple.JSONObject) product;
						FoodEventProductBean foodEventProduct = new FoodEventProductBean();
						foodEventProduct.setFoodEventId(foodEvent.getBeanId());
						foodEventProduct.setIndustryCode((String)productObject.get("industry_code"));
						foodEventProduct.setNameBrand((String)productObject.get("name_brand"));
						foodEventProduct.setRole((String)productObject.get("role"));
						foodEventProduct.setIndustryName((String)productObject.get("industry_name"));
						((FoodEventProductService)CoreContext.getBean("foodEventProductService")).save(foodEventProduct);
					}
					++newRecord;
				}
				else  {
					++skippedRecord;
					System.out.println(++size + ": " + reportNumber + " exists, skiping...");
					
				}
			}
		} catch (IOException | ParseException e) {
			e.printStackTrace();
			Logger.getLogger(this.getClass()).error(e.toString());
		}
		System.out.println("Total: " + size + ", new record: " + newRecord + ", updated record: " + updatededRecord + ", skipped record: " + skippedRecord);
		System.out.println("\n\n\n");
		return size;
	}

	
	
	
	
	
	
//	//	protected abstract MetaDataBean getMetaData();
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
//
//
//
//	private ProductBean saveProduct(org.json.simple.JSONObject resultObject) {
//		ProductBean product = new ProductBean();
//		product.setDescription(((String)resultObject.get("product_description")).replaceAll("¿", "&reg;"));
//		product.setQuantity((String)resultObject.get("product_quantity"));
//		product.setType((String)resultObject.get("product_type"));
//
//		((ProductService)CoreContext.getBean("productService")).save(product);
//		return product;
//	}
//	
//	private FoodEventBean saveFoodEvent (org.json.simple.JSONObject resultObject) {
//		
//		return null;
//	}
	
	
}
