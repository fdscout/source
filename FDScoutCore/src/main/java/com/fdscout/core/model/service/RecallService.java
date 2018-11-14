package com.fdscout.core.model.service;

import com.fdscout.core.model.bean.RecallBean;
import com.fdscout.core.model.dao.RecallDao;

public class RecallService extends CoreService {
	public void save(RecallBean recall) {
		((RecallDao)getDao()).create(recall);
	}

}
