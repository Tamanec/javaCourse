package com.epam.edu;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Launcher {

	/**
	 * @param args
	 */
	public static void main(String[] args) {		
		loadJDBCDriver();		
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		try {
			conn = DriverManager.getConnection("jdbc:mysql://localhost/home?user=root&password=121131");			
			stmt = conn.createStatement(ResultSet.TYPE_FORWARD_ONLY, ResultSet.CONCUR_UPDATABLE);
			rs = stmt.executeQuery("select * from test");
						
			
			while (rs.next()) {
				System.out.println(rs.getString("name") + " - " + rs.getInt("age"));
				
				if (rs.getString("name").equals("Зазо")) {
					rs.updateString("name", "Зазози");
					rs.updateRow();
				} else if (rs.getString("name").equals("Зазози")) {
					rs.updateString("name", "Зазо");
					rs.updateRow();
				}
				
				System.out.println(rs.getString("name") + " - " + rs.getInt("age"));
			}			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {			
					e.printStackTrace();
				}
			}
		}
						
		
	}

	private static void loadJDBCDriver() {
		try {
			Class.forName("com.mysql.jdbc.Driver").newInstance();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

}
