package com.fdscout.core.model.bean;

public class FoodEventProductBean extends CoreBean {
	private String industryCode;
	private long foodEventId;
	private String nameBrand;
	private String industryName;
	private String role;
	
	public String getNameBrand() {
		return nameBrand;
	}
	public void setNameBrand(String nameBrand) {
		this.nameBrand = nameBrand;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}

	public long getFoodEventId() {
		return foodEventId;
	}
	public void setFoodEventId(long foodEventId) {
		this.foodEventId = foodEventId;
	}
	public String getIndustryCode() {
		return industryCode;
	}
	public void setIndustryCode(String industryCode) {
		this.industryCode = industryCode;
	}
	public String getIndustryName() {
		return industryName;
	}
	public void setIndustryName(String industryName) {
		this.industryName = industryName;
	}

}
