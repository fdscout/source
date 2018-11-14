package com.fdscout.core.model.dao;

public class RecallDao extends CoreDao {

	@Override
	protected String buildCreateQuery() {
		StringBuilder query = new StringBuilder();
		query.append("insert into fdscoutc_dev.fds_recall ");
		query.append("(recall_id, recall_nr, recalling_firm, reason, recall_type, ini_firm_notification, status, classification, center_class_dt, report_dt, term_dt, recall_ini_dt, event_id, code_info, more_code_info, distro_pattern) ");
		query.append("values (:beanId, :recallNumber, :recallingFirm, :reasonForRecall, :voluntaryOrMandated, :initialFirmNotification, :status, :classification, :centerClassificatonDate, :reportDate, :terminationDate, :recallInitiationDate, :eventId, :codeInfo, :moreCodeInfo, :distributionPattern) ");
		return query.toString();
	}

}