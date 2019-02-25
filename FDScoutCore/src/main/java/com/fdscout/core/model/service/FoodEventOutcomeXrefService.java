package com.fdscout.core.model.service;

import java.util.List;

import com.fdscout.core.context.CoreContext;
import com.fdscout.core.model.bean.FoodEventOutcomeBean;
import com.fdscout.core.model.bean.FoodEventOutcomeXrefBean;
import com.fdscout.core.model.dao.FoodEventOutcomeXrefDao;

public class FoodEventOutcomeXrefService extends CoreService {

	public void save(long foodEventId, List<FoodEventOutcomeBean> foodEventOutcomeList) {
		if (foodEventOutcomeList != null) { 
			for (FoodEventOutcomeBean foodEventOutcome : foodEventOutcomeList) {
				FoodEventOutcomeXrefBean foodEventOutcomeXref = new FoodEventOutcomeXrefBean();
				foodEventOutcomeXref.setFoodEventId(foodEventId);
				long foodEventOutcomeId = ((FoodEventOutcomeService)CoreContext.getBean("foodEventOutcomeService")).getFoodEventOutcomeId(foodEventOutcome.getOutcome());
				foodEventOutcomeXref.setFoodEventOutcomeId(foodEventOutcomeId);
				((FoodEventOutcomeXrefDao)getDao()).create(foodEventOutcomeXref);
			}
		}
	}
	
}
