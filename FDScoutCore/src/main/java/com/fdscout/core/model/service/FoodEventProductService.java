package com.fdscout.core.model.service;

import com.fdscout.core.model.bean.FoodEventProductBean;
import com.fdscout.core.model.dao.FoodEventProductDao;

public class FoodEventProductService extends CoreService {

	public void save(FoodEventProductBean foodEventProduct) {
		((FoodEventProductDao)getDao()).create(foodEventProduct);
	}
	
}	

