package com.fdscout.core.model.bean;

import java.sql.Date;

public class MetaDataBean extends CoreBean {
	private Date lastUpdateDate;
	private String terms;
	private String license;
	private String disclaimer;
	private long skippedRecordCount;
	private long totalRecordCount;
	private long limitRecordCount;
	private int resultTypeCode;
	
	
	public int getResultTypeCode() {
		return resultTypeCode;
	}
	public void setResultTypeCode(int resultTypeCode) {
		this.resultTypeCode = resultTypeCode;
	}
	public Date getLastUpdateDate() {
		return lastUpdateDate;
	}
	public void setLastUpdateDate(Date lastUpdateDate) {
		this.lastUpdateDate = lastUpdateDate;
	}
	public String getTerms() {
		return terms;
	}
	public void setTerms(String terms) {
		this.terms = terms;
	}
	public String getLicense() {
		return license;
	}
	public void setLicense(String license) {
		this.license = license;
	}
	public String getDisclaimer() {
		return disclaimer;
	}
	public void setDisclaimer(String disclaimer) {
		this.disclaimer = disclaimer;
	}
	public long getSkippedRecordCount() {
		return skippedRecordCount;
	}
	public void setSkippedRecordCount(long skippedRecordCount) {
		this.skippedRecordCount = skippedRecordCount;
	}
	public long getTotalRecordCount() {
		return totalRecordCount;
	}
	public void setTotalRecordCount(long totalRecordCount) {
		this.totalRecordCount = totalRecordCount;
	}
	public long getLimitRecordCount() {
		return limitRecordCount;
	}
	public void setLimitRecordCount(long limitRecordCount) {
		this.limitRecordCount = limitRecordCount;
	}
}
