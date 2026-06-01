public class VirtualThreads_Example {

    public static void main(String[] args)
    throws InterruptedException {

        // Start Time
        long startTime =
        System.currentTimeMillis();

        // Create 100000 Virtual Threads
        for (int i = 1; i <= 100000; i++) {

            int threadNumber = i;

            Thread.startVirtualThread(() -> {

                System.out.println(
                    "Virtual Thread : " +
                    threadNumber
                );
            });
        }

        // Wait for threads to finish
        Thread.sleep(3000);

        // End Time
        long endTime =
        System.currentTimeMillis();

        // Total Time
        System.out.println(

            "Execution Time : " +

            (endTime - startTime) +

            " ms"
        );
    }
}