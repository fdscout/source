package com.fdscout.web.search;

import com.fdscout.core.model.service.MetaDataService;
import com.fdscout.core.model.service.ProductService;
import com.fdscout.core.model.service.RecallService;
import com.fdscout.core.model.service.RecallXrefService;

public abstract class SearchHandler {
	private RecallService recallService;
	private RecallXrefService recallXrefService;
	private MetaDataService metaDataService;
	private ProductService productService;
	
	protected abstract SearchResult executeSearch(String searchString);
	
	public final SearchResult getSearchResult(String searchString) {
//		WebContext.getSession().setAttribute(WebAttribute.SESSION_SEARCHSTRING, searchString);
		return executeSearch(searchString);
	};
	

	public RecallService getRecallService() {
		return recallService;
	}


	public RecallXrefService getRecallXrefService() {
		return recallXrefService;
	}


	public MetaDataService getMetaDataService() {
		return metaDataService;
	}


	public ProductService getProductService() {
		return productService;
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
