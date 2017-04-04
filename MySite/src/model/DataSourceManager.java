package model;

import javax.sql.DataSource;

import org.apache.tomcat.dbcp.dbcp2.BasicDataSource;

/**
 * DBCP
 * WAS(Tomcat)에서 제공하는 DBCP(DataBase Connection Pool)을 생성해 사용한다
 * WAS별로 제공하는 DBCP는 다양하므로 
 * javax.sql.DataSource Interface타입으로 관리한다
 * @author kim moon il
 *
 */
public class DataSourceManager {
	private static DataSourceManager instance=new DataSourceManager();
	private DataSource dataSource;
	private DataSourceManager(){
		//tomcat DBCP 생성
		BasicDataSource dbcp=new BasicDataSource();
		dbcp.setDriverClassName("oracle.jdbc.driver.OracleDriver");
		dbcp.setUrl("jdbc:oracle:thin:@127.0.0.1:1521:xe");
		dbcp.setUsername("scott");
		dbcp.setPassword("tiger");
		dataSource=dbcp;
		System.out.println(dbcp);
	}
	public static DataSourceManager getInstance(){
		return instance;
	}
	public DataSource getDataSource(){
		return dataSource;
	}
	
}
