package com.james.spring.dbConnectionByProperty;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class DBConnection {
	@Value("${driver.name}")
	private String driver;
	
	@Value("${db.url}")
	private String dbURL;

	@Value("${db.username}")
	private String dbUserName;
	
	@Value("${db.password}")
	private String dbPassword;
	
	
	public void showConnectionProperties()
	{
		System.out.println("Driver : "+driver);
		System.out.println("DB URL : "+dbURL);
		System.out.println("DB Name : "+dbUserName);
		System.out.println("DB Password : "+dbPassword);
	}
	
	
	public Connection getDBConnection()
	{
		Connection connectionObj = null;
		try {
			Class.forName(driver);
			connectionObj= DriverManager.getConnection(dbURL, dbUserName, dbPassword);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return connectionObj;
	}
	
}
