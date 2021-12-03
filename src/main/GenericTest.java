package main;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class GenericTest {
    public static void main(String[] args) {


        GenericTest g = new GenericTest();
        g.a("10");
        g.a(1000000l);

    }

    public  void a(short a){
        System.out.println("String");
    }
    public  void a(Object a){
        System.out.println("Oject");
    }

}
class Parent {
    public void set(List<?> c) { }
}

class Child extends Parent {
    public void set(List<?> c) {
        setHelper(c);
    }

    public <T> void setHelper(List<T> c) {
        System.out.println(c.getClass());
        c.forEach(c1->
        {
            if(c1 instanceof String){
                System.out.println();
            }
        });
        // use T instead of Integer in body of code
    }


}