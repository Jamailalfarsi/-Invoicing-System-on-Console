package com.shop;

import java.io.IOException;
import java.util.Scanner;

public class MainMenu {
	
	public static void MainMenuFunction() {
		
		System.out.println("****************************************************");
		System.out.println("Select one of the Shop Setting options:");
		System.out.println("1.Load Data (Items and invoices)");
		System.out.println("2.Set Shop Name (data should be saved)  ");
		System.out.println("3.Set Invoice Header (Tel / Fax / Email / Website)");
		System.out.println("4.Go Back ");
		System.out.println("****************************************************");
		
	}

	public static void main(String[] args) throws IOException, InterruptedException {
		
		 
		   
		// TODO Auto-generated method stub
		
		boolean MenuExit = true;
		
		
		while( MenuExit ) {
			Scanner sc = new Scanner(System.in);
			
		
		do {
			
			MainMenuFunction();
			int MainMenue1 = sc.nextInt();
			switch(MainMenue1) {
			case 1:
				
				
				 break;
				 
				
			case 2:
				
				
				break;
				
			case 3:
				
				
				break;
				
			case 4:
				
				
				
				break;
				
				
				
			
		}
			}while(true);

	}
		 MenuExit =false;


		

	}

}
