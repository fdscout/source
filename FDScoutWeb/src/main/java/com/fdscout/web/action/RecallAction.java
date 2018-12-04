package com.fdscout.web.action;

import java.util.List;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.InterceptorRef;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.ResultPath;

import com.fdscout.core.model.bean.RecallBean;
import com.fdscout.core.model.bean.RecallSearchResultBean;
import com.fdscout.core.model.service.RecallService;
import com.fdscout.web.search.RecallIdSearchHandler;
import com.fdscout.web.search.SearchResult;

@SuppressWarnings("serial")
@ResultPath(value="/")
@InterceptorRef(value="fdscoutGenericStack")
@ParentPackage(value ="com.fdscout.default")
public class RecallAction extends FDScoutAction {
	private RecallBean recall;
	private SearchResult searchResult ;
	private RecallIdSearchHandler recallIdSearchHandler;

	@Action(value="/loadRecallDetails", results={@Result(name="singleRecall", type="tiles", location="searchResultSingleRecall")})
	public String loadRecallDetails() {
		searchResult = recallIdSearchHandler.executeSearch(String.valueOf(recall.getBeanId()));
		return searchResult.getReturnValue();
	}

	public void setRecall(RecallBean recall) {
		this.recall = recall;
	}


	public void setRecallIdSearchHandler(RecallIdSearchHandler recallIdSearchHandler) {
		this.recallIdSearchHandler = recallIdSearchHandler;
	}

	public SearchResult getSearchResult() {
		return searchResult;
	}

	public void setSearchResult(SearchResult searchResult) {
		this.searchResult = searchResult;
	}

}
