package com.fdscout.core.model.bean;

import java.sql.Date;

public class RecallBean extends CoreBean{
	private String recallNumber;
	private String recallingFirm;
	private String reasonForRecall;
	private String voluntaryOrMandated;
	private String initialFirmNotification;
	private String status;
	private String classification;
	private Date centerClassificatonDate;
	private Date reportDate;
	private Date terminationDate;
	private Date recallInitiationDate;
	private String eventId;
	private String codeInfo;
	private String moreCodeInfo;
	private String distributionPattern;

	public String getRecallNumber() {
		return recallNumber;
	}
	public void setRecallNumber(String recallNumber) {
		this.recallNumber = recallNumber;
	}
	public String getRecallingFirm() {
		return recallingFirm;
	}
	public void setRecallingFirm(String recallingFirm) {
		this.recallingFirm = recallingFirm;
	}
	public String getReasonForRecall() {
		return reasonForRecall;
	}
	public void setReasonForRecall(String reasonForRecall) {
		this.reasonForRecall = reasonForRecall;
	}
	public String getVoluntaryOrMandated() {
		return voluntaryOrMandated;
	}
	public void setVoluntaryOrMandated(String voluntaryOrMandated) {
		this.voluntaryOrMandated = voluntaryOrMandated;
	}
	public String getInitialFirmNotification() {
		return initialFirmNotification;
	}
	public void setInitialFirmNotification(String initialFirmNotification) {
		this.initialFirmNotification = initialFirmNotification;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getClassification() {
		return classification;
	}
	public void setClassification(String classification) {
		this.classification = classification;
	}
	public Date getCenterClassificatonDate() {
		return centerClassificatonDate;
	}
	public void setCenterClassificatonDate(Date centerClassificatonDate) {
		this.centerClassificatonDate = centerClassificatonDate;
	}
	public Date getReportDate() {
		return reportDate;
	}
	public void setReportDate(Date reportDate) {
		this.reportDate = reportDate;
	}
	public Date getTerminationDate() {
		return terminationDate;
	}
	public void setTerminationDate(Date terminationDate) {
		this.terminationDate = terminationDate;
	}
	public Date getRecallInitiationDate() {
		return recallInitiationDate;
	}
	public void setRecallInitiationDate(Date recallInitiationDate) {
		this.recallInitiationDate = recallInitiationDate;
	}
	public String getEventId() {
		return eventId;
	}
	public void setEventId(String eventId) {
		this.eventId = eventId;
	}
	public String getCodeInfo() {
		return codeInfo;
	}
	public void setCodeInfo(String codeInfo) {
		this.codeInfo = codeInfo;
	}
	public String getMoreCodeInfo() {
		return moreCodeInfo;
	}
	public void setMoreCodeInfo(String moreCodeInfo) {
		this.moreCodeInfo = moreCodeInfo;
	}
	public String getDistributionPattern() {
		return distributionPattern;
	}
	public void setDistributionPattern(String distributionPattern) {
		this.distributionPattern = distributionPattern;
	}
}
