package com.fdscout.core.model.service;

import java.util.List;

import com.fdscout.core.model.bean.RecallBean;
import com.fdscout.core.model.bean.RecallInfoExtBean;
import com.fdscout.core.model.dao.RecallInfoExtDao;

public class RecallInfoExtService extends CoreService {
	public void save(List<RecallInfoExtBean> recallInfoExtList, RecallBean recall) {
		for (RecallInfoExtBean reallInfoExt : recallInfoExtList) {
			reallInfoExt.setRecallId(recall.getBeanId());
			((RecallInfoExtDao)getDao()).create(reallInfoExt);	
		}
		
	}
}
