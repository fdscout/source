package com.fdscout.core.model.dao;

public class FoodEventReactionXrefDao extends CoreDao {

	@Override
	protected String buildCreateQuery() {
		StringBuilder query = new StringBuilder();
		query.append("insert into fdscoutc_dev.fds_food_event_reaction_xref ");
		query.append("(food_event_id, food_event_reaction_id) ");
		query.append("values (:foodEventId, :foodEventReactionId) ");
		return query.toString();
	}


}