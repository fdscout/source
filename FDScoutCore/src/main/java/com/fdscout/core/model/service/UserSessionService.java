package com.fdscout.core.model.service;

import org.apache.commons.lang.StringUtils;

import com.fdscout.core.model.bean.UserSessionBean;
import com.fdscout.core.model.dao.UserSessionDao;
import com.fdscout.core.util.entity.CoreConstants;

public class UserSessionService extends CoreService {
	
//	public boolean sessionIsValid(CoreUserBean user, String sessionId) {
//		if (userSessionExists(user.getBeanId(), sessionId)) {
//			if (isUserSessionActive(user.getBeanId(), sessionId)) {
//				return true;
//			}
//			else {
//				user.setErrors(new ArrayList<String>());
//				user.getErrors().add("Your session has expired.  Please log in again.");
//				return false;
//			}
//		}
//		return false;
//	}
	
//		else {
//			deactivateSessionByUserId(user.getBeanId());
//			createNewSession(user.getBeanId(), sessionId);
//			return true;
//		}
//	}
	
	
	public void createNewSession (long userId, String sessionId) {
		// deactivate all existing sessions to make sure only one active session per user. 
		deactivateSessionByUserId(userId);
		//
		UserSessionBean session = new UserSessionBean();
		session.setUserId(userId);
		session.setSessionId(sessionId);
		session.setStatusCode(CoreConstants.CODE_STATUS_ACTIVE);
		session.setCreateUserId(userId);
		((UserSessionDao)getDao()).create(session, false);		
	}
  
	public synchronized void setSessionExpire(String sessionId) {
		if(StringUtils.isNotBlank(sessionId)) {
			deactivateSessionBySessionId(0, sessionId);
		}
    }
	
	public void deactivateSessionBySessionId(long userId, String sessionId) {
		UserSessionBean session = new UserSessionBean();
		session.setUserId(userId);
		session.setSessionId(sessionId);
		session.setUpdateUserId(userId);
		((UserSessionDao)getDao()).deactivateSessionBySessionId(session);
	}

	public void deactivateSessionByUserId(long userId) {
		((UserSessionDao)getDao()).deactivateSessionByUserId(userId);
	}

	public boolean userSessionExists(long userId, String sessionId) {
		UserSessionBean session = new UserSessionBean();
		session.setUserId(userId);
		session.setSessionId(sessionId);
		return ((UserSessionDao)getDao()).getUserSessionCount(session) > 0;
	}

	public boolean isUserSessionActive(long userId, String sessionId) {
		UserSessionBean session = new UserSessionBean();
		session.setUserId(userId);
		session.setSessionId(sessionId);
		return ((UserSessionDao)getDao()).getUserSessionStatusCode(session) == CoreConstants.CODE_STATUS_ACTIVE;
	}
	
}