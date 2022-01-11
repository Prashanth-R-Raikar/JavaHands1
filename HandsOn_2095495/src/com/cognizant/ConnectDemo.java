package com.cognizant;
import java.sql.Connection;
import java.sql.DriverManager;


public class ConnectDemo {
	static Connection connection;
	
	public static Connection createConn()  {
		try {
		connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/ipmjava", "root", "12345");
		}catch (Exception e) {
			System.out.println("Error in DB Connection : "+e);
		}
		return connection;
	}
	
	public static void closeConn() {
		try {
			connection.close();
		} catch (Exception e) {
			System.out.println("Error in DB Connection Close : "+e);
		}
	}

}