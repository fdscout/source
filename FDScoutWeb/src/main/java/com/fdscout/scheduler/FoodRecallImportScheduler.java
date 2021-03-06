package com.fdscout.scheduler;

import com.fdscout.web.util.tool.PropertyReader;

public class FoodRecallImportScheduler extends RecallImportScheduler{

	@Override
	protected String getDownloadPath() {
		return PropertyReader.get("path.download.zip_file");
	}

	@Override
	protected String getJsonFileName() {
		return PropertyReader.get("name.jsonfile.food_recall");
	}

}
