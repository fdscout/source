package com.fdscout.web.search;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.commons.lang3.StringUtils;

import com.fdscout.context.WebContext;

public class SearchCategorizer {
	private Pattern recallNumberPattern = Pattern.compile("[Ff]-\\d\\d\\d\\d-\\d\\d\\d\\d");

	public SearchHandler getSearchHandler(String searchString) {
		 Matcher matcher = recallNumberPattern.matcher(searchString);
		 if (matcher.matches()) {
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
