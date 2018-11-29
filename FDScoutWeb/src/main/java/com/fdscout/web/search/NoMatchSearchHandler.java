package com.fdscout.web.search;

public class NoMatchSearchHandler extends SearchHandler{
	
	public synchronized SearchResult executeSearch(String searchString) {
		SearchResult matchFound = new SearchResultNoMatchFound();
		return matchFound;
	}


}
