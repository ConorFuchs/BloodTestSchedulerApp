/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bloodtestercaconorfuchs;

/**
 *
 * @author serpl
 */
public class Patient {
    
    //declare variables
    String name, priority, gpDetails;
    int age;
    boolean fromHospitalWard;

    public Patient(String name, String priority, String gpDetails, int age, boolean fromHospitalWard) {
        this.name = name;
        this.priority = priority;
        this.gpDetails = gpDetails;
        this.age = age;
        this.fromHospitalWard = fromHospitalWard;
    }
    
    
}


