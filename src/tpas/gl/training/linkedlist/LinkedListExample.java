package tpas.gl.training.linkedlist;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args){
        // Create a LinkedList of integers
        LinkedList<Integer> list = new LinkedList<>();

        // Add elements to the LinkedList
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        // Iterate through the LinkedList and print each element
        System.out.println("Elements in the LinkedList:");
        for (Integer element : list) {
            System.out.println(element);
        }

        // Alternatively, you can use an iterator
        System.out.println("\nElements in the LinkedList (using iterator):");
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
