import java.util.Scanner;

public class Trycatch {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {

            // Taking input from user
            System.out.print("Enter first number: ");
            int a = sc.nextInt();

            System.out.print("Enter second number: ");
            int b = sc.nextInt();

            // Division operation
            int result = a / b;

            System.out.println("Result = " + result);

        } catch (ArithmeticException e) {

            // Handling division by zero
            System.out.println("Cannot divide by zero");

        }

        sc.close();
    }
}