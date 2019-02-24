package com.fdscout.core.model.bean;

public class FoodEventProductBean extends CoreBean {
	private long industry;
	private String nameBrand;
	private String industryCode;
	private String role;
	
	public long getIndustry() {
		return industry;
	}
	public void setIndustry(long industry) {
		this.industry = industry;
	}
	public String getNameBrand() {
		return nameBrand;
	}
	public void setNameBrand(String nameBrand) {
		this.nameBrand = nameBrand;
	}
	public String getIndustryCode() {
		return industryCode;
	}
	public void setIndustryCode(String industryCode) {
		this.industryCode = industryCode;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}

}
