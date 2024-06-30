package tpas.gl.training.hashmap;

import java.util.HashMap;

public class RemoveEntryFromHashMap {
    public static void main(String[] args) {
        // Create a HashMap where keys are Strings (names) and values are Integers (ages)
        HashMap<String, Integer> nameAgeMap = new HashMap<>();

        // Add some entries to the HashMap
        nameAgeMap.put("Adi", 30);
        nameAgeMap.put("Raj", 25);
        nameAgeMap.put("Hari", 35);
        nameAgeMap.put("Diana", 28);

        // Print the original HashMap
        System.out.println("Original HashMap: " + nameAgeMap);

        // Key to be removed
        String keyToRemove = "Diana";

        // Remove the entry with the given key
        if (nameAgeMap.containsKey(keyToRemove)) {
            nameAgeMap.remove(keyToRemove);
            System.out.println("Entry with key '" + keyToRemove + "' has been removed.");
        } else {
            System.out.println("Key '" + keyToRemove + "' not found in the HashMap.");
        }

        // Print the updated HashMap
        System.out.println("Updated HashMap: " + nameAgeMap);
    }
}
