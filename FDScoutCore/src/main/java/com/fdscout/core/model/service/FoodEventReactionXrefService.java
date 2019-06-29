package com.fdscout.core.model.service;

import com.fdscout.core.model.bean.FoodEventReactionXrefBean;
import com.fdscout.core.model.dao.FoodEventReactionXrefDao;

public class FoodEventReactionXrefService extends CoreService {

	public void save(FoodEventReactionXrefBean foodEventReactionXref) {
		((FoodEventReactionXrefDao)getDao()).create(foodEventReactionXref);
	}
	
}
