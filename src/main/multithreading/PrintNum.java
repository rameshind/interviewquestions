package main.multithreading;

import java.util.ArrayList;
import java.util.List;

public class PrintNum implements Runnable {
     volatile Integer a = 0;
     List<?> aa = new ArrayList<>();


    //Object thiss = new Object();
    public synchronized void run() {

            while (a < 10) {
                synchronized (a){
                System.out.println(Thread.currentThread().getName()+" "+a);
                a++;
            }}
            try {
                Thread.sleep(10);
            } catch (Exception e) {
            }

    }

    public static void main(String[] args) {
        PrintNum printNum1 = new PrintNum();
        PrintNum printNum2 = new PrintNum();
        Thread t1 = new Thread(printNum1);
        t1.setName("t1");
        Thread t2 = new Thread(printNum2);
        t2.setName("t2");

        System.out.println(16>>2);
        System.out.println(16>>>2);
       // t1.start();
        //t2.start();
        int w = (int)888.8;
        byte x = (byte)1000L;
        long y = (byte)100;;
        byte z = (byte)100L;
    }
}
interface  a {}
interface b extends a {}


class MyThrea extends Thread
{
    public static void main(String [] args)
    {
        MyThrea t = new MyThrea();
        Thread x = new Thread(t);
        System.out.println(16>>2);
        System.out.println(16>>>2);
      //  x.start(); /* Line 7 */
    }
    public void run()
    {
        for(int i = 0; i < 3; ++i)
        {
            System.out.print(i + "..");
        }
    }
}