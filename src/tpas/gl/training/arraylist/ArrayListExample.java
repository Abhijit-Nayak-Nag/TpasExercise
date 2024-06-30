package tpas.gl.training.arraylist;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();

        // Add elements to the ArrayList
        stringList.add("Element 1");
        stringList.add("Element 2");
        stringList.add("Element 3");
        stringList.add("Element 4");
        stringList.add("Element 5");
        System.out.println(stringList);

        System.out.println("Iterating using get method with index: ");
        System.out.println(stringList.get(0));
        System.out.println(stringList.get(1));
        System.out.println(stringList.get(2));
        System.out.println(stringList.get(3));
        System.out.println(stringList.get(4));


        // Iterate through the ArrayList and print each element
        System.out.println("Elements in the ArrayList:");
        for (String element : stringList) {
            System.out.println(element);
        }
    }
}

