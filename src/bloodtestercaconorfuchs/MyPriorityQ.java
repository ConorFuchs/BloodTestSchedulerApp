/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bloodtestercaconorfuchs;

import java.util.PriorityQueue;

/**
 *
 * @author serpl
 */
public class MyPriorityQ implements PriorityQInterface<Patient>{
    private PriorityQueue<Patient> pq;

    public MyPriorityQ(PriorityQueue<Patient> pq) {
        this.pq = pq;
    }
  
    //
    @Override
    public void insert(Patient patient){//will finish implementing this later just setting up
        
    }
    
    @Override
    public Patient remove(){
        return null;//here till i fix issue and create method
        
    }
    
    @Override
    public boolean isEmpty(){
        return false; //here till i fix issue and create method
    }
    
    
    
}
