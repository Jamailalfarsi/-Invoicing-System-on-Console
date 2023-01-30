package com.shop;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

public class LoadData2 {

	public void LoadInvoiceData(){ 
		// Creating the connection using Oracle DB
	    // Note: url syntax is standard, so do grasp
	    String url = "jdbc:mysql://localhost:3306/ShopDataBase";

	    // Username and password to access DB
	    // Custom initialization
	    String user = "root";
	    String pass = "root";

	    // Entering the data
	    Scanner scanner = new Scanner(System.in);

	    
	    System.out.println("Enter id");
	    Integer id = scanner.nextInt();
	    
	    System.out.println("Enter shop name");
	    String shop_name = scanner.next();

	    System.out.println("Enter customer name");
	    String customer_full_name  = scanner.next();
	    
	    System.out.println("Enter phone number");
	    String phone_number  = scanner.next();
	    
	    System.out.println("Enter invoice date");
	    String invoice_date  = scanner.next();
	    
	    System.out.println("Enter number of items");
	    Integer number_of_items = scanner.nextInt();
	    
	    System.out.println("Enter total amount");
	    Integer total_amount = scanner.nextInt();
	    
	    System.out.println("Enter Paid amount");
	    String paid_amount = scanner.next();
	    
	    
	    System.out.println("Enter Tel/Fax/Email/website");
	    String Header_Tel_Fax_Email_Website = scanner.next();
	    
	    System.out.println("Enter balance");
	    Integer balance = scanner.nextInt();
	    
	    
	    
	    

	    // Inserting data using SQL query
	    String sql = "insert into invoice values(" + id
	            + ",'" +  shop_name +"','" +customer_full_name +"','"+phone_number +"','"+
	            invoice_date +"',"+number_of_items+","+total_amount+",'"+
	            paid_amount+"','"+Header_Tel_Fax_Email_Website+"',"+balance +")";

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
	            System.out.println("**************************************************");}
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

