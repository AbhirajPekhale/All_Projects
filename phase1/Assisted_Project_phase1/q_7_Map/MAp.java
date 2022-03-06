package q_7_Map;
import java.util.Map;
import java.util.HashMap;

public class MAp {

    public static void main(String[] args) {
        // Creating a map using the HashMap
        Map<String, Integer> numbers = new HashMap<>();

        // Insert elements to the map
        numbers.put("One", 1);
        numbers.put("Two", 2);
        numbers.put("Three", 3);
        
        System.out.println("Map: " + numbers);

        // Access keys of the map
        System.out.println("Keys: " + numbers.keySet());

        // Access values of the map
        System.out.println("Values: " + numbers.values());

        // Access entries of the map
        System.out.println("Entries: " + numbers.entrySet());

        // Remove Elements from the map
        int value = numbers.remove("Three");
        System.out.println("Removed Value: " + value);
        
     // Access keys of the map
        System.out.println("Keys: " + numbers.keySet());
    }
}