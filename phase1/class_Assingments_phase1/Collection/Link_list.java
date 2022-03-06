package link_set;

import java.util.Iterator;
import java.util.LinkedList;

public class Link_list {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
LinkedList<String> ll = new LinkedList<String>();

ll.add("May");
ll.add("june");
ll.add("july");
ll.add("Augast");
ll.add("april");
ll.add("november");

System.out.println(" 6 moonths are:  " +ll);
ll.addLast("December");
ll.addFirst("january");
ll.add(1,"march");
ll.add(1,"february");
ll.add(8,"september");
ll.add(9,"october");
ll.add(3,"april");
ll.remove(8);
System.out.println(" moonths are:  " +ll);
System.out.println(" \n ");
int no=0;

Iterator itr=ll.iterator();
while(itr.hasNext()) {
	System.out.println(itr.next());
}

//using a for-each loop to
// iterate through the list
System.out.println(" \n ");
System.out.println(" Elements at even position are : ");
for (String ss : ll) {
  if (no % 2 != 0) {
      System.out.println(ss + " ");
  }
  no += 1;
}
System.out.println(" \n ");
System.out.println(" Elements at odd position are : ");

for (String sss : ll) {
  if (no % 2 == 0) {
      System.out.println(sss + " ");
  }
  no += 1;
}
System.out.println(" \n ");

System.out.println(" first and last month respectively: "+ll.peekFirst()+ " "+ll.peekLast());
System.out.println(" remove my birthday month  " +ll.remove("march"));
System.out.println(" after removing birthday month:  " +ll);
System.out.println(" size are:  " +ll.size());
System.out.println(" winter months " +ll.contains("December"));
System.out.println(" peek 1st and last month:  " +ll.peekFirst()+"  "+ll.peekLast());
ll.pollFirst();
ll.pollLast();
System.out.println(" moonths are after poll :  " +ll);
System.out.println(" linkedlist empty:  " +ll.isEmpty());
	}

}
