package com.fdscout.core.util.entity;

import org.apache.log4j.Logger;

import com.fdscout.core.model.bean.CoreBean;


public class CoreException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3076114094728564588L;
	
	private CoreBean coreBean;
	
	public CoreException() {
		super();
		Logger.getLogger(this.getClass()).error(super.toString());
	}

	public CoreException(String message) {
		super(message);
		Logger.getLogger(this.getClass()).error(message);
	}
	
	
	public CoreBean getCoreBean() {
		return coreBean;
	}

	public void setCoreBean(CoreBean coreBean) {
		this.coreBean = coreBean;
	}
}
