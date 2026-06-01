import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class file_writing {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {

            // Taking input from user
            System.out.print("Enter a string: ");
            String text = sc.nextLine();

            // Creating file writer object
            FileWriter fw = new FileWriter("output.txt");

            // Writing into file
            fw.write(text);

            // Closing file
            fw.close();

            System.out.println("Data has been written to output.txt");

        } catch (IOException e) {

            System.out.println("Error while writing file");
        }

        sc.close();
    }
}