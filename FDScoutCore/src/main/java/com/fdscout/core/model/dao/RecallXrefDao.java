package com.fdscout.core.model.dao;

import java.util.HashMap;
import java.util.Map;

import com.fdscout.core.model.bean.RecallXrefBean;
import com.fdscout.core.util.AccessFlag.BeanDaf;

public class RecallXrefDao extends CoreDao {

	@Override
	protected String buildCreateQuery() {
		StringBuilder query = new StringBuilder();
		query.append("insert into fdscoutc_dev.fds_recall_xref ");
		query.append("(recall_xref_id, meta_data_id, product_id, address_id, recall_id) ");
		query.append("values (:beanId, :metaDataId, :productId, :addressId, :recallId) ");
		return query.toString();
	}

	@SuppressWarnings("unchecked")
	public RecallXrefBean getRecallXrefByRecall(long recallId) {
		StringBuilder query = new StringBuilder();
		Map<String, Object> paramMap = new HashMap<String, Object>();
		query.append("select recall_xref_id, meta_data_id, product_id, address_id, recall_id ");
		query.append("from fds_recall_xref ");
		query.append("where recall_id = :recallId ");
		paramMap.put("recallId", recallId);		
		return (RecallXrefBean)namedParamJdbcTemplate.queryForObject(query.toString(), paramMap, getRowMapper().getInstance(BeanDaf.LOAD_BEAN_1));
	}

}