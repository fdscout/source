package com.fdscout.core.model.dao;

public class AddressDao extends CoreDao {

	@Override
	protected String buildCreateQuery() {
		StringBuilder query = new StringBuilder();
		query.append("insert into fdscoutc_dev.fds_address ");
		query.append("(address_id, street_1, street_2, city, state, country, postal_cd) ");
		query.append("values (:beanId, :address1, :address2, :city, :state, :country, :postalCode) ");
		return query.toString();
	}

}