import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class lambda_exp {

    public static void main(String[] args) {

        // Creating list
        List<String> names = new ArrayList<>();

        names.add("Ravi");
        names.add("Arun");
        names.add("Priya");
        names.add("Kavin");

        // Sorting using lambda expression
        Collections.sort(names, (a, b) -> a.compareTo(b));

        // Displaying sorted list
        System.out.println("Sorted Names:");

        for (String name : names) {
            System.out.println(name);
        }
    }
}