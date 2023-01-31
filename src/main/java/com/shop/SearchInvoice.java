package com.shop;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class SearchInvoice {

	public void sreachInvoicById(){ 
		// Creating the connection using Oracle DB
	    // Note: url syntax is standard, so do grasp
	    String url = "jdbc:mysql://localhost:3306/ShopDataBase";

	    // Username and password to access DB
	    // Custom initialization
	    String user = "root";
	    String pass = "root";

	    
	    Scanner scanner = new Scanner(System.in);
		System.out.println("Enter id: ");
		Integer idInput = scanner.nextInt();

		String sql = " SELECT*FROM invoice INNER JOIN product ON invoice.id=product.item_ID where id='" + idInput + "'";

		
		
	    
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
				String shop_name=resultSet.getString("shop_name");
				String phone_number  = resultSet.getString("phone_number");
				String invoice_date  = resultSet.getString("invoice_date");
				String customer_full_name  =resultSet.getString("customer_full_name");
				Integer number_of_items= resultSet.getInt("number_of_items");
				Integer total_amount = resultSet.getInt("total_amount");
				String paid_amount   = resultSet.getString("paid_amount");
				String Header_Tel_Fax_Email_Website  = resultSet.getString("Header_Tel_Fax_Email_Website");
				Integer balance= resultSet.getInt("balance");
				
				Integer item_ID = resultSet.getInt("item_ID");
				String item_name = resultSet.getString("item_name");
				String unit_price  =resultSet.getString("unit_price");
				String quantity= resultSet.getString("quantity");
				Integer qty_amount_price = resultSet.getInt("qty_amount_price");

				System.out.println(invoice_No  + ", "+shop_name+", "+customer_full_name+", "+phone_number+", " + invoice_date +", " + number_of_items + " ,"
						+total_amount+", "+paid_amount +", "+Header_Tel_Fax_Email_Website +", "+balance+", " +item_ID  + ", " + item_name  + ", "+unit_price +", " + quantity + " ,"
						+ qty_amount_price);
			}


	        // Executing query
	        int m = st.executeUpdate(sql);
	        if (m >=  1) {
	            System.out.println("Search successfully : " + sql);
	            System.out.println("***********************************");
	            
	        }
	        else
	            System.out.println("Search failed");

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




