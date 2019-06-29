package com.fdscout.core.model.dao;

import java.util.HashMap;
import java.util.Map;

public class FoodEventProductDao extends CoreDao {

	@Override
	protected String buildCreateQuery() {
		StringBuilder query = new StringBuilder();
		query.append("insert into fdscoutc_dev.fds_food_event_product ");
		query.append("(food_event_product_id, food_event_id, industry_cd, name_brand, industry_nm, role) ");
		query.append("values (:beanId, :foodEventId, :industryCode, :nameBrand, :industryName, :role) ");
		return query.toString();
	}
	
	
//	
////	food_event_product_id, food_event_id, industry_id, name_brand, role
//
//
	public int deleteFoodEventProducts(long foodEventId) {
		StringBuilder query = new StringBuilder();
		Map<String, Object> paramMap = new HashMap<String, Object>();
		query.append("delete from fdscoutc_dev.fds_food_event_product ");
		query.append("where food_event_id = :foodEventId ");
		paramMap.put("foodEventId", foodEventId);		
		return namedParamJdbcTemplate.update(query.toString(), paramMap);
	}
//
//	public int getFoodEventOutcomeCount(String outcome) {
//		StringBuilder query = new StringBuilder();
//		Map<String, Object> paramMap = new HashMap<String, Object>();
//		query.append("select count(food_event_outcome_id) ");
//		query.append("from fdscoutc_dev.fds_food_event_outcome ");
//		query.append("where outcome_de = :outcome ");
//		paramMap.put("outcome", outcome);		
//		return namedParamJdbcTemplate.queryForObject(query.toString(), paramMap, Integer.class);
//	}
}