/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bloodtestercaconorfuchs;

/**
 *
 * @author serpl
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        MyPriorityQ patientQueue = new MyPriorityQ();//create a pq to manage patients
        MyQueue<String> noShowQueue = new MyQueue<>();//create a queue for the no show list
        
        //scheduler instance to manage patients and noshows
        Scheduler scheduler = new Scheduler(patientQueue, noShowQueue);
        BloodGUI gui = new BloodGUI(scheduler); //pass scheduler to GUI
        gui.setVisible(true);    
        
        //added some patients to the patient list
        scheduler.addPatient(new Patient("Pat", "Urgent", "Dr Moore", 75, false));
        scheduler.addPatient(new Patient("Mikey", "Medium", "Dr Boss", 40, true));       
    }
    
}
