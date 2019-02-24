package com.fdscout.core.model.service;

import java.util.List;

import com.fdscout.core.context.CoreContext;
import com.fdscout.core.model.bean.FoodEventReactionBean;
import com.fdscout.core.model.bean.FoodEventReactionXrefBean;
import com.fdscout.core.model.dao.FoodEventReactionXrefDao;

public class FoodEventReactionXrefService extends CoreService {

	public void save(long foodEventId, List<FoodEventReactionBean> foodEventReactionList) {
		if (foodEventReactionList != null) { 
			for (FoodEventReactionBean foodEventReaction : foodEventReactionList) {
				FoodEventReactionXrefBean foodEventReactionXref = new FoodEventReactionXrefBean();
				foodEventReactionXref.setFoodEventId(foodEventId);
				long foodEventReactionId = ((FoodEventReactionService)CoreContext.getBean("foodEventReactionService")).getFoodEventReactionId(foodEventReaction.getReaction());
				foodEventReactionXref.setFoodEventReactionId(foodEventReactionId);
				((FoodEventReactionXrefDao)getDao()).create(foodEventReactionXref);
			}
		}
	}
	
}
