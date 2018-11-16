package com.fdscout.core.model.bean;

public class RecallInfoExtBean extends CoreBean {
	private long recallId;
	private int columnId;
	private String text;
	
	public long getRecallId() {
		return recallId;
	}
	public void setRecallId(long recallId) {
		this.recallId = recallId;
	}
	public int getColumnId() {
		return columnId;
	}
	public void setColumnId(int columnId) {
		this.columnId = columnId;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
}
