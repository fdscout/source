package com.fdscout.core.model.dao;

public class MetaDataDao extends CoreDao {

	@Override
	protected String buildCreateQuery() {
		StringBuilder query = new StringBuilder();
		query.append("insert into fdscoutc_dev.fds_meta_data ");
		query.append("(meta_data_id, last_update_dt, terms, results_skip, results_total, results_limit, license, disclaimer, create_time) ");
		query.append("values (:beanId, :lastUpdateDate, :terms, :skippedRecordCount, :totalRecordCount, :limitRecordCount,  :license, :disclaimer, :createTime) ");
		return query.toString();
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