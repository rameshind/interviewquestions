package main.multithreading;

public class Thread1 extends Thread {
    int i = 0;
    boolean b;
    int result;

    Thread1(int i) {
        this.i = i;
    }

    public synchronized void run() {
        result = i*2;
        b=true;
        notify();
        System.out.println("run.");
        throw new RuntimeException("Problem");
    }
    public synchronized int getResults(){
        while (!b){

            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Thread1[] tArr = new Thread1[4];
        for (int i=0; i<tArr.length;i++){
            tArr[i] = new Thread1(i);
            tArr[i].start();
        }


        System.out.println("End of method.");
    }
}
