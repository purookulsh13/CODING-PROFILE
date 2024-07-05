import java.util.*;

public class hashmap {
    public static void main(String[] args) {
        // Create a HashMap
        HashMap<Integer, String> map = new HashMap<>();

        // Put entries into the HashMap
        map.put(1, "one");
        map.put(2, "two");
        map.put(3, "three");

        // Get a value
        String value = map.get(2); // Returns "two"
        System.out.println("Value for key 2: " + value);

        // Check if a key exists
        boolean hasKey = map.containsKey(3); // Returns true
        System.out.println("Contains key 3: " + hasKey);

        // Check if a value exists
        boolean hasValue = map.containsValue("four"); // Returns false
        System.out.println("Contains value 'four': " + hasValue);

        // Get the size of the map
        int size = map.size(); // Returns 3
        System.out.println("Size of the map: " + size);

        // Iterate over keys
        System.out.println("Keys:");
        for (Integer key : map.keySet()) {
            System.out.println(key);
        }

        // Iterate over values
        System.out.println("Values:");
        for (String val : map.values()) {
            System.out.println(val);
        }

        // Iterate over key-value pairs
        System.out.println("Entries:");
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " => " + entry.getValue());
        }

        //Returns the value to which the specified key is mapped, or defaultValue if this map contains no mapping for the key.
        System.out.println(map.getOrDefault(2, "default"));
        
        // Remove an entry
        map.remove(2);
        System.out.println("Map after removing key 2: " + map);

        // Clear the map
        map.clear();
        System.out.println("Map after clearing: " + map);
    }
}
