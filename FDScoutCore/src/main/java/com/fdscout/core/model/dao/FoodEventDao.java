package com.fdscout.core.model.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.fdscout.core.model.bean.FoodEventBean;
import com.fdscout.core.util.AccessFlag.BeanDaf;

public class FoodEventDao extends CoreDao {

	@Override
	protected String buildCreateQuery() {
		StringBuilder query = new StringBuilder();
		query.append("insert into fdscoutc_dev.fds_food_event ");
		query.append("(food_event_id, report_nr, create_dt, start_dt, consumer_gender, consumer_age, consumer_age_unit, meta_data_id) ");
		query.append("values (:beanId, :reportNumber, :createDate, :startDate, :consumerGender, :consumerAge, :consumerAgeUnit, :metaDataId) ");
		return query.toString();
	}

	@SuppressWarnings("unchecked")
	public FoodEventBean getFoodEventById(long foodEventId) {
		StringBuilder query = new StringBuilder();
		Map<String, Object> paramMap = new HashMap<String, Object>();
		query.append("select food_event_id, report_nr, create_dt, start_dt, consumer_gender, consumer_age, consumer_age_unit, status_id, create_time, meta_data_id ");
		query.append("from fdscoutc_dev.fds_food_event ");
		query.append("where food_event_id = :foodEventId ");
		paramMap.put("foodEventId", foodEventId);		
		return (FoodEventBean)namedParamJdbcTemplate.queryForObject(query.toString(), paramMap, getRowMapper().getInstance(BeanDaf.LOAD_BEAN_1));
	}

	public List<String> getReportNumberSet() {
		StringBuilder query = new StringBuilder();
		Map<String, Object> paramMap = new HashMap<String, Object>();
		query.append("select report_nr ");
		query.append("from fdscoutc_dev.fds_food_event ");
		query.append("order by report_nr "); 
		return namedParamJdbcTemplate.queryForList(query.toString(), paramMap, String.class);
	}
}