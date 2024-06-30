package tpas.gl.training.linkedlist;

import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListReverseExample {
    public static void main(String[] args) {
        // Create a LinkedList of integers
        LinkedList<Integer> list = new LinkedList<>();

        // Add elements to the LinkedList
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        // Print the original LinkedList
        System.out.println("Original LinkedList:");
        printList(list);

        // Reverse the LinkedList
        LinkedList<Integer> reversedList = reverseLinkedList(list);

        // Print the reversed LinkedList
        System.out.println("Reversed LinkedList:");
        printList(reversedList);
    }

    // Method to reverse a LinkedList
    public static LinkedList<Integer> reverseLinkedList(LinkedList<Integer> list) {
        LinkedList<Integer> reversedList = new LinkedList<>();
        ListIterator<Integer> iterator = list.listIterator(list.size());
        while (iterator.hasPrevious()) {
            reversedList.add(iterator.previous());
        }
        return reversedList;
    }

    // Method to print the LinkedList
    public static void printList(LinkedList<Integer> list) {
        for (Integer element : list) {
            System.out.print(element + " ");
        }
        System.out.println();

    }
}
