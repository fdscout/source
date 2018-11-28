package com.fdscout.web.search;

import java.util.ArrayList;
import java.util.List;

import com.fdscout.core.model.bean.RecallBean;
import com.fdscout.core.model.bean.RecallSearchResultBean;
import com.fdscout.core.model.bean.RecallXrefBean;

public class RecallNumberSearchHandler extends SearchHandler{
	
	public synchronized String executeSearch(List<Object> recallSearchResultList, String searchString) {
		recallSearchResultList = new ArrayList<Object>();
		// assume it is recall number
		List<RecallBean> recallList = getRecallService().getRecallListByRecallNumber(searchString);
		for (RecallBean recall : recallList) {
			RecallSearchResultBean recallSearchResult = new RecallSearchResultBean();
			RecallXrefBean recallXref = getRecallXrefService().getRecallXrefByRecall(recall.getBeanId());
			recallSearchResult.setRecall(recall);
			recallSearchResult.setMetaData(getMetaDataService().getMetaDataById(recallXref.getMetaDataId()));
			recallSearchResult.setProduct(getProductService().getProductById(recallXref.getProductId()));
			recallSearchResultList.add(recallSearchResult);
		}
		return recallList.size() == 0 ? "noMatchFound" : "singleRecall";
	}


}
