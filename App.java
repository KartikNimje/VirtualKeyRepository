package com.virtualKeyRepository;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class App 
{
	Scanner sc = new Scanner(System.in);
	public void welcomeScreen()
	{
		System.out.println("*************** Welcome to Lockedme.com ***************");
		System.out.println();
		System.out.println("\tApplication Name: Virtual Key Repository");
		System.out.println();
		System.out.println("***************** Developer Details *******************");
		System.out.println();
		System.out.println("\tDeveloper name : Kartik Nimje");
		System.out.println("\tDesignation : Software Developer");
		System.out.println("\tDate : 06-May-2022");
		System.out.println();
		System.out.println("*******************************************************");
	}
	
	public void ascendingOrderFileNames()
	{
		File file = new File("C:\\Users\\Admin\\eclipse-workspace\\VirtualKeyRepository");
		if(file.isDirectory())
		{
			List<String> listFile = Arrays.asList(file.list());
			Collections.sort(listFile);
			System.out.println();
			for(String s:listFile)
			{
				System.out.println(s);
			}

		}
		System.out.println();
		System.out.println("Files are arranged in ascending order");
		System.out.println();
	}
	
	public void businessLevelOperation() throws IOException
	{
		BusinessOperation businessOperation = new BusinessOperation();
		while(true) {
			System.out.println();
			System.out.println("Enter 1 : to add the file.");
			System.out.println("Enter 2 : to delete the file.");
			System.out.println("Enter 3 : to search the file.");
			System.out.println("Enter 4 : to go back to main menu");
			int input = sc.nextInt();
			if(input==4)
			{
				break;
			}
			switch(input)
			{
			case 1 : businessOperation.addFile(); break;
			case 2 : businessOperation.deleteFile(); break;
			case 3 : businessOperation.searchFile(); break;
			default : System.out.println("You have entered an invalid input");
			}
		}
	}
	
	public void closeApplication()
	{
		System.out.println("Closing your application... \nThank you!");
		System.exit(0);
	}
	

}
