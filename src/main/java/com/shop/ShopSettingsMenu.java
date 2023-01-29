package com.shop;

import java.util.Arrays;
import java.util.List;

public class ShopSettingsMenu {

	public static List<String> getmenuOptionList1(){
		List<String> menuOptionList1= Arrays.asList("1-Load Data(Items and invoices)",
				"2-Set Shop Name (data should be saved) ",
				"3-Set Invoice Header (Tel / Fax / Email / Website)(Data should be saved) ",
				"4- Go Back "
	           
				);
		
		
		return menuOptionList1;
	}

}
