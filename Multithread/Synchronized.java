
public class Synchronized {

    static int i = -1;

    public static void main(String[] args) {

        MyRunnable myRunnable = new MyRunnable();

        Thread t0 = new Thread(myRunnable);
        Thread t1 = new Thread(myRunnable);
        Thread t2 = new Thread(myRunnable);
        Thread t3 = new Thread(myRunnable);
        Thread t4 = new Thread(myRunnable);

        t0.start();
        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }

    public static class MyRunnable implements Runnable {

        // @Override
        // public void run() --> In this way, all the threads gonna use the method RUN
        // at "same time".
        public synchronized void run() { // --> This way, the next thread will wait the current thread done the
                                         // execution of the method.
            print();
        }

        // Example 1: Two example of the use of SYNCHRONIZED in block*

        // static Object lock1 = new Object();
        // static Object lock2 = new Object();

        /*
         * @Override
         * public void run() {
         * synchronized (lock1) {
         * System.out.println(
         * "Thread about to increment in LOCK-1 is: " +
         * Thread.currentThread().getName());
         * i++;
         * System.out.println(
         * "Current thread is: " + Thread.currentThread().getName() +
         * " and * i * value is: " + i);
         * }
         * synchronized (lock2) {
         * System.out.println(
         * "Thread about to increment in LOCK-2 is: " +
         * Thread.currentThread().getName());
         * i++;
         * System.out.println(
         * "Current thread is: " + Thread.currentThread().getName() +
         * " and * i * value is: " + i);
         * }
         * }
         */ // this way, each synchronized method has its own 'waiting' time.

        /*
         * @Override
         * public void run() {
         * synchronized (lock1) {
         * System.out.println(
         * "Thread about to increment in LOCK-1 is: " +
         * Thread.currentThread().getName());
         * i++;
         * System.out.println(
         * "Current thread is: " + Thread.currentThread().getName() +
         * " and * i * value is: " + i);
         * }
         * synchronized (lock1) {
         * System.out.println(
         * "Thread about to increment in LOCK-1-1 is: " +
         * Thread.currentThread().getName());
         * i++;
         * System.out.println(
         * "Current thread is: " + Thread.currentThread().getName() +
         * " and * i * value is: " + i);
         * }
         * }
         */ // this way,each thread will execute both methods synchronized before change to
            // next thread.

    }

    // Example 2: USing SYNCHRONIZED with static methods
    public static void print() {
        synchronized (Synchronized.class) { // This way, i'm locking the entire class, only one thread will execute this
                                            // code at a time *per JVM*.
            i++;
            System.out.println("Current thread is: " + Thread.currentThread().getName() +
                    " and * i * value is: " + i);
        }
    }
}

// disadvantage of the keyword SYNCHRONIZED
/*
 * When we use the SYNCHRONIZED keyword, we lost the 'purpose' of
 * multithreading, as we are 'queuing' the threads,
 * it will be a sequential process.
 */

// What we do to avoid this?
/*
 * A good way to use the SYNCHRONIZED keyword is to only use it in the block of
 * code that contains the resource that will be competed for.
 * Example above. *obs: a real-world usecase seems like this.
 */

/*
 * ... public void run() {
 * int j;
 * synchronized(this){
 * i++;
 * j = i * 2;
 * }
 * 
 * double jPoweredTo100 = Math.pow(j, 100);
 * double sqrt = Math.sqrt(jPoweredTo100);
 * sysout...(sqrt);
 * }
 */
