package com.fdscout.web.search;

import java.util.ArrayList;
import java.util.List;

import com.fdscout.core.model.bean.RecallSearchResultBean;

public class SearchResultRecallDetails implements SearchResult{
	private List<RecallSearchResultBean> recallDetailList;
	private String returnValue;
	
	public List<RecallSearchResultBean> getRecallDetailList() {
		if (recallDetailList == null) {
			recallDetailList = new ArrayList<RecallSearchResultBean>();
		}
		return recallDetailList;
	}
	
	public void setRecallDetailList(List<RecallSearchResultBean> recallDetailList) {
		this.recallDetailList = recallDetailList;
	}
	
	@Override
	public String getReturnValue() {
		return returnValue;
	}
	
	public void setReturnValue(String returnValue) {
		this.returnValue = returnValue;
	}
}
