package q_6_collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Vector;

public class collection {


		public static void main(String[] args) {
			//creating arraylist
			System.out.println("ArrayList");
			ArrayList<String> city=new ArrayList<String>();   
		      city.add("punjab");//
		      city.add("Delhi"); 
		      city.add("mumbai");
		      System.out.println(city);  
		    //creating vector
		      System.out.println("\n");
		      System.out.println("Vector");
		      Vector<Integer> v = new Vector();
		      v.addElement(20); 
		      v.addElement(30); 
		      v.addElement(50);
		      System.out.println(v);
			
			//creating linkedlist
		      System.out.println("\n");
		      System.out.println("LinkedList");
		      LinkedList<String> names=new LinkedList<String>();  
		      names.add("abhiraj");  
		      names.add("pekhale");  	      
		      names.add("rahul");
		      Iterator<String> itr=names.iterator();  
		      while(itr.hasNext()){  
		       System.out.println(itr.next());  
		       
		       //creating hashset
		       System.out.println("\n");
		       System.out.println("HashSet");
		       HashSet<Integer> set=new HashSet<Integer>();  
		       set.add(90);  
		       set.add(91);  
		       set.add(92);
		       set.add(93);
		       System.out.println(set);
		       
		       //creating linkedhashset
		       System.out.println("\n");
		       System.out.println("LinkedHashSet");
		       LinkedHashSet<Integer> set2=new LinkedHashSet<Integer>();  
		       set2.add(11);  
		       set2.add(13);  
		       set2.add(12);
		       set2.add(14);	       
		       System.out.println(set2);
		      	} 
		}		
}
