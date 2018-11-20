package com.fdscout.core.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.fdscout.core.model.bean.RecallXrefBean;

public class RecallXrefRowMapper extends CoreRowMapper {
	@Override
	protected  Object getBean1(ResultSet rs, int rowCount) throws SQLException{
		RecallXrefBean recallXref = new RecallXrefBean();
		recallXref.setBeanId(rs.getLong("recall_xref_id"));
		recallXref.setMetaDataId(rs.getLong("meta_data_id"));
		recallXref.setProductId(rs.getLong("product_id"));
		recallXref.setAddressId(rs.getLong("address_id"));
		recallXref.setRecallId(rs.getLong("recall_id"));
		return recallXref;
	}
}
