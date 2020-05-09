package com.james.spring.dbConnectionByProperty;

import java.sql.Connection;
import java.sql.SQLException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class App 
{
    public static void main( String[] args )
    {
    	
        ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        DBConnection dbConnection = context.getBean(DBConnection.class);
        dbConnection.showConnectionProperties();
        Connection connectionObj = dbConnection.getDBConnection();
        System.out.println("Connection Obj : "+connectionObj);
        
        ((AnnotationConfigApplicationContext) context).close();
        try {
			connectionObj.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
}
