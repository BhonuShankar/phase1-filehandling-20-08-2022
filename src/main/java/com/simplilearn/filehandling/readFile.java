package com.simplilearn.filehandling;

import java.io.FileInputStream;

public class readFile {

	public static void main(String[] args) {
		readFile("data.txt");
	}
	
	private static void readFile(String filename) {
		try {
			FileInputStream fileInputStream = new FileInputStream(filename);
			int count = 0;
			while((count=fileInputStream.read())!= -1) {
				System.out.print((char) count);
			}
			System.out.println();
			fileInputStream.close();
			
		} catch (Exception e) {
			System.out.println("Exeption Occured: "+e.getClass());
			System.out.println("Exeption Occured: "+e.getMessage());
		}
		
	}

}
