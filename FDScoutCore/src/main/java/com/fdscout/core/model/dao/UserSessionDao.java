package com.fdscout.core.model.dao;

import java.util.HashMap;
import java.util.Map;

import com.fdscout.core.model.bean.UserSessionBean;
import com.fdscout.core.util.CoreUtility;
import com.fdscout.core.util.entity.CoreConstants;

public class UserSessionDao extends CoreDao {

	@Override
	protected String buildCreateQuery() {
		StringBuilder query = new StringBuilder();
		query.append("insert into ps_user_session ");
		query.append("(user_id, session_id, status_cd, create_user_id, create_time)  ");
		query.append("values (:userId, :sessionId, :statusCode, :createUserId, :createTime) ");
		return query.toString();
	}
	
	public  void deactivateSessionBySessionId(UserSessionBean userSession) {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		StringBuilder query = new StringBuilder();
		query.append("update ps_user_session  	");
		query.append("set status_cd = :inactiveStatus, update_user_id = :updateUserId, update_time = :updateTime	");
		query.append("where session_id = :sessionId ");
		query.append("and status_cd = :activeStatus ");
		paramMap.put("inactiveStatus", CoreConstants.CODE_STATUS_INACTIVE);
		paramMap.put("activeStatus", CoreConstants.CODE_STATUS_ACTIVE);
		paramMap.put("updateUserId", userSession.getUserId());
		paramMap.put("updateTime", CoreUtility.getCurrentTimestamp());
		paramMap.put("sessionId", userSession.getSessionId());
		namedParamJdbcTemplate.update(query.toString(), paramMap);
	}

	public  void deactivateSessionByUserId(long userId) {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		StringBuilder query = new StringBuilder();
		query.append("update ps_user_session  	");
		query.append("set status_cd = :inactiveStatus, update_user_id = :updateUserId, update_time = :updateTime	");
		query.append("where user_id = :userId ");
		query.append("and status_cd = :activeStatus ");

		paramMap.put("inactiveStatus", CoreConstants.CODE_STATUS_INACTIVE);
		paramMap.put("activeStatus", CoreConstants.CODE_STATUS_ACTIVE);
		paramMap.put("updateUserId", userId);
		paramMap.put("updateTime", CoreUtility.getCurrentTimestamp());
		paramMap.put("userId", userId);
		namedParamJdbcTemplate.update(query.toString(), paramMap);
	}

	public  int getUserSessionCount(UserSessionBean userSession) {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		StringBuilder query = new StringBuilder();
		query.append("select count(user_id) ");
		query.append("from ps_user_session	");
		query.append("where session_id = :sessionId ");
		query.append("and user_id = :userId ");

		paramMap.put("userId", userSession.getUserId());
		paramMap.put("sessionId", userSession.getSessionId());
		return namedParamJdbcTemplate.queryForObject(query.toString(), paramMap, Integer.class);
	}

	public  int getUserSessionStatusCode(UserSessionBean userSession) {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		StringBuilder query = new StringBuilder();
		query.append("select status_cd from ps_user_session where session_id = :sessionId and user_id = :userId ");

		paramMap.put("userId", userSession.getUserId());
		paramMap.put("sessionId", userSession.getSessionId());
		return namedParamJdbcTemplate.queryForObject(query.toString(), paramMap, Integer.class);
	}

//	public void deactivateAllUserSessions() {
//		Map<String, Object> paramMap = new HashMap<String, Object>();
//		StringBuilder query = new StringBuilder();
//		query.append("update ps_user_session ");
//		query.append("set status_cd = :inactiveStatus, update_user_id = :updateUserId, update_time = :updateTime	");
//		query.append("where status_cd = :activeStatus  ");
//
//		paramMap.put("inactiveStatus", PresphereConstants.CODE_STATUS_INACTIVE);
//		paramMap.put("updateUserId", 0);
//		paramMap.put("updateTime", CoreUtility.getCurrentTimestamp());
//		paramMap.put("activeStatus", PresphereConstants.CODE_STATUS_ACTIVE);
//		namedParamJdbcTemplate.update(query.toString(), paramMap);	
//	}
}
