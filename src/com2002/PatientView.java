package com2002;

import com2002.models.*;

public class PatientView extends javax.swing.JFrame {

    public PatientView() {
        initComponents();
        setLocationRelativeTo(null);
    }

    public void setPatient(Patient patient) {
        patientObj = patient;
        patientID = patient.getPatientID();
        title = patient.getTitle();
        forename = patient.getForename();
        surname = patient.getSurname();
        dateOfBirth = patient.getDateOfBirth().toString();
        contactNo = patient.getContactNo();
        TxtFld_PatientView_PatientID.setText(""+patientID);
        TxtFld_PatientView_PatientID.setEditable(false);
        TxtFld_PatientView_Title.setText(title);
        TxtFld_PatientView_Title.setEditable(false);
        TxtFld_PatientView_Forename.setText(forename);
        TxtFld_PatientView_Forename.setEditable(false);
        TxtFld_PatientView_Surname.setText(surname);
        TxtFld_PatientView_Surname.setEditable(false);
        TxtFld_PatientView_Dob.setText(dateOfBirth);
        TxtFld_PatientView_Dob.setEditable(false);
        TxtFld_PatientView_Contact.setText(contactNo);
        TxtFld_PatientView_Contact.setEditable(false);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        PatientViewPanel = new javax.swing.JPanel();
        Lbl_PatientView_PatientID = new javax.swing.JLabel();
        TxtFld_PatientView_PatientID = new javax.swing.JTextField();
        Lbl_PatientView_Title = new javax.swing.JLabel();
        TxtFld_PatientView_Title = new javax.swing.JTextField();
        Lbl_PatientView_Forename = new javax.swing.JLabel();
        TxtFld_PatientView_Forename = new javax.swing.JTextField();
        Lbl_PatientView_Surname = new javax.swing.JLabel();
        TxtFld_PatientView_Surname = new javax.swing.JTextField();
        Lbl_PatientView_Dob = new javax.swing.JLabel();
        TxtFld_PatientView_Dob = new javax.swing.JTextField();
        Lbl_PatientView_Contact = new javax.swing.JLabel();
        TxtFld_PatientView_Contact = new javax.swing.JTextField();
        Btn_PatientView_ViewPatientPlan = new javax.swing.JButton();
        Btn_PatientView_OutstandingCosts = new javax.swing.JButton();
        Btn_PatientView_Cancel = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Patient");

        Lbl_PatientView_PatientID.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Lbl_PatientView_PatientID.setText("Patient ID");

        Lbl_PatientView_Title.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Lbl_PatientView_Title.setText("Title");

        Lbl_PatientView_Forename.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Lbl_PatientView_Forename.setText("Forename");

        Lbl_PatientView_Surname.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Lbl_PatientView_Surname.setText("Surname");

        Lbl_PatientView_Dob.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Lbl_PatientView_Dob.setText("Date of Birth");

        Lbl_PatientView_Contact.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Lbl_PatientView_Contact.setText("Contact No.");

        Btn_PatientView_ViewPatientPlan.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Btn_PatientView_ViewPatientPlan.setText("View Patient Plan");
        Btn_PatientView_ViewPatientPlan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_PatientView_ViewPatientPlanActionPerformed(evt);
            }
        });

        Btn_PatientView_OutstandingCosts.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Btn_PatientView_OutstandingCosts.setText("Outstanding Costs");
        Btn_PatientView_OutstandingCosts.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_PatientView_OutstandingCostsActionPerformed(evt);
            }
        });

        Btn_PatientView_Cancel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Btn_PatientView_Cancel.setText("Cancel");
        Btn_PatientView_Cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_PatientView_CancelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PatientViewPanelLayout = new javax.swing.GroupLayout(PatientViewPanel);
        PatientViewPanel.setLayout(PatientViewPanelLayout);
        PatientViewPanelLayout.setHorizontalGroup(
                PatientViewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(PatientViewPanelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(PatientViewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(PatientViewPanelLayout.createSequentialGroup()
                                                .addGroup(PatientViewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(PatientViewPanelLayout.createSequentialGroup()
                                                                .addComponent(Lbl_PatientView_Dob)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(TxtFld_PatientView_Dob, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(PatientViewPanelLayout.createSequentialGroup()
                                                                .addComponent(Lbl_PatientView_Title, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(TxtFld_PatientView_Title, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(PatientViewPanelLayout.createSequentialGroup()
                                                                .addComponent(Lbl_PatientView_Contact, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(TxtFld_PatientView_Contact, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(PatientViewPanelLayout.createSequentialGroup()
                                                                .addGroup(PatientViewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addGroup(PatientViewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                                                .addGroup(PatientViewPanelLayout.createSequentialGroup()
                                                                                        .addComponent(Lbl_PatientView_Forename, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                        .addComponent(TxtFld_PatientView_Forename, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                .addGroup(PatientViewPanelLayout.createSequentialGroup()
                                                                                        .addComponent(Lbl_PatientView_PatientID, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                        .addComponent(TxtFld_PatientView_PatientID, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                        .addGap(51, 51, 51)))
                                                                        .addComponent(Btn_PatientView_ViewPatientPlan))
                                                                .addGap(18, 18, 18)
                                                                .addComponent(Lbl_PatientView_Surname, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(TxtFld_PatientView_Surname, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGroup(PatientViewPanelLayout.createSequentialGroup()
                                                .addComponent(Btn_PatientView_OutstandingCosts)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(Btn_PatientView_Cancel))))
        );
        PatientViewPanelLayout.setVerticalGroup(
                PatientViewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(PatientViewPanelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(PatientViewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(TxtFld_PatientView_PatientID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(Lbl_PatientView_PatientID))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(PatientViewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(TxtFld_PatientView_Title, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(Lbl_PatientView_Title))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(PatientViewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(TxtFld_PatientView_Forename, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(Lbl_PatientView_Forename)
                                        .addComponent(TxtFld_PatientView_Surname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(Lbl_PatientView_Surname))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(PatientViewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(TxtFld_PatientView_Dob, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(Lbl_PatientView_Dob))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(PatientViewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(TxtFld_PatientView_Contact, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(Lbl_PatientView_Contact))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Btn_PatientView_ViewPatientPlan)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(PatientViewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(Btn_PatientView_OutstandingCosts)
                                        .addComponent(Btn_PatientView_Cancel))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(PatientViewPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap())
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(PatientViewPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>

    private void Btn_PatientView_ViewPatientPlanActionPerformed(java.awt.event.ActionEvent evt) {
        SubscriptionView plan = new SubscriptionView();
        plan.setPatient(patientObj);
        plan.setVisible(true);
    }

    private void Btn_PatientView_OutstandingCostsActionPerformed(java.awt.event.ActionEvent evt) {
        OutstandingCosts outstanding = new OutstandingCosts();
        outstanding.setPatient(patientObj);
    }

    private void Btn_PatientView_CancelActionPerformed(java.awt.event.ActionEvent evt) {
        setVisible(false);
        dispose();
    }

    private javax.swing.JButton Btn_PatientView_Cancel;
    private javax.swing.JButton Btn_PatientView_OutstandingCosts;
    private javax.swing.JButton Btn_PatientView_ViewPatientPlan;
    private javax.swing.JLabel Lbl_PatientView_Contact;
    private javax.swing.JLabel Lbl_PatientView_Dob;
    private javax.swing.JLabel Lbl_PatientView_Forename;
    private javax.swing.JLabel Lbl_PatientView_PatientID;
    private javax.swing.JLabel Lbl_PatientView_Surname;
    private javax.swing.JLabel Lbl_PatientView_Title;
    private javax.swing.JPanel PatientViewPanel;
    private javax.swing.JTextField TxtFld_PatientView_Contact;
    private javax.swing.JTextField TxtFld_PatientView_Dob;
    private javax.swing.JTextField TxtFld_PatientView_Forename;
    private javax.swing.JTextField TxtFld_PatientView_PatientID;
    private javax.swing.JTextField TxtFld_PatientView_Surname;
    private javax.swing.JTextField TxtFld_PatientView_Title;
    private int patientID;
    private String title;
    private String forename;
    private String surname;
    private String dateOfBirth;
    private String contactNo;
    private Patient patientObj;
}
