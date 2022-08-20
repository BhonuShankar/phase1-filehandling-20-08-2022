package com.simplilearn.filehandling;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;

public class CreateNewFile {

	public static void main(String[] args) {
		
		createFile("data.txt");
		createFileFOS("test.txt");
		
		
	}
	
	private static void createFile(String filename) {
		
		File file = new File(filename);
		try {
			 boolean response = file.createNewFile();
			 if(response) {
				 System.out.println("File is Created successfully");}
				 else {
					 System.out.println("File already exists!");
					 
					 FileWriter fileWriter = new FileWriter(file);
					 fileWriter.write("Today is a Good day !");
					 fileWriter.append("\nToday is a Wonderful Day");

					 fileWriter.close();
				 }
		} catch (Exception e) {
			System.out.println("Exeption Occured: "+e.getClass());
			System.out.println("Exeption Occured: "+e.getMessage());

		}
			
		}
	
		private static void createFileFOS(String filename) {
			try {
				String data = "Today is a wonderful day";
				FileOutputStream out = new FileOutputStream(filename);
				out.write(data.getBytes());
				out.close();
				System.out.println("File is created and data is written");
				
			} catch (Exception e) {
				System.out.println("Exeption Occured: "+e.getClass());
				System.out.println("Exeption Occured: "+e.getMessage());
			}
		}
	}


