
public class Multithreads {

    public static void main(String[] args) {
        Thread t = Thread.currentThread();
        System.out.println(t.getName());

        // New thread
        Thread t1 = new Thread(new MyRunnable());
        t1.run(); // Still in the same thread
        t1.start(); // Executing in a new thread

        Thread t2 = new Thread(() -> System.out.println("Runnable as lambda"));
    }
}