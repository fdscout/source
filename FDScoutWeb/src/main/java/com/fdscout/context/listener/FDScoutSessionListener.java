package com.fdscout.context.listener;

import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

import org.apache.log4j.Logger;

import com.fdscout.context.WebAttribute;

public class FDScoutSessionListener implements HttpSessionListener {

    @Override
    public void sessionCreated(HttpSessionEvent sessionEvent) {
    	Logger.getLogger(getClass()).info("New session is created: " + sessionEvent.getSession().getId());
    }

    @Override
    public void sessionDestroyed(HttpSessionEvent event) {
        if (event.getSession().getAttribute(WebAttribute.SESSION_USER) != null) {
        	event.getSession().setAttribute(WebAttribute.SESSION_USER, null);
        }
//    	((UserSessionService)WebContext.getBean("userSessionService")).setSessionExpire(event.getSession().getId());
        Logger.getLogger(this.getClass()).warn("Session expired: " + event.getSession().getId());
      
    }
}
