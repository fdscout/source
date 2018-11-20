package com.fdscout.core.model.dao;

import java.util.HashMap;
import java.util.Map;

import com.fdscout.core.model.bean.ProductBean;
import com.fdscout.core.util.AccessFlag.BeanDaf;

public class ProductDao extends CoreDao {

	@Override
	protected String buildCreateQuery() {
		StringBuilder query = new StringBuilder();
		query.append("insert into fdscoutc_dev.fds_product ");
		query.append("(product_id, type, description, quantity) ");
		query.append("values (:beanId, :type, :description, :quantity) ");
		return query.toString();
	}

	@SuppressWarnings("unchecked")
	public ProductBean getProductById(long productId) {
		StringBuilder query = new StringBuilder();
		Map<String, Object> paramMap = new HashMap<String, Object>();
		query.append("select product_id, type, description, quantity ");
		query.append("from fds_product ");
		query.append("where product_id = :productId ");
		paramMap.put("productId", productId);		
		return (ProductBean)namedParamJdbcTemplate.queryForObject(query.toString(), paramMap, getRowMapper().getInstance(BeanDaf.LOAD_BEAN_1));
	}

}