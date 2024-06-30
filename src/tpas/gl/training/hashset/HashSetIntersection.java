package tpas.gl.training.hashset;

import java.util.HashSet;

public class HashSetIntersection {
    public static void main(String[] args) {
        // Create the first HashSet and add elements to it
        HashSet<String> set1 = new HashSet<>();
        set1.add("Apple");
        set1.add("Banana");
        set1.add("Cherry");
        set1.add("Date");
        set1.add("Elderberry");

        // Create the second HashSet and add elements to it
        HashSet<String> set2 = new HashSet<>();
        set2.add("Banana");
        set2.add("Date");
        set2.add("Fig");
        set2.add("Grape");
        set2.add("Cherry");

        // Find the intersection of set1 and set2
        HashSet<String> intersection = new HashSet<>(set1);
        intersection.retainAll(set2);

        // Print the intersection of the two sets
        System.out.println("Intersection of set1 and set2: " + intersection);
    }
}
