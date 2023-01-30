package com.shop;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ReportStatics {

	public void StaticsFunction(){ 
		// Creating the connection using Oracle DB
	    // Note: url syntax is standard, so do grasp
	    String url = "jdbc:mysql://localhost:3306/ShopDataBase";

	    // Username and password to access DB
	    // Custom initialization
	    String user = "root";
	    String pass = "root";

	    
		String sql = "SELECT (SELECT COUNT(*)FROM invoice ) AS number_of_items,(SELECT COUNT(*)FROM product  ) AS item_ID ,(SELECT Sum(total_amount )FROM invoice ) AS total_amount";
		
		
	    // Connection class object
	    Connection con = null;

	    // Try block to check for exceptions
	    try {

	        Driver driver = (Driver) Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
	        // Registering drivers
	        DriverManager.registerDriver(driver);

	        // Reference to connection interface
	        con = DriverManager.getConnection(url, user,
	                pass);

	        // Creating a statement
	        Statement st = con.createStatement();
	       
	        
	        ResultSet resultSet = st.executeQuery(sql);
	      
			 
			while (resultSet.next()) {
				Integer number_Of_items = resultSet.getInt("number_Of_items");
				Integer item_ID = resultSet.getInt("item_ID");
				Integer total_amount = resultSet.getInt("total_amount");
				
				
				
				System.out.println(number_Of_items+","+item_ID+","+total_amount);
			}

	        // Executing query
	        int m = st.executeUpdate(sql);
	        if (m >=  1) {
	            System.out.println("Printed successfully : " + sql);
	            System.out.println("***********************************");
	            
	        }
	        else
	            System.out.println("Printed failed");

	        // Closing the connections
	        con.close();
	    }

	    // Catch block to handle exceptions
	    catch (Exception ex) {
	        // Display message when exceptions occurs
	        System.err.println(ex);
	    }
	}

		

	}









