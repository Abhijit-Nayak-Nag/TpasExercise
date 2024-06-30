package tpas.gl.training.hashset;

import java.util.HashSet;

public class HashSetExample {
    public static void main(String[] args) {
        // Create a HashSet of strings
        HashSet<String> stringSet = new HashSet<>();

        // Add elements to the HashSet
        stringSet.add("Apple");
        stringSet.add("Banana");
        stringSet.add("Cherry");
        stringSet.add("Date");
        stringSet.add("Elderberry");

        // Iterate through the HashSet and print each element
        for (String element : stringSet) {
            System.out.println(element);
        }
    }
 }
