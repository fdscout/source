package com.fdscout.web.parser;

import com.fdscout.core.model.bean.AddressBean;
import com.fdscout.core.model.bean.ProductBean;
import com.fdscout.core.model.bean.RecallBean;

public class RecallWrapper {
	private RecallBean recall;
	private AddressBean address;
	private ProductBean product;
	
	private org.json.simple.JSONObject openFda;

	public RecallBean getRecall() {
		return recall == null ? new RecallBean() : recall;
	}

	public void setRecall(RecallBean recall) {
		this.recall = recall;
	}

	public AddressBean getAddress() {
		return address == null ? new AddressBean() : address;
	}

	public void setAddress(AddressBean address) {
		this.address = address;
	}

	public ProductBean getProduct() {
		return product == null ? new ProductBean() : product;
	}

	public void setProduct(ProductBean product) {
		this.product = product;
	}

	public org.json.simple.JSONObject getOpenFda() {
		return openFda == null ? new org.json.simple.JSONObject() : openFda;
	}

	public void setOpenFda(org.json.simple.JSONObject openFda) {
		this.openFda = openFda;
	}
	

	
	
}
