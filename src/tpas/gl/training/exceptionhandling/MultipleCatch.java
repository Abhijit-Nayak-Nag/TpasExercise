package tpas.gl.training.exceptionhandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MultipleCatch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Read the dividend from the user
            System.out.print("Enter the dividend: ");
            int dividend = scanner.nextInt();

            // Read the divisor from the user
            System.out.print("Enter the divisor: ");
            int divisor = scanner.nextInt();

            // Perform division
            int result = divide(dividend, divisor);
            System.out.println("Result of division: " + result);
        } catch (InputMismatchException e) {
            // Handle invalid input type
            System.out.println("Error: Please enter valid integers.");
        } catch (ArithmeticException e) {
            // Handle division by zero
            System.out.println("Error: Division by zero is not allowed.");
        } finally {
            scanner.close();
        }
    }

    // Method to perform division and throw ArithmeticException if divisor is zero
    public static int divide(int dividend, int divisor) {
        if (divisor == 0) {
            throw new ArithmeticException("Division by zero");
        }
        return dividend / divisor;
    }
}
