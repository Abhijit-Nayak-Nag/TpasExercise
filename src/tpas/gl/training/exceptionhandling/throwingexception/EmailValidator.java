package tpas.gl.training.exceptionhandling.throwingexception;

public class EmailValidator {
    public static void main(String[] args) {
        // Test the validateEmail method
        try {
            validateEmail("nayakabhijit209@gmail.com"); // Valid email
            System.out.println("Email is valid.");

            validateEmail("invalid-gmail.com");// Invalid email
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }

    }

    public static void validateEmail(String email) {
        if (email == null || !email.contains("@")) {
            throw new IllegalArgumentException("Invalid email address: " + email);
        }
    }
}

