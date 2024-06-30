package tpas.gl.training.linkedlist;

import java.util.LinkedList;

public class FindMiddleElement {
    public static void main(String[] args) {
        // Create a LinkedList of integers
        LinkedList<Integer> list = new LinkedList<>();

        // Add elements to the LinkedList
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        // Find and print the middle element
        Integer middleElement = findMiddle(list);
        System.out.println("The middle element is: " + middleElement);
    }

    // Method to find the middle element of a LinkedList
    public static Integer findMiddle(LinkedList<Integer> list) {
        if (list.isEmpty()) {
            return null;
        }

        // Two pointers: slow and fast
        var slow = list.listIterator();
        var fast = list.listIterator();

        // Move fast pointer two steps and slow pointer one step at a time
        while (fast.hasNext() && fast.nextIndex() < list.size() - 1) {
            slow.next();
            fast.next();
            if (fast.hasNext()) {
                fast.next();
            }
        }

        // Slow pointer is now pointing to the middle element
        return slow.next();
    }
}
