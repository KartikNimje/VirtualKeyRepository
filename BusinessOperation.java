package com.virtualKeyRepository;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class BusinessOperation {
	Scanner sc = new Scanner(System.in);
	
	public void addFile() throws IOException
	{
		System.out.println("Enter the file name with .txt extention. (e.g. file_name.txt)");
		String fileName = sc.next();
		File file = new File(fileName);
		
		if(file.createNewFile())
			System.out.println("File created successfully");
		else
			System.out.println("File already exist");
		
	}
	
	public void deleteFile()
	{
		System.out.println("Enter the file name which you want to delete with .txt extention. (e.g. file_name.txt)");
		String fileName = sc.next();
		File file = new File(fileName);
		
		if(file.exists())
		{
			file.delete();
			System.out.println("File deleted successfully");
		}
		else
		{
			System.out.println("File Not Found");	
		}
	}
	
	public void searchFile()
	{
		System.out.println("Enter the file name which you want to search with .txt extention. (e.g. file_name.txt)");
		String fileName = sc.next();
		File file = new File(fileName);
		
		if(file.exists())
		{
			System.out.println("File is found");
		}
		else
		{
			System.out.println("File Not Found");	
		}
	}

}
