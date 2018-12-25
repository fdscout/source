package com.fdscout.web.action;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.InterceptorRef;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.ResultPath;

import com.fdscout.context.WebAttribute;
import com.fdscout.context.WebContext;
import com.fdscout.web.search.SearchCategorizer;
import com.fdscout.web.search.SearchHandler;
import com.fdscout.web.search.SearchResult;

@SuppressWarnings("serial")
@ResultPath(value="/")
@InterceptorRef(value="fdscoutGenericStack")
@ParentPackage(value ="com.fdscout.default")
public class SearchAction extends FDScoutAction {
	private String searchString;
	private SearchResult searchResult;
//	private List<Object> recallSearchResultList;
//	private SearchHandler searchHandler;
	private SearchCategorizer searchCategorizer;
	
	@Action(value="/search", results={@Result(name="singleRecall", type="tiles", location="searchResultSingleRecall"),
									  @Result(name="recallSummary", type="tiles", location="searchResultRecallSummary"),
									  @Result(name="noMatchFound", type="tiles", location="noMatchFound")
									 })
	public String search() {
		searchString = searchString.trim();
		SearchHandler searchHandler = searchCategorizer.getSearchHandler(searchString);
		searchResult = searchHandler.getSearchResult(searchString);
//		WebContext.getSession().setAttribute(WebAttribute.SESSION_SEARCHSTRING, searchString);
		return searchResult.getReturnValue();
	}
	
	@Action(value="/loadLastSearchResult", results={@Result(name="recallSummary", type="tiles", location="searchResultRecallSummary")})
	public String loadLastSearchResult() {
		searchString = (String)WebContext.getSession().getAttribute(WebAttribute.SESSION_SEARCHSTRING);
		return search();
	}

	

	public void setSearchCategorizer(SearchCategorizer searchCategorizer) {
		this.searchCategorizer = searchCategorizer;
	}

	public void setSearchString(String searchString) {
		this.searchString = searchString;
	}
	public String getSearchString() {
		return searchString;
	}

	public SearchResult getSearchResult() {
		return searchResult;
	}

	public void setSearchResult(SearchResult searchResult) {
		this.searchResult = searchResult;
	}

}
