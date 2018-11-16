package com.fdscout.core.model.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RecallDao extends CoreDao {

	@Override
	protected String buildCreateQuery() {
		StringBuilder query = new StringBuilder();
		query.append("insert into fdscoutc_dev.fds_recall ");
		query.append("(recall_id, recall_nr, recalling_firm, reason, recall_type, ini_firm_notification, status, classification, center_class_dt, report_dt, term_dt, recall_ini_dt, event_id, code_info, more_code_info, distro_pattern) ");
		query.append("values (:beanId, :recallNumber, :recallingFirm, :reasonForRecall, :voluntaryOrMandated, :initialFirmNotification, :status, :classification, :centerClassificatonDate, :reportDate, :terminationDate, :recallInitiationDate, :eventId, :codeInfo, :moreCodeInfo, :distributionPattern) ");
		return query.toString();
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
}