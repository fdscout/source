package com.fdscout.web.search;

import java.util.Calendar;
import java.util.List;

import com.fdscout.core.model.bean.RecallSummaryBean;

public class RecallDefaultResultSearchHandler extends SearchHandler{
	@Override
	public synchronized SearchResult executeSearch(String searchString) {
		SearchResultRecallSummary searchResultSummary = new SearchResultRecallSummary();
		// assume it is recall number
		Calendar calendar = Calendar.getInstance();
		calendar.add(Calendar.DAY_OF_YEAR, -40);
		java.sql.Date startDate = new java.sql.Date(calendar.getTime().getTime());
		List<RecallSummaryBean> recallSummaryList = getRecallService().getRecallListByReportDate(startDate);
		searchResultSummary.setRecallSummaryList(recallSummaryList);
		searchResultSummary.setReturnValue(searchResultSummary.getRecallSummaryList().size() == 0 ? "noMatchFound" : "recallSummary");
		return searchResultSummary;
	}


}
