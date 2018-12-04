package com.fdscout.core.model.bean;

public class RecallSummaryBean extends RecallSearchResultBean{
	private String productDesc;
	private String disclaimer;

	public String getProductShortDesc() {
		int numberOfCharToDisplay = 100;
		if (productDesc != null) {
			return productDesc.length() > numberOfCharToDisplay ? (productDesc.substring(0, numberOfCharToDisplay) + "...") : productDesc;
		}
		return "";
	}

	public String getRecallReasonShortDesc() {
		int numberOfCharToDisplay = 100;
		if (getRecall().getReasonForRecall() != null) {
			return getRecall().getReasonForRecall().length() > numberOfCharToDisplay ? (getRecall().getReasonForRecall().substring(0, numberOfCharToDisplay) + "...") : getRecall().getReasonForRecall();
		}
		return "";
	}
	
	public String getProductDesc() {
		return productDesc;
	}
	public void setProductDesc(String productDesc) {
		this.productDesc = productDesc;
	}
	public String getDisclaimer() {
		return disclaimer;
	}
	public void setDisclaimer(String disclaimer) {
		this.disclaimer = disclaimer;
	}
}
