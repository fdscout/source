package com.fdscout.web.search;

import java.util.List;

import com.fdscout.core.model.bean.RecallBean;
import com.fdscout.core.model.bean.RecallSearchResultBean;
import com.fdscout.core.model.bean.RecallXrefBean;

public class RecallNumberSearchHandler extends SearchHandler{
	
	public synchronized SearchResult executeSearch(String searchString) {
		SearchResultRecallDetails searchResultDetails = new SearchResultRecallDetails();
		// assume it is recall number
		List<RecallBean> recallList = getRecallService().getRecallListByRecallNumber(searchString);
		for (RecallBean recall : recallList) {
			RecallSearchResultBean recallSearchResult = new RecallSearchResultBean();
			RecallXrefBean recallXref = getRecallXrefService().getRecallXrefByRecall(recall.getBeanId());
			recallSearchResult.setRecall(recall);
			recallSearchResult.setMetaData(getMetaDataService().getMetaDataById(recallXref.getMetaDataId()));
			recallSearchResult.setProduct(getProductService().getProductById(recallXref.getProductId()));
			searchResultDetails.getRecallDetailList().add(recallSearchResult);
			System.out.println(searchResultDetails.getRecallDetailList().size());
		}
		searchResultDetails.setReturnValue(searchResultDetails.getRecallDetailList().size() == 0 ? "noMatchFound" : "singleRecall");
		return searchResultDetails;
	}


}
