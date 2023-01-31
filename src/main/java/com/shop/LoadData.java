package com.shop;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

public class LoadData {
	
	public void LoadcustomerData(String user,String pass){ 
	// Creating the connection using Oracle DB
    // Note: url syntax is standard, so do grasp
     String url = "jdbc:mysql://localhost:3306/ShopDataBase";

    // Username and password to access DB
    // Custom initialization
      // String user = "root";
      // String pass = "root";

    // Entering the data
    Scanner scanner = new Scanner(System.in);

    
    System.out.println("Enter Custumer ID");
    Integer customer_ID = scanner.nextInt();
    
    System.out.println("Enter Customer Name");
    String customer_name = scanner.next();

    System.out.println("Enter Invoice number");
    Integer Invoice_No  = scanner.nextInt();

    // Inserting data using SQL query
    String sql = "insert into customer values(" + customer_ID
            + ",'" + customer_name + "'," + Invoice_No + ")";

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
