package tpas.gl.training.hashmap;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

public class NameAgeHashMap {
    public static void main(String[] args) {
        // Create a HashMap where keys are Strings (names) and values are Integers (ages)
        HashMap<String, Integer> nameAgeMap = new HashMap<>();

        // Add some entries to the HashMap
        nameAgeMap.put("Abhijit", 23);
        nameAgeMap.put("Rahul", 22);
        nameAgeMap.put("Aman", 25);
        nameAgeMap.put("Adarsh", 28);

        // Iterate through the HashMap and print each key-value pair
        for (Map.Entry<String, Integer> entry : nameAgeMap.entrySet()) {
            System.out.println("Name: " + entry.getKey() + ", Age: " + entry.getValue());
        }

    }
}
