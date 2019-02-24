package com.fdscout.core.model.bean;

public class FoodEventReactionXrefBean extends CoreBean {
	private long foodEventId;
	private long foodEventReactionId;
	
	public long getFoodEventId() {
		return foodEventId;
	}
	public void setFoodEventId(long foodEventId) {
		this.foodEventId = foodEventId;
	}
	public long getFoodEventReactionId() {
		return foodEventReactionId;
	}
	public void setFoodEventReactionId(long foodEventReactionId) {
		this.foodEventReactionId = foodEventReactionId;
	}
	
	
}
