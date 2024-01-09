package org.cristian.queue;

import java.util.PriorityQueue;

public class MyQueue {

//    PriorityQueue genericQueue = new PriorityQueue(); // Not allowed
    static PriorityQueue<Integer> queue = new PriorityQueue<>();

    public static void main(String[] args) {
        addElements();
        System.out.println(queue);
        System.out.println("head: " + queue.element()); // can return an exception
        System.out.println("head: " + queue.peek()); // can return a null value
        queue.remove(); // can return an exception
        queue.poll(); // can return a null value
        System.out.println(queue);
    }

    static void addElements(){
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(5);
        queue.offer(6); // return true if is successfully if isn't successfully is null.
    }

}
