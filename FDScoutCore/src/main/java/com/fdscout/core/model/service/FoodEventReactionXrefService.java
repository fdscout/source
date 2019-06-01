package com.fdscout.core.model.service;

import com.fdscout.core.model.bean.FoodEventReactionXrefBean;
import com.fdscout.core.model.dao.FoodEventReactionXrefDao;

public class FoodEventReactionXrefService extends CoreService {

	public void save(FoodEventReactionXrefBean foodEventReactionXref) {
		((FoodEventReactionXrefDao)getDao()).create(foodEventReactionXref);
//		if (foodEventReactionList != null) { 
//			for (FoodEventReactionBean foodEventReaction : foodEventReactionList) {
//				FoodEventReactionXrefBean foodEventReactionXref = new FoodEventReactionXrefBean();
//				foodEventReactionXref.setFoodEventId(foodEventId);
//				long foodEventReactionId = ((FoodEventReactionService)CoreContext.getBean("foodEventReactionService")).getFoodEventReactionId(foodEventReaction.getReaction());
//				foodEventReactionXref.setFoodEventReactionId(foodEventReactionId);
//				((FoodEventReactionXrefDao)getDao()).create(foodEventReactionXref);
//			}
//		}
	}
	
}
