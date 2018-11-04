package com.fdscout.context;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import com.fdscout.core.context.CoreContext;


public class WebContext extends CoreContext{

    public static void resetSessionAttributes() {
    
    	WebContext.getSession().setAttribute(WebAttribute.SESSION_USER, null);
    }

    
    public static HttpSession getSession() {
        if (getServletRequest() != null) {
            return  getServletRequest().getSession(false); // true == allow create
        }
        return null;
    }

//    public static long getCurrentUserId() {
//        PresphereUserBean user = null;
//        if (getSession() != null) {
//            user = (PresphereUserBean)getSession().getAttribute(WebAttribute.SESSION_USER);
//        }
//        return user == null ? 0 : user.getBeanId();
//    }
//    
//    public static PresphereUserBean getCurrentUser() {
//        PresphereUserBean user = null;
//        if (getSession() != null) {
//            return (PresphereUserBean)getSession().getAttribute(WebAttribute.SESSION_USER);
//        }
//        return null;
//    }
    
    public static HttpServletRequest getServletRequest() {
        ServletRequestAttributes attributes;
        try {
            attributes = (ServletRequestAttributes) RequestContextHolder.currentRequestAttributes();
        }
        catch (IllegalStateException ise) {
            // batch process
            return null;
        }
        return  attributes.getRequest(); 
    }
}


    
