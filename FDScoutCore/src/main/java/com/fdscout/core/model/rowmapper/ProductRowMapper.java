package com.fdscout.core.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.fdscout.core.model.bean.ProductBean;

public class ProductRowMapper extends CoreRowMapper {
	@Override
	protected  Object getBean1(ResultSet rs, int rowCount) throws SQLException{
		ProductBean product = new ProductBean();
		product.setBeanId(rs.getLong("product_id"));
		product.setType(rs.getString("type"));
		product.setDescription(rs.getString("description"));
		product.setQuantity(rs.getString("quantity"));
		return product;
	}
}
