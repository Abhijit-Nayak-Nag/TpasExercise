package tpas.gl.training.functionalinterface;

class LambdaExample{
    public static void main(String[] args) {
// Define a lambda expression that implements the StringProcessor interface
// Define a lambda expression that converts a string to uppercase
        StringProcessor toUpperCaseProcessor = (String input) -> input.toUpperCase();

        // Use the lambda expression
        String inputString = "hello world";
        String result = toUpperCaseProcessor.process(inputString);

        // Print the result
        System.out.println("Original: " + inputString);
        System.out.println("Processed: " + result);
    }

}

