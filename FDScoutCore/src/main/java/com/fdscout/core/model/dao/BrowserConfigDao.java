package com.fdscout.core.model.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.fdscout.core.model.bean.BrowserConfigBean;
import com.fdscout.core.util.AccessFlag.BeanDaf;
import com.fdscout.core.util.entity.CoreConstants;

public class BrowserConfigDao extends CoreDao {

	@Override
	protected String buildCreateQuery() {
		StringBuilder query = new StringBuilder();
		query.append("insert into ps_browser_config ");
		query.append("(name, min_version, max_version,create_time) ");
		query.append("values (:name, :minVersion, :maxVersion,:createTime) ");
		return query.toString();
	}
	
	@SuppressWarnings("unchecked")
	public List<BrowserConfigBean> getBrowserConfigList() {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		StringBuilder query = new StringBuilder();
		query.append("SELECT config_id, name, min_version, max_version \n");
		query.append("FROM ps_browser_config \n");
		query.append("WHERE status_cd = :statusActive \n");
		query.append("order by name ");
		paramMap.put("statusActive", CoreConstants.CODE_STATUS_ACTIVE);
		
		return (List<BrowserConfigBean>) namedParamJdbcTemplate.query(query.toString(), paramMap,
				rowMapper.getInstance(BeanDaf.LOAD_BEAN_1));
	}
}