package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class DemoTest {

	public static void main(String[] args) throws Exception{
		//Class.forName("com.mysql.jdbc.Driver");		// MySQL 5.x 
		Class.forName("com.mysql.cj.jdbc.Driver");		// MySQL 8.x 
		System.out.println("Driver Loaded successfully");
Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch8", "root", "root@123");		
		System.out.println("Connected successfully");
		Scanner sc = new Scanner(System.in);
		// insert query 
//		System.out.println("Enter the id");
//		int id = sc.nextInt();
//		System.out.println("Enter the name");
//		//sc.nextLine();			// hold the enter key
//		String name = sc.next();
//		
//		System.out.println("Enter the salary");
//		float salary = sc.nextFloat();
//		PreparedStatement pstmt = con.prepareStatement("insert into employee values(?,?,?)");
//		pstmt.setInt(1, id);
//		pstmt.setString(2, name);
//		pstmt.setFloat(3, salary);
//		int res = pstmt.executeUpdate();			// DML Operation 
//		if(res>0) {
//			System.out.println("Record inserted successfully..");
//		}
		
		// update query 
		
//		System.out.println("Enter the id");
//		int id = sc.nextInt();
//		System.out.println("Enter the salary");
//		float salary = sc.nextFloat();
//		PreparedStatement pstmt = con.prepareStatement("update employee set salary = ? where id = ?");
//		pstmt.setFloat(1, salary);
//		pstmt.setInt(2, id);
//		int res = pstmt.executeUpdate();			// DML Operation 
//		if(res>0) {
//			System.out.println("Record udpated successfully..");
//		}else {
//			System.out.println("Record didn't update");
//		}
			
		// Retrieve records 
		PreparedStatement pstmt = con.prepareStatement("select * from employee");
		ResultSet rs = pstmt.executeQuery();			// select clause 
		while(rs.next()) {
			System.out.println("id is "+rs.getInt(1)+" Name is "+rs.getString(2)+" Salary is "+rs.getFloat(3));
		}
		
		rs.close();
		pstmt.close();
		con.close();
	}

}
