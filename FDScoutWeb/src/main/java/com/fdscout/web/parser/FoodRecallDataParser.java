package com.fdscout.web.parser;

import com.fdscout.core.model.bean.MetaDataBean;
import com.fdscout.core.model.bean.MetaDataFoodBean;

public class FoodRecallDataParser extends DataParser {

	@Override
	protected MetaDataBean getMetaData() {
		return new MetaDataFoodBean();
	}

}
