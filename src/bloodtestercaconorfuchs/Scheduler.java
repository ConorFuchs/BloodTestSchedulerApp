/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bloodtestercaconorfuchs;

/**
 *
 * @author serpl
 */
//scheduler class will handle adding patients to PQ and handle no shows
public class Scheduler {
    private MyPriorityQ pq;
    private MyQueue<String> noShowTrack;

    public Scheduler(MyPriorityQ pq, MyQueue<String> noShowTrack) {
        this.pq = pq;
        this.noShowTrack = noShowTrack;
    }
    
    public void addPatient(Patient patient){
        //will finish implementing this later just setting up
    }
    
    public Patient getNextP(){
        return null;//here till i fix issue and create method
    }
    
    public void patientNoShow(String patientName){
        //will finish implementing this later just setting up
    }
}
