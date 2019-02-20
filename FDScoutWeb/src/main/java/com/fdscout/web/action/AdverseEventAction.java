package com.fdscout.web.action;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.InterceptorRef;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.ResultPath;

@SuppressWarnings("serial")
@ResultPath(value="/")
@InterceptorRef(value="fdscoutGenericStack")
@ParentPackage(value ="com.fdscout.default")
public class AdverseEventAction extends FDScoutAction {
//	private RecallBean recall;
//	private SearchResult searchResult ;
//	private RecallIdSearchHandler recallIdSearchHandler;
//	private RecallDefaultResultSearchHandler recallDefaultResultSearchHandler;

	@Action(value="/adverseEventMainPage", 
			results={@Result(name="adverseEventTemplate", type="tiles", location="adverseEventTemplate")})
	public String loadAdverseEventTemplate() {
//		searchResult = recallDefaultResultSearchHandler.executeSearch("");
//		return searchResult.getReturnValue();
		return "adverseEventTemplate";
	}
//
//	@Action(value="/loadRecallDetails", 
//			results={@Result(name="singleRecall", type="tiles", location="searchResultSingleRecall")})
//	public String loadRecallDetails() {
//		searchResult = recallIdSearchHandler.executeSearch(String.valueOf(recall.getBeanId()));
//		String searchString = (String)WebContext.getSession().getAttribute(WebAttribute.SESSION_SEARCHSTRING);
//		if (!CoreConstants.TAG_MOST_RECENT_RECALLS.equals(searchString)) {
//			setSearchString(searchString);
//		}
//		return searchResult.getReturnValue();
//	}
//	
//	public void setRecall(RecallBean recall) {
//		this.recall = recall;
//	}
//
//
//	public void setRecallIdSearchHandler(RecallIdSearchHandler recallIdSearchHandler) {
//		this.recallIdSearchHandler = recallIdSearchHandler;
//	}
//
//	public SearchResult getSearchResult() {
//		return searchResult;
//	}
//
//	public void setSearchResult(SearchResult searchResult) {
//		this.searchResult = searchResult;
//	}

//	public void setRecallDefaultResultSearchHandler(RecallDefaultResultSearchHandler recallDefaultResultSearchHandler) {
//		this.recallDefaultResultSearchHandler = recallDefaultResultSearchHandler;
//	}

}
