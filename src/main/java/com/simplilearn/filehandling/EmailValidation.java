package com.simplilearn.filehandling;

import java.util.ArrayList;
import java.util.regex.Pattern;

public class EmailValidation {
	
		public static boolean isValid(String email) {
			String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\."+
                    "[a-zA-Z0-9_+&*-]+)*@" +
                    "(?:[a-zA-Z0-9-]+\\.)+[a-z" +
                    "A-Z]{2,7}$";
			Pattern pat = Pattern.compile(emailRegex);
			if(email==null)
				return false;
			return pat.matcher(email).matches();
		}
		
	public static void main(String[] args) {
		ArrayList <String> address = new ArrayList <String>();
		address.add("bhonushankar@gmail.com");
		address.add("Shankar#gmail.com");
		for(String i : address){
            if (isValid(i))
                System.out.println(i + " - Yes");
            else
                System.out.println(i + " - No");
        }
	}

}
