package com.fdscout.core.model.dao;

import java.util.HashMap;
import java.util.List;
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

	public List<Long> getFoodEventReactionIdList(String reaction) {
		StringBuilder query = new StringBuilder();
		Map<String, Object> paramMap = new HashMap<String, Object>();
		query.append("select food_event_reaction_id ");
		query.append("from fdscoutc_dev.fds_food_event_reaction ");
		query.append("where reaction_de = :reaction ");
		query.append("order by create_time ");
		paramMap.put("reaction", reaction);		
		return (List<Long>)namedParamJdbcTemplate.queryForList(query.toString(), paramMap, Long.class);
	}

	public int getFoodEventReactionCount(String reaction) {
		StringBuilder query = new StringBuilder();
		Map<String, Object> paramMap = new HashMap<String, Object>();
		query.append("select count(food_event_reaction_id) ");
		query.append("from fdscoutc_dev.fds_food_event_reaction ");
		query.append("where lower(reaction_de) = :reaction ");
		paramMap.put("reaction", reaction.toLowerCase());		
		return namedParamJdbcTemplate.queryForObject(query.toString(), paramMap, Integer.class);
	}


}