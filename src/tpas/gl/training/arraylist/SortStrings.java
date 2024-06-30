package tpas.gl.training.arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class SortStrings {
    public static void main(String[] args) {
        // Create an ArrayList of Strings
        ArrayList<String> stringList = new ArrayList<>();

        // Add elements to the ArrayList
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of strings you want to add:");
        int n = scanner.nextInt();
        scanner.nextLine();  // Consume the newline character

        System.out.println("Enter the strings:");
        for (int i = 0; i < n; i++) {
            String str = scanner.nextLine();
            stringList.add(str);
        }

        // Print the original ArrayList
        System.out.println("Original ArrayList: " + stringList);

        // Sort the ArrayList alphabetically
        Collections.sort(stringList);

        // Print the sorted ArrayList
        System.out.println("Sorted ArrayList: " + stringList);

    }
}
