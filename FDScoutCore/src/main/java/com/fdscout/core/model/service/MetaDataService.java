package com.fdscout.core.model.service;

import com.fdscout.core.model.bean.MetaDataBean;
import com.fdscout.core.model.dao.MetaDataDao;

public class MetaDataService extends CoreService {
	public void test() {
		System.out.println("from metaDataService");
		
	}
	
	public MetaDataBean getMetaDataById(long metaDataId) {
		return ((MetaDataDao)getDao()).getMetaDataById(metaDataId);
	}
}
