package com.fdscout.core.model.service;

import com.fdscout.core.model.bean.FoodEventIndustryBean;
import com.fdscout.core.model.dao.FoodEventIndustryDao;

public class FoodEventIndustryService extends CoreService {

	public void save(FoodEventIndustryBean foodEventIndustry) {
		((FoodEventIndustryDao)getDao()).create(foodEventIndustry);
	}
	
	public long getFoodEventIndustryId(String industryName, String industryCode) {
		if (((FoodEventIndustryDao)getDao()).getFoodEventIndustryCount(industryName, industryCode) > 0) {
			return ((FoodEventIndustryDao)getDao()).getFoodEventIndustryId(industryName, industryCode);
		}
		else {
			FoodEventIndustryBean foodEventIndustry = new FoodEventIndustryBean();
			foodEventIndustry.setIndustry(industryName);
			foodEventIndustry.setCode(industryCode);
			save(foodEventIndustry);
			return foodEventIndustry.getBeanId();
		}
	}
}	

