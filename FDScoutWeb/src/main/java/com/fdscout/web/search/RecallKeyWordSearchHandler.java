package com.fdscout.web.search;

import java.util.List;

import com.fdscout.core.model.bean.RecallSummaryBean;

public class RecallKeyWordSearchHandler extends SearchHandler{
	
	public synchronized SearchResult executeSearch(String searchString) {
		SearchResultRecallSummary searchResultSummary = new SearchResultRecallSummary();
		// assume it is recall number
		List<RecallSummaryBean> recallSummaryList = getRecallService().getRecallListByKeyWord(searchString);
		searchResultSummary.setRecallSummaryList(recallSummaryList);
		searchResultSummary.setReturnValue(searchResultSummary.getRecallSummaryList().size() == 0 ? "recallNoMatchFound" : "recallSummary");
		return searchResultSummary;
	}


}
