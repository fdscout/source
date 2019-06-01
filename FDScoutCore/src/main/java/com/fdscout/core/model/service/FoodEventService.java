package com.fdscout.core.model.service;

import java.util.List;

import com.fdscout.core.model.bean.FoodEventBean;
import com.fdscout.core.model.dao.FoodEventDao;

public class FoodEventService extends CoreService {

	public void save(FoodEventBean foodEvent) {
		((FoodEventDao)getDao()).create(foodEvent);
	}
//	
//	public long getFoodEventReactionId(String reaction) {
//		if (((FoodEventReactionDao)getDao()).getFoodEventReactionCount(reaction) > 0) {
//			return ((FoodEventReactionDao)getDao()).getFoodEventReactionId(reaction);
//		}
//		else {
//			FoodEventReactionBean foodEventReaction = new FoodEventReactionBean();
//			foodEventReaction.setReaction(reaction);
//			save(foodEventReaction);
//			return foodEventReaction.getBeanId();
//		}
//	}
	
	public List<String> getReportNumberSet() {
		return ((FoodEventDao)getDao()).getReportNumberSet();
	}
}	

