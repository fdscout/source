package com.fdscout.core.model.service;

import com.fdscout.core.model.bean.FoodEventOutcomeXrefBean;
import com.fdscout.core.model.dao.FoodEventOutcomeXrefDao;

public class FoodEventOutcomeXrefService extends CoreService {

	public void save(FoodEventOutcomeXrefBean foodEventOutcomeXref) {
		((FoodEventOutcomeXrefDao)getDao()).create(foodEventOutcomeXref);
	}
	
}
