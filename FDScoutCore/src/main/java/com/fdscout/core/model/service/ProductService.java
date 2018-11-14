package com.fdscout.core.model.service;

import com.fdscout.core.model.bean.ProductBean;
import com.fdscout.core.model.dao.ProductDao;

public class ProductService extends CoreService {
	public void save(ProductBean product) {
		((ProductDao)getDao()).create(product);
	}

}
