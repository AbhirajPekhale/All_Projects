package q11_seachstring;

import java.util.Scanner;

public class Search_string {

	public static void main(String[] args) {  
        String[] strArray = { "Abhi", "shreyas", "sushant" };  
        boolean x = false; //initializing x to false  
        int in = 0; //declaration of index variable  
        Scanner sc = new Scanner(System.in); //System.in is a standard input stream  
        System.out.print("Enter a string: ");  
        String s= sc.nextLine();  
        // Iteration of the String Array  
        for (int i = 0; i < strArray.length; i++) {  
            if(s.equals(strArray[i])) {  
                in = i; x = true; break;  
            }  
        }  
        if(x)  
            System.out.println(s +" String is found at index "+in);  
        else  
            System.out.println(s +" String is not found in the array");  
    }  
}
