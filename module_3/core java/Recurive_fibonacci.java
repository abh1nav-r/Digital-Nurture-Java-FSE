import java.util.Scanner;

public class Recurive_fibonacci {

    // Recursive method to find nth Fibonacci number
    static int fibonacci(int n) {

        // Base cases
        if (n == 0) {
            return 0;
        }

        if (n == 1) {
            return 1;
        }

        // Recursive call
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Taking input from user
        System.out.print("Enter a positive integer: ");
        int n = sc.nextInt();

        // Displaying result
        System.out.println("Fibonacci number is: " + fibonacci(n));

        sc.close();
    }
}