
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SynchronizedCollections {

    private static List<String> myList = new ArrayList<>();

    public static void main(String[] args) throws InterruptedException {
        /*
         * Solution: This method of Collections will encapsulate our list in a
         * synchronized method.
         */
        myList = Collections.synchronizedList(myList);

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

        /*
         * This way, sometimes some threads will not add the string "Test" to the list,
         * and none exceptions or erros will the throw, so this is VERY dangerous in
         * production. See the solution in *Solution*.
         */
        @Override
        public void run() {
            myList.add("Test");
        }

    }
}
