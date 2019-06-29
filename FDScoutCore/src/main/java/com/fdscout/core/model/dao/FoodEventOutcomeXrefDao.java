package com.fdscout.core.model.dao;

public class FoodEventOutcomeXrefDao extends CoreDao {

	@Override
	protected String buildCreateQuery() {
		StringBuilder query = new StringBuilder();
		query.append("insert into fdscoutc_dev.fds_food_event_outcome_xref ");
		query.append("(food_event_id, food_event_outcome_id) ");
		query.append("values (:foodEventId, :foodEventOutcomeId) ");
		return query.toString();
	}

}