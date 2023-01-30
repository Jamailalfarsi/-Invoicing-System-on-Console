package com.shop;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Date;
import java.util.Scanner;

public class ReportAllItems {

	public void ReportItemData(){ 
		// Creating the connection using Oracle DB
	    // Note: url syntax is standard, so do grasp
	    String url = "jdbc:mysql://localhost:3306/ShopDataBase";

	    // Username and password to access DB
	    // Custom initialization
	    String user = "root";
	    String pass = "root";

	    
		String sql = "SELECT * FROM product";
		
		
	    
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
				Integer item_ID = resultSet.getInt("item_ID");
				String item_name = resultSet.getString("item_name");
				String unit_price  =resultSet.getString("unit_price");
				String quantity= resultSet.getString("quantity");
				Integer qty_amount_price = resultSet.getInt("qty_amount_price");
				

				System.out.println(item_ID  + ", " + item_name  + ", "+unit_price +", " + quantity + " ,"
						+ qty_amount_price);
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






