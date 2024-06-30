package tpas.gl.training.hashmap;

import java.util.HashMap;

public class CheckKeyInHashMap {
    public static void main(String[] args) {
        // Create a HashMap where keys are Strings (names) and values are Integers (ages)
        HashMap<String, Integer> nameAgeMap = new HashMap<>();

        // Add some entries to the HashMap
        nameAgeMap.put("Alice", 30);
        nameAgeMap.put("Bob", 25);
        nameAgeMap.put("Charlie", 35);
        nameAgeMap.put("Diana", 28);

        // Key to be checked
        String keyToCheck = "Charlie";

        // Check if the key exists in the HashMap
        if (nameAgeMap.containsKey(keyToCheck)) {
            System.out.println("The key '" + keyToCheck + "' exists in the HashMap.");
        } else {
            System.out.println("The key '" + keyToCheck + "' does not exist in the HashMap.");
        }
    }
}
