package com.fdscout.core.model.dao;

public class ProductDao extends CoreDao {

	@Override
	protected String buildCreateQuery() {
		StringBuilder query = new StringBuilder();
		query.append("insert into fdscoutc_dev.fds_product ");
		query.append("(product_id, type, description, quantity) ");
		query.append("values (:beanId, :type, :description, :quantity) ");
		return query.toString();
	}

}