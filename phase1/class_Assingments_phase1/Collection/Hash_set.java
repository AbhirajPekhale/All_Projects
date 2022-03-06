package link_set;

import java.util.HashSet;

public class Hash_set {
	public static void main(String[] args) {
		
		HashSet st = new HashSet();
		
		st.add("a");
		st.add("b");
		st.add("c");
		st.add('c');
		st.add(45436436);
		st.add("ghg");
		st.add(45.86);
		
		
		
		
		System.out.println("Hashset is:" +st);
		System.out.println("Hashset size:" +st.size());
		System.out.println("remove element :" +st.remove("ghg"));
		st.clear();
		System.out.println("Hashset is:" +st);
		
		
	}
}
