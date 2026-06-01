import java.util.Scanner;

// Custom Exception Class
class InvalidAgeException extends Exception {

    InvalidAgeException(String message) {
        super(message);
    }
}

public class custom_exception {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {

            // Taking age input
            System.out.print("Enter your age: ");
            int age = sc.nextInt();

            // Checking age
            if (age < 18) {
                throw new InvalidAgeException("Age must be 18 or above");
            }

            System.out.println("Eligible to vote");

        } catch (InvalidAgeException e) {

            // Handling custom exception
            System.out.println(e.getMessage());
        }

        sc.close();
    }
}