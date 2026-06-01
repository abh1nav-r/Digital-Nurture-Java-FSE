class MyThread extends Thread {

    // run() method
    public void run() {

        for (int i = 1; i <= 5; i++) {

            System.out.println(Thread.currentThread().getName() + " is running");

        }
    }
}

public class Thread_creation {

    public static void main(String[] args) {

        // Creating thread objects
        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();

        // Setting thread names
        t1.setName("Thread 1");
        t2.setName("Thread 2");

        // Starting threads
        t1.start();
        t2.start();
    }
}