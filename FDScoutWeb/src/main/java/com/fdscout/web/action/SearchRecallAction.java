package com.fdscout.web.action;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.InterceptorRef;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.ResultPath;

import com.fdscout.context.WebAttribute;
import com.fdscout.context.WebContext;
import com.fdscout.core.util.entity.CoreConstants;
import com.fdscout.web.search.SearchCategorizer;
import com.fdscout.web.search.SearchHandler;
import com.fdscout.web.search.SearchResult;

@SuppressWarnings("serial")
@ResultPath(value="/")
@InterceptorRef(value="fdscoutGenericStack")
@ParentPackage(value ="com.fdscout.default")
public class SearchRecallAction extends FDScoutAction {
	private SearchResult searchResult;
	private SearchCategorizer searchCategorizer;

	//	private List<Object> recallSearchResultList;
//	private SearchHandler searchHandler;
//	private RecallDefaultResultSearchHandler recallDefaultResultSearchHandler;
	
	@Action(value="/searchRecall", results={@Result(name="singleRecall", type="tiles", location="searchResultSingleRecall"),
									  @Result(name="recallSummary", type="tiles", location="searchResultRecallSummary"),
									  @Result(name="recallNoMatchFound", type="tiles", location="recallNoMatchFound")
									 })
	public String search() {
		setSearchString(getSearchString().trim());
		SearchHandler searchHandler = searchCategorizer.getSearchHandler(getSearchString());
		searchResult = searchHandler.getSearchResult(getSearchString());
		WebContext.getSession().setAttribute(WebAttribute.SESSION_SEARCHSTRING, getSearchString());
		if (CoreConstants.TAG_MOST_RECENT_RECALLS.equals(getSearchString())) {
			setSearchString("");
		}
		return searchResult.getReturnValue();
	}
	
	@Action(value="/loadLastSearchResult", results={@Result(name="recallSummary", type="tiles", location="searchResultRecallSummary")})
	public String loadLastSearchResult() {
		setSearchString((String)WebContext.getSession().getAttribute(WebAttribute.SESSION_SEARCHSTRING));
		return search();
	}

	@Action(value="/loadMostRecentRecalls", results={@Result(name="recallSummary", type="tiles", location="searchResultRecallSummary"),
													 @Result(name="recallNoMatchFound", type="tiles", location="recallNoMatchFound")})
	public String loadMostRecentRecalls() {
		SearchHandler searchHandler = searchCategorizer.getSearchHandler(CoreConstants.TAG_MOST_RECENT_RECALLS);
		searchResult = searchHandler.getSearchResult("");
		WebContext.getSession().setAttribute(WebAttribute.SESSION_SEARCHSTRING, CoreConstants.TAG_MOST_RECENT_RECALLS);
		return searchResult.getReturnValue();
	}

	public void setSearchCategorizer(SearchCategorizer searchCategorizer) {
		this.searchCategorizer = searchCategorizer;
	}

	public SearchResult getSearchResult() {
		return searchResult;
	}

	public void setSearchResult(SearchResult searchResult) {
		this.searchResult = searchResult;
	}

//	public void setRecallDefaultResultSearchHandler(RecallDefaultResultSearchHandler recallDefaultResultSearchHandler) {
//		this.recallDefaultResultSearchHandler = recallDefaultResultSearchHandler;
//	}

}
