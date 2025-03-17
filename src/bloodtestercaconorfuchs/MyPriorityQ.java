/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bloodtestercaconorfuchs;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 *
 * @author serpl
 */
public class MyPriorityQ implements PriorityQInterface<Patient>{
    private PriorityQueue<Patient> pq; //holds priority queue of patients

    //constructor
    public MyPriorityQ() {
        //using a comparator to assign priority to the patients 
        pq = new PriorityQueue<>(Comparator
        .comparing((Patient p) -> {
            switch (p.getPriority()){
                case "urgent": return 1; //urgent patients are 1st priority
                case "medium": return 2; //2nd priority
                default: return 3; //low priority last
            }
        })
            //if patients are same priority, use age to compare, older is more priority
            .thenComparing(p -> -p.getAge())
            //if age is the same can check if theyre from hospital ward or not, patients not from one are higher prio
            .thenComparing(p -> !p.isFromHospitalWard()));
    }
  
    //add new patient to PQ
    @Override
    public void insert(Patient patient){
        pq.add(patient);
    }
    
    //remove patient from PQ with highest prio as theyve been seen to
    @Override
    public Patient remove(){
        return pq.poll();
        
    }
    
    //check if priority quehe is empty or not
    @Override
    public boolean isEmpty(){
        return pq.isEmpty();
    }
    
    
    
}
