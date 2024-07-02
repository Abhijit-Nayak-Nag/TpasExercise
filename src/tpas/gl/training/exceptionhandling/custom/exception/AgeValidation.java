package tpas.gl.training.exceptionhandling.custom.exception;

import java.util.Scanner;

public class AgeValidation {
    public static void main(String[] args) {
        Scanner scanner= new Scanner (System.in);

        System.out.println("Enter the Age of the Person: ");
        int age= scanner.nextInt();
        try {
            // Validate age
            validateAge(age);
            System.out.println("Age is valid.");
        } catch (InvalidAgeException e) {
            System.out.println("Error: " + e.getMessage());
        }

        scanner.close();
    }

    // Method to validate age and throw InvalidAgeException if age is invalid
    public static void validateAge(int age) throws InvalidAgeException {
        if (age < 0 || age > 150) {
            throw new InvalidAgeException("Age must be between 0 and 150 inclusive.");
        }
    }
}
