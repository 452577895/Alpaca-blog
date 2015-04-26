package com.csust.alpacablog.dbconnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


public class DBConnection {
	private final static String CLASSNAME = "com.mysql.jdbc.Driver";
	private final static String URL = "jdbc:mysql://localhost:3306/alpacablog?useUnicode=true&characterEncoding=UTF-8";
	private final static String USERNAME = "root";
	private final static String PASSWORD = "";

	public static Connection getConn() {
		Connection conn = null;
		try {
			Class.forName(CLASSNAME);
			conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
		} catch (Exception e) {
			e.printStackTrace();
		}
		if(conn!=null){
			System.out.println("连接成功");
		}
		return conn;
	}

	public static void closeAll(Connection conn, PreparedStatement ps, ResultSet rs) {
		try {
			if (conn != null) {
				conn.close();
			}
			if (ps != null) {
				ps.close();
			}
			if (rs != null) {
				rs.close();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	public  static void  main(String args[]){
		getConn();
	}
}
