package link_set;

import java.util.Scanner;
import java.util.TreeSet;

public class Tree_set {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeSet<String> ts= new TreeSet<String>();
		
		System.out.println("enter the 6 languages");
		
		Scanner sc =new Scanner(System.in);
		
	 String s1 = sc.nextLine();
	 String s2 = sc.nextLine();
	 String s3 = sc.nextLine();
	 String s4 = sc.nextLine();
	 String s5 = sc.nextLine();
	 String s6 = sc.nextLine();
	 
	 ts.add(s1);
	 ts.add(s2);
	 ts.add(s3);
	 ts.add(s4);
	 ts.add(s5);
	 ts.add(s6);
	 
	 System.out.println(" 6 languages are:  " +ts);
	 ts.remove(s6);
	 ts.remove(s5);
	 
	 
	 
	 System.out.println(" after removing 2 languasa,4 languages are:  " +ts);
	 
	 
		}

}
