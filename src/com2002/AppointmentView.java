package com2002;

import com2002.models.Appointment;
import com2002.models.Patient;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowEvent;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class AppointmentView extends javax.swing.JFrame {

    public AppointmentView() {
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        AppointmentViewPanel = new javax.swing.JPanel();
        TxtFld_AppointmentView_Date = new javax.swing.JTextField();
        TxtFld_AppointmentView_Start = new javax.swing.JTextField();
        TxtFld_AppointmentView_End = new javax.swing.JTextField();
        TxtFld_AppointmentView_Title = new javax.swing.JTextField();
        TxtFld_AppointmentView_Forename = new javax.swing.JTextField();
        TxtFld_AppointmentView_Surname = new javax.swing.JTextField();
        TxtFld_AppointmentView_Dob = new javax.swing.JTextField();
        TxtFld_AppointmentView_Contact = new javax.swing.JTextField();
        Lbl_AppointmentView_Date = new javax.swing.JLabel();
        Lbl_AppointmentView_Start = new javax.swing.JLabel();
        Lbl_AppointmentView_End = new javax.swing.JLabel();
        Lbl_AppointmentView_Title = new javax.swing.JLabel();
        Lbl_AppointmentView_Forename = new javax.swing.JLabel();
        Lbl_AppointmentView_Surname = new javax.swing.JLabel();
        Lbl_AppointmentView_Dob = new javax.swing.JLabel();
        Lbl_AppointmentView_Contact = new javax.swing.JLabel();
        TxtFld_AppointmentView_Partner = new javax.swing.JTextField();
        Lbl_AppointmentView_Partner = new javax.swing.JLabel();
        Btn_AppointmentView_OK = new javax.swing.JToggleButton();
        Btn_AppointmentView_Cancel = new javax.swing.JToggleButton();
        TxtFld_AppointmentView_Type = new javax.swing.JTextField();
        Lbl_AppointmentView_Type = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        TxtFld_AppointmentView_Date.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        TxtFld_AppointmentView_Start.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        TxtFld_AppointmentView_End.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        TxtFld_AppointmentView_Title.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        TxtFld_AppointmentView_Forename.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        TxtFld_AppointmentView_Surname.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        TxtFld_AppointmentView_Dob.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        TxtFld_AppointmentView_Contact.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        Lbl_AppointmentView_Date.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Lbl_AppointmentView_Date.setText("Date");

        Lbl_AppointmentView_Start.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Lbl_AppointmentView_Start.setText("Start Time");
        Lbl_AppointmentView_Start.setToolTipText("");

        Lbl_AppointmentView_End.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Lbl_AppointmentView_End.setText("End Time");

        Lbl_AppointmentView_Title.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Lbl_AppointmentView_Title.setText("Title");

        Lbl_AppointmentView_Forename.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Lbl_AppointmentView_Forename.setText("Forename");
        Lbl_AppointmentView_Forename.setToolTipText("");

        Lbl_AppointmentView_Surname.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Lbl_AppointmentView_Surname.setText("Surname");

        Lbl_AppointmentView_Dob.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Lbl_AppointmentView_Dob.setText("Date of Birth");

        Lbl_AppointmentView_Contact.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Lbl_AppointmentView_Contact.setText("Contact No.");

        TxtFld_AppointmentView_Partner.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        Lbl_AppointmentView_Partner.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Lbl_AppointmentView_Partner.setText("Partner");

        Btn_AppointmentView_OK.setText("OK");
        Btn_AppointmentView_OK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_AppointmentView_OKActionPerformed(evt);
            }
        });

        Btn_AppointmentView_Cancel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Btn_AppointmentView_Cancel.setText("Cancel Appointment");
        Btn_AppointmentView_Cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_AppointmentView_CancelActionPerformed(evt);
            }
        });

        TxtFld_AppointmentView_Type.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        Lbl_AppointmentView_Type.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Lbl_AppointmentView_Type.setText("Type ");

        javax.swing.GroupLayout AppointmentViewPanelLayout = new javax.swing.GroupLayout(AppointmentViewPanel);
        AppointmentViewPanel.setLayout(AppointmentViewPanelLayout);
        AppointmentViewPanelLayout.setHorizontalGroup(
                AppointmentViewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(AppointmentViewPanelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(AppointmentViewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(AppointmentViewPanelLayout.createSequentialGroup()
                                                .addGroup(AppointmentViewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(Lbl_AppointmentView_Start, javax.swing.GroupLayout.DEFAULT_SIZE, 72, Short.MAX_VALUE)
                                                        .addComponent(Lbl_AppointmentView_Date, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(AppointmentViewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(TxtFld_AppointmentView_Start)
                                                        .addComponent(TxtFld_AppointmentView_Date, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(Lbl_AppointmentView_End)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(TxtFld_AppointmentView_End, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, Short.MAX_VALUE))
                                        .addGroup(AppointmentViewPanelLayout.createSequentialGroup()
                                                .addGroup(AppointmentViewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(AppointmentViewPanelLayout.createSequentialGroup()
                                                                .addGroup(AppointmentViewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addGroup(AppointmentViewPanelLayout.createSequentialGroup()
                                                                                .addGroup(AppointmentViewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                        .addGroup(AppointmentViewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                                                .addComponent(Lbl_AppointmentView_Dob, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                                                .addComponent(Lbl_AppointmentView_Contact, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                        .addComponent(Lbl_AppointmentView_Partner, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                        .addComponent(Lbl_AppointmentView_Type, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                .addGroup(AppointmentViewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                                        .addComponent(TxtFld_AppointmentView_Contact, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
                                                                                        .addComponent(TxtFld_AppointmentView_Partner)
                                                                                        .addComponent(TxtFld_AppointmentView_Dob, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                        .addComponent(TxtFld_AppointmentView_Type)))
                                                                        .addGroup(AppointmentViewPanelLayout.createSequentialGroup()
                                                                                .addGroup(AppointmentViewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                                                        .addComponent(Lbl_AppointmentView_Forename, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                                        .addComponent(Lbl_AppointmentView_Title, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                .addGroup(AppointmentViewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                        .addComponent(TxtFld_AppointmentView_Title, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                        .addGroup(AppointmentViewPanelLayout.createSequentialGroup()
                                                                                                .addComponent(TxtFld_AppointmentView_Forename, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                                .addComponent(Lbl_AppointmentView_Surname)
                                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                                .addComponent(TxtFld_AppointmentView_Surname, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                                                .addGap(0, 9, Short.MAX_VALUE))
                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AppointmentViewPanelLayout.createSequentialGroup()
                                                                .addComponent(Btn_AppointmentView_Cancel)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addComponent(Btn_AppointmentView_OK)))
                                                .addContainerGap())))
        );
        AppointmentViewPanelLayout.setVerticalGroup(
                AppointmentViewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(AppointmentViewPanelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(AppointmentViewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(TxtFld_AppointmentView_Date, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(Lbl_AppointmentView_Date))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(AppointmentViewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(TxtFld_AppointmentView_Start, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(Lbl_AppointmentView_Start)
                                        .addComponent(TxtFld_AppointmentView_End, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(Lbl_AppointmentView_End))
                                .addGap(35, 35, 35)
                                .addGroup(AppointmentViewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(TxtFld_AppointmentView_Title, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(Lbl_AppointmentView_Title))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(AppointmentViewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(TxtFld_AppointmentView_Forename, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(Lbl_AppointmentView_Forename)
                                        .addComponent(TxtFld_AppointmentView_Surname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(Lbl_AppointmentView_Surname))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(AppointmentViewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(TxtFld_AppointmentView_Dob, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(Lbl_AppointmentView_Dob))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(AppointmentViewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(TxtFld_AppointmentView_Contact, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(Lbl_AppointmentView_Contact))
                                .addGap(37, 37, 37)
                                .addGroup(AppointmentViewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(TxtFld_AppointmentView_Partner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(Lbl_AppointmentView_Partner))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(AppointmentViewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(TxtFld_AppointmentView_Type, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(Lbl_AppointmentView_Type))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                                .addGroup(AppointmentViewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(Btn_AppointmentView_OK)
                                        .addComponent(Btn_AppointmentView_Cancel))
                                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(AppointmentViewPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(AppointmentViewPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>

    public void setAppointment(Appointment app) {
        appointmentObj = app;
        patient = app.getPatient();

        title = forename = surname = contactNo = dateOfBirth = "";

        if (patient != null) {
            title = patient.getTitle();
            forename = patient.getForename();
            surname = patient.getSurname();
            dateOfBirth = patient.getDateOfBirth().toString();
            contactNo = patient.getContactNo();
        }

        start = app.getStartTime();
        end = app.getEndTime();
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat timeFormat = new SimpleDateFormat("HH:mm");
        startTime = timeFormat.format(start);
        endTime = timeFormat.format(end);
        dateStr = dateFormat.format(start);
        staff = app.getStaff().getPosition();
        TxtFld_AppointmentView_Title.setText(title);
        TxtFld_AppointmentView_Forename.setText(forename);
        TxtFld_AppointmentView_Surname.setText(surname);
        TxtFld_AppointmentView_Dob.setText(dateOfBirth);
        TxtFld_AppointmentView_Contact.setText(contactNo);
        TxtFld_AppointmentView_Date.setText(dateStr);
        TxtFld_AppointmentView_Start.setText(startTime);
        TxtFld_AppointmentView_End.setText(endTime);
        TxtFld_AppointmentView_Partner.setText(staff);
        if (end.getTime() - start.getTime() == 1200000){
            if (staff.equals("Dentist")){
                TxtFld_AppointmentView_Type.setText("Check-Up");
            }
            else {
                TxtFld_AppointmentView_Type.setText("Hygiene");
            }
        }
        else{
            TxtFld_AppointmentView_Type.setText("Treatment");
        }
        
        this.setTitle("Appointment: " + dateStr + " " + startTime + " - " + endTime + ", " + staff);
    }

    private void Btn_AppointmentView_OKActionPerformed(java.awt.event.ActionEvent evt) {
        Window parent = SwingUtilities.getWindowAncestor(AppointmentViewPanel);
        parent.dispatchEvent(new WindowEvent(parent , WindowEvent.WINDOW_CLOSING));

    }

    private void Btn_AppointmentView_CancelActionPerformed(java.awt.event.ActionEvent evt) {
        appointmentObj.cancel();
        Window parent = SwingUtilities.getWindowAncestor(AppointmentViewPanel);
        parent.dispatchEvent(new WindowEvent(parent , WindowEvent.WINDOW_CLOSING));
    }

    private javax.swing.JPanel AppointmentViewPanel;
    private javax.swing.JToggleButton Btn_AppointmentView_Cancel;
    private javax.swing.JToggleButton Btn_AppointmentView_OK;
    private javax.swing.JLabel Lbl_AppointmentView_Contact;
    private javax.swing.JLabel Lbl_AppointmentView_Date;
    private javax.swing.JLabel Lbl_AppointmentView_Dob;
    private javax.swing.JLabel Lbl_AppointmentView_End;
    private javax.swing.JLabel Lbl_AppointmentView_Forename;
    private javax.swing.JLabel Lbl_AppointmentView_Partner;
    private javax.swing.JLabel Lbl_AppointmentView_Start;
    private javax.swing.JLabel Lbl_AppointmentView_Surname;
    private javax.swing.JLabel Lbl_AppointmentView_Title;
    private javax.swing.JLabel Lbl_AppointmentView_Type;
    private javax.swing.JTextField TxtFld_AppointmentView_Contact;
    private javax.swing.JTextField TxtFld_AppointmentView_Date;
    private javax.swing.JTextField TxtFld_AppointmentView_Dob;
    private javax.swing.JTextField TxtFld_AppointmentView_End;
    private javax.swing.JTextField TxtFld_AppointmentView_Forename;
    private javax.swing.JTextField TxtFld_AppointmentView_Partner;
    private javax.swing.JTextField TxtFld_AppointmentView_Start;
    private javax.swing.JTextField TxtFld_AppointmentView_Surname;
    private javax.swing.JTextField TxtFld_AppointmentView_Title;
    private javax.swing.JTextField TxtFld_AppointmentView_Type;
    private String title;
    private String forename;
    private String surname;
    private String dateOfBirth;
    private String contactNo;
    private String dateStr;
    private String startTime;
    private String endTime;
    private String staff;
    private Date start;
    private Date end;
    private Patient patient;
    private Appointment appointmentObj;
}
