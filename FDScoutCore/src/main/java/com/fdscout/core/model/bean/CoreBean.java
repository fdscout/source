package com.fdscout.core.model.bean;

import java.sql.Timestamp;

public class CoreBean {
	private long beanId;
	private int statusCode;
	private Timestamp createTime;
	private Timestamp updateTime;
	private long createUserId;
	private long updateUserId;
	
	public boolean isNew() {
		return beanId == 0l;
	}
	
	public long getBeanId() {
		return beanId;
	}
	public void setBeanId(long beanId) {
		this.beanId = beanId;
	}


	public long getCreateUserId() {
		return createUserId;
	}
	public void setCreateUserId(long createUserId) {
		this.createUserId = createUserId;
	}
	public long getUpdateUserId() {
		return updateUserId;
	}
	public void setUpdateUserId(long updateUserId) {
		this.updateUserId = updateUserId;
	}
	public Timestamp getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Timestamp createTime) {
		this.createTime = createTime;
	}
	public Timestamp getUpdateTime() {
		return updateTime;
	}
	public void setUpdateTime(Timestamp updateTime) {
		this.updateTime = updateTime;
	}
	public int getStatusCode() {
		return statusCode;
	}
	public void setStatusCode(int statusCode) {
		this.statusCode = statusCode;
	}
}
