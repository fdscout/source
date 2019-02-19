package com.fdscout.web.search;

import java.util.regex.Pattern;

import org.apache.commons.lang3.StringUtils;

import com.fdscout.context.WebContext;
import com.fdscout.core.util.entity.CoreConstants;

public class SearchCategorizer {
	private Pattern recallNumberPattern = Pattern.compile("[Ff]-\\d\\d\\d\\d-\\d\\d\\d\\d");
	private int minimumSearchStringLength = 4;
	
	public SearchHandler getSearchHandler(String searchString) {
		if (searchString.equals(CoreConstants.TAG_MOST_RECENT_RECALLS)) {
			return (RecallDefaultResultSearchHandler)WebContext.getBean("recallDefaultResultSearchHandler");
		}
		else if (searchString.length() < minimumSearchStringLength) {
			return (NoMatchSearchHandler)WebContext.getBean("noMatchSearchHandler");
		}
		else if (recallNumberPattern.matcher(searchString).matches()) {
			return (RecallNumberSearchHandler)WebContext.getBean("recallNumberSearchHandler");
		}
		else if (StringUtils.isNumeric(searchString)) {
			return (RecallIdSearchHandler)WebContext.getBean("recallIdSearchHandler");
		}
		else if (!StringUtils.isBlank(searchString)) {
			return (RecallKeyWordSearchHandler)WebContext.getBean("recallKeyWordSearchHandler");
		}
		return (NoMatchSearchHandler)WebContext.getBean("noMatchSearchHandler");
	}
}
