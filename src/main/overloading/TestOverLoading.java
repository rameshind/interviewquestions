package main.overloading;

public class TestOverLoading
{
    public void calculate(Integer i)
    {
        System.out.println("int method called!");
    }

    public void calculate(short i)  //or byte
    {
        System.out.println("short method called!");
    }

    public static void main(String args[]) {
        //Test1
       TestOverLoading t1 = new test1(); //int method called
        t1.calculate(5);
        //Test2         
        new TestOverLoading().calculate( 5); //short method called
    }
}

class test1 extends TestOverLoading
{
    public void calculate(Object i)
    {
        System.out.println(" child int method called!");
    }

    public void calculate(String i)  //or byte
    {
        System.out.println("child short method called!");
    }
}