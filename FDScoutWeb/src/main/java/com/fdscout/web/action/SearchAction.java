package com.fdscout.web.action;

import java.util.List;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.InterceptorRef;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.ResultPath;

import com.fdscout.web.search.SearchCategorizer;
import com.fdscout.web.search.SearchHandler;

@SuppressWarnings("serial")
@ResultPath(value="/")
@InterceptorRef(value="fdscoutGenericStack")
@ParentPackage(value ="com.fdscout.default")
public class SearchAction extends FDScoutAction {
	private String searchString;
	private List<Object> recallSearchResultList;
//	private SearchHandler searchHandler;
	private SearchCategorizer searchCategorizer;
	
	@Action(value="/search", results={@Result(name="singleRecall", type="tiles", location="searchResultSingleRecall"),
									  @Result(name="noMatchFound", type="tiles", location="noMatchFound")
									 })
	public String search() {
		SearchHandler searchHandler = searchCategorizer.getSearchHandler(searchString);
		return searchHandler.executeSearch(recallSearchResultList, searchString);
	}

	public void setSearchCategorizer(SearchCategorizer searchCategorizer) {
		this.searchCategorizer = searchCategorizer;
	}
	
    public List<Object> getRecallSearchResultList() {
		return recallSearchResultList;
	}

	public void setSearchString(String searchString) {
		this.searchString = searchString;
	}
	public String getSearchString() {
		return searchString;
	}

}
