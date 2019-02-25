package com.fdscout.core.model.dao;

import java.util.HashMap;
import java.util.Map;

public class FoodEventIndustryDao extends CoreDao {

	@Override
	protected String buildCreateQuery() {
		StringBuilder query = new StringBuilder();
		query.append("insert into fdscoutc_dev.fds_food_event_industry ");
		query.append("(food_event_industry_id, industry_nm, industry_cd) ");
		query.append("values (:beanId, :industry, :code) ");
		return query.toString();
	}
	
	public long getFoodEventIndustryId(String industryName, String industryCode) {
		StringBuilder query = new StringBuilder();
		Map<String, Object> paramMap = new HashMap<String, Object>();
		query.append("select food_event_industry_id ");
		query.append("from fdscoutc_dev.fds_food_event_industry ");
		query.append("where industry_nm = :industryName ");
		query.append("and industry_cd = :industryCode");
		paramMap.put("industryName", industryName);		
		paramMap.put("industryCode", industryCode);		
		return namedParamJdbcTemplate.queryForObject(query.toString(), paramMap, Long.class);
	}

	public int getFoodEventIndustryCount(String industryName, String industryCode) {
		StringBuilder query = new StringBuilder();
		Map<String, Object> paramMap = new HashMap<String, Object>();
		query.append("select count(food_event_industry_id) ");
		query.append("from fdscoutc_dev.fds_food_event_industry ");
		query.append("where industry_nm = :industryName ");
		query.append("and industry_cd = :industryCode");
		paramMap.put("industryName", industryName);		
		paramMap.put("industryCode", industryCode);		
		return namedParamJdbcTemplate.queryForObject(query.toString(), paramMap, Integer.class);
	}
}