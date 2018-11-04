package com.fdscout.core.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.fdscout.core.model.bean.CoreBean;
import com.fdscout.core.util.AccessFlag.BeanDaf;

@SuppressWarnings("rawtypes")
public abstract class CoreRowMapper implements RowMapper {
		protected Object accessFlag;

		@Override
		public Object mapRow(ResultSet resultSet, int rowCount) throws SQLException {
			switch ((BeanDaf)getAccessFlag()) {
			case LOAD_BEAN_1:
				return getBean1(resultSet, rowCount);
			case LOAD_BEAN_2:
				return getBean2(resultSet, rowCount);
			case LOAD_BEAN_3:
				return getBean3(resultSet, rowCount);
			case LOAD_BEAN_4:
				return getBean4(resultSet, rowCount);
			case LOAD_BEAN_5:
				return getBean5(resultSet, rowCount);
			case LOAD_BEAN_6:
				return getBean6(resultSet, rowCount);
			case LOAD_BEAN_7:
				return getBean7(resultSet, rowCount);
			case LOAD_BEAN_8:
				return getBean8(resultSet, rowCount);
			case LOAD_BEAN_9:
				return getBean9(resultSet, rowCount);
			case LOAD_BEAN_10:
				return getBean10(resultSet, rowCount);
			default:
				break;
			}
			return null;
		}

		
		
		protected  Object getBean1(ResultSet resultSet, int rowCount) throws SQLException {return null;};
		protected  Object getBean2(ResultSet resultSet, int rowCount) throws SQLException {return null;};
		protected  Object getBean3(ResultSet resultSet, int rowCount) throws SQLException {return null;};
		protected  Object getBean4(ResultSet resultSet, int rowCount) throws SQLException {return null;};
		protected  Object getBean5(ResultSet resultSet, int rowCount) throws SQLException {return null;};
		protected  Object getBean6(ResultSet resultSet, int rowCount) throws SQLException {return null;};
		protected  Object getBean7(ResultSet resultSet, int rowCount) throws SQLException {return null;};
		protected  Object getBean8(ResultSet resultSet, int rowCount) throws SQLException {return null;};
		protected  Object getBean9(ResultSet resultSet, int rowCount) throws SQLException {return null;};
		protected  Object getBean10(ResultSet resultSet, int rowCount) throws SQLException {return null;};


		public Object getAccessFlag() {
			return accessFlag;
		}
		public void setAccessFlag(Object accessFlag) {
			this.accessFlag = accessFlag;
		}

	   	public CoreRowMapper getInstance(Object accessFlag) {
			this.accessFlag = accessFlag;
			return this;
		}

	   protected void setUserInfo(ResultSet rs, CoreBean bean) throws SQLException{
	   	bean.setCreateUserId(rs.getLong("create_user_id"));
	   	bean.setUpdateUserId(rs.getLong("update_user_id"));
	   	bean.setStatusCode(rs.getInt("status_cd"));
	   	bean.setCreateTime(rs.getTimestamp("create_time"));
	   	bean.setUpdateTime(rs.getTimestamp("update_time"));
	}


}
