package com.fdscout.web.handler;

import java.util.ArrayList;
import java.util.List;

import com.fdscout.core.context.CoreContext;
import com.fdscout.core.model.bean.RecallBean;
import com.fdscout.core.model.bean.RecallSearchResultBean;
import com.fdscout.core.model.bean.RecallXrefBean;
import com.fdscout.core.model.service.MetaDataService;
import com.fdscout.core.model.service.ProductService;
import com.fdscout.core.model.service.RecallService;
import com.fdscout.core.model.service.RecallXrefService;

public class SearchHandler {
	private RecallService recallService;
	private RecallXrefService recallXrefService;
	private MetaDataService metaDataService;
	private ProductService productService;
	
	public synchronized List<RecallSearchResultBean> executeSearch(String searchString) {
		List<RecallSearchResultBean> recallSearchResultList = new ArrayList<RecallSearchResultBean>();
		// assume it is recall number
		List<RecallBean> recallList = recallService.getRecallListByRecallNumber(searchString);
		for (RecallBean recall : recallList) {
			RecallSearchResultBean recallSearchResult = new RecallSearchResultBean();
			RecallXrefBean recallXref = recallXrefService.getRecallXrefByRecall(recall.getBeanId());
			recallSearchResult.setRecall(recall);
			recallSearchResult.setMetaData(metaDataService.getMetaDataById(recallXref.getMetaDataId()));
			recallSearchResult.setProduct(productService.getProductById(recallXref.getProductId()));
			recallSearchResultList.add(recallSearchResult);
		}
		return recallSearchResultList;
	}

	public void setRecallService(RecallService recallService) {
		this.recallService = recallService;
	}

	public void setRecallXrefService(RecallXrefService recallXrefService) {
		this.recallXrefService = recallXrefService;
	}

	public void setMetaDataService(MetaDataService metaDataService) {
		this.metaDataService = metaDataService;
	}

	public void setProductService(ProductService productService) {
		this.productService = productService;
	}

}
