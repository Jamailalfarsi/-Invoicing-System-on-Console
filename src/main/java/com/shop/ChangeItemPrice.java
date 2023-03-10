package com.shop;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

public class ChangeItemPrice {

	public void changeItemData(String user,String pass,String url){ 
		// Creating the connection using Oracle DB
	    // Note: url syntax is standard, so do grasp
	   // String url = "jdbc:mysql://localhost:3306/ShopDataBase";

	    // Username and password to access DB
	    // Custom initialization
	   // String user = "root";
	   // String pass = "root";

	    // Entering the data
	    Scanner scanner = new Scanner(System.in);
		System.out.println("Enter id: ");
		Integer idInput = scanner.nextInt();
		
		System.out.println("Enter  qty_amount_price: ");
		Integer qty_amount_price= scanner.nextInt();

		String sql = "UPDATE product SET qty_amount_price='" +  qty_amount_price
				+ "' WHERE item_ID='" + idInput + "'";
		
		
	    
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

	        // Executing query
	        int m = st.executeUpdate(sql);
	        if (m >=  1) {
	            System.out.println("updated successfully : " + sql);
	            System.out.println("***********************************");
	            
	        }
	        else
	            System.out.println("updated failed");

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



