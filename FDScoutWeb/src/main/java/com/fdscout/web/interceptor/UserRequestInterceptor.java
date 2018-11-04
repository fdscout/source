package com.fdscout.web.interceptor;

import org.apache.log4j.Logger;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;

//import bsh.This;

public class UserRequestInterceptor implements Interceptor {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3934620860054283647L;

	@Override
	public void destroy() {
		Logger.getLogger(this.getClass()).info("UserRequestInterceptor destroyed.");
	}

	@Override
	public void init() {
		//Logger.getLogger(this.getClass()).info(This.class.getSimpleName() + " initialized.");
	}

	@Override
	public String intercept(ActionInvocation invocation) throws Exception {
		// check if last request is xx minutes ago.   xx is defined in property file as max session idle time allowed.
		// if yes, deactivate the session.  redirect to session timeout page
		
		Logger.getLogger(this.getClass()).info("UserRequestInterceptor intercepts.");
		return invocation.invoke();
	}

}
