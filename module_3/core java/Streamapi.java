import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Streamapi {

    public static void main(String[] args) {

        // Creating list
        List<Integer> numbers = new ArrayList<>();

        numbers.add(10);
        numbers.add(15);
        numbers.add(20);
        numbers.add(25);
        numbers.add(30);

        // Filtering even numbers using Stream API
        List<Integer> evenNumbers = numbers.stream()
                                           .filter(n -> n % 2 == 0)
                                           .collect(Collectors.toList());

        // Displaying result
        System.out.println("Even Numbers:");

        for (int num : evenNumbers) {
            System.out.println(num);
        }
    }
}