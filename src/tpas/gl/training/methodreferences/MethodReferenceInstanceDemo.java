package tpas.gl.training.methodreferences;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MethodReferenceInstanceDemo {
    public static void main(String[] args) {
        // Create an instance of the class with the instance method
        StringTransformer transformer = new StringTransformer();
        // Create a list of strings
        List<String> words = Arrays.asList("apple", "banana", "cherry", "date");
        // Use a method reference to an instance method of an object
        List<Integer> lengths = words.stream()
                .map(transformer:: getLength)
                .collect(Collectors.toList());

        // Print the transformed list
        lengths.forEach(System.out::println);
    }


    static class StringTransformer {
        // Instance method to get the length of a string
        public int getLength(String s) {
            return s.length();

        }
    }
}

