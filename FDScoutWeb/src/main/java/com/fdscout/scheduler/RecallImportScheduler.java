package com.fdscout.scheduler;

import com.fdscout.web.parser.FoodRecallDataParser;

public class RecallImportScheduler extends AbstractScheduler{

	protected void run() {
		new FoodRecallDataParser().parse("C:\\FDScout\\downloads\\food-enforcement-0001-of-0001.json");
	}

}
