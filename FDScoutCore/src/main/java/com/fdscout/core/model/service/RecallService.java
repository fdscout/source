package com.fdscout.core.model.service;

import java.util.List;

import com.fdscout.core.model.bean.RecallBean;
import com.fdscout.core.model.bean.RecallSummaryBean;
import com.fdscout.core.model.dao.RecallDao;

public class RecallService extends CoreService {
	public void save(RecallBean recall) {
		((RecallDao)getDao()).create(recall);
	}

	public List<String> getRecallNumberSet(int recallTypeCode) {
		return ((RecallDao)getDao()).getRecallNumberSet(recallTypeCode);
	}
	
	public List<RecallBean> getRecallListByRecallNumber(String recallNumber) {
		return ((RecallDao)getDao()).getRecallListByRecallNumber(recallNumber);
	}

	public List<RecallBean> getRecallListByRecallId(String recallId) {
		return ((RecallDao)getDao()).getRecallListByRecallId(recallId);
	}

	public List<RecallSummaryBean> getRecallListByKeyWord(String keyWord) {
		return ((RecallDao)getDao()).getRecallListByKeyWord(keyWord);
	}

}
