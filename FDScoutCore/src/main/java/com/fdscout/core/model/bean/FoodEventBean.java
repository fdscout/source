package com.fdscout.core.model.bean;

import java.sql.Date;

public class FoodEventBean extends CoreBean {
	private long metaDataId;
	private String reportNumber;
	private Date createDate;
	private Date startDate;
	private String consumerGender;
	private int consumerAge;
	private String consumerAgeUnit;
	
	public String getReportNumber() {
		return reportNumber;
	}
	public void setReportNumber(String reportNumber) {
		this.reportNumber = reportNumber;
	}
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public String getConsumerGender() {
		return consumerGender;
	}
	public void setConsumerGender(String consumerGender) {
		this.consumerGender = consumerGender;
	}
	public int getConsumerAge() {
		return consumerAge;
	}
	public void setConsumerAge(int consumerAge) {
		this.consumerAge = consumerAge;
	}
	public String getConsumerAgeUnit() {
		return consumerAgeUnit;
	}
	public void setConsumerAgeUnit(String consumerAgeUnit) {
		this.consumerAgeUnit = consumerAgeUnit;
	}
	public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	public long getMetaDataId() {
		return metaDataId;
	}
	public void setMetaDataId(long metaDataId) {
		this.metaDataId = metaDataId;
	}
	
}
