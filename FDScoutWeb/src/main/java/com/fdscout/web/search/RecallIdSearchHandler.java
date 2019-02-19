package com.fdscout.web.search;

import java.util.List;

import com.fdscout.core.model.bean.RecallBean;
import com.fdscout.core.model.bean.RecallSearchResultBean;
import com.fdscout.core.model.bean.RecallXrefBean;

public class RecallIdSearchHandler extends SearchHandler{
	@Override
	public synchronized SearchResult executeSearch(String searchString) {
		SearchResultRecallDetails searchResultDetails = new SearchResultRecallDetails();
		List<RecallBean> recallList = getRecallService().getRecallListByRecallId(searchString);
		for (RecallBean recall : recallList) {
			RecallSearchResultBean recallSearchResult = new RecallSearchResultBean();
			RecallXrefBean recallXref = getRecallXrefService().getRecallXrefByRecall(recall.getBeanId());
			recallSearchResult.setRecall(recall);
			recallSearchResult.setMetaData(getMetaDataService().getMetaDataById(recallXref.getMetaDataId()));
			recallSearchResult.setProduct(getProductService().getProductById(recallXref.getProductId()));
			searchResultDetails.getRecallDetailList().add(recallSearchResult);
		}
		searchResultDetails.setReturnValue(searchResultDetails.getRecallDetailList().size() == 0 ? "recallNoMatchFound" : "singleRecall");
		return searchResultDetails;
	}


}
