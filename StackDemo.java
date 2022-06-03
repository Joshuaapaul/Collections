package com.StackDemo;

import java.util.Scanner;
import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {

        Stack stack = new Stack();

        //Adding elements to the stack using push method.
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println("Original Stack : "+stack);

        //Removing the element on top the stack by using pop method.
        stack.pop();
        System.out.println("Stack after pop1 : "+stack);

        //Checking the top of stack element by using peek method.
        System.out.println("Stack peek : "+stack.peek());

        //StackOverflow occurs when the loop runs for infinite times.
        /*for(;;){
            stack.push(1);
        }*/


        /*stack.pop();
        System.out.println("Stack after pop2 : "+stack);
        stack.pop();
        System.out.println("Stack after pop3 : "+stack);

        //Trying to pop the Stack when stack is empty. It will throw error, which is StackUnderflow.
        stack.pop();
        System.out.println("Stack after pop4 : "+stack);*/




    }
}
