package tpas.gl.training.exceptionhandling;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AverageCalcuator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = new ArrayList<>();
        String input;

        System.out.println("Enter integers to calculate their average. Type 'done' to finish:");

        // Loop to read user input until "done" is entered
        while (true) {
            input = scanner.nextLine();

            if (input.equalsIgnoreCase("done")) {
                break;
            }

            try {
                // Convert input to an integer and add it to the list
                int number = Integer.parseInt(input);
                numbers.add(number);
            } catch (NumberFormatException e) {
                // Handle the case where the input is not a valid integer
                System.out.println("Invalid input. Please enter an integer or 'done' to finish.");
            }
        }

        // Calculate the average of the entered numbers
        if (!numbers.isEmpty()) {
            double sum = 0;
            for (int number : numbers) {
                sum += number;
            }
            double average = sum / numbers.size();
            System.out.println("The average of the entered numbers is: " + average);
        } else {
            System.out.println("No numbers were entered.");
        }

        scanner.close();
    }
}
