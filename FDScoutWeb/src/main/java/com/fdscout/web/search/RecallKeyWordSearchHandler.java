package com.fdscout.web.search;

import java.util.List;

import com.fdscout.core.model.bean.RecallBean;
import com.fdscout.core.model.bean.RecallSearchResultBean;

public class RecallKeyWordSearchHandler extends SearchHandler{
	
	public synchronized SearchResult executeSearch(String searchString) {
		SearchResultRecallSummary searchResultSummary = new SearchResultRecallSummary();
		// assume it is recall number
		List<RecallBean> recallSummaryList = getRecallService().getRecallListByKeyWord(searchString);
		for (RecallBean recall : recallSummaryList) {
			RecallSearchResultBean recallSearchResult = new RecallSearchResultBean();
//			RecallXrefBean recallXref = getRecallXrefService().getRecallXrefByRecall(recall.getBeanId());
			recallSearchResult.setRecall(recall);
//			recallSearchResult.setMetaData(getMetaDataService().getMetaDataById(recallXref.getMetaDataId()));
//			recallSearchResult.setProduct(getProductService().getProductById(recallXref.getProductId()));
			searchResultSummary.getRecallSummaryList().add(recallSearchResult);
//			System.out.println(searchResultDetails.getRecallDetailList().size());
		}
		searchResultSummary.setReturnValue(searchResultSummary.getRecallSummaryList().size() == 0 ? "noMatchFound" : "recallSummary");
		return searchResultSummary;
	}


}
