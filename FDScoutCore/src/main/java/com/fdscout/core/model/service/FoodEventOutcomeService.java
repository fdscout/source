package com.fdscout.core.model.service;

import java.util.List;

import com.fdscout.core.model.bean.FoodEventOutcomeBean;
import com.fdscout.core.model.dao.FoodEventOutcomeDao;

public class FoodEventOutcomeService extends CoreService {

	public void save(FoodEventOutcomeBean foodEventOutcome) {
		((FoodEventOutcomeDao)getDao()).create(foodEventOutcome);
	}
	
	public long getFoodEventOutcomeId(String outcome) {
		switch (((FoodEventOutcomeDao)getDao()).getFoodEventOutcomeCount(outcome)) {
		case 0:
			FoodEventOutcomeBean foodEventOutcome = new FoodEventOutcomeBean();
			foodEventOutcome.setOutcome(outcome);
			save(foodEventOutcome);
			return foodEventOutcome.getBeanId();
		case 1:
			return ((FoodEventOutcomeDao)getDao()).getFoodEventOutcomeId(outcome);
		default:
			List<Long> outcomeIdList = ((FoodEventOutcomeDao)getDao()).getFoodEventOutcomeIdList(outcome);
			return outcomeIdList.get(0);
			 
		}
	}
}	

