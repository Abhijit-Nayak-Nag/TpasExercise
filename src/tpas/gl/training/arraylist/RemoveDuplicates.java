package tpas.gl.training.arraylist;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicates {
   static String namee;
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(2);
        numbers.add(4);
        numbers.add(1);
        numbers.add(5);
        numbers.add(3);

        System.out.println("Original ArrayList: " + numbers );

        // Remove duplicates
        ArrayList<Integer> uniqueNumbers = removeDuplicates(numbers);

        System.out.println("ArrayList after removing duplicates: " + uniqueNumbers);

    }

    public static ArrayList<Integer> removeDuplicates(ArrayList<Integer> list) {
        // Use a HashSet to remove duplicates
        Set<Integer> set = new HashSet<>(list);

        // Convert the HashSet back to an ArrayList
        return new ArrayList<>(set);
    }
}

