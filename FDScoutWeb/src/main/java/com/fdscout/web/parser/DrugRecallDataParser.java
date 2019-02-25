package com.fdscout.web.parser;

import com.fdscout.core.model.bean.MetaDataBean;
import com.fdscout.core.model.bean.MetaDataDrugBean;

public class DrugRecallDataParser extends RecallDataParser {

	@Override
	protected MetaDataBean getMetaData() {
		return new MetaDataDrugBean();
	}

}
