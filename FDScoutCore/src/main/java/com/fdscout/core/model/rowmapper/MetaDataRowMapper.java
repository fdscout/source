package com.fdscout.core.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.fdscout.core.model.bean.MetaDataBean;

public class MetaDataRowMapper extends CoreRowMapper {
	@Override
	protected  Object getBean1(ResultSet rs, int rowCount) throws SQLException{
		MetaDataBean metaData = new MetaDataBean();
		metaData.setBeanId(rs.getLong("meta_data_id"));
		metaData.setResultTypeCode(rs.getInt("result_type_cd"));
		metaData.setLastUpdateDate(rs.getDate("last_update_dt"));
		metaData.setTerms(rs.getString("terms"));
		metaData.setSkippedRecordCount(rs.getInt("results_skip"));
		metaData.setTotalRecordCount(rs.getInt("results_total"));
		metaData.setLimitRecordCount(rs.getInt("results_limit"));
		metaData.setLicense(rs.getString("license"));
		metaData.setDisclaimer(rs.getString("disclaimer"));
		return metaData;
	}
}
