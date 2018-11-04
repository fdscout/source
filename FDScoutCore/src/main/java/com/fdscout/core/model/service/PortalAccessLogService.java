package com.fdscout.core.model.service;

import com.fdscout.core.model.bean.RequestAddressBean;
import com.fdscout.core.model.dao.PortalAccessLogDao;

public class PortalAccessLogService extends CoreService {
	
	public void logPortalAccess(String ipAddress) {
		((PortalAccessLogDao)getDao()).create(new RequestAddressBean(ipAddress));
	}


}