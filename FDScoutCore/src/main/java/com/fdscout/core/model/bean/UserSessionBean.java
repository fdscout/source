package com.fdscout.core.model.bean;

import java.sql.Timestamp;

public class UserSessionBean extends CoreBean {
	private long userId;
	private String sessionId;
	private Timestamp lastRquestTime;
	private Timestamp lastProcedureTime;
	
	public long getUserId() {
		return userId;
	}
	public void setUserId(long userId) {
		this.userId = userId;
	}
	public String getSessionId() {
		return sessionId;
	}
	public void setSessionId(String sessionId) {
		this.sessionId = sessionId;
	}
	public Timestamp getLastRquestTime() {
		return lastRquestTime;
	}
	public void setLastRquestTime(Timestamp lastRquestTime) {
		this.lastRquestTime = lastRquestTime;
	}
	public Timestamp getLastProcedureTime() {
		return lastProcedureTime;
	}
	public void setLastProcedureTime(Timestamp lastProcedureTime) {
		this.lastProcedureTime = lastProcedureTime;
	}
}
