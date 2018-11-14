package com.fdscout.core.model.service;

import com.fdscout.core.model.bean.AddressBean;
import com.fdscout.core.model.dao.AddressDao;

public class AddressService extends CoreService {
	public void save(AddressBean address) {
		((AddressDao)getDao()).create(address);
	}
}
