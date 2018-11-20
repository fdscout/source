package com.fdscout.web.action;

import java.util.List;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.InterceptorRef;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.ResultPath;

import com.fdscout.core.model.bean.RecallSearchResultBean;
import com.fdscout.web.handler.SearchHandler;

@SuppressWarnings("serial")
@ResultPath(value="/")
@InterceptorRef(value="fdscoutGenericStack")
@ParentPackage(value ="com.fdscout.default")
public class SearchAction extends FDScoutAction {
	private String searchString;
	private SearchHandler searchHandler;

	public void setSearchHandler(SearchHandler searchHandler) {
		this.searchHandler = searchHandler;
	}

	@Action(value="/search", results={@Result(name="success", type="tiles", location="searchResult")})
	public String search() {
		recallSearchResultList = searchHandler.executeSearch(searchString);
		return SUCCESS;
	}

	private List<RecallSearchResultBean> recallSearchResultList;
	
    public List<RecallSearchResultBean> getRecallSearchResultList() {
		return recallSearchResultList;
	}

	public void setSearchString(String searchString) {
		this.searchString = searchString;
	}

}
