package tpas.gl.training.methodreferences;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MethodReferenceDemo {
    public static void main(String[] args) {
        // Create a list of integers
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        // Use a method reference to a static method
        numbers.forEach(MethodReferenceDemo::printNumber);

    }

    // Static method to print a number
    public static void printNumber(int number) {
        System.out.println("Number: " + number);
    }
}
