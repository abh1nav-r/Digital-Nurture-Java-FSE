import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExecutorService_Example {

    public static void main(String[] args) {

        // Create thread pool
        ExecutorService executor =
        Executors.newFixedThreadPool(3);

        // Task 1
        Callable<String> task1 = () -> {

            return "Task 1 Completed";
        };

        // Task 2
        Callable<String> task2 = () -> {

            return "Task 2 Completed";
        };

        // Task 3
        Callable<String> task3 = () -> {

            return "Task 3 Completed";
        };

        try {

            // Submit tasks
            Future<String> result1 =
            executor.submit(task1);

            Future<String> result2 =
            executor.submit(task2);

            Future<String> result3 =
            executor.submit(task3);

            // Print results
            System.out.println(
                result1.get()
            );

            System.out.println(
                result2.get()
            );

            System.out.println(
                result3.get()
            );

        } catch (Exception e) {

            System.out.println(e);
        }

        // Shutdown executor
        executor.shutdown();
    }
}