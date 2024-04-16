package org.michael.queue;

import org.michael.doublelinkedlist.MyDoubleLinkedList;

public class Queue {

    MyDoubleLinkedList<Integer> data = new MyDoubleLinkedList<>();

    public void enqueue(int elementToAdd){
        data.add(elementToAdd);
    }
    public int size(){
        return data.size();
    }
    public int dequeue(){
        return data.remove(0);
    }
    public int[] dequeue(int index){
        int[] result = new int[index];

        if(data.size() == 0)
            throw new NullPointerException("The Stack is already empty");
        for (int i = 1; i < index + 1; i++) {
            result[i - 1] = data.remove(0);
        }
        return result;
    }
    public String queuetoString(){
        return data.toString();
    }
}
