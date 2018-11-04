package com.fdscout.core.model.bean;

public class RequestAddressBean extends CoreBean {
	private String ipAddress;

	public RequestAddressBean (String ipAddress) {
		this.ipAddress = ipAddress;
	}
	
	public String getIpAddress() {
		return ipAddress;
	}

	public void setIpAddress(String ipAddress) {
		this.ipAddress = ipAddress;
	}
	
}
