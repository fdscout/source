package com.fdscout.core.util.parser;

public class FoodRecallRecordParser {
//	public void testParser() {
//		JSONParser parser = new JSONParser();
//		try {
//			JSONObject jsonFile = (JSONObject)parser.parse(new FileReader("c:\\resource\\sample.json"));
//
//			JSONArray metaArray = new JSONArray();
//			metaArray.add(jsonFile.get("meta"));
//			org.json.simple.JSONObject metaDataObject = (org.json.simple.JSONObject) metaArray.get(0);
//				MetaDataBean metaData = new MetaDataFoodBean();
//				metaData.setLastUpdateDate(CoreUtility.getStrToSqlDate((String)metaDataObject.get("last_updated"), "yyyy-MM-dd"));
//				metaData.setTerms((String)metaDataObject.get("terms"));
//				metaData.setLicense((String)metaDataObject.get("license"));
//				metaData.setDisclaimer((String)metaDataObject.get("disclaimer"));
//				org.json.simple.JSONObject resultCounts = (org.json.simple.JSONObject)metaDataObject.get("results");
//				metaData.setTotalRecordCount((Long)resultCounts.get("total"));
//				metaData.setSkippedRecordCount((Long)resultCounts.get("skip"));
//				metaData.setLimitRecordCount((Long)resultCounts.get("limit"));
//				
//				((MetaDataService)CoreContext.getBean("metaDataService")).save(metaData);
//				
//				System.out.println(metaDataObject.get("last_updated"));	
//				System.out.println(metaDataObject.get("terms"));	
//				System.out.println(metaDataObject.get("license"));	
//				System.out.println(metaDataObject.get("disclaimer"));	
//				
//				
//				System.out.println(resultCounts.get("skip"));	
//				System.out.println(resultCounts.get("total"));
//				System.out.println(resultCounts.get("limit"));	
//			
//			JSONArray resultArray = new JSONArray();
//			resultArray.add(jsonFile.get("results"));
//			org.json.simple.JSONArray resultDataArray = (org.json.simple.JSONArray) resultArray.get(0);
//			for (Object result : resultDataArray) {
//				org.json.simple.JSONObject resultObject = (org.json.simple.JSONObject) result;
//				RecallXrefBean recallXref = new RecallXrefBean();
//				recallXref.getRecall().setClassification((String)resultObject.get("classification"));
//				
//				System.out.println(resultObject.get("classification"));
//				System.out.println(resultObject.get("country"));
//				System.out.println(resultObject.get("city"));
//				System.out.println(resultObject.get("reason_for_recall"));
//				System.out.println(resultObject.get("address_1"));
//				System.out.println(resultObject.get("address_2"));
//				System.out.println(resultObject.get("code_info"));
//				System.out.println(resultObject.get("product_quantity"));
//				System.out.println(resultObject.get("center_classification_date"));
//				System.out.println(resultObject.get("distribution_pattern"));
//				System.out.println(resultObject.get("state"));
//				System.out.println(resultObject.get("product_description"));
//				System.out.println(resultObject.get("report_date"));
//				System.out.println(resultObject.get("classification"));
//				System.out.println(resultObject.get("openfda"));
//				System.out.println(resultObject.get("recall_number"));
//				System.out.println(resultObject.get("recalling_firm"));
//				System.out.println(resultObject.get("initial_firm_notification"));
//				System.out.println(resultObject.get("event_id"));
//				System.out.println(resultObject.get("product_type"));
//				System.out.println(resultObject.get("termination_date"));
//				System.out.println(resultObject.get("more_code_info"));
//				System.out.println(resultObject.get("recall_initiation_date"));
//				System.out.println(resultObject.get("postal_code"));
//				System.out.println(resultObject.get("voluntary_mandated"));
//				System.out.println(resultObject.get("status"));
//				System.out.println("---------------------------------------------");
//			}
//			System.out.println(jsonFile);
//
//		} catch (IOException | ParseException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//
//
//		}

}
