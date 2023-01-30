package com.shop;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ReportInvoice {
	public void ReportInvoiceData(){ 
		// Creating the connection using Oracle DB
	    // Note: url syntax is standard, so do grasp
	    String url = "jdbc:mysql://localhost:3306/ShopDataBase";

	    // Username and password to access DB
	    // Custom initialization
	    String user = "root";
	    String pass = "root";

	    
		String sql = "SELECT * FROM invoice";
		
		
	    
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
				Integer invoice_No = resultSet.getInt("id");
				String invoice_date  = resultSet.getString("invoice_date");
				String customer_full_name  =resultSet.getString("customer_full_name");
				Integer number_of_items= resultSet.getInt("number_of_items");
				Integer total_amount = resultSet.getInt("total_amount");
				Integer balance= resultSet.getInt("balance");

				System.out.println(invoice_No  + ", " + invoice_date  + ", "+customer_full_name +", " + number_of_items + " ,"
						+total_amount+", " +balance);
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




