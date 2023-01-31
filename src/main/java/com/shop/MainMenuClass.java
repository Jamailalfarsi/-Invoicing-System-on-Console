package com.shop;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class MainMenuClass {
public static List<String> getmenuOptionList(){
	List<String> menuOptionList= Arrays.asList("1-Shop Settings",
			"2-Manage Shop Items",
			"3-Create New Invoice(Invoices should be save/serialized)",
			"4-Report: Statistics(No Of Items,No of Invoices,Total Sales)",
            "5-Report: All Invoices(Invoice No,Invoice Date,Customer Name,No of items,Total,Balance)",
			"6-Search(1)Invoice (Search by Invoice No and Report All Invoice details with items)",
			"7-Program Statistics (Print each Main Menu Item with how many number selected)",
			"8-Exit");
	
	
	return menuOptionList;

	
		   
			
			
			
		
				

		

}
}

