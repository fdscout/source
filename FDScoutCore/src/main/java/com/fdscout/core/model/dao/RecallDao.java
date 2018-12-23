package com.fdscout.core.model.dao;

import java.sql.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.fdscout.core.model.bean.CoreBean;
import com.fdscout.core.model.bean.RecallBean;
import com.fdscout.core.model.bean.RecallSummaryBean;
import com.fdscout.core.util.AccessFlag.BeanDaf;

public class RecallDao extends CoreDao {

	@Override
	protected String buildCreateQuery() {
		StringBuilder query = new StringBuilder();
		query.append("insert into fdscoutc_dev.fds_recall ");
		query.append("(recall_id, recall_nr, recalling_firm, reason, recall_type, ini_firm_notification, status, classification, center_class_dt, report_dt, term_dt, recall_ini_dt, event_id, code_info, more_code_info, distro_pattern) ");
		query.append("values (:beanId, :recallNumber, :recallingFirm, :reasonForRecall, :voluntaryOrMandated, :initialFirmNotification, :status, :classification, :centerClassificationDate, :reportDate, :terminationDate, :recallInitiationDate, :eventId, :codeInfo, :moreCodeInfo, :distributionPattern) ");
		return query.toString();
	}

	@Override
	public int update(CoreBean coreBean) {
		StringBuilder query = new StringBuilder();
		Map<String, Object> paramMap = new HashMap<String, Object>();
		RecallBean recall = (RecallBean) coreBean;
		query.append("update fdscoutc_dev.fds_recall ");
		query.append("set status = :status ");
		query.append("where recall_nr = :recallNumber and recalling_firm = :recallingFirm ");
		paramMap.put("recallNumber", recall.getRecallNumber());
		paramMap.put("recallingFirm", recall.getRecallingFirm());
		paramMap.put("status", recall.getStatus());
		return namedParamJdbcTemplate.update(query.toString(), paramMap);
	}
	
	public List<String> getRecallNumberSet(int recallTypeCode) {
		StringBuilder query = new StringBuilder();
		Map<String, Object> paramMap = new HashMap<String, Object>();
		query.append("select recall_nr from fds_recall a ");
		query.append("inner join fds_recall_xref b on a.recall_id = b.recall_id ");
		query.append("inner join fds_meta_data c on b.meta_data_id = c.meta_data_id ");
		query.append("and c.result_type_cd = :resultTypeCode ");
		query.append("order by a.report_dt desc "); 
		paramMap.put("resultTypeCode", recallTypeCode);
		return namedParamJdbcTemplate.queryForList(query.toString(), paramMap, String.class);
	}

	@SuppressWarnings("unchecked")
	public List<RecallBean> getRecallListByRecallNumber(String recallNumber) {
		StringBuilder query = new StringBuilder();
		Map<String, Object> paramMap = new HashMap<String, Object>();
		query.append("select recall_id, recall_nr, recalling_firm, reason, recall_type, ini_firm_notification, status, classification, center_class_dt, report_dt, term_dt, recall_ini_dt, event_id, code_info, more_code_info, distro_pattern  ");
		query.append("from fds_recall ");
		query.append("where recall_nr = :recallNumber ");
		query.append("order by recall_ini_dt desc ");
		paramMap.put("recallNumber", recallNumber);		
		return namedParamJdbcTemplate.query(query.toString(), paramMap, getRowMapper().getInstance(BeanDaf.LOAD_BEAN_1));
	}

	@SuppressWarnings("unchecked")
	public List<RecallBean> getRecallListByRecallId(String recallId) {
		StringBuilder query = new StringBuilder();
		Map<String, Object> paramMap = new HashMap<String, Object>();
		query.append("select recall_id, recall_nr, recalling_firm, reason, recall_type, ini_firm_notification, status, classification, center_class_dt, report_dt, term_dt, recall_ini_dt, event_id, code_info, more_code_info, distro_pattern  ");
		query.append("from fds_recall ");
		query.append("where recall_id = :recallId ");
		paramMap.put("recallId", recallId);		
		return namedParamJdbcTemplate.query(query.toString(), paramMap, getRowMapper().getInstance(BeanDaf.LOAD_BEAN_1));
	}

	@SuppressWarnings("unchecked")
	public List<RecallSummaryBean>  getRecallListByReportDate(Date reportDate) {
		StringBuilder query = new StringBuilder();
		Map<String, Object> paramMap = new HashMap<String, Object>();
		query.append("select a.recall_id, a.recall_nr, a.recalling_firm, a.reason, a.recall_type, a.ini_firm_notification, a.status, a.classification, ");
		query.append("a.center_class_dt, a.report_dt, a.term_dt, a.recall_ini_dt, a.event_id, a.code_info, a.more_code_info, a.distro_pattern,  ");
		query.append("c.description ");
		query.append("from fds_recall a ");
		query.append("inner join fds_recall_xref b on a.recall_id = b.recall_id ");
		query.append("inner join fds_product c on b.product_id = c.product_id ");
		query.append("where lower(a.status) = :status ");
		query.append("and a.report_dt > :recallIniDate ");
		query.append("order by a.report_dt desc ");
		paramMap.put("status", "ongoing");
		paramMap.put("reportDate", reportDate);	
		return namedParamJdbcTemplate.query(query.toString(), paramMap, getRowMapper().getInstance(BeanDaf.LOAD_BEAN_2));
	}

	@SuppressWarnings("unchecked")
	public List<RecallSummaryBean> getRecallListByKeyWord(String keyWord) {
		StringBuilder query = new StringBuilder();
		Map<String, Object> paramMap = new HashMap<String, Object>();
		query.append("select a.recall_id, a.recall_nr, a.recalling_firm, a.reason, a.recall_type, a.ini_firm_notification, a.status, a.classification, ");
		query.append("a.center_class_dt, a.report_dt, a.term_dt, a.recall_ini_dt, a.event_id, a.code_info, a.more_code_info, a.distro_pattern,  ");
		query.append("c.description ");
		query.append("from fds_recall a ");
		query.append("inner join fds_recall_xref b on a.recall_id = b.recall_id ");
		query.append("inner join fds_product c on b.product_id = c.product_id ");
		query.append("where lower(a.status) = :status ");
		query.append("and (lower(a.recalling_firm) like :keyWord or lower(a.reason) like :keyWord) ");
		query.append("order by a.recall_ini_dt desc ");
		paramMap.put("keyWord", "%" + keyWord + "%");		
		paramMap.put("status", "ongoing");
		return namedParamJdbcTemplate.query(query.toString(), paramMap, getRowMapper().getInstance(BeanDaf.LOAD_BEAN_2));
	}

}