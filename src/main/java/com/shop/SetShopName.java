package com.shop;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

public class SetShopName {

	public void ShopNameData(String user,String pass,String url){ 
		// Creating the connection using Oracle DB
	    // Note: url syntax is standard, so do grasp
	    //String url = "jdbc:mysql://localhost:3306/ShopDataBase";

	    // Username and password to access DB
	    // Custom initialization
	    // String user = "root";
	    // String pass = "root";

	    // Entering the data
	    Scanner scanner = new Scanner(System.in);

	    System.out.println("Enter Shop Id");
	    Integer shop_Id= scanner.nextInt();
	    
	    System.out.println("Enter Shop Name");
	    String shop_name = scanner.next();
	    

	    // Inserting data using SQL query
	    String sql = "insert into shop values("+shop_Id+",'"+shop_name+")";

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
	        if (m >=  1)
	            System.out.println(
	                    "inserted successfully : " + sql);
	        else
	            System.out.println("insertion failed");

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

	


