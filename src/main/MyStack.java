package main;

import java.util.Objects;

public class MyStack {
    public Node root;
    public Node last;
    public Integer data;

   /* MyStack(Integer data){
        new Node(data);
    }*/

    class Node {
        Integer data;
        Node next;
        Node pre;

        Node(Integer data) {
            this.data = data;
        }
    }

    public void push(Integer data) {

        if (Objects.isNull(root)) {
            Node newNode = new Node(data);
            root = newNode;
           /* newNode.next = root;
            newNode.pre = root;
            last.pre = root;*/

        } else {
            Node temp = root;
            while (Objects.nonNull(temp.next)) {
                temp = temp.next;
            }
            Node newNode = new Node(data);
            temp.next = newNode;
            newNode.pre = temp;

            last = newNode;
            // temp = newNode;

        }


    }

    public void pop() {
        if (Objects.isNull(root)) {
            System.out.println("Stack is empty");
            return;
        } else {
            System.out.println(last.data);

            last = last.pre;
           // last.next = null;

        }


    }

    public static void main(String[] args) {

        MyStack stack = new MyStack();
        stack.push(3);
        stack.push(4);
        stack.pop();
        stack.pop();
        stack.pop();

    }
}
