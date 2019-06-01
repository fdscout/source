package com.fdscout.core.model.service;

import java.util.List;

import com.fdscout.core.model.bean.FoodEventReactionBean;
import com.fdscout.core.model.dao.FoodEventReactionDao;

public class FoodEventReactionService extends CoreService {

	public void save(FoodEventReactionBean foodEventReaction) {
		((FoodEventReactionDao)getDao()).create(foodEventReaction);
	}
	
	public long getFoodEventReactionId(String reaction) {
		switch (((FoodEventReactionDao)getDao()).getFoodEventReactionCount(reaction)) {
		case 0:
			FoodEventReactionBean foodEventReaction = new FoodEventReactionBean();
			foodEventReaction.setReaction(reaction);
			save(foodEventReaction);
			return foodEventReaction.getBeanId();
		case 1:
			return ((FoodEventReactionDao)getDao()).getFoodEventReactionId(reaction);
		default:
			List<Long> reactionIdList = ((FoodEventReactionDao)getDao()).getFoodEventReactionIdList(reaction);
			return reactionIdList.get(0);
			 
		}
	}
}	

