package com.fdscout.core.model.bean;

public class PhoneBean extends CoreBean {
	private int typeCode;
	private String number;
	private String extention;
	private int cellFlag;
	
	public boolean isCellNumber() {
		return cellFlag == 1;
	}
	
	public int getTypeCode() {
		return typeCode;
	}
	public void setTypeCode(int typeCode) {
		this.typeCode = typeCode;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getExtention() {
		return extention;
	}
	public void setExtention(String extention) {
		this.extention = extention;
	}
	
	public int getCellFlag() {
		return cellFlag;
	}
	public void setCellFlag(int cellFlag) {
		this.cellFlag = cellFlag;
	}

	
}
