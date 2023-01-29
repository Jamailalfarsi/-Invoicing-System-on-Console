package com.shop;

import java.util.Arrays;
import java.util.List;

public class ManageShopItems {

	public static List<String> getmenuOptionList2(){
		List<String> menuOptionList2= Arrays.asList("_________________________________",
				"1-Add Items (Item should be saved/serialized)",
				"2-Delete Items",
				"3-Change Item Price",
				"4-Report All Items ",
				"5-Go Back",
				"____________________________________"
	           
				);
		
		
		return menuOptionList2;
	}

}


