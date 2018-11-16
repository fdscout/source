package com.fdscout.core.model.dao;

public class RecallInfoExtDao extends CoreDao {

	@Override
	protected String buildCreateQuery() {
		StringBuilder query = new StringBuilder();
		query.append("insert into fdscoutc_dev.fds_recall_info_ext ");
		query.append("(recall_info_ext_id, recall_id, column_id, text) ");
		query.append("values (:beanId, :recallId, :columnId, :text) ");
		return query.toString();
	}

}