package com2002;

import com2002.models.*;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

public class SubscriptionView extends javax.swing.JFrame {

    public SubscriptionView() {
        initComponents();
        setLocationRelativeTo(null);
    }

    public void setPatient(Patient patient) {
        this.patientObj = patient;
        
        PatientPlan plan = patientObj.getPlan(); 
        Combo_SubscriptionView_Plan.setSelectedItem("No Plan");
        
        if (plan.getPlanName() != null) {
            Combo_SubscriptionView_Plan.setSelectedItem(plan.getPlanName());
        }
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        SubscriptionViewPanel = new javax.swing.JPanel();
        Lbl_SubscriptionView_Plan = new javax.swing.JLabel();
        Combo_SubscriptionView_Plan = new javax.swing.JComboBox();
        Btn_SubscriptionView_Ok = new javax.swing.JButton();
        Btn_SubscriptionView_Cancel = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Patient Plan");

        Lbl_SubscriptionView_Plan.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Lbl_SubscriptionView_Plan.setText("Plan");

        ArrayList<Plan> plans = Plan.getAllPlans();
        ArrayList<String> planNames = new ArrayList<>();
        for (int i=0;i<plans.size();i++){
            planNames.add(plans.get(i).getName());
        }
        planNames.add("No Plan");
        Combo_SubscriptionView_Plan.setModel(new javax.swing.DefaultComboBoxModel(planNames.toArray()));

        Btn_SubscriptionView_Ok.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Btn_SubscriptionView_Ok.setText("OK");
        Btn_SubscriptionView_Ok.setToolTipText("");
        Btn_SubscriptionView_Ok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_SubscriptionView_OkActionPerformed(evt);
            }
        });

        Btn_SubscriptionView_Cancel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Btn_SubscriptionView_Cancel.setText("Cancel");
        Btn_SubscriptionView_Cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_SubscriptionView_CancelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout SubscriptionViewPanelLayout = new javax.swing.GroupLayout(SubscriptionViewPanel);
        SubscriptionViewPanel.setLayout(SubscriptionViewPanelLayout);
        SubscriptionViewPanelLayout.setHorizontalGroup(
                SubscriptionViewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(SubscriptionViewPanelLayout.createSequentialGroup()
                                .addGap(37, 37, 37)
                                .addComponent(Lbl_SubscriptionView_Plan)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Combo_SubscriptionView_Plan, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(39, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, SubscriptionViewPanelLayout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Btn_SubscriptionView_Ok)
                                .addGap(18, 18, 18)
                                .addComponent(Btn_SubscriptionView_Cancel)
                                .addGap(78, 78, 78))
        );
        SubscriptionViewPanelLayout.setVerticalGroup(
                SubscriptionViewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(SubscriptionViewPanelLayout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addGroup(SubscriptionViewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(Combo_SubscriptionView_Plan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(Lbl_SubscriptionView_Plan))
                                .addGap(18, 18, 18)
                                .addGroup(SubscriptionViewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(Btn_SubscriptionView_Ok)
                                        .addComponent(Btn_SubscriptionView_Cancel))
                                .addContainerGap(31, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(SubscriptionViewPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(SubscriptionViewPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>

    private void Btn_SubscriptionView_OkActionPerformed(java.awt.event.ActionEvent evt) {
        // return the plan selected in the SQL
        String planName = Combo_SubscriptionView_Plan.getSelectedItem().toString();
        
        if (planName.equals("No Plan")) {
            patientObj.getPlan().deletePatientPlan();
        } else {
            Calendar cal = Calendar.getInstance();
            cal.add(Calendar.YEAR, 1);
            Date nextYear = cal.getTime();
            
            new PatientPlan(patientObj.getPatientID(), planName, nextYear);
        }
        
        setVisible(false);
        dispose();
    }

    private void Btn_SubscriptionView_CancelActionPerformed(java.awt.event.ActionEvent evt) {
        setVisible(false);
        dispose();
    }

    private javax.swing.JButton Btn_SubscriptionView_Cancel;
    private javax.swing.JButton Btn_SubscriptionView_Ok;
    private javax.swing.JComboBox Combo_SubscriptionView_Plan;
    private javax.swing.JLabel Lbl_SubscriptionView_Plan;
    private javax.swing.JPanel SubscriptionViewPanel;
    private Patient patientObj;
}
