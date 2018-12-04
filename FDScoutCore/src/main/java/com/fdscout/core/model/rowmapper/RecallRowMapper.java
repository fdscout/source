package com.fdscout.core.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.fdscout.core.model.bean.RecallBean;
import com.fdscout.core.model.bean.RecallSummaryBean;

public class RecallRowMapper extends CoreRowMapper {

	@Override
	protected  Object getBean1(ResultSet rs, int rowCount) throws SQLException{
		RecallBean recall = new RecallBean();
		recall.setBeanId(rs.getLong("recall_id"));
		recall.setRecallNumber(rs.getString("recall_nr"));
		recall.setRecallingFirm(rs.getString("recalling_firm"));
		recall.setReasonForRecall(rs.getString("reason"));
		recall.setVoluntaryOrMandated(rs.getString("recall_type"));
		recall.setInitialFirmNotification(rs.getString("ini_firm_notification"));
		recall.setStatus(rs.getString("status"));
		recall.setClassification(rs.getString("classification"));
		recall.setCenterClassificationDate(rs.getDate("center_class_dt"));
		recall.setReportDate(rs.getDate("report_dt"));
		recall.setTerminationDate(rs.getDate("term_dt"));
		recall.setRecallInitiationDate(rs.getDate("recall_ini_dt"));
		recall.setEventId(rs.getString("event_id"));
		recall.setCodeInfo(rs.getString("code_info"));
		recall.setMoreCodeInfo(rs.getString("more_code_info"));
		recall.setDistributionPattern(rs.getString("distro_pattern"));
		return recall;
	}
	
	@Override
	protected  Object getBean2(ResultSet rs, int rowCount) throws SQLException{
		RecallSummaryBean recallSummary = new  RecallSummaryBean();
		recallSummary.setRecall((RecallBean) getBean1(rs, rowCount));
		recallSummary.setProductDesc(rs.getString("description"));
		return recallSummary;
	}

}
