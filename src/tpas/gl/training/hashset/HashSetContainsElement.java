package tpas.gl.training.hashset;

import java.util.HashSet;

public class HashSetContainsElement {
    public static void main(String[] args) {
        // Create a HashSet and add elements to it
        HashSet<String> fruits = new HashSet<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        fruits.add("Date");
        fruits.add("Elderberry");

        // Element to check
        String elementToCheck = "Cherry";

        // Check if the element exists in the HashSet
        if (fruits.contains(elementToCheck)) {
            System.out.println(elementToCheck + " exists in the HashSet.");
        } else {
            System.out.println(elementToCheck + " does not exist in the HashSet.");
        }

    }
}
