
public class MyRunnable implements Runnable {

    @Override
    public void run() {
        System.out.println("Current Thread is: " + Thread.currentThread().getName());
    }
}