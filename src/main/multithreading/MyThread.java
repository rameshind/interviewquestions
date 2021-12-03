package main.multithreading;

public class MyThread extends Thread {

    //define the Total No.Of Threads needed
    public static final int TOTAL_THREADS = 10;

    public final static Object obj = new Object();

    int threadNo;
    static volatile int counter = 1;

    public MyThread(int threadNo) {
        this.threadNo = threadNo;
    }

    @Override
    public void run() {

        //in a synchronized block to acquire lock
        synchronized (obj) {

            while (counter <= 100) {

                /*
                 * counter==threadNo => To print the initial numbers till TOTAL_THREADS
                 * counter%TOTAL_THREADS == threadNo => e.g 11%10 = 1 -> 1 will print this, 12%10 = 2 ..
                 * (counter%TOTAL_THREADS == 0) && (TOTAL_THREADS == threadNo) => 10%10 will be 0,
                 *              and this must be printed by 10 th thread only, ie the highest thread.
                 */
                if (counter == threadNo || (counter % TOTAL_THREADS == threadNo) ||
                        ((counter % TOTAL_THREADS == 0) && (TOTAL_THREADS == threadNo))) {

                    //Display the output as desired
                    System.out.println(this.threadNo + " printing" + " " + counter++);

                    //notify
                    obj.notifyAll();
                } else {

                    //current thread not eligible for printing the current counter value, so wait till its notified
                    try {
                        obj.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }

    }

    public static void main(String args[]) {

        /*
         * Creating as many threads as needed.
         */
        for (int i = 1; i <= TOTAL_THREADS; i++) {
            MyThread th = new MyThread(i);
            th.start();
        }
    }
}