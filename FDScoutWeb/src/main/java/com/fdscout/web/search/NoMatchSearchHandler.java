package com.fdscout.web.search;

import java.util.List;

public class NoMatchSearchHandler extends SearchHandler{
	
	public synchronized String executeSearch(List<Object> recallSearchResultList, String searchString) {
		return "noMatchFound";
	}


}
