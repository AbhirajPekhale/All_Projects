package q30_Q_operation;

import java.util.*;

public class Q_operation {
	public static void main(String[] args) {
        Queue < String > locationsQueue = new LinkedList < > ();
        locationsQueue.add("maharashtra");
        locationsQueue.add("rajasthan");
        locationsQueue.add("delhi");
        locationsQueue.add("Pune");
        locationsQueue.add("mumbai");
        System.out.println("Queue is : " + locationsQueue);
        System.out.println("Head of Queue : " + locationsQueue.peek());
        locationsQueue.remove();
        System.out.println("After removing Head of Queue : " + locationsQueue);
        System.out.println("Size of Queue : " + locationsQueue.size());
    }
}