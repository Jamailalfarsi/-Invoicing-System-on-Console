package com.shop;

import java.io.IOException;
import java.util.Scanner;

public class MainFunction {
	
	

	public static void main(String[] args) throws IOException, InterruptedException {
		
		 
		   
		// TODO Auto-generated method stub
		
		boolean MenuExit = true;

		boolean subMenuExit = true;
		
		
		
		while( MenuExit ) {
			Scanner sc = new Scanner(System.in);
			
			
		do {
			
			for(String x:MainMenuClass.getmenuOptionList()) {
				System.out.println(x);
			int MainMenue1 = sc.nextInt();
			switch(MainMenue1) {
			case 1:
				for(String m:ShopSettingsMenu.getmenuOptionList1()) {
					System.out.println(m);	
				}

				
				
              do {
					System.out.println("Enter what do you want load:");
					System.out.println("1-load invoice data ");
					System.out.println("2-load item data ");
					System.out.println("3-load customer data");
					System.out.println("4-Exit");

					int SubMenue = sc.nextInt();
					switch(SubMenue) {
					case 1:
						
						

						 break;
						 
					case 2:
						
						 break;
					case 3:
						LoadData customerData=new LoadData();
						customerData.LoadcustomerData();
					
						break;
					case 4:
						subMenuExit = false;
						
						break;
					
				}
					}while(subMenuExit);
				
				 break;
				 
				
			case 2:
				for(String m:ManageShopItems.getmenuOptionList2()) {
					System.out.println(m);	
				}
				
				break;
				
			case 3:
				
				
				break;
				
			case 4:
				
				
				
				break;
				
				
				
			}
			}
			}while(true);


		//MenuExit =false;


		

	}
		MenuExit =false;

}
}
