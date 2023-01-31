package com.shop;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ReportStatistics {

	public void StaticsFunction(){ 
		// Creating the connection using Oracle DB
	    // Note: url syntax is standard, so do grasp
	    String url = "jdbc:mysql://localhost:3306/ShopDataBase";

	    // Username and password to access DB
	    // Custom initialization
	    String user = "root";
	    String pass = "root";

	    
		String sql = "SELECT (SELECT COUNT(*)FROM product ) AS No_Of_Items,(SELECT COUNT(*)FROM invoice ) AS No_of_Invoices ,(SELECT Sum(total_amount )FROM invoice ) AS Total_sales ";
		
		
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
				Integer number_Of_items = resultSet.getInt("No_Of_Items");
				Integer No_of_Invoices = resultSet.getInt("No_of_Invoices");
				Integer total_amount = resultSet.getInt("Total_sales");
				
				
				
				System.out.println("No_Of_Items="+number_Of_items+","+"No_of_Invoices="+No_of_Invoices+","+"Total_sales="+total_amount);
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









