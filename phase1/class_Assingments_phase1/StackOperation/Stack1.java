package link_set;

import java.util.Stack;

public class Stack1 {

	public static void main(String[] args) {
	
		
		Stack<String> st1 = new Stack<String>();
		
		st1.push("india");
		st1.push("america");
		st1.push("austrualia");
		st1.push("germany");
		st1.push("spain");
		st1.push("srilanka");
		st1.push("canada");
		st1.push("russia");
		st1.push("china");
		st1.push("japan");
		 System.out.println("all are"  +st1);
		 System.out.println("pop 1st element :  "  +st1.pop());
		 System.out.println("pop 2nd element :  "  +st1.pop());
		 
		 st1.push("apple");
		 st1.push("orange");
		 System.out.println("after adding fruits: "  +st1);
		 System.out.println("pop 1nd element :  "  +st1.pop());
		 System.out.println("pop 2nd element :  "  +st1.pop());
		 System.out.println("pop 3nd element :  "  +st1.pop());
		 System.out.println("pop 4nd element :  "  +st1.pop());
		 System.out.println("after 4times pop: "  +st1);
		 System.out.println("search india element :  "  +st1.search("india"));
		 System.out.println("search canada element :  "  +st1.search("canada"));
		 

	}

}
