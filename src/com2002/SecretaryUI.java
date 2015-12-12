package com2002;

import com2002.models.*;

import java.awt.Color;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JPanel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Louis
 */
public class SecretaryUI extends javax.swing.JFrame {


    private Calendar calendar;
    private String weekStart;
    private String weekEnd;
    private String displayYear;
    private String dateActual;
    private final Date today;

    /**
     * Creates new form UI
     */
    public SecretaryUI() {

        calendar = new GregorianCalendar(TimeZone.getTimeZone("GMT"));
        Date now = new Date();
        calendar.setTime(now);

        DateFormat dateAct = new SimpleDateFormat("dd/MM/yyyy", Locale.getDefault());
        today = calendar.getTime();
        dateActual = dateAct.format(calendar.getTime());


        initComponents();
        this.setLocationRelativeTo(null);
        updateUI();

    }

    public void updateNav(){
        DateFormat dFormat = new SimpleDateFormat("dd/MM", Locale.getDefault());

        calendar.set(Calendar.DAY_OF_WEEK, Calendar.MONDAY);
        weekStart = dFormat.format(calendar.getTime());
        calendar.set(Calendar.DAY_OF_WEEK, Calendar.FRIDAY);
        weekEnd = dFormat.format(calendar.getTime());

        weekDates.setText(weekStart + "-" + weekEnd);

        DateFormat yFormat = new SimpleDateFormat("yyyy", Locale.getDefault());
        displayYear = yFormat.format(calendar.getTime());
        yearDate.setText(displayYear);

    }

    public void updateDays(){
        DateFormat dFormat = new SimpleDateFormat("dd", Locale.getDefault());
        calendar.set(Calendar.DAY_OF_WEEK, Calendar.MONDAY);
        date1L.setText("Mon - " + dFormat.format(calendar.getTime()));
        calendar.set(Calendar.DAY_OF_WEEK, Calendar.TUESDAY);
        date2L.setText("Tues - " + dFormat.format(calendar.getTime()));
        calendar.set(Calendar.DAY_OF_WEEK, Calendar.WEDNESDAY);
        date3L.setText("Wed - " + dFormat.format(calendar.getTime()));
        calendar.set(Calendar.DAY_OF_WEEK, Calendar.THURSDAY);
        date4L.setText("Thurs - " + dFormat.format(calendar.getTime()));
        calendar.set(Calendar.DAY_OF_WEEK, Calendar.FRIDAY);
        date5L.setText("Fri - " + dFormat.format(calendar.getTime()));
    }

    public void updateDayButtons(){



        day1B.setBackground(Color.LIGHT_GRAY);
        day2B.setBackground(Color.LIGHT_GRAY);
        day3B.setBackground(Color.LIGHT_GRAY);
        day4B.setBackground(Color.LIGHT_GRAY);
        day5B.setBackground(Color.LIGHT_GRAY);

        ArrayList<Integer> apts = new ArrayList<>();

        int trueDay = 0;
        for(int i=0; i<5; i++){
            calendar.set(Calendar.DAY_OF_WEEK, (i+2));

            ArrayList<Appointment> dayApts = Appointment.getAppointmentsOnDate(calendar.getTime());

            apts.add(dayApts.size());

            DateFormat tDate = new SimpleDateFormat("dd/MM/yyyy", Locale.getDefault());
            String tempDate = tDate.format(calendar.getTime());
            System.out.println(tempDate);
            System.out.println(dateActual);
            if(tempDate.equals(dateActual)){
                trueDay = i+1;
            }
        }
        switch (trueDay) {
            case 1:
                day1B.setBackground(Color.RED);
                break;
            case 2:
                day2B.setBackground(Color.RED);
                break;
            case 3:
                day3B.setBackground(Color.RED);
                break;
            case 4:
                day4B.setBackground(Color.RED);
                break;
            case 5:
                day5B.setBackground(Color.RED);
                break;
            default:
                break;
        }

        day1B.setText(String.valueOf(apts.get(0)));
        day2B.setText(String.valueOf(apts.get(1)));
        day3B.setText(String.valueOf(apts.get(2)));
        day4B.setText(String.valueOf(apts.get(3)));
        day5B.setText(String.valueOf(apts.get(4)));



    }


    public void updateTimetable(){

        updateHourSlot(appointmentSlot1);
        updateHourSlot(appointmentSlot2);
        updateHourSlot(appointmentSlot3);
        updateHourSlot(appointmentSlot4);
        updateHourSlot(appointmentSlot5);
        updateHourSlot(appointmentSlot6);
        updateHourSlot(appointmentSlot7);
        updateHourSlot(appointmentSlot8);




    }


    public void updateHourSlot(JPanel slot){
        // Add appointment buttons to the slot where slot is a JPanel





    }

    public void updateUI(){
        updateNav();
        updateDays();
        updateDayButtons();
        //updateTimetable();
    }







    /**
     * This method is called from within the constructor to initialise the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        calendarMaster = new javax.swing.JPanel();
        navWrapper = new javax.swing.JPanel();
        nextWeek = new javax.swing.JButton();
        prevWeek = new javax.swing.JButton();
        weekDates = new javax.swing.JLabel();
        yearDate = new javax.swing.JLabel();
        weekWrapper = new javax.swing.JPanel();
        day1B = new javax.swing.JButton();
        day2B = new javax.swing.JButton();
        day3B = new javax.swing.JButton();
        day4B = new javax.swing.JButton();
        day5B = new javax.swing.JButton();
        date1L = new javax.swing.JLabel();
        date2L = new javax.swing.JLabel();
        date3L = new javax.swing.JLabel();
        date4L = new javax.swing.JLabel();
        date5L = new javax.swing.JLabel();
        timetableWrapper = new javax.swing.JPanel();
        hourSlot1 = new javax.swing.JPanel();
        timeLBL1 = new javax.swing.JLabel();
        appointmentSlot1 = new javax.swing.JPanel();
        hourSlot2 = new javax.swing.JPanel();
        timeLBL2 = new javax.swing.JLabel();
        appointmentSlot2 = new javax.swing.JPanel();
        hourSlot3 = new javax.swing.JPanel();
        timeLBL3 = new javax.swing.JLabel();
        appointmentSlot3 = new javax.swing.JPanel();
        hourSlot4 = new javax.swing.JPanel();
        timeLBL4 = new javax.swing.JLabel();
        appointmentSlot4 = new javax.swing.JPanel();
        hourSlot5 = new javax.swing.JPanel();
        timeLBL5 = new javax.swing.JLabel();
        appointmentSlot5 = new javax.swing.JPanel();
        hourSlot6 = new javax.swing.JPanel();
        timeLBL6 = new javax.swing.JLabel();
        appointmentSlot6 = new javax.swing.JPanel();
        hourSlot7 = new javax.swing.JPanel();
        timeLBL7 = new javax.swing.JLabel();
        appointmentSlot7 = new javax.swing.JPanel();
        hourSlot8 = new javax.swing.JPanel();
        timeLBL8 = new javax.swing.JLabel();
        appointmentSlot8 = new javax.swing.JPanel();
        controlMaster = new javax.swing.JPanel();
        lookupPatient = new javax.swing.JButton();
        bookAppointment = new javax.swing.JButton();
        searchDate = new javax.swing.JTextField();
        goToButton = new javax.swing.JButton();
        resetDate = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        calendarMaster.setBackground(new java.awt.Color(255, 255, 255));

        navWrapper.setBackground(new java.awt.Color(204, 204, 255));

        nextWeek.setText("Next Week");
        nextWeek.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextWeekActionPerformed(evt);
            }
        });

        prevWeek.setText("Prev. Week");
        prevWeek.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prevWeekActionPerformed(evt);
            }
        });

        weekDates.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        weekDates.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        weekDates.setText("jLabel1");

        yearDate.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        yearDate.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        yearDate.setText("jLabel1");

        javax.swing.GroupLayout navWrapperLayout = new javax.swing.GroupLayout(navWrapper);
        navWrapper.setLayout(navWrapperLayout);
        navWrapperLayout.setHorizontalGroup(
                navWrapperLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(navWrapperLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(prevWeek, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(107, 107, 107)
                                .addComponent(weekDates, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(80, 80, 80)
                                .addComponent(yearDate, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 108, Short.MAX_VALUE)
                                .addComponent(nextWeek, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
        );
        navWrapperLayout.setVerticalGroup(
                navWrapperLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(navWrapperLayout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addGroup(navWrapperLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(nextWeek, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(prevWeek, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(weekDates, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(yearDate, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(22, Short.MAX_VALUE))
        );

        weekWrapper.setBackground(new java.awt.Color(204, 204, 255));

        day1B.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        day1B.setText("jButton1");

        day2B.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        day2B.setText("jButton1");

        day3B.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        day3B.setText("jButton1");

        day4B.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        day4B.setText("jButton1");

        day5B.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        day5B.setText("jButton1");

        date1L.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        date1L.setText("jLabel1");

        date2L.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        date2L.setText("jLabel1");

        date3L.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        date3L.setText("jLabel1");

        date4L.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        date4L.setText("jLabel1");

        date5L.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        date5L.setText("jLabel1");

        javax.swing.GroupLayout weekWrapperLayout = new javax.swing.GroupLayout(weekWrapper);
        weekWrapper.setLayout(weekWrapperLayout);
        weekWrapperLayout.setHorizontalGroup(
                weekWrapperLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(weekWrapperLayout.createSequentialGroup()
                                .addGap(45, 45, 45)
                                .addComponent(date1L, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(90, 90, 90)
                                .addComponent(date2L, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(90, 90, 90)
                                .addComponent(date3L, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(90, 90, 90)
                                .addComponent(date4L, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(date5L, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(52, 52, 52))
                        .addGroup(weekWrapperLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(day1B, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(day2B, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(day3B, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(day4B, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                                .addComponent(day5B, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
        );
        weekWrapperLayout.setVerticalGroup(
                weekWrapperLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, weekWrapperLayout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(weekWrapperLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(date1L, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(date2L, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(date3L, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(date4L, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(date5L, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(weekWrapperLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(day1B, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(day2B, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(day3B, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(day4B, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(day5B, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(23, 23, 23))
        );

        timetableWrapper.setBackground(new java.awt.Color(204, 204, 255));

        timeLBL1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        timeLBL1.setText("9:00");

        javax.swing.GroupLayout appointmentSlot1Layout = new javax.swing.GroupLayout(appointmentSlot1);
        appointmentSlot1.setLayout(appointmentSlot1Layout);
        appointmentSlot1Layout.setHorizontalGroup(
                appointmentSlot1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 0, Short.MAX_VALUE)
        );
        appointmentSlot1Layout.setVerticalGroup(
                appointmentSlot1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 53, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout hourSlot1Layout = new javax.swing.GroupLayout(hourSlot1);
        hourSlot1.setLayout(hourSlot1Layout);
        hourSlot1Layout.setHorizontalGroup(
                hourSlot1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(hourSlot1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(timeLBL1)
                                .addGap(18, 18, 18)
                                .addComponent(appointmentSlot1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap())
        );
        hourSlot1Layout.setVerticalGroup(
                hourSlot1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(hourSlot1Layout.createSequentialGroup()
                                .addGroup(hourSlot1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(hourSlot1Layout.createSequentialGroup()
                                                .addContainerGap()
                                                .addComponent(appointmentSlot1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(hourSlot1Layout.createSequentialGroup()
                                                .addGap(32, 32, 32)
                                                .addComponent(timeLBL1)))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        timeLBL2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        timeLBL2.setText("10:00");

        javax.swing.GroupLayout appointmentSlot2Layout = new javax.swing.GroupLayout(appointmentSlot2);
        appointmentSlot2.setLayout(appointmentSlot2Layout);
        appointmentSlot2Layout.setHorizontalGroup(
                appointmentSlot2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 0, Short.MAX_VALUE)
        );
        appointmentSlot2Layout.setVerticalGroup(
                appointmentSlot2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 53, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout hourSlot2Layout = new javax.swing.GroupLayout(hourSlot2);
        hourSlot2.setLayout(hourSlot2Layout);
        hourSlot2Layout.setHorizontalGroup(
                hourSlot2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(hourSlot2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(timeLBL2)
                                .addGap(18, 18, 18)
                                .addComponent(appointmentSlot2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap())
        );
        hourSlot2Layout.setVerticalGroup(
                hourSlot2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(hourSlot2Layout.createSequentialGroup()
                                .addGroup(hourSlot2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(hourSlot2Layout.createSequentialGroup()
                                                .addContainerGap()
                                                .addComponent(appointmentSlot2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(hourSlot2Layout.createSequentialGroup()
                                                .addGap(32, 32, 32)
                                                .addComponent(timeLBL2)))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        timeLBL3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        timeLBL3.setText("11:00");

        javax.swing.GroupLayout appointmentSlot3Layout = new javax.swing.GroupLayout(appointmentSlot3);
        appointmentSlot3.setLayout(appointmentSlot3Layout);
        appointmentSlot3Layout.setHorizontalGroup(
                appointmentSlot3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 0, Short.MAX_VALUE)
        );
        appointmentSlot3Layout.setVerticalGroup(
                appointmentSlot3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 53, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout hourSlot3Layout = new javax.swing.GroupLayout(hourSlot3);
        hourSlot3.setLayout(hourSlot3Layout);
        hourSlot3Layout.setHorizontalGroup(
                hourSlot3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(hourSlot3Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(timeLBL3)
                                .addGap(18, 18, 18)
                                .addComponent(appointmentSlot3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap())
        );
        hourSlot3Layout.setVerticalGroup(
                hourSlot3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(hourSlot3Layout.createSequentialGroup()
                                .addGroup(hourSlot3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(hourSlot3Layout.createSequentialGroup()
                                                .addContainerGap()
                                                .addComponent(appointmentSlot3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(hourSlot3Layout.createSequentialGroup()
                                                .addGap(32, 32, 32)
                                                .addComponent(timeLBL3)))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        timeLBL4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        timeLBL4.setText("12:00");

        javax.swing.GroupLayout appointmentSlot4Layout = new javax.swing.GroupLayout(appointmentSlot4);
        appointmentSlot4.setLayout(appointmentSlot4Layout);
        appointmentSlot4Layout.setHorizontalGroup(
                appointmentSlot4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 0, Short.MAX_VALUE)
        );
        appointmentSlot4Layout.setVerticalGroup(
                appointmentSlot4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 53, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout hourSlot4Layout = new javax.swing.GroupLayout(hourSlot4);
        hourSlot4.setLayout(hourSlot4Layout);
        hourSlot4Layout.setHorizontalGroup(
                hourSlot4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(hourSlot4Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(timeLBL4)
                                .addGap(18, 18, 18)
                                .addComponent(appointmentSlot4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap())
        );
        hourSlot4Layout.setVerticalGroup(
                hourSlot4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(hourSlot4Layout.createSequentialGroup()
                                .addGroup(hourSlot4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(hourSlot4Layout.createSequentialGroup()
                                                .addContainerGap()
                                                .addComponent(appointmentSlot4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(hourSlot4Layout.createSequentialGroup()
                                                .addGap(32, 32, 32)
                                                .addComponent(timeLBL4)))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        timeLBL5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        timeLBL5.setText("13:00");

        javax.swing.GroupLayout appointmentSlot5Layout = new javax.swing.GroupLayout(appointmentSlot5);
        appointmentSlot5.setLayout(appointmentSlot5Layout);
        appointmentSlot5Layout.setHorizontalGroup(
                appointmentSlot5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 0, Short.MAX_VALUE)
        );
        appointmentSlot5Layout.setVerticalGroup(
                appointmentSlot5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 53, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout hourSlot5Layout = new javax.swing.GroupLayout(hourSlot5);
        hourSlot5.setLayout(hourSlot5Layout);
        hourSlot5Layout.setHorizontalGroup(
                hourSlot5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(hourSlot5Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(timeLBL5)
                                .addGap(18, 18, 18)
                                .addComponent(appointmentSlot5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap())
        );
        hourSlot5Layout.setVerticalGroup(
                hourSlot5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(hourSlot5Layout.createSequentialGroup()
                                .addGroup(hourSlot5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(hourSlot5Layout.createSequentialGroup()
                                                .addContainerGap()
                                                .addComponent(appointmentSlot5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(hourSlot5Layout.createSequentialGroup()
                                                .addGap(32, 32, 32)
                                                .addComponent(timeLBL5)))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        timeLBL6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        timeLBL6.setText("14:00");

        javax.swing.GroupLayout appointmentSlot6Layout = new javax.swing.GroupLayout(appointmentSlot6);
        appointmentSlot6.setLayout(appointmentSlot6Layout);
        appointmentSlot6Layout.setHorizontalGroup(
                appointmentSlot6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 0, Short.MAX_VALUE)
        );
        appointmentSlot6Layout.setVerticalGroup(
                appointmentSlot6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 53, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout hourSlot6Layout = new javax.swing.GroupLayout(hourSlot6);
        hourSlot6.setLayout(hourSlot6Layout);
        hourSlot6Layout.setHorizontalGroup(
                hourSlot6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(hourSlot6Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(timeLBL6)
                                .addGap(18, 18, 18)
                                .addComponent(appointmentSlot6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap())
        );
        hourSlot6Layout.setVerticalGroup(
                hourSlot6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(hourSlot6Layout.createSequentialGroup()
                                .addGroup(hourSlot6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(hourSlot6Layout.createSequentialGroup()
                                                .addContainerGap()
                                                .addComponent(appointmentSlot6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(hourSlot6Layout.createSequentialGroup()
                                                .addGap(32, 32, 32)
                                                .addComponent(timeLBL6)))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        timeLBL7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        timeLBL7.setText("15:00");

        javax.swing.GroupLayout appointmentSlot7Layout = new javax.swing.GroupLayout(appointmentSlot7);
        appointmentSlot7.setLayout(appointmentSlot7Layout);
        appointmentSlot7Layout.setHorizontalGroup(
                appointmentSlot7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 0, Short.MAX_VALUE)
        );
        appointmentSlot7Layout.setVerticalGroup(
                appointmentSlot7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 53, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout hourSlot7Layout = new javax.swing.GroupLayout(hourSlot7);
        hourSlot7.setLayout(hourSlot7Layout);
        hourSlot7Layout.setHorizontalGroup(
                hourSlot7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(hourSlot7Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(timeLBL7)
                                .addGap(18, 18, 18)
                                .addComponent(appointmentSlot7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap())
        );
        hourSlot7Layout.setVerticalGroup(
                hourSlot7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(hourSlot7Layout.createSequentialGroup()
                                .addGroup(hourSlot7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(hourSlot7Layout.createSequentialGroup()
                                                .addContainerGap()
                                                .addComponent(appointmentSlot7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(hourSlot7Layout.createSequentialGroup()
                                                .addGap(32, 32, 32)
                                                .addComponent(timeLBL7)))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        timeLBL8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        timeLBL8.setText("16:00");

        javax.swing.GroupLayout appointmentSlot8Layout = new javax.swing.GroupLayout(appointmentSlot8);
        appointmentSlot8.setLayout(appointmentSlot8Layout);
        appointmentSlot8Layout.setHorizontalGroup(
                appointmentSlot8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 0, Short.MAX_VALUE)
        );
        appointmentSlot8Layout.setVerticalGroup(
                appointmentSlot8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 53, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout hourSlot8Layout = new javax.swing.GroupLayout(hourSlot8);
        hourSlot8.setLayout(hourSlot8Layout);
        hourSlot8Layout.setHorizontalGroup(
                hourSlot8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(hourSlot8Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(timeLBL8)
                                .addGap(18, 18, 18)
                                .addComponent(appointmentSlot8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap())
        );
        hourSlot8Layout.setVerticalGroup(
                hourSlot8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(hourSlot8Layout.createSequentialGroup()
                                .addGroup(hourSlot8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(hourSlot8Layout.createSequentialGroup()
                                                .addContainerGap()
                                                .addComponent(appointmentSlot8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(hourSlot8Layout.createSequentialGroup()
                                                .addGap(32, 32, 32)
                                                .addComponent(timeLBL8)))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout timetableWrapperLayout = new javax.swing.GroupLayout(timetableWrapper);
        timetableWrapper.setLayout(timetableWrapperLayout);
        timetableWrapperLayout.setHorizontalGroup(
                timetableWrapperLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(timetableWrapperLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(timetableWrapperLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(hourSlot1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(hourSlot2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(hourSlot3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(hourSlot4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(hourSlot5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(hourSlot6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(hourSlot7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(hourSlot8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addContainerGap())
        );
        timetableWrapperLayout.setVerticalGroup(
                timetableWrapperLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(timetableWrapperLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(hourSlot1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(hourSlot2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(hourSlot3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(hourSlot4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(hourSlot5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(hourSlot6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(hourSlot7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(hourSlot8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout calendarMasterLayout = new javax.swing.GroupLayout(calendarMaster);
        calendarMaster.setLayout(calendarMasterLayout);
        calendarMasterLayout.setHorizontalGroup(
                calendarMasterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(calendarMasterLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(calendarMasterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(timetableWrapper, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, calendarMasterLayout.createSequentialGroup()
                                                .addGap(0, 0, Short.MAX_VALUE)
                                                .addComponent(weekWrapper, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(calendarMasterLayout.createSequentialGroup()
                                                .addComponent(navWrapper, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, Short.MAX_VALUE)))
                                .addContainerGap())
        );
        calendarMasterLayout.setVerticalGroup(
                calendarMasterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(calendarMasterLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(navWrapper, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(weekWrapper, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(timetableWrapper, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        controlMaster.setBackground(new java.awt.Color(255, 255, 255));

        lookupPatient.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lookupPatient.setText("Lookup Patient");
        lookupPatient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lookupPatientActionPerformed(evt);
            }
        });

        bookAppointment.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        bookAppointment.setText("Book Appointment");
        bookAppointment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookAppointmentActionPerformed(evt);
            }
        });

        searchDate.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        searchDate.setText("dd/mm/yyyy");
        searchDate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                searchDateMouseClicked(evt);
            }
        });

        goToButton.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        goToButton.setText("Go To");
        goToButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                goToButtonActionPerformed(evt);
            }
        });

        resetDate.setText("Today");
        resetDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetDateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout controlMasterLayout = new javax.swing.GroupLayout(controlMaster);
        controlMaster.setLayout(controlMasterLayout);
        controlMasterLayout.setHorizontalGroup(
                controlMasterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(controlMasterLayout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addGroup(controlMasterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(resetDate, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(controlMasterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addGroup(controlMasterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(bookAppointment, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(lookupPatient, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(controlMasterLayout.createSequentialGroup()
                                                        .addComponent(searchDate)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                        .addComponent(goToButton))))
                                .addContainerGap(29, Short.MAX_VALUE))
        );
        controlMasterLayout.setVerticalGroup(
                controlMasterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(controlMasterLayout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addGroup(controlMasterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(goToButton, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(searchDate, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(resetDate, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(99, 99, 99)
                                .addComponent(lookupPatient, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(38, 38, 38)
                                .addComponent(bookAppointment, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(calendarMaster, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(controlMaster, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(controlMaster, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(calendarMaster, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>

    private void nextWeekActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        calendar.set(Calendar.DAY_OF_WEEK, Calendar.MONDAY);
        calendar.add(Calendar.DATE, +7);

//
//            calendarMaster.removeAll();
//            navWrapper.removeAll();
//            weekWrapper.removeAll();
//            timetableWrapper.removeAll();
//
//            calendarMaster.repaint();
//            calendarMaster.revalidate();



        updateUI();
    }

    private void prevWeekActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:

        calendar.set(Calendar.DAY_OF_WEEK, Calendar.MONDAY);
        calendar.add(Calendar.DATE, -7);

        updateUI();
    }

    private void goToButtonActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:

        String goToString = searchDate.getText();
        DateFormat fmt = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);
        try {
            Date goToDate = fmt.parse(goToString);

            calendar.setTime(goToDate);
        } catch (ParseException ex) {
            Logger.getLogger(SecretaryUI.class.getName()).log(Level.SEVERE, null, ex);
        }

        updateUI();




        // Search for a specific date
        // Take variable from the text box

    }

    private void resetDateActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:

        calendar.setTime(today);
        calendar.set(Calendar.DAY_OF_WEEK, Calendar.MONDAY);

        searchDate.setText("dd/mm/yyyy");
        updateUI();


        // Reset the date to today

    }

    private void lookupPatientActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:

        // Open the lookup patient GUI, do NOT close the current GUI
        LookUpPatient lookup = new LookUpPatient();
        lookup.setVisible(true);
    }

    private void bookAppointmentActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:

        // Open the book appointment GUI, do NOT close the current GUI
    }

    private void searchDateMouseClicked(java.awt.event.MouseEvent evt) {
        // TODO add your handling code here:
        searchDate.setText("");
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
            java.util.logging.Logger.getLogger(SecretaryUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SecretaryUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SecretaryUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SecretaryUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>


        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SecretaryUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify
    private javax.swing.JPanel appointmentSlot1;
    private javax.swing.JPanel appointmentSlot2;
    private javax.swing.JPanel appointmentSlot3;
    private javax.swing.JPanel appointmentSlot4;
    private javax.swing.JPanel appointmentSlot5;
    private javax.swing.JPanel appointmentSlot6;
    private javax.swing.JPanel appointmentSlot7;
    private javax.swing.JPanel appointmentSlot8;
    private javax.swing.JButton bookAppointment;
    private javax.swing.JPanel calendarMaster;
    private javax.swing.JPanel controlMaster;
    private javax.swing.JLabel date1L;
    private javax.swing.JLabel date2L;
    private javax.swing.JLabel date3L;
    private javax.swing.JLabel date4L;
    private javax.swing.JLabel date5L;
    private javax.swing.JButton day1B;
    private javax.swing.JButton day2B;
    private javax.swing.JButton day3B;
    private javax.swing.JButton day4B;
    private javax.swing.JButton day5B;
    private javax.swing.JButton goToButton;
    private javax.swing.JPanel hourSlot1;
    private javax.swing.JPanel hourSlot2;
    private javax.swing.JPanel hourSlot3;
    private javax.swing.JPanel hourSlot4;
    private javax.swing.JPanel hourSlot5;
    private javax.swing.JPanel hourSlot6;
    private javax.swing.JPanel hourSlot7;
    private javax.swing.JPanel hourSlot8;
    private javax.swing.JButton lookupPatient;
    private javax.swing.JPanel navWrapper;
    private javax.swing.JButton nextWeek;
    private javax.swing.JButton prevWeek;
    private javax.swing.JButton resetDate;
    private javax.swing.JTextField searchDate;
    private javax.swing.JLabel timeLBL1;
    private javax.swing.JLabel timeLBL2;
    private javax.swing.JLabel timeLBL3;
    private javax.swing.JLabel timeLBL4;
    private javax.swing.JLabel timeLBL5;
    private javax.swing.JLabel timeLBL6;
    private javax.swing.JLabel timeLBL7;
    private javax.swing.JLabel timeLBL8;
    private javax.swing.JPanel timetableWrapper;
    private javax.swing.JLabel weekDates;
    private javax.swing.JPanel weekWrapper;
    private javax.swing.JLabel yearDate;
    // End of variables declaration
}
