package com.example.demo.dao;



import javax.sql.DataSource;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
//import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.stereotype.Repository;
import org.springframework.util.ObjectUtils;

//import com.sei.fuels.outage.entity.FisFuelOutageBO;
//import com.sei.fuels.outage.transformer.FisFuelOutageMapper;

@Component
public class OutageDAOImpl {
	
	 Logger logger = LogManager.getLogger(OutageDAOImpl.class);
	
	 JdbcTemplate jdbcTemplate;
	
	 @Autowired
	   public OutageDAOImpl( @Qualifier("H2DataSource") DataSource dataSource) {
    // public OutageDAOImpl( @Qualifier("sparkDataSource") DataSource dataSource) {
		 jdbcTemplate = new JdbcTemplate(dataSource);
     }
	 
	/*
	 * public int getOutageCount(String organization, Integer year, Integer
	 * processDate, String processDateTS, String carrier) { logger.
	 * info("Inside getOutageCount organization: {}, year: {}, processDate: {}, processDateTS: {} carrier: {}"
	 * , organization, year, processDate, processDateTS, carrier); StringBuffer
	 * transactionCountSqlSb = new
	 * StringBuffer("SELECT COUNT(*) FROM digital.fis_fuel_outage_history WHERE organization = '"
	 * + organization + "'"); if(year > 0) {
	 * transactionCountSqlSb.append(" and year = " + year); }
	 * 
	 * // TODO: USE if process_dt_int - INTEGER if specific daily count is requested
	 * //if(processDate > 0) {
	 * //transactionCountSqlSb.append(" and process_dt_int = " + processDate); //}
	 * 
	 * // USE LESS THAN process_dttm - TIMESTAMP AND year = YYYY if Year Till
	 * Process Date count is requested if(processDate > 0) {
	 * transactionCountSqlSb.append(" and process_dttm <= TIMESTAMP('" +
	 * processDateTS + "')"); } if(!ObjectUtils.isEmpty(carrier)) {
	 * transactionCountSqlSb.append(" and carrier = '" + carrier + "'"); }
	 * 
	 * logger.info("Before Spark SQL call, SQL: {}",
	 * transactionCountSqlSb.toString()); int cnt =
	 * jdbcTemplate.queryForObject(transactionCountSqlSb.toString(), Integer.class);
	 * 
	 * return cnt; }
	 * 
	 */
	 public int getOutageCount1() {
		// logger.info("Inside getOutageCount organization: {}, year: {}, processDate: {}, processDateTS: {} carrier: {}", organization, year, processDate, processDateTS, carrier);
		// StringBuffer query = new StringBuffer("SELECT COUNT(*) FROM digital.fis_fuel_outage_history");
		// StringBuffer query = new StringBuffer("SELECT COUNT(*) FROM digital.fis_fuel_outage_history");
		 
		 StringBuffer query = new StringBuffer("SELECT COUNT(*) FROM BOOK");
		 logger.info("Before Spark SQL call, SQL: {}", query.toString());
		 int cnt = jdbcTemplate.queryForObject(query.toString(), Integer.class);
		 
		 return cnt;
	 }
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
}