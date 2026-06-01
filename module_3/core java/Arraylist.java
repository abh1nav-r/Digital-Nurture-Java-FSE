import java.util.ArrayList;
import java.util.Scanner;

public class Arraylist {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Creating ArrayList
        ArrayList<String> students = new ArrayList<>();

        // Taking number of students
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        sc.nextLine();

        // Adding names into ArrayList
        for (int i = 0; i < n; i++) {

            System.out.print("Enter student name: ");
            String name = sc.nextLine();

            students.add(name);
        }

        // Displaying all names
        System.out.println("\nStudent Names:");

        for (String name : students) {
            System.out.println(name);
        }

        sc.close();
    }
}