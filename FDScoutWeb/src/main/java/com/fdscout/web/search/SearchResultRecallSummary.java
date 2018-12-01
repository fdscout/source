package com.fdscout.web.search;

import java.util.ArrayList;
import java.util.List;

import com.fdscout.core.model.bean.RecallSearchResultBean;

public class SearchResultRecallSummary implements SearchResult{
	private List<RecallSearchResultBean> recallSummaryList;
	private String returnValue;
	
	@Override
	public String getReturnValue() {
		return returnValue;
	}
	
	public void setReturnValue(String returnValue) {
		this.returnValue = returnValue;
	}

	public List<RecallSearchResultBean> getRecallSummaryList() {
		if (recallSummaryList == null) {
			recallSummaryList = new ArrayList<RecallSearchResultBean>();
		}
		return recallSummaryList;
	}

	public void setRecallSummaryList(List<RecallSearchResultBean> recallSummaryList) {
		this.recallSummaryList = recallSummaryList;
	}
}
