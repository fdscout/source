package com.fdscout.core.model.dao;

public class RecallXrefDao extends CoreDao {

	@Override
	protected String buildCreateQuery() {
		StringBuilder query = new StringBuilder();
		query.append("insert into fdscoutc_dev.fds_recall_xref ");
		query.append("(recall_xref_id, metaData_id, product_id, address_id, recall_id) ");
		query.append("values (:beanId, :metaDataId, :productId, :addressId, :recallId) ");
		return query.toString();
	}

}