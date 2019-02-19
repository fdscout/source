package com.fdscout.web.search;

import java.util.ArrayList;
import java.util.List;

import com.fdscout.core.model.bean.RecallSummaryBean;

public class SearchResultRecallSummary implements SearchResult{
	private List<RecallSummaryBean> recallSummaryList;
	private String returnValue;
	
	@Override
	public String getReturnValue() {
		return returnValue;
	}
	
	public void setReturnValue(String returnValue) {
		this.returnValue = returnValue;
	}

	public List<RecallSummaryBean> getRecallSummaryList() {
		if (recallSummaryList == null) {
			recallSummaryList = new ArrayList<RecallSummaryBean>();
		}
		return recallSummaryList;
	}

	public void setRecallSummaryList(List<RecallSummaryBean> recallSummaryList) {
		this.recallSummaryList = recallSummaryList;
	}
	
}
