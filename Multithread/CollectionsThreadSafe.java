/*
 * Collections to use for multithread applications.
 * 1: CopyOnWriteArrayList -> Makes a copy of the entire array when you remove or add an element. Extremaly heavy process.
 * 2: ConcurrentHashMap -> Alternative for HashMap collections.
 * 3: LinkedBlockingQueue -> Alternative, turn the Array into a Queue thread-safe.
 * 4: LinkedBlockingDeque -> Double Ended Queue, you can transfer an element to another place(index) on the queue AND you can get an element at the end of the queue.
 * 
 * @author Luanmxz
 */

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class CollectionsThreadSafe {

    private static List<String> myList = new CopyOnWriteArrayList<>();

    public static void main(String[] args) throws InterruptedException {

        MyRunnable myRunnable = new MyRunnable();
        Thread t0 = new Thread(myRunnable);
        Thread t1 = new Thread(myRunnable);
        Thread t2 = new Thread(myRunnable);

        t0.start();
        t1.start();
        t2.start();
        Thread.sleep(500);

        System.out.println(myList);
    }

    public static class MyRunnable implements Runnable {

        @Override
        public void run() {
            myList.add("Test");
        }
    }

}