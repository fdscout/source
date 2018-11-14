package com.fdscout.core.model.bean;

public class RecallXrefBean extends CoreBean {
	private long metaDataId;
	private long productId;
	private long addressId;
	private long recallId;
	
	public long getMetaDataId() {
		return metaDataId;
	}
	public void setMetaDataId(long metaDataId) {
		this.metaDataId = metaDataId;
	}
	public long getProductId() {
		return productId;
	}
	public void setProductId(long productId) {
		this.productId = productId;
	}
	public long getAddressId() {
		return addressId;
	}
	public void setAddressId(long addressId) {
		this.addressId = addressId;
	}
	public long getRecallId() {
		return recallId;
	}
	public void setRecallId(long recallId) {
		this.recallId = recallId;
	}
	
}
