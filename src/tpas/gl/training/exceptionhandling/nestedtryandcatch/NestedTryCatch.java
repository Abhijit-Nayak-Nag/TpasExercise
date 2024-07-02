package tpas.gl.training.exceptionhandling.nestedtryandcatch;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class NestedTryCatch {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);

        System.out.print("Enter the file path: ");
        String filePath = inputScanner.nextLine();

        // Try to open and read the file
        try {
            readFile(filePath);
        } catch (FileNotFoundException e) {
            // Handle case where the file is not found
            System.out.println("Error: File not found. Please check the file path.");
        } catch (IOException e) {
            // Handle general I/O exceptions
            System.out.println("Error: An I/O error occurred while reading the file.");
        } finally {
            inputScanner.close();
        }
    }

    // Method to read a file and print its content
    public static void readFile(String filePath) throws IOException {
        File file = new File(filePath);
        Scanner fileScanner = new Scanner(file);

        while (fileScanner.hasNextLine()) {
            String line = fileScanner.nextLine();
            System.out.println(line);
        }

        fileScanner.close();
    }
}
