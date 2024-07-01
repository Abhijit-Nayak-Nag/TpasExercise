package tpas.gl.training.functionalinterface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortStringByLength {
    public static void main(String[] args) {
        // Create a list of strings
        List<String> strings = new ArrayList<>();
        strings.add("banana");
        strings.add("apple");
        strings.add("kiwi");
        strings.add("blueberry");
        strings.add("pear");


        // Print the list before sorting
        System.out.println("Before sorting: " + strings);

        // Sort the list using a Comparator with lambda expression based on string length
        Comparator<String> lengthComparator = (str1, str2) -> Integer.compare(str1.length(), str2.length());
        Collections.sort(strings, lengthComparator);

        // Print the list after sorting
        System.out.println("After sorting: " + strings);

    }
}
