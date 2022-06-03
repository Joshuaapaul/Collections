package com.QueueDemo;

import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();

        //Adding elements to the queue (Enqueue).
        queue.add(1);
        queue.add(2);
        queue.add(3);

        System.out.println("Original Queue :  "+queue);

        //Removing the first element from the queue(Dequeue)
        queue.poll();
        System.out.println("Queue after dequeue : "+queue);

        //Checking the head of the queue.
        System.out.println(queue.peek());

    }
}
