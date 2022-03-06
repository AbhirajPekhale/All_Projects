package link_set;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedMap {

	public static void main(String[] args) {
		
		
		Map<Integer, String>  lmap= new LinkedHashMap<Integer, String>();
		lmap.put(1, "apple");
		lmap.put(2, "orange");
		lmap.put(3, "kiwi");
		lmap.put(4, "grape");
		lmap.put(5, "banana");
		lmap.put(6, "pineapple");
		lmap.put(7, "mango");
		lmap.put(8, "muskmelon");
		lmap.put(9, "watermelon");
		lmap.put(10, "berry");
 System.out.println("all fruits are"  +lmap);
 
 for(Integer key :lmap.keySet()) {
	 System.out.println(key +":\t"+lmap.get(key));
	 
 }
 System.out.println("\nRemove entry for value mango : " + lmap.remove(7));
 System.out.println(" after removing key 7: " + lmap);
 System.out.println(" contains 4 as key? : " + lmap.containsKey(4));
 System.out.println(" contains banana as value? : " + lmap.containsValue("banana"));
 System.out.println(" contains Apple as value? : " + lmap.containsValue("Apple"));
 System.out.println("after removing key 2: " + lmap);
 System.out.println("hashmap" +lmap.hashCode());
 lmap.clear();
 System.out.println("\nContent of LinkedHashMap after clearing: " +lmap);
}
}