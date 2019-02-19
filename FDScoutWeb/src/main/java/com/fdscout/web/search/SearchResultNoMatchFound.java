package com.fdscout.web.search;

public class SearchResultNoMatchFound implements SearchResult {

	@Override
	public String getReturnValue() {
		return "recallNoMatchFound";
	}

}
