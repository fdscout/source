package com.fdscout.core.model.bean;

public class FoodEventProductBean extends CoreBean {
	private long industryId;
	private long foodEventId;
	private String nameBrand;
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
	public long getIndustryId() {
		return industryId;
	}
	public void setIndustryId(long industryId) {
		this.industryId = industryId;
	}
	public long getFoodEventId() {
		return foodEventId;
	}
	public void setFoodEventId(long foodEventId) {
		this.foodEventId = foodEventId;
	}

}
