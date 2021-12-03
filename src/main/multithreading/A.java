package main.multithreading;

class A extends Thread{
    String name = "";
    static Integer num = 1;
    public void run(){
        while(num <= 10){

            synchronized(num){

                System.out.println(Thread.currentThread().getName() + " " +num);
                num++;

            }

            try{
                Thread.sleep(100);
            }catch(InterruptedException e){}


        }
    }
    public static void main(String args[]){
        A t1 = new A();
        t1.setName("t1");
        t1.name = "Thread one";
        A t2 = new A();
        t2.setName("t2");
        t2.name = "Thread two";
        A t3 = new A();
        t3.setName("t3");
        t3.name = "Thread three";
        t1.start();
        t2.start();
        t3.start();
    }
}