package com.fdscout.core.model.dao;

import java.util.HashMap;
import java.util.Map;

import com.fdscout.core.model.bean.MetaDataBean;
import com.fdscout.core.util.AccessFlag.BeanDaf;

public class MetaDataDao extends CoreDao {

	@Override
	protected String buildCreateQuery() {
		StringBuilder query = new StringBuilder();
		query.append("insert into fdscoutc_dev.fds_meta_data ");
		query.append("(meta_data_id, result_type_cd, last_update_dt, terms, results_skip, results_total, results_limit, license, disclaimer) ");
		query.append("values (:beanId, :resultTypeCode, :lastUpdateDate, :terms, :skippedRecordCount, :totalRecordCount, :limitRecordCount,  :license, :disclaimer) ");
		return query.toString();
	}

	@SuppressWarnings("unchecked")
	public MetaDataBean getMetaDataById(long metaDataId) {
		StringBuilder query = new StringBuilder();
		Map<String, Object> paramMap = new HashMap<String, Object>();
		query.append("select meta_data_id, result_type_cd, last_update_dt, terms, results_skip, results_total, results_limit, license, disclaimer ");
		query.append("from fds_meta_data ");
		query.append("where meta_data_id = :metaDataId ");
		paramMap.put("metaDataId", metaDataId);		
		return (MetaDataBean)namedParamJdbcTemplate.queryForObject(query.toString(), paramMap, getRowMapper().getInstance(BeanDaf.LOAD_BEAN_1));
	}

	//	@SuppressWarnings("unchecked")
//	public List<BrowserConfigBean> getBrowserConfigList() {
//		Map<String, Object> paramMap = new HashMap<String, Object>();
//		StringBuilder query = new StringBuilder();
//		query.append("SELECT config_id, name, min_version, max_version \n");
//		query.append("FROM ps_browser_config \n");
//		query.append("WHERE status_cd = :statusActive \n");
//		query.append("order by name ");
//		paramMap.put("statusActive", CoreConstants.CODE_STATUS_ACTIVE);
//		
//		return (List<BrowserConfigBean>) namedParamJdbcTemplate.query(query.toString(), paramMap,
//				rowMapper.getInstance(BeanDaf.LOAD_BEAN_1));
//	}
}