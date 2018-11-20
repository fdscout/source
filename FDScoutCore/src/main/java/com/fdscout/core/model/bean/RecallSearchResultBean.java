package com.fdscout.core.model.bean;

public class RecallSearchResultBean extends CoreBean{
	private RecallBean recall;
	private AddressBean address;
	private ProductBean product;
	private MetaDataBean metaData;
	
	public MetaDataBean getMetaData() {
		return metaData;
	}
	public void setMetaData(MetaDataBean metaData) {
		this.metaData = metaData;
	}
	public RecallBean getRecall() {
		return recall;
	}
	public void setRecall(RecallBean recall) {
		this.recall = recall;
	}
	public AddressBean getAddress() {
		return address;
	}
	public void setAddress(AddressBean address) {
		this.address = address;
	}
	public ProductBean getProduct() {
		return product;
	}
	public void setProduct(ProductBean product) {
		this.product = product;
	}
}
