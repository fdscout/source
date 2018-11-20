package com.fdscout.web.parser;

import com.fdscout.core.model.bean.MetaDataBean;
import com.fdscout.core.model.bean.MetaDataDeviceBean;

public class DeviceRecallDataParser extends DataParser {

	@Override
	protected MetaDataBean getMetaData() {
		return new MetaDataDeviceBean();
	}

}
