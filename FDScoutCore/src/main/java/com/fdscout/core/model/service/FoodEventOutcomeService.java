package com.fdscout.core.model.service;

import com.fdscout.core.model.bean.FoodEventOutcomeBean;
import com.fdscout.core.model.dao.FoodEventOutcomeDao;

public class FoodEventOutcomeService extends CoreService {

	public void save(FoodEventOutcomeBean foodEventOutcome) {
		((FoodEventOutcomeDao)getDao()).create(foodEventOutcome);
	}
	
	public long getFoodEventOutcomeId(String outcome) {
		if (((FoodEventOutcomeDao)getDao()).getFoodEventOutcomeCount(outcome) > 0) {
			return ((FoodEventOutcomeDao)getDao()).getFoodEventOutcomeId(outcome);
		}
		else {
			FoodEventOutcomeBean foodEventOutcome = new FoodEventOutcomeBean();
			foodEventOutcome.setOutcome(outcome);
			save(foodEventOutcome);
			return foodEventOutcome.getBeanId();
		}
	}
}	

