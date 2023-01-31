package com.shop;

import java.io.IOException;
import java.sql.DriverManager;
import java.util.Scanner;
import java.util.Stack;

public class MainFunction {

	public static void main(String[] args)  {
		
		 
		   
		// TODO Auto-generated method stub
		
		boolean MenuExit = true;

		boolean subMenuExit = true;
		
		Scanner sc = new Scanner(System.in);
		
		Stack stk = new Stack();
		
		boolean usepass = true;
		 String user,pass,url;
		
		
				
				while(usepass) {
					System.out.println("Enter Username");
					 user = sc.nextLine();
					System.out.println("Enter Password");
					 pass = sc.nextLine();	
					System.out.println("Enter url");
					url = sc.nextLine();	
					
					
					try {
						if(!user.equals("root")){
							throw new Exception("username is not found");
							
							}
					
						if(! pass.equals("root")){
							throw new Exception("password is not found");
						
						}
						 else if(! url.equals("jdbc:mysql://localhost:3306/ShopDataBase")){
							throw new Exception("url is not found");
						
						}
						
						
						else {
							System.out.println("username , password and url Successful welcome to main menue");
		
						}
						
						System.out.println("*********************************************");
				
				
				
		
		 
		while( MenuExit ) {
			
			for(String x:MainMenuClass.getmenuOptionList()) {
				System.out.println(x);}
			int MainMenue1 = sc.nextInt();
			stk.push(MainMenue1);
			switch(MainMenue1) {
			case 1:
				for(String m:ShopSettingsMenu.getmenuOptionList1()) {
					System.out.println(m);	
				}

				
				
              do {
					System.out.println("Enter what do you want load Data:");
					System.out.println("1-load customer data");
					System.out.println("2-load invoice data ");
					System.out.println("3-load item data ");
					System.out.println("4-Exit");

					int SubMenue = sc.nextInt();
					switch(SubMenue) {
					case 1:
						
						LoadData customerData=new LoadData();
						customerData.LoadcustomerData(user,pass,url);
						
						 break;
						 
					case 2:
						LoadData2 invoiceData=new LoadData2();
						invoiceData.LoadInvoiceData(user,pass,url);
						 break;
					case 3:
						LoadData1 productData=new LoadData1();
						productData.LoadProductData(user,pass,url);
					
						break;
					case 4:
						subMenuExit = false;
						
						break;
						
				}
					}while(subMenuExit);
			
				 break;
				 
			
			case 2:
				
				
				 do {
					 for(String m:ManageShopItems.getmenuOptionList2()) {
							System.out.println(m);
												
					}

						int SubMenue = sc.nextInt();
						switch(SubMenue) {
						case 1:
							
							
							 break;
							 
						case 2:
							DeleteItems deleteItemObj=new DeleteItems();
							 deleteItemObj.deletItemData(user,pass,url);
							 
							break;
						case 3:
							ChangeItemPrice itemPriceUpdate=new ChangeItemPrice();
							itemPriceUpdate.changeItemData(user,pass,url);
							break;
						case 4:	
							ReportAllItems printItems=new ReportAllItems();
							printItems.ReportItemData(user,pass,url);
							break;
							
						case 5:
							subMenuExit = false;
							
							break;
						
					}
						}while(subMenuExit);
				
				
				break;
				
			case 3:
				
				
				break;
				
			case 4:
				ReportStatistics noOfItemsObj=new ReportStatistics();
				noOfItemsObj.StaticsFunction(user,pass,url);
				
				break;
				
			case 5:	
				ReportInvoice printInvoice=new ReportInvoice();
				printInvoice.ReportInvoiceData(user,pass,url);
				break;
				
			case 6:
				SearchInvoice searchObj=new SearchInvoice();
				searchObj.sreachInvoicById(user,pass,url);
			case 7:
				while (stk.empty() == false) {
					System.out.println(stk.pop());
				
				// {@code true} if and only if this stack contains
				// no items; {@code false} otherwise.	

			}
				break;
				
			case 8:
				System.out.println("Are you sure you want to exit? if Yes press 0 if No press 1");
				Integer userInput = sc.nextInt();
				if(userInput==0) {
					MenuExit =false;
					System.out.println("The program is Exit");
					
				}
				else if (userInput==1) {
					
					MenuExit =true;}
				break;
				
//			case 9:
//				SetShopName shopObj=new SetShopName();
//				shopObj.ShopNameData();
//				break;
			
			
		
			}
		

	}
		}
				catch(Exception e){
					System.out.println("Execption:"+ e.getMessage() );
					
				}

				}
				
				
			usepass=false;	
		
	
}
}
