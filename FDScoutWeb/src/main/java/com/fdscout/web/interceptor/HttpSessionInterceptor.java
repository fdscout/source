package com.fdscout.web.interceptor;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;

public class HttpSessionInterceptor implements Interceptor {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7784362934708894341L;

	@Override
	public String intercept(ActionInvocation invocation) throws Exception {
//		PresphereAction action = (PresphereAction) invocation.getAction();
//		HttpServletRequest request = action.getServletRequest();
//		HttpSession session = ServletActionContext.getRequest().getSession();
//    	long userId = WebContext.getCurrentUserId();
//    	if (userId == 0 || session.isNew() || ((UserSessionService)WebContext.getBean("userSessionService")).isUserSessionActive(userId, session.getId())) {
//    		if (session.getAttribute(WebAttribute.SESSION_USER) == null) {
//    			Logger.getLogger(this.getClass()).warn("User is not valid in session " + session.getId());
//    			return ActionReturnValue.SECURITY_ERROR;
//    		}
//    	} 
    	/****************************************************************/    	
    	ServletActionContext.getResponse().setHeader("Cache-control", "no-cache, no-store");
    	ServletActionContext.getResponse().setHeader("Pragma", "no-cache");
    	ServletActionContext.getResponse().setHeader("Expires", "-1");
//		Logger.getLogger(this.getClass()).info("UserRequestInterceptor intercepts.");
		return invocation.invoke();
	}

	@Override
	public void destroy() {
	}

	@Override
	public void init() {
	}

}
