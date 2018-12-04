package com.fdscout.web.search;

import java.util.List;

import com.fdscout.core.model.bean.RecallSummaryBean;

public class RecallKeyWordSearchHandler extends SearchHandler{
	
	public synchronized SearchResult executeSearch(String searchString) {
		SearchResultRecallSummary searchResultSummary = new SearchResultRecallSummary();
		// assume it is recall number
		List<RecallSummaryBean> recallSummaryList = getRecallService().getRecallListByKeyWord(searchString);
//		for (RecallSummaryBean recallSummary : recallSummaryList) {
//			recallSummary.getRecall().setReasonForRecall(recallSummary.getRecall().getReasonForRecall().replace(searchString, "<b>" + searchString + "</b>"));
//			RecallSearchResultBean recallSearchResult = new RecallSearchResultBean();
//			RecallXrefBean recallXref = getRecallXrefService().getRecallXrefByRecall(recall.getBeanId());
//			recallSearchResult.setRecall(recall);
//			recallSearchResult.setMetaData(getMetaDataService().getMetaDataById(recallXref.getMetaDataId()));
//			recallSearchResult.setProduct(getProductService().getProductById(recallXref.getProductId()));
//			searchResultSummary.getRecallSummaryList().add(recallSearchResult);
//			System.out.println(searchResultDetails.getRecallDetailList().size());
//		}
		searchResultSummary.setRecallSummaryList(recallSummaryList);
		searchResultSummary.setReturnValue(searchResultSummary.getRecallSummaryList().size() == 0 ? "noMatchFound" : "recallSummary");
		return searchResultSummary;
	}


}
