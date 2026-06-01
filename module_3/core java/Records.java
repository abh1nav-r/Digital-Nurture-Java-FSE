import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

// Record declaration
record Person(String name, int age) {}

public class Records {

    public static void main(String[] args) {

        // Creating list of Person records
        List<Person> people = new ArrayList<>();

        people.add(new Person("Arun", 20));
        people.add(new Person("Priya", 17));
        people.add(new Person("Ravi", 22));
        people.add(new Person("Kavin", 16));

        // Printing all records
        System.out.println("All Persons:");

        for (Person p : people) {
            System.out.println(p);
        }

        // Filtering people with age >= 18
        List<Person> adults = people.stream()
                                    .filter(p -> p.age() >= 18)
                                    .collect(Collectors.toList());

        // Displaying filtered records
        System.out.println("\nAdults:");

        for (Person p : adults) {
            System.out.println(p);
        }
    }
}