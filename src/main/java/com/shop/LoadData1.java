package com.shop;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

public class LoadData1 {

	public void LoadProductData(){ 
		// Creating the connection using Oracle DB
	    // Note: url syntax is standard, so do grasp
	    String url = "jdbc:mysql://localhost:3306/ShopDataBase";

	    // Username and password to access DB
	    // Custom initialization
	    String user = "root";
	    String pass = "root";

	    // Entering the data
	    Scanner scanner = new Scanner(System.in);

	    
	    System.out.println("Enter item Id");
	    Integer item_ID = scanner.nextInt();
	    
	    System.out.println("Enter item name");
	    String item_name = scanner.next();

	    System.out.println("Enter unit price");
	    String unit_price  = scanner.next();
	    
	    System.out.println("Enter quantity");
	    String quantity  = scanner.next();
	    
	    System.out.println("Enter quantity amount/price");
	    Integer qty_amount_price  = scanner.nextInt();
	    
	    
	    
	    

	    // Inserting data using SQL query
	    String sql = "insert into product values(" + item_ID
	            + ",'" + item_name + "','"+unit_price+"','"+ quantity+"',"+qty_amount_price +")";

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
	            System.out.println(
	                    "inserted successfully : " + sql);
	        System.out.println("*****************************************");}
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

