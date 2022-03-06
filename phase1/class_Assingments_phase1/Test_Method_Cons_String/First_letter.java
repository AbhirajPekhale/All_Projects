package string;

import java.util.Scanner;

public class First_letter {

	public static void main(String[] args) {
	
		
		Scanner sc = new Scanner(System.in);
		
	       System.out.println("Enter a sentence:");
	       String str = sc.nextLine();
	       String word = "" + str.charAt(0);
	       int l = str.length();
	       
	       for (int i=0;i<l;i++) 
	       {
	           char ch = str.charAt(i);
	           if (ch== ' ')
	               word=word+str.charAt(i+1);
	       }
	       
	       System.out.println(word);
	}

}
