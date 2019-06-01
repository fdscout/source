package com.fdscout.web.parser;

import java.util.List;

import com.fdscout.core.context.CoreContext;
import com.fdscout.core.model.bean.MetaDataBean;
import com.fdscout.core.model.bean.MetaDataFoodBean;
import com.fdscout.core.model.service.FoodEventService;

public class FoodEventDataParser extends EventDataParser {

	@Override
	protected MetaDataBean getMetaData() {
		return new MetaDataFoodBean();
	}

	protected List<String> getEventNumberSet() {
		return ((FoodEventService)CoreContext.getBean("foodEventService")).getReportNumberSet();
	}
}
