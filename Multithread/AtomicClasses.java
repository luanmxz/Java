/*
 * Atomic Classes do their operations in one way, because this their name are 'Atomic', since their operations cannot be 'break' in the middle of the execution by other threads.
 * @Author: Luanmxz
 */

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicClasses {

    static AtomicInteger i = new AtomicInteger(-1);

    public static void main(String[] args) {

        MyRunnable myRunnable = new MyRunnable();

        Thread t0 = new Thread(myRunnable);
        Thread t1 = new Thread(myRunnable);
        Thread t2 = new Thread(myRunnable);

        t0.start();
        t1.start();
        t2.start();

    }

    public static class MyRunnable implements Runnable {

        @Override
        public void run() {
            System.out.println(Thread.currentThread().getName() + " -> " + i.incrementAndGet());
        }

    }

}
