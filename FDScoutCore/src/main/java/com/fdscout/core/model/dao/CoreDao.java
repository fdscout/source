package com.fdscout.core.model.dao;

import javax.sql.DataSource;

import org.apache.log4j.Logger;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;

import com.fdscout.core.model.bean.CoreBean;
import com.fdscout.core.model.rowmapper.CoreRowMapper;
import com.fdscout.core.util.CoreUtility;

public abstract class CoreDao {
	protected JdbcTemplate jdbcTemplate;
	protected NamedParameterJdbcTemplate namedParamJdbcTemplate;
	protected DataSource dataSource;
	protected CoreRowMapper rowMapper;
	protected SqlParameterSource paramSource;

	public long create(CoreBean coreBean) {
		long beanId = 0l;
		try {
			coreBean.setCreateTime(CoreUtility.getCurrentTimestamp());
			KeyHolder keyHolder = new GeneratedKeyHolder();
			createNewRow(coreBean, buildCreateQuery(), keyHolder);
			beanId = keyHolder.getKey().longValue();
			coreBean.setBeanId(beanId);
		} catch (Exception e) {
			e.printStackTrace();
			Logger.getLogger(this.getClass()).fatal(e);
			throw e;
		}
		return beanId;
	}

	
	public int update(CoreBean fdscout) {
		return 0;
	}
	
	public void create(CoreBean fdscoutBean, boolean newSequence) {
		long beanId = 0l;
		try {
			fdscoutBean.setCreateTime(CoreUtility.getCurrentTimestamp());
			KeyHolder keyHolder = new GeneratedKeyHolder();
			createNewRow(fdscoutBean, buildCreateQuery(), keyHolder);
			if (newSequence) {
				beanId = keyHolder.getKey().longValue();
				fdscoutBean.setBeanId(beanId);
			}
		} catch (Exception e) {
			Logger.getLogger(this.getClass()).fatal(e);
			e.printStackTrace();
		}
	}

	protected abstract String buildCreateQuery();

	// protected long getNextSequence() {
	// return new OracleSequenceMaxValueIncrementer(dataSource,
	// sequenceName).nextLongValue();
	// }

	public SqlParameterSource getParamSource() {
		return paramSource;
	}

	public void setParamSource(SqlParameterSource paramSource) {
		this.paramSource = paramSource;
	}

	public CoreRowMapper getRowMapper() {
		return rowMapper;
	}

	public void setRowMapper(CoreRowMapper rowMapper) {
		this.rowMapper = rowMapper;
	}

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public NamedParameterJdbcTemplate getNamedParamJdbcTemplate() {
		return namedParamJdbcTemplate;
	}

	public void setNamedParamJdbcTemplate(NamedParameterJdbcTemplate namedParamJdbcTemplate) {
		this.namedParamJdbcTemplate = namedParamJdbcTemplate;
	}

	protected int createNewRow(CoreBean bean, String query, KeyHolder keyHolder) {
		bindingParameterSource(bean);
		return namedParamJdbcTemplate.update(query, paramSource, keyHolder);
	}

	protected void bindingParameterSource(CoreBean bean) {
		paramSource = new BeanPropertySqlParameterSource(bean);
	}

	public DataSource getDataSource() {
		return dataSource;
	}

	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}
}