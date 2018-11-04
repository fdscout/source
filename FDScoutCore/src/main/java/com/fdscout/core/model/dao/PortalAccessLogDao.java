package com.fdscout.core.model.dao;

public class PortalAccessLogDao extends CoreDao {

	@Override
	protected String buildCreateQuery() {
		StringBuilder query = new StringBuilder();
		query.append("insert into ps_portal_access_log ");
		query.append("(log_id, ip_address, create_time)  ");
		query.append("values (:beanId, :ipAddress, :createTime) ");
		return query.toString();
	}
}