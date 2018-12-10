package com.fdscout.core.model.service;

import java.sql.Date;
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

	public List<RecallSummaryBean>  getRecallListByReportDate(Date reportDate) {
		return ((RecallDao)getDao()).getRecallListByReportDate(reportDate);
	}

	public List<RecallSummaryBean> getRecallListByKeyWord(String keyWord) {
		return ((RecallDao)getDao()).getRecallListByKeyWord(keyWord);
	}
	
	public int update(RecallBean recall) {
		return ((RecallDao)getDao()).update(recall);
	}

}
