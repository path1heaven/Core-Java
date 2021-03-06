/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.CP.BloodBankMangementSystem.UI;

import com.CP.BloodBankManagementSystem.DBUtil.DBConnection;
import com.CP.BloodBankManagementSystem.Service.PatientService;
import com.CP.BloodBankManagementSystem.entity.Patient;
import java.awt.HeadlessException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Satish
 */
public class AddPatientForm extends javax.swing.JFrame {

    /**
     * Creates new form AddPatientForm
     */
    public AddPatientForm() {
        initComponents();
        lWarning.setText(null);
        rdbtnMale.setSelected(true);
        BloodCombo();
        HospitalCombo();
        rdbtnMale.setActionCommand("Male");
        rdbtnFemale.setActionCommand("Female");
        setLocation(200, 100);
        setTitle("Add New Patient Form");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        genderBtnGroup = new javax.swing.ButtonGroup();
        pnl = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        lbl_Name = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        rdbtnMale = new javax.swing.JRadioButton();
        rdbtnFemale = new javax.swing.JRadioButton();
        lbl_Age = new javax.swing.JLabel();
        txtAge = new javax.swing.JTextField();
        txtHomeAddr = new javax.swing.JTextField();
        lbl_OffAddr = new javax.swing.JLabel();
        txtOffAddr = new javax.swing.JTextField();
        txtHome = new javax.swing.JTextField();
        lbl_Home = new javax.swing.JLabel();
        lbl_TelNo = new javax.swing.JLabel();
        lbl_Office = new javax.swing.JLabel();
        txtOffice = new javax.swing.JTextField();
        lbl_Mob = new javax.swing.JLabel();
        txtMob = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        lbl_Email = new javax.swing.JLabel();
        lbl_HAddr = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        lblWeight = new javax.swing.JLabel();
        txtWeight = new javax.swing.JTextField();
        lbl_Gender = new javax.swing.JLabel();
        lbl_BloodGrp = new javax.swing.JLabel();
        cmbBloodGrp = new javax.swing.JComboBox();
        lWarning = new javax.swing.JLabel();
        saveButton = new javax.swing.JButton();
        exitButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        cmbHospital = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnl.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lbl_Name.setText("Name");

        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });
        txtName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNameKeyTyped(evt);
            }
        });

        genderBtnGroup.add(rdbtnMale);
        rdbtnMale.setText("Male");
        rdbtnMale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbtnMaleActionPerformed(evt);
            }
        });

        genderBtnGroup.add(rdbtnFemale);
        rdbtnFemale.setText("Female");
        rdbtnFemale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbtnFemaleActionPerformed(evt);
            }
        });

        lbl_Age.setText("Age");

        txtAge.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAgeActionPerformed(evt);
            }
        });
        txtAge.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtAgeKeyTyped(evt);
            }
        });

        txtHomeAddr.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtHomeAddrKeyTyped(evt);
            }
        });

        lbl_OffAddr.setText("Official Address");

        txtOffAddr.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtOffAddrKeyTyped(evt);
            }
        });

        txtHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHomeActionPerformed(evt);
            }
        });
        txtHome.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtHomeKeyTyped(evt);
            }
        });

        lbl_Home.setText("Home:");

        lbl_TelNo.setText("Telephone no");

        lbl_Office.setText("Office:");

        txtOffice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtOfficeActionPerformed(evt);
            }
        });
        txtOffice.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtOfficeKeyTyped(evt);
            }
        });

        lbl_Mob.setText("Mobile:");

        txtMob.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtMobKeyTyped(evt);
            }
        });

        lbl_Email.setText("e-mail");

        lbl_HAddr.setText("Home Address");

        jLabel15.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("Details of the Patient");

        lblWeight.setText("Weight (kg)*");

        txtWeight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtWeightActionPerformed(evt);
            }
        });
        txtWeight.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtWeightKeyTyped(evt);
            }
        });

        lbl_Gender.setText("Gender");

        lbl_BloodGrp.setText("Blood Group");

        lWarning.setFont(new java.awt.Font("Palatino Linotype", 0, 14)); // NOI18N
        lWarning.setForeground(java.awt.Color.blue);
        lWarning.setText("Warning");

        saveButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/save.png"))); // NOI18N
        saveButton.setText("Save");
        saveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtonActionPerformed(evt);
            }
        });

        exitButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/CloseButton2.png"))); // NOI18N
        exitButton.setText("Exit");
        exitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButtonActionPerformed(evt);
            }
        });

        jLabel1.setText("Hospital");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(lbl_OffAddr)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtOffAddr, javax.swing.GroupLayout.PREFERRED_SIZE, 483, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(lbl_TelNo)
                                        .addGap(18, 18, 18)
                                        .addComponent(lbl_Home)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtHome, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lbl_Office)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtOffice, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lbl_Mob)
                                        .addGap(14, 14, 14)
                                        .addComponent(txtMob, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(lbl_Gender)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lbl_Age)
                                            .addComponent(lbl_Name))
                                        .addGap(55, 55, 55)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(rdbtnMale, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                                        .addComponent(lblWeight)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                        .addComponent(txtWeight, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                                        .addGap(15, 15, 15)
                                                        .addComponent(rdbtnFemale, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                            .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 483, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(lbl_HAddr)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtHomeAddr, javax.swing.GroupLayout.PREFERRED_SIZE, 483, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lbl_Email)
                                            .addComponent(lbl_BloodGrp, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel1))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtEmail)
                                            .addComponent(cmbHospital, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(cmbBloodGrp, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, Short.MAX_VALUE)))))
                                .addGap(0, 272, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lWarning)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(saveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(exitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(93, 93, 93))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel15)
                .addGap(54, 54, 54)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_Name)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rdbtnMale)
                    .addComponent(rdbtnFemale)
                    .addComponent(lbl_Gender))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_Age)
                    .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblWeight)
                    .addComponent(txtWeight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtHomeAddr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_HAddr))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_OffAddr)
                    .addComponent(txtOffAddr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_TelNo)
                    .addComponent(lbl_Home)
                    .addComponent(lbl_Office)
                    .addComponent(lbl_Mob)
                    .addComponent(txtHome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtOffice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMob, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_Email)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_BloodGrp)
                    .addComponent(cmbBloodGrp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(cmbHospital, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lWarning)
                    .addComponent(saveButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(exitButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(16, 16, 16))
        );

        pnl.addTab("Patient Details", jPanel1);

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/FormHeader.png"))); // NOI18N
        jLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnl)
            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 887, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnl, javax.swing.GroupLayout.PREFERRED_SIZE, 593, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameActionPerformed

    private void txtNameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNameKeyTyped
        /* char c = evt.getKeyChar();

         if (c == java.awt.event.KeyEvent.VK_ENTER) {
         txtName.requestFocus(true);

         }
         */
    }//GEN-LAST:event_txtNameKeyTyped

    private void rdbtnMaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbtnMaleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rdbtnMaleActionPerformed

    private void rdbtnFemaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbtnFemaleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rdbtnFemaleActionPerformed

    private void txtAgeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAgeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAgeActionPerformed

    private void txtAgeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAgeKeyTyped
        /* char c = evt.getKeyChar();

         if (!(Character.isDigit(c) || c == java.awt.event.KeyEvent.VK_BACK_SPACE) || c == java.awt.event.KeyEvent.VK_DELETE) {
         evt.consume();
         }

         if (c == java.awt.event.KeyEvent.VK_ENTER) {
         txtWeight.requestFocus(true);

         }
         */
    }//GEN-LAST:event_txtAgeKeyTyped

    private void txtHomeAddrKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtHomeAddrKeyTyped
        /* char c = evt.getKeyChar();

         if (c == java.awt.event.KeyEvent.VK_ENTER) {
         txtOffAddr.requestFocus(true);

         }
         */
    }//GEN-LAST:event_txtHomeAddrKeyTyped

    private void txtOffAddrKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtOffAddrKeyTyped
        /* char c = evt.getKeyChar();

         if (c == java.awt.event.KeyEvent.VK_ENTER) {
         txtHome.requestFocus(true);

         }
         */
    }//GEN-LAST:event_txtOffAddrKeyTyped

    private void txtHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHomeActionPerformed

    private void txtHomeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtHomeKeyTyped
        /*char c = evt.getKeyChar();

         if (!(Character.isDigit(c) || c == java.awt.event.KeyEvent.VK_BACK_SPACE) || c == java.awt.event.KeyEvent.VK_DELETE) {
         evt.consume();
         }

         if (c == java.awt.event.KeyEvent.VK_ENTER) {
         txtOffice.requestFocus(true);

         }
         */
    }//GEN-LAST:event_txtHomeKeyTyped

    private void txtOfficeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtOfficeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtOfficeActionPerformed

    private void txtOfficeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtOfficeKeyTyped
        /*char c = evt.getKeyChar();

         if (!(Character.isDigit(c) || c == java.awt.event.KeyEvent.VK_BACK_SPACE) || c == java.awt.event.KeyEvent.VK_DELETE) {
         evt.consume();
         }

         if (c == java.awt.event.KeyEvent.VK_ENTER) {
         txtMob.requestFocus(true);

         }
         */
    }//GEN-LAST:event_txtOfficeKeyTyped

    private void txtMobKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMobKeyTyped
        /*char c = evt.getKeyChar();

         if (!(Character.isDigit(c) || c == java.awt.event.KeyEvent.VK_BACK_SPACE) || c == java.awt.event.KeyEvent.VK_DELETE) {
         evt.consume();
         }

         if (c == java.awt.event.KeyEvent.VK_ENTER) {
         txtEmail.requestFocus(true);

         }
         */
    }//GEN-LAST:event_txtMobKeyTyped

    private void txtWeightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtWeightActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtWeightActionPerformed

    private void txtWeightKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtWeightKeyTyped
        /*char c = evt.getKeyChar();

         if (!(Character.isDigit(c) || c == java.awt.event.KeyEvent.VK_BACK_SPACE) || c == java.awt.event.KeyEvent.VK_DELETE) {
         evt.consume();
         }

         if (c == java.awt.event.KeyEvent.VK_ENTER) {
         txtHomeAddr.requestFocus(true);

         }
         */
    }//GEN-LAST:event_txtWeightKeyTyped

    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed
        try {
            if (txtName.getText().isEmpty()) {
                lWarning.setText("Please enter patient's Full Name");
                txtName.requestFocus();
            } else if (txtAge.getText().isEmpty()) {
                lWarning.setText("Please enter patient's age");
                txtAge.requestFocus();
            } else if (txtWeight.getText().isEmpty()) {
                lWarning.setText("Please enter patient's weight");
                txtWeight.requestFocus();
            } else if (txtHomeAddr.getText().isEmpty()) {
                lWarning.setText("Please enter patient's permanent address");
                txtHomeAddr.requestFocus();
            } else if (txtHome.getText().matches("\\\\d{3}[-\\\\.\\\\s]\\\\d{3}[-\\\\.\\\\s]\\\\d{4}") || txtHome.getText().length() != 9) {
                lWarning.setText("Phone Number is invalid... TRY AGAIN");
                txtHome.requestFocus();
            } else if (txtOffice.getText().matches("\\\\d{3}[-\\\\.\\\\s]\\\\d{3}[-\\\\.\\\\s]\\\\d{4}") || txtOffice.getText().length() != 9) {
                lWarning.setText("Office Number is invalid... TRY AGAIN");
                txtOffice.requestFocus();
            } else if (txtMob.getText().matches("\\\\d{3}[-\\\\.\\\\s]\\\\d{3}[-\\\\.\\\\s]\\\\d{4}") || txtMob.getText().length() != 10) {
                lWarning.setText("Mobile number is invalid... TRY AGAIN");
                txtMob.requestFocus();
            } else {
                lWarning.setText(null);
                PatientService patientService = new PatientService();
                Patient patient = new Patient();
                patient.setName(txtName.getText());
                patient.setGender(genderBtnGroup.getSelection().getActionCommand());
                patient.setAge(Integer.parseInt(txtAge.getText()));
                patient.setWeight(Integer.parseInt(txtWeight.getText()));
                patient.setHomeAddr(txtHomeAddr.getText());
                patient.setOffAddr(txtOffAddr.getText());
                patient.setPhNo(txtHome.getText());
                patient.setOffNo(txtOffice.getText());
                patient.setMoNo(txtMob.getText());
                patient.seteMail(txtEmail.getText());
                patient.setBloodGrp(cmbBloodGrp.getSelectedItem().toString());
                patient.setHospitalName(cmbHospital.getSelectedItem().toString());
                patientService.insert(patient);
                JOptionPane.showMessageDialog(this, "Patient Added Successfully", "Add Donor", JOptionPane.INFORMATION_MESSAGE);
                clearAllFields();
            }
        } catch (NumberFormatException | ClassNotFoundException | SQLException | HeadlessException e) {
            JOptionPane.showMessageDialog(this, e);
        }
    }//GEN-LAST:event_saveButtonActionPerformed

    private void exitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButtonActionPerformed
        int showConfirmDialog = JOptionPane.showConfirmDialog(this, "Are you sure that you want to exit ?");
        System.out.println(showConfirmDialog);
        if (showConfirmDialog == 0) {
            this.dispose();
        }
    }//GEN-LAST:event_exitButtonActionPerformed
    public void clearAllFields() {

        txtName.setText("");
        genderBtnGroup.clearSelection();
        txtAge.setText(null);
        txtWeight.setText(null);
        txtHomeAddr.setText("");
        txtOffAddr.setText("");
        txtHome.setText("");
        txtOffice.setText("");
        txtMob.setText("");
        txtEmail.setText("");
        cmbBloodGrp.setSelectedIndex(0);
        cmbHospital.setSelectedIndex(0);
    }
    private void BloodCombo() {
        try {
            DBConnection conn = new DBConnection();
            conn.open();
            String sql = "Select * from tbl_blood_type";
            PreparedStatement stmt = conn.initStatement(sql);
            ResultSet rst = stmt.executeQuery();
            while (rst.next()) {
                String blood = rst.getString("Blood_Group");
                cmbBloodGrp.addItem(blood);
            }
            conn.close();
        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showConfirmDialog(null, e);
        }
    }
    
    private void HospitalCombo() {
        try {
            DBConnection conn = new DBConnection();
            conn.open();
            String sql = "Select * from tbl_hospital";
            PreparedStatement stmt = conn.initStatement(sql);
            ResultSet rst = stmt.executeQuery();
            while (rst.next()) {
                String name = rst.getString("Hospital_Name");
                cmbHospital.addItem(name);
            }
            conn.close();
        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showConfirmDialog(null, e);
        }
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
            java.util.logging.Logger.getLogger(AddPatientForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddPatientForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddPatientForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddPatientForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddPatientForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox cmbBloodGrp;
    private javax.swing.JComboBox cmbHospital;
    private javax.swing.JButton exitButton;
    private javax.swing.ButtonGroup genderBtnGroup;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lWarning;
    private javax.swing.JLabel lblWeight;
    private javax.swing.JLabel lbl_Age;
    private javax.swing.JLabel lbl_BloodGrp;
    private javax.swing.JLabel lbl_Email;
    private javax.swing.JLabel lbl_Gender;
    private javax.swing.JLabel lbl_HAddr;
    private javax.swing.JLabel lbl_Home;
    private javax.swing.JLabel lbl_Mob;
    private javax.swing.JLabel lbl_Name;
    private javax.swing.JLabel lbl_OffAddr;
    private javax.swing.JLabel lbl_Office;
    private javax.swing.JLabel lbl_TelNo;
    private javax.swing.JTabbedPane pnl;
    private javax.swing.JRadioButton rdbtnFemale;
    private javax.swing.JRadioButton rdbtnMale;
    private javax.swing.JButton saveButton;
    private javax.swing.JTextField txtAge;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtHome;
    private javax.swing.JTextField txtHomeAddr;
    private javax.swing.JTextField txtMob;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtOffAddr;
    private javax.swing.JTextField txtOffice;
    private javax.swing.JTextField txtWeight;
    // End of variables declaration//GEN-END:variables
}
