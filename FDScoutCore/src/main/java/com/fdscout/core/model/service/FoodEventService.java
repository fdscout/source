package com.fdscout.core.model.service;

import com.fdscout.core.model.bean.FoodEventReactionBean;
import com.fdscout.core.model.dao.FoodEventReactionDao;

public class FoodEventService extends CoreService {

	public void save(FoodEventReactionBean foodEventReaction) {
		((FoodEventReactionDao)getDao()).create(foodEventReaction);
	}
	
	public long getFoodEventReactionId(String reaction) {
		if (((FoodEventReactionDao)getDao()).getFoodEventReactionCount(reaction) > 0) {
			return ((FoodEventReactionDao)getDao()).getFoodEventReactionId(reaction);
		}
		else {
			FoodEventReactionBean foodEventReaction = new FoodEventReactionBean();
			foodEventReaction.setReaction(reaction);
			save(foodEventReaction);
			return foodEventReaction.getBeanId();
		}
	}
}	

