package com.fdscout.core.model.bean;

import com.fdscout.core.model.entity.Address;
import com.fdscout.core.model.entity.Product;
import com.fdscout.core.model.entity.Recall;

public class FoodRecallBean extends FDScoutBean {
	private Recall recall;
	private Address address;
	private Product product;
	
	private org.json.simple.JSONObject openFda;

	public Recall getRecall() {
		return recall == null ? new Recall() : recall;
	}

	public void setRecall(Recall recall) {
		this.recall = recall;
	}

	public Address getAddress() {
		return address == null ? new Address() : address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Product getProduct() {
		return product == null ? new Product() : product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public org.json.simple.JSONObject getOpenFda() {
		return openFda == null ? new org.json.simple.JSONObject() : openFda;
	}

	public void setOpenFda(org.json.simple.JSONObject openFda) {
		this.openFda = openFda;
	}
	

	
	
}
