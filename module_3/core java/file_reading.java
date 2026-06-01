import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class file_reading {

    public static void main(String[] args) {

        try {

            // Opening the file
            File file = new File("output.txt");

            Scanner sc = new Scanner(file);

            // Reading file line by line
            while (sc.hasNextLine()) {

                String line = sc.nextLine();
                System.out.println(line);
            }

            sc.close();

        } catch (FileNotFoundException e) {

            System.out.println("File not found");
        }
    }
}