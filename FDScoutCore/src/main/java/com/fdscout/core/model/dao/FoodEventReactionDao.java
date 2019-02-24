package com.fdscout.core.model.dao;

import java.util.HashMap;
import java.util.Map;

public class FoodEventReactionDao extends CoreDao {

	@Override
	protected String buildCreateQuery() {
		StringBuilder query = new StringBuilder();
		query.append("insert into fdscoutc_dev.fds_food_event_reaction ");
		query.append("(food_event_reaction_id, reaction_de) ");
		query.append("values (:beanId, :reaction) ");
		return query.toString();
	}

	public long getFoodEventReactionId(String reaction) {
		StringBuilder query = new StringBuilder();
		Map<String, Object> paramMap = new HashMap<String, Object>();
		query.append("select food_event_reaction_id ");
		query.append("from fdscoutc_dev.fds_food_event_reaction ");
		query.append("where reaction_de = :reaction ");
		paramMap.put("reaction", reaction);		
		return namedParamJdbcTemplate.queryForObject(query.toString(), paramMap, Long.class);
	}

	public int getFoodEventReactionCount(String reaction) {
		StringBuilder query = new StringBuilder();
		Map<String, Object> paramMap = new HashMap<String, Object>();
		query.append("select count(food_event_reaction_id) ");
		query.append("from fdscoutc_dev.fds_food_event_reaction ");
		query.append("where reaction_de = :reaction ");
		paramMap.put("reaction", reaction);		
		return namedParamJdbcTemplate.queryForObject(query.toString(), paramMap, Integer.class);
	}
}