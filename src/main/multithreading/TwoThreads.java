package main.multithreading;

public class TwoThreads  {
    public static void main(String[] args) {

        new MyThread1().start();
        new MyThread1(new MyRunnable1()).start();
    }
}
class MyThread1 extends Thread
{
    public MyThread1(MyRunnable1 myRunnable1) {
        super(myRunnable1);
    }

    public MyThread1() {
        super();
    }

    public  void run(){
        System.out.println("Thread....");
    }
}

class MyRunnable1 implements Runnable
{
    public  void run(){
        System.out.println("Runnable....");
    }
}
