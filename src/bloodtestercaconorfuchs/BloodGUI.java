/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package bloodtestercaconorfuchs;

import java.awt.event.KeyEvent;
import java.util.List;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author serpl
 */
public class BloodGUI extends javax.swing.JFrame {

    /**
     * Creates new form BloodGUI
     */
    private Scheduler scheduler; //added as instance variable to use the scheduler
    
    public BloodGUI(Scheduler scheduler) {
        this.scheduler = scheduler; //assigned scheduler to the GUI
        initComponents();
    }

    private boolean filledFields(){
        //make sure the text fields have inputs that are needed to avoid errors
        if(nameTF.getText().isEmpty() || ageTF.getText().isEmpty() ||
                gpTF.getText().isEmpty()){
            
            JOptionPane.showMessageDialog(null, "Please fill in all text fields");
            return false;
        }
            return true;//return true if fields are filled
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        titleLBL = new javax.swing.JLabel();
        nameLBL = new javax.swing.JLabel();
        ageLBL = new javax.swing.JLabel();
        priorityLBL = new javax.swing.JLabel();
        gpLBL = new javax.swing.JLabel();
        hospLBL = new javax.swing.JLabel();
        addBTN = new javax.swing.JButton();
        nameTF = new javax.swing.JTextField();
        ageTF = new javax.swing.JTextField();
        gpTF = new javax.swing.JTextField();
        priorityCB = new javax.swing.JComboBox<>();
        hospCB = new javax.swing.JCheckBox();
        queueTA = new javax.swing.JScrollPane();
        queueTxtA = new javax.swing.JTextArea();
        queueLBL = new javax.swing.JLabel();
        viewPatBTN = new javax.swing.JButton();
        patDoneBTN = new javax.swing.JButton();
        noShowBTN = new javax.swing.JButton();
        noShowLBL = new javax.swing.JLabel();
        noShowTA = new javax.swing.JScrollPane();
        noShowTxtA = new javax.swing.JTextArea();
        exitBTN = new javax.swing.JButton();
        listNoShowBTN = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        titleLBL.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        titleLBL.setText("Blood Test Center");

        nameLBL.setText("Name:");

        ageLBL.setText("Age:");

        priorityLBL.setText("Priority:");

        gpLBL.setText("GP Name:");

        hospLBL.setText("Hospital Ward?");

        addBTN.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        addBTN.setText("Add Patient");
        addBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBTNActionPerformed(evt);
            }
        });

        ageTF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                ageTFKeyPressed(evt);
            }
        });

        priorityCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Low", "Medium", "Urgent" }));

        hospCB.setText("Yes");

        queueTxtA.setColumns(20);
        queueTxtA.setRows(5);
        queueTA.setViewportView(queueTxtA);

        queueLBL.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        queueLBL.setText("List of Patients");

        viewPatBTN.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        viewPatBTN.setText("View Queue");
        viewPatBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewPatBTNActionPerformed(evt);
            }
        });

        patDoneBTN.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        patDoneBTN.setText("Patient Finished");
        patDoneBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                patDoneBTNActionPerformed(evt);
            }
        });

        noShowBTN.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        noShowBTN.setText("No Show");
        noShowBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                noShowBTNActionPerformed(evt);
            }
        });

        noShowLBL.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        noShowLBL.setText("Recent No Shows:");

        noShowTxtA.setColumns(20);
        noShowTxtA.setRows(5);
        noShowTA.setViewportView(noShowTxtA);

        exitBTN.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        exitBTN.setText("Exit");
        exitBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitBTNActionPerformed(evt);
            }
        });

        listNoShowBTN.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        listNoShowBTN.setText("List No Shows");
        listNoShowBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listNoShowBTNActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 106, Short.MAX_VALUE)
                .addComponent(viewPatBTN)
                .addGap(18, 18, 18)
                .addComponent(patDoneBTN)
                .addGap(18, 18, 18)
                .addComponent(noShowBTN)
                .addGap(219, 219, 219))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(queueTA)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nameLBL, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ageLBL, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(priorityLBL)
                            .addComponent(gpLBL)
                            .addComponent(hospLBL))
                        .addGap(23, 23, 23)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(hospCB, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(addBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(gpTF, javax.swing.GroupLayout.DEFAULT_SIZE, 235, Short.MAX_VALUE)
                                    .addComponent(ageTF, javax.swing.GroupLayout.DEFAULT_SIZE, 235, Short.MAX_VALUE)
                                    .addComponent(nameTF)
                                    .addComponent(priorityCB, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(exitBTN))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(236, 236, 236)
                        .addComponent(titleLBL))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(233, 233, 233)
                        .addComponent(queueLBL))
                    .addComponent(noShowTA, javax.swing.GroupLayout.Alignment.LEADING))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(221, 221, 221)
                .addComponent(noShowLBL)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(listNoShowBTN)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titleLBL)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameLBL)
                    .addComponent(nameTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(exitBTN))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ageLBL)
                    .addComponent(ageTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(priorityLBL)
                    .addComponent(priorityCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(gpLBL)
                    .addComponent(gpTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(hospLBL)
                    .addComponent(hospCB))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(addBTN)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(queueLBL)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(queueTA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(viewPatBTN)
                    .addComponent(patDoneBTN)
                    .addComponent(noShowBTN))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(noShowLBL)
                    .addComponent(listNoShowBTN))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(noShowTA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitBTNActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_exitBTNActionPerformed

    private void addBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBTNActionPerformed
        // TODO add your handling code here:
        //adds new patient to scheduler
        if(filledFields()){
        String name = nameTF.getText();
        String priority = (String) priorityCB.getSelectedItem();
        String gpDetails = gpTF.getText();
        int age = Integer.parseInt(ageTF.getText());
        boolean fromHospitalWard = hospCB.isSelected();
        
        //create a newpatient obj
        Patient newPatient = new Patient(name,priority,gpDetails,age,fromHospitalWard);
        
        //add the new patient to the scheudler
        scheduler.addPatient(newPatient);
        
        //clear text box
        queueTxtA.setText("");
        
        //show new patient confirmation message
        queueTxtA.append("Added: " + name +" to the Patient List");
        
        //reset input fields
        nameTF.setText("");
        priorityCB.setSelectedIndex(0);
        gpTF.setText("");
        ageTF.setText("");
        hospCB.setSelected(false);
        }
    }//GEN-LAST:event_addBTNActionPerformed

    private void viewPatBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewPatBTNActionPerformed
        // TODO add your handling code here:
        //view the list of patients in priority order
        
        //clear text box
        queueTxtA.setText("");
        
        //check if patient list queue is empty
        if(scheduler.isQueueEmpty()){
            queueTxtA.setText("No Patients waiting for Blood Test");
            return;
        }
        
        //make temp list for patients in Priority Queue
        List<Patient> patientsList = new ArrayList<>();
        
        //while loop to copy list of patients from pq to temp list
        while(!scheduler.isQueueEmpty()){
            patientsList.add(scheduler.getNextPat());
        }
        
        //put patients back into the priority quee to get back to original state using a for each loop
        for(int i = 0; i < patientsList.size(); i++){
            scheduler.addPatient(patientsList.get(i));
        }
        
        //display the patients
        for(int i = 0; i < patientsList.size(); i++){
            Patient p = patientsList.get(i);
            queueTxtA.append("Name: " +p.getName() + " | Priority: " + p.getPriority() + " | Age: " + p.getAge() + " | GP: " + p.getGpDetails() + "\n");
        }
    }//GEN-LAST:event_viewPatBTNActionPerformed

    private void patDoneBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_patDoneBTNActionPerformed
        // TODO add your handling code here:
        //removes patient at top of the queue as theyve been seen to by doctor
        queueTxtA.setText("");
        
        //check if patient list queue is empty
        if(scheduler.isQueueEmpty()){
            queueTxtA.setText("No Patients waiting for Blood Test");
            return;
        }
        
        //remove patient at top of queue
        Patient seenPatient = scheduler.getNextPat();
        
        //message that patients got blood test done
        queueTxtA.setText("Patient " + seenPatient.getName() + " has had blood test completed");
        
    }//GEN-LAST:event_patDoneBTNActionPerformed

    private void noShowBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_noShowBTNActionPerformed
        // TODO add your handling code here:
         //check if patient list queue is empty
        if(scheduler.isQueueEmpty()){
            queueTxtA.setText("No Patients waiting for Blood Test");
            return;
        }
        
        //add temp variable to store no show patient, next in queue remove them from pq
        Patient noShowPatient = scheduler.getNextPat();
        
        //add patients name to the no show list
        scheduler.patientNoShow(noShowPatient.getName());
        //confirmation message for user
        queueTxtA.setText("Patient " + noShowPatient.getName() + " has not turned up for their appointment, moved to no show list");
    }//GEN-LAST:event_noShowBTNActionPerformed

    private void listNoShowBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listNoShowBTNActionPerformed
        // TODO add your handling code here:
        //show the no show list patients
        //clear text area
        noShowTxtA.setText("");
        
        //check if list is empty
        if(scheduler.isNoShowEmpty()){
            noShowTxtA.setText("No Show list empty today!");
            return;
        }
        
        //display all no shows list
        List<String> noShowList = scheduler.getNoShowList();
        for(int i = 0; i < noShowList.size(); i++){
            noShowTxtA.append("Name: " + noShowList.get(i) + "\n");
        }
        
    }//GEN-LAST:event_listNoShowBTNActionPerformed

    private void ageTFKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ageTFKeyPressed
        // TODO add your handling code here:
        //make sure only integers are added to the age text field
        
        char keyChar = evt.getKeyChar();
        int key = evt.getKeyCode();
        
        //check if keys a digit or backspace, allow them aswell as numbers
        if(!(Character.isDigit(keyChar) || key == KeyEvent.VK_BACK_SPACE)){
            evt.consume();//prevent key from being entered
            JOptionPane.showMessageDialog(null, "Only Digits 0-9 for Age please");
            ageTF.setText("");
            
        }
    }//GEN-LAST:event_ageTFKeyPressed

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addBTN;
    private javax.swing.JLabel ageLBL;
    private javax.swing.JTextField ageTF;
    private javax.swing.JButton exitBTN;
    private javax.swing.JLabel gpLBL;
    private javax.swing.JTextField gpTF;
    private javax.swing.JCheckBox hospCB;
    private javax.swing.JLabel hospLBL;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton listNoShowBTN;
    private javax.swing.JLabel nameLBL;
    private javax.swing.JTextField nameTF;
    private javax.swing.JButton noShowBTN;
    private javax.swing.JLabel noShowLBL;
    private javax.swing.JScrollPane noShowTA;
    private javax.swing.JTextArea noShowTxtA;
    private javax.swing.JButton patDoneBTN;
    private javax.swing.JComboBox<String> priorityCB;
    private javax.swing.JLabel priorityLBL;
    private javax.swing.JLabel queueLBL;
    private javax.swing.JScrollPane queueTA;
    private javax.swing.JTextArea queueTxtA;
    private javax.swing.JLabel titleLBL;
    private javax.swing.JButton viewPatBTN;
    // End of variables declaration//GEN-END:variables
}
