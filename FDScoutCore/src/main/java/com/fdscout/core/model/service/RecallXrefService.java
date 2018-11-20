package com.fdscout.core.model.service;

import com.fdscout.core.model.bean.RecallXrefBean;
import com.fdscout.core.model.dao.RecallXrefDao;

public class RecallXrefService extends CoreService {
	public void save(RecallXrefBean recallXref) {
		((RecallXrefDao)getDao()).create(recallXref);
	}
	
	public RecallXrefBean getRecallXrefByRecall(long recallId) {
		return ((RecallXrefDao)getDao()).getRecallXrefByRecall(recallId);
	}
}
