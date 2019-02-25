package com.fdscout.core.model.dao;

import java.util.HashMap;
import java.util.Map;

public class FoodEventOutcomeXrefDao extends CoreDao {

	@Override
	protected String buildCreateQuery() {
		StringBuilder query = new StringBuilder();
		query.append("insert into fdscoutc_dev.fds_food_event_outcome ");
		query.append("(food_event_outcome_id, outcome_de) ");
		query.append("values (:beanId, :outcome) ");
		return query.toString();
	}

	public long getFoodEventOutcomeId(String outcome) {
		StringBuilder query = new StringBuilder();
		Map<String, Object> paramMap = new HashMap<String, Object>();
		query.append("select food_event_outcome_id ");
		query.append("from fdscoutc_dev.fds_food_event_outcome ");
		query.append("where outcome_de = :outcome ");
		paramMap.put("outcome", outcome);		
		return namedParamJdbcTemplate.queryForObject(query.toString(), paramMap, Long.class);
	}

	public int getFoodEventOutcomeCount(String outcome) {
		StringBuilder query = new StringBuilder();
		Map<String, Object> paramMap = new HashMap<String, Object>();
		query.append("select count(food_event_outcome_id) ");
		query.append("from fdscoutc_dev.fds_food_event_outcome ");
		query.append("where outcome_de = :outcome ");
		paramMap.put("outcome", outcome);		
		return namedParamJdbcTemplate.queryForObject(query.toString(), paramMap, Integer.class);
	}
}