/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bloodtestercaconorfuchs;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author serpl
 */
//scheduler class will handle adding patients to PQ and handle no shows
public class Scheduler {
    private MyPriorityQ pq;//priority queue managing patients on urgency
    private MyQueue<String> noShowTrack;//for tracking no shows

    //constructor initilizez with pq and no show queue
    public Scheduler(MyPriorityQ pq, MyQueue<String> noShowTrack) {
        this.pq = pq;
        this.noShowTrack = noShowTrack;
    }
    //add new patient to pq
    public void addPatient(Patient patient){
        pq.insert(patient);
    }
    //remove the next patient from the pq
    public Patient getNextPat(){
        return pq.remove();
    }
    //moves no show patient to no show queue
    public void patientNoShow(String patientName){
        noShowTrack.enqueue(patientName);
    }
    //check if patient queues empty
    public boolean isQueueEmpty(){
        return pq.isEmpty();
    }
    //check it no show queues empty
    public boolean isNoShowEmpty(){
        return noShowTrack.isEmpty();
    }
    
    public List<String> getNoShowList() {
    List<String> noShowPatients = new ArrayList<>();
    while (!noShowTrack.isEmpty()) {
        noShowPatients.add(noShowTrack.dequeue());
    }
    
    for (int i = 0; i < noShowPatients.size(); i++) {
        noShowTrack.enqueue(noShowPatients.get(i));
        }
            return noShowPatients;
    }
}
