/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bloodtestercaconorfuchs;

import java.util.LinkedList;

/**
 *
 * @author serpl
 * @param <T>
 */
public class MyQueue<T> implements QueueInterface<T>{
    // gonna use this queue for tracking 5 no shows FIFO method
    private LinkedList<T> queue; //linked list to store queue elements
    private static final int MAX_SIZE = 5; //have the max size of no show list be 5
    
    //declare constructor
    public MyQueue(LinkedList<T> queue) {
        this.queue = queue;
    }
    
    @Override //add patient to no show list
    public void enqueue(T item){
        if (queue.size() == MAX_SIZE){ //if no show Q is 5 remove last 1 in fifo style
            queue.poll(); //remove first element in queue
        }
        queue.add(item); //add patient to no show list at the end of q
    }
    
    @Override //remove first patient from noshow list
    public T dequeue(){
        return queue.poll();
    }
    
    @Override //check if list is empty
    public boolean isEmpty(){
        return queue.isEmpty();//returns true if queues empty
    }
}
