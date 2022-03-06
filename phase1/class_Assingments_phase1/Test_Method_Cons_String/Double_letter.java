package rabbit_code;

import java.util.Scanner;

public class Double_letter {

	public static void main(String[] args)
	{
		 Scanner sc = new Scanner(System.in);
		 
	        System.out.print("Enter string: ");
	        String s1 = sc.nextLine();
	        
	        String str = s1.toUpperCase();
	       
	        int count = 0;
	        int l = str.length();
	        
	        for (int i = 0; i < l-1; i++) {
	            if (str.charAt(i) == str.charAt(i + 1))
	                count++;
	        }
	        
	        System.out.println("double Letter Count = " + count);
	        
	    }
	
	}


