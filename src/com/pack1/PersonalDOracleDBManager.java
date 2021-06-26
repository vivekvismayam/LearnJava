package com.pack1;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class PersonalDOracleDBManager {
	
	public static void DBaccessing() {
	System.out.println("dbs start");
	String sql="select * from Employee";
	//System.out.println(sql);
	try {
		//Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection conn =DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","dbuser","ODB123");
		PreparedStatement ps= conn.prepareStatement(sql);
		//CallableStatement ps=conn.prepareCall(sql);
		//ps.setString(1,"10000");
		ResultSet rs=ps.executeQuery();
		while(rs.next())
		{
		   // rs.getString(1); //or rs.getString("column name");
		   //System.out.println( rs.getString(1));
		   System.out.println( rs.getString(2));
		   //System.out.println( rs.getString(3));
		   //System.out.println( rs.getString(4));
		   //System.out.println( rs.getString(5));
		   //System.out.println( rs.getString(6));
		   //System.out.println( rs.getString(7));
		}
		
		    System.out.println("End of result dislay;db connection will be closed");
		conn.close();
	} catch (Exception e) {
		e.printStackTrace();
	}  
	
	System.out.println("End");
	}
}


