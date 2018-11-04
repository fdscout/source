package com.fdscout.web.interceptor;

import org.apache.log4j.Logger;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;

public class ScheduledRequestInterceptor implements Interceptor {

	private static final long serialVersionUID = -311612772303180824L;

	@Override
	public void destroy() {
		Logger.getLogger(this.getClass()).info("ScheduledRequestInterceptor destroyed.");
	}

	@Override
	public void init() {
		Logger.getLogger(this.getClass()).info("ScheduledRequestInterceptor initialized.");
	}

	@Override
	public String intercept(ActionInvocation invocation) throws Exception {
		Logger.getLogger(this.getClass()).info("ScheduledRequestInterceptor intercepts.");

		return invocation.invoke();
	}

}
