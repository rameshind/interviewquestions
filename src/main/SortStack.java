package main;

import javax.crypto.spec.PSource;
import java.util.Stack;

public class SortStack {

   static Stack<Integer> s = new Stack<>();

    public static void main(String[] args) {
        s.push(4);
        s.push(3);
        s.push(5);
        s.push(1);

        Stack<Integer> temp = new Stack();
        temp.push(s.pop());
        while (!s.empty()){
            //if(!temp.isEmpty()){

                    int temp1 = s.pop();
                    if(!temp.isEmpty() &&temp.peek()> temp1){
                        s.push(temp.pop());
                    }
                    temp.push(temp1);


          //  }
        }

        temp.stream().forEach(ele-> System.out.println(ele));
    }
}
