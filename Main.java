package com.virtualKeyRepository;

import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		App app = new App();
		app.welcomeScreen();
		
		Scanner sc = new Scanner(System.in);
		while(true)
		{
			System.out.println("Enter 1 : to get file names in ascending order");
			System.out.println("Enter 2 : for Business Level Operation");
			System.out.println("Enter 3 : to close the Application");
			int choice = sc.nextInt();
			
			if(choice == 1)
			{
				app.ascendingOrderFileNames();
			}
			else if(choice == 2)
			{
				app.businessLevelOperation();
			}
			else if(choice == 3)
			{
				app.closeApplication();
			}
			else
			{
				System.out.println("You have made an invalid choice.");
				System.out.println();
			}
		}
	}

}
