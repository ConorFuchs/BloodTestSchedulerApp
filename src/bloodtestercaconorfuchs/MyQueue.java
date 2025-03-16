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
    private LinkedList<T> queue;

    public MyQueue(LinkedList<T> queue) {
        this.queue = queue;
    }
    
    @Override
    public void enqueue(T item){//will finish implementing this later just setting up
        
    }
    
    @Override
    public T dequeue(){
        return null; //here till i fix issue and create method
    }
    
    @Override
    public boolean isEmpty(){
        return false;//here till i fix issue and create method
    }
}
