package org.michael;

import org.michael.queue.Queue;

public class Main {
    public static void main(String[] args) {
        Queue myQueue = new Queue();
        myQueue.enqueue(3);
        myQueue.enqueue(4);
        myQueue.enqueue(1);
        myQueue.enqueue(8);
        myQueue.enqueue(9);

        System.out.println(myQueue.queuetoString());
        System.out.println(myQueue.size());
        System.out.println(myQueue.dequeue());
        System.out.println(myQueue.queuetoString());

        for(int i :myQueue.dequeue(2)){
            System.out.printf(" ,");
            System.out.printf(Integer.toString(i));
        }
        System.out.println();
        System.out.println(myQueue.queuetoString());
    }
}
