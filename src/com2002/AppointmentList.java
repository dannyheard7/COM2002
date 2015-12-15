/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com2002;

import com2002.models.Appointment;
import com2002.models.Patient;
import com2002.models.Treatment;

import javax.swing.*;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

/**
 *
 * @author Abigail
 */
public class AppointmentList extends javax.swing.JFrame {

    /**
     * Creates new form AppointmentList
     */
    public AppointmentList() {
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

        AppointmentListPanel = new javax.swing.JPanel();
        Lbl_AppointmentList_Appointment = new javax.swing.JLabel();
        Scrl_AppointmentList_Appointment = new javax.swing.JScrollPane();
        Lst_AppointmentList_Appointment = new javax.swing.JList<>();
        Btn_AppointmentList_ViewAppointment = new javax.swing.JToggleButton();
        Btn_AppointmentList_Cancel = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        Lbl_AppointmentList_Appointment.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Lbl_AppointmentList_Appointment.setText("Appointment");

//        Lst_AppointmentList_Appointment.setModel(new javax.swing.AbstractListModel<String>() {
//            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
//            public int getSize() { return strings.length; }
//            public String getElementAt(int i) { return strings[i]; }
//        });
        Scrl_AppointmentList_Appointment.setViewportView(Lst_AppointmentList_Appointment);

        Btn_AppointmentList_ViewAppointment.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Btn_AppointmentList_ViewAppointment.setText("View Appointment");
        Btn_AppointmentList_ViewAppointment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_AppointmentList_ViewAppointmentActionPerformed(evt);
            }
        });

        Btn_AppointmentList_Cancel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Btn_AppointmentList_Cancel.setText("Cancel");
        Btn_AppointmentList_Cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_AppointmentList_CancelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout AppointmentListPanelLayout = new javax.swing.GroupLayout(AppointmentListPanel);
        AppointmentListPanel.setLayout(AppointmentListPanelLayout);
        AppointmentListPanelLayout.setHorizontalGroup(
                AppointmentListPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(AppointmentListPanelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(AppointmentListPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(Scrl_AppointmentList_Appointment, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(Lbl_AppointmentList_Appointment, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AppointmentListPanelLayout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Btn_AppointmentList_ViewAppointment)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Btn_AppointmentList_Cancel)
                                .addContainerGap())
        );
        AppointmentListPanelLayout.setVerticalGroup(
                AppointmentListPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(AppointmentListPanelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(Lbl_AppointmentList_Appointment)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Scrl_AppointmentList_Appointment, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                                .addGroup(AppointmentListPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(Btn_AppointmentList_ViewAppointment)
                                        .addComponent(Btn_AppointmentList_Cancel))
                                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(AppointmentListPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(106, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(AppointmentListPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>

    private void Btn_AppointmentList_ViewAppointmentActionPerformed(java.awt.event.ActionEvent evt) {
        if (!Lst_AppointmentList_Appointment.isSelectionEmpty()) {
            Appointment app = (Appointment) Lst_AppointmentList_Appointment.getSelectedValue();
            AppointmentView appView = new AppointmentView();
            appView.setAppointment(app);
            appView.setVisible(true);
            appView.addWindowListener(new java.awt.event.WindowAdapter() {
                @Override
                public void windowClosing(java.awt.event.WindowEvent windowEvent) {
                    displayAppointments();
                }
            });
        }
    }

    private void Btn_AppointmentList_CancelActionPerformed(java.awt.event.ActionEvent evt) {
        setVisible(false);
    }

    public void setPatient(Patient patient){
        patientObj = patient;

        listModel = new DefaultListModel();
        displayAppointments();

    }

    public void displayAppointments(){
        listModel.removeAllElements();
        ArrayList<Appointment> appointments = Appointment.findPatientsAppointments(patientObj);
        for (Appointment a : appointments) {
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
            SimpleDateFormat timeFormat = new SimpleDateFormat("HH:mm");
            listModel.addElement(a);
        }
        Lst_AppointmentList_Appointment.setModel(listModel);
    }


    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AppointmentList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AppointmentList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AppointmentList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AppointmentList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AppointmentList().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify
    private javax.swing.JPanel AppointmentListPanel;
    private javax.swing.JButton Btn_AppointmentList_Cancel;
    private javax.swing.JToggleButton Btn_AppointmentList_ViewAppointment;
    private javax.swing.JLabel Lbl_AppointmentList_Appointment;
    private javax.swing.JList Lst_AppointmentList_Appointment;
    private javax.swing.JScrollPane Scrl_AppointmentList_Appointment;
    private Patient patientObj;
    private DefaultListModel listModel;
    // End of variables declaration
}
