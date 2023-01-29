package com.shop;

import java.io.IOException;
import java.util.Scanner;

public class MainFunction {
	
	

	public static void main(String[] args) throws IOException, InterruptedException {
		
		 
		   
		// TODO Auto-generated method stub
		
		boolean MenuExit = true;
		
		
		while( MenuExit ) {
			Scanner sc = new Scanner(System.in);
			
		
		do {
			
			//MainMenuFunction();
			for(String x:MainMenuClass.getmenuOptionList()) {
				System.out.println(x);
			int MainMenue1 = sc.nextInt();
			switch(MainMenue1) {
			case 1:
				for(String m:ShopSettingsMenu.getmenuOptionList1()) {
					System.out.println(m);	
				}
				
				 break;
				 
				
			case 2:
				
				
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

}
}
