/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package bloodtestercaconorfuchs;

/**
 *
 * @author serpl
 */
public interface QueueInterface<T> {
    //using T as a generic type parameter to store any type of object i need
    public void enqueue(T item);
    public T dequeue();
    public boolean isEmpty();
}
