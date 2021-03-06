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
public class UpdatePatientForm extends javax.swing.JFrame {

    /**
     * Creates new form UpdatePatientForm
     */
    public UpdatePatientForm() {
        initComponents();
        FillCombo();
        BloodCombo();
        HospitalCombo();
        rdbtnMale.setSelected(true);
        rdbtnMale.setActionCommand("Male");
        rdbtnFemale.setActionCommand("Female");
        setTitle("Update Patient Form");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        genderBtnGrp = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        jScrollPane3 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        lblName = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        rdbtnMale = new javax.swing.JRadioButton();
        rdbtnFemale = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();
        llbAge = new javax.swing.JLabel();
        txtAge = new javax.swing.JTextField();
        txtHomeAddr = new javax.swing.JTextField();
        lblOffAddr = new javax.swing.JLabel();
        txtOffAddr = new javax.swing.JTextField();
        txtHome = new javax.swing.JTextField();
        lblHome = new javax.swing.JLabel();
        lblTelNo = new javax.swing.JLabel();
        lblOffice = new javax.swing.JLabel();
        txtOffice = new javax.swing.JTextField();
        lblMobile = new javax.swing.JLabel();
        txtMob = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        lblEmail = new javax.swing.JLabel();
        lblHomeAddr = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        lblWeight = new javax.swing.JLabel();
        txtWeight = new javax.swing.JTextField();
        cmbPid = new javax.swing.JComboBox();
        lblGender = new javax.swing.JLabel();
        lWarning = new javax.swing.JLabel();
        cmbBloodGrp = new javax.swing.JComboBox();
        lbl_BloodGrp = new javax.swing.JLabel();
        cmbHospital = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        btnUpdate = new javax.swing.JButton();
        exitButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/FormHeader.png"))); // NOI18N

        jTabbedPane1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lblName.setText("Name:");

        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });

        genderBtnGrp.add(rdbtnMale);
        rdbtnMale.setText("Male");
        rdbtnMale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbtnMaleActionPerformed(evt);
            }
        });

        genderBtnGrp.add(rdbtnFemale);
        rdbtnFemale.setText("Female");
        rdbtnFemale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbtnFemaleActionPerformed(evt);
            }
        });

        jLabel4.setText("Patient ID:");

        llbAge.setText("Age:");

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

        lblOffAddr.setText("Official Address:");

        txtOffAddr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtOffAddrActionPerformed(evt);
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

        lblHome.setText("Home:");

        lblTelNo.setText("Telephone no:");

        lblOffice.setText("Office:");

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

        lblMobile.setText("Mobile:");

        txtMob.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtMobKeyTyped(evt);
            }
        });

        lblEmail.setText("e-mail:");

        lblHomeAddr.setText("Home Address:");

        jLabel15.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("Patient Update Form");

        lblWeight.setText("Weight (kg):");

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

        cmbPid.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select Patient ID" }));
        cmbPid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbPidActionPerformed(evt);
            }
        });

        lblGender.setText("Gender:");

        lWarning.setFont(new java.awt.Font("Palatino Linotype", 0, 14)); // NOI18N
        lWarning.setForeground(java.awt.Color.blue);
        lWarning.setText("Warning");

        cmbBloodGrp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbBloodGrpActionPerformed(evt);
            }
        });

        lbl_BloodGrp.setText("Blood Group");

        jLabel2.setText("Hospital");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblTelNo)
                                    .addComponent(lblEmail))
                                .addGap(25, 25, 25)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(cmbHospital, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(lblHome)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtHome, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lblOffice)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtOffice, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(lblMobile)
                                        .addGap(14, 14, 14)
                                        .addComponent(txtMob, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(txtEmail)
                                    .addComponent(cmbBloodGrp, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblOffAddr)
                                    .addComponent(lblHomeAddr)
                                    .addComponent(lblName)
                                    .addComponent(lblGender)
                                    .addComponent(llbAge)
                                    .addComponent(jLabel4))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtName, javax.swing.GroupLayout.DEFAULT_SIZE, 473, Short.MAX_VALUE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(rdbtnMale, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(10, 10, 10)
                                        .addComponent(rdbtnFemale, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(cmbPid, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(43, 43, 43)
                                        .addComponent(lblWeight)
                                        .addGap(65, 65, 65)
                                        .addComponent(txtWeight, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(txtHomeAddr)
                                    .addComponent(txtOffAddr)))
                            .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 904, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(251, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(lbl_BloodGrp)
                            .addComponent(lWarning))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel15)
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cmbPid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblName)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblGender)
                    .addComponent(rdbtnMale)
                    .addComponent(rdbtnFemale))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(llbAge)
                    .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblWeight)
                    .addComponent(txtWeight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblHomeAddr)
                    .addComponent(txtHomeAddr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblOffAddr)
                    .addComponent(txtOffAddr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTelNo)
                    .addComponent(lblHome)
                    .addComponent(lblOffice)
                    .addComponent(lblMobile)
                    .addComponent(txtHome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtOffice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMob, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEmail)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_BloodGrp)
                    .addComponent(cmbBloodGrp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cmbHospital, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addComponent(lWarning)
                .addContainerGap(48, Short.MAX_VALUE))
        );

        jScrollPane3.setViewportView(jPanel1);

        jScrollPane2.setViewportView(jScrollPane3);

        jTabbedPane1.addTab("Patient Update", jScrollPane2);

        btnUpdate.setBackground(new java.awt.Color(204, 255, 255));
        btnUpdate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/updateButton.png"))); // NOI18N
        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        exitButton.setBackground(new java.awt.Color(204, 255, 255));
        exitButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/CloseButton2.png"))); // NOI18N
        exitButton.setText("Exit");
        exitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(exitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTabbedPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(1, 1, 1))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 563, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(exitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameActionPerformed

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
        char c = evt.getKeyChar();

        if (!(Character.isDigit(c) || c == java.awt.event.KeyEvent.VK_BACK_SPACE) || c == java.awt.event.KeyEvent.VK_DELETE) {
            evt.consume();
        }
    }//GEN-LAST:event_txtAgeKeyTyped

    private void txtHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHomeActionPerformed

    private void txtHomeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtHomeKeyTyped
        char c = evt.getKeyChar();

        if (!(Character.isDigit(c) || c == java.awt.event.KeyEvent.VK_BACK_SPACE) || c == java.awt.event.KeyEvent.VK_DELETE) {
            evt.consume();
        }
    }//GEN-LAST:event_txtHomeKeyTyped

    private void txtOfficeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtOfficeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtOfficeActionPerformed

    private void txtOfficeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtOfficeKeyTyped
        char c = evt.getKeyChar();

        if (!(Character.isDigit(c) || c == java.awt.event.KeyEvent.VK_BACK_SPACE) || c == java.awt.event.KeyEvent.VK_DELETE) {
            evt.consume();
        }
    }//GEN-LAST:event_txtOfficeKeyTyped

    private void txtMobKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMobKeyTyped
        char c = evt.getKeyChar();

        if (!(Character.isDigit(c) || c == java.awt.event.KeyEvent.VK_BACK_SPACE) || c == java.awt.event.KeyEvent.VK_DELETE) {
            evt.consume();
        }
    }//GEN-LAST:event_txtMobKeyTyped

    private void txtWeightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtWeightActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtWeightActionPerformed

    private void txtWeightKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtWeightKeyTyped
        char c = evt.getKeyChar();

        if (!(Character.isDigit(c) || c == java.awt.event.KeyEvent.VK_BACK_SPACE) || c == java.awt.event.KeyEvent.VK_DELETE) {
            evt.consume();
        }
    }//GEN-LAST:event_txtWeightKeyTyped

    private void cmbPidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbPidActionPerformed
        try {
            searchPatientbyPID((int) cmbPid.getSelectedItem());
        } catch (ClassNotFoundException | SQLException ex) {
            JOptionPane.showMessageDialog(this, ex);
        }
    }//GEN-LAST:event_cmbPidActionPerformed

    private void cmbBloodGrpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbBloodGrpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbBloodGrpActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        try {

            if (txtName.getText().isEmpty()) {
                lWarning.setText("Please enter donor's Full Name");
                txtName.requestFocus();
            } else if (txtAge.getText().isEmpty()) {
                lWarning.setText("Please enter donor's age");
                txtAge.requestFocus();
            } else if (Integer.parseInt(txtAge.getText()) < 20) {
                lWarning.setText("We do not accept blood from kids!");
                txtAge.requestFocus();
            } else if (txtWeight.getText().isEmpty()) {
                lWarning.setText("Please enter donor's weight");
                txtWeight.requestFocus();
            } else if (txtHomeAddr.getText().isEmpty()) {
                lWarning.setText("Please enter donor's permanent address");
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

                int did = (int) cmbPid.getSelectedItem();
                String name = txtName.getText();
                String gender = (genderBtnGrp.getSelection().getActionCommand());
                int age = (Integer.parseInt(txtAge.getText()));
                int weight = (Integer.parseInt(txtWeight.getText()));
                String homeAddr = (txtHomeAddr.getText());
                String offAddr = (txtOffAddr.getText());
                String phNo = (txtHome.getText());
                String offNo = (txtOffice.getText());
                String moNo = (txtMob.getText());
                String eMail = (txtEmail.getText());
                String bloodGrp = (cmbBloodGrp.getSelectedItem().toString());
                String hospitalName=(cmbHospital.getSelectedItem().toString());
                Patient updatedPatient = new Patient(did, name, gender, homeAddr, offAddr, phNo, offNo, moNo, eMail, bloodGrp, age, weight, hospitalName);
                int added = patientService.update(updatedPatient);
                if (added == 1) {
                    JOptionPane.showMessageDialog(null, "Error while Updating!");

                } else {
                    JOptionPane.showMessageDialog(null, "Updateded Succesfully");
                    clearAllFields();
                }

            }
        } catch (NumberFormatException | ClassNotFoundException | SQLException | HeadlessException e) {
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void exitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButtonActionPerformed
        int showConfirmDialog = JOptionPane.showConfirmDialog(this, "Are you sure that you want to exit ?");
        System.out.println(showConfirmDialog);
        if (showConfirmDialog == 0) {
            this.dispose();
        }
    }//GEN-LAST:event_exitButtonActionPerformed

    private void txtOffAddrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtOffAddrActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtOffAddrActionPerformed
    private void FillCombo() {
        try {
            DBConnection conn = new DBConnection();
            conn.open();
            String sql = "Select * from tbl_patient";
            PreparedStatement stmt = conn.initStatement(sql);
            ResultSet rst = stmt.executeQuery();
            while (rst.next()) {
                int pid = rst.getInt("PID");
                cmbPid.addItem(pid);
            }

        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showConfirmDialog(null, e);
        }
    }

    private void searchPatientbyPID(int pid) throws ClassNotFoundException, SQLException {
        PatientService ps = new PatientService();
        Patient existingPatient = ps.searchPatient(pid);
        if (existingPatient != null) {

            txtName.setText(existingPatient.getName());
            if (existingPatient.getGender().equals("Male")) {
                rdbtnMale.setSelected(true);
            } else {
                rdbtnFemale.setSelected(true);
            }
            txtAge.setText(Integer.toString(existingPatient.getAge()));
            txtWeight.setText(Integer.toString(existingPatient.getWeight()));
            txtHomeAddr.setText(existingPatient.getHomeAddr());
            txtOffAddr.setText(existingPatient.getOffAddr());
            txtHome.setText(existingPatient.getPhNo());
            txtOffice.setText(existingPatient.getOffNo());
            txtMob.setText(existingPatient.getMoNo());
            txtEmail.setText(existingPatient.geteMail());
            cmbBloodGrp.setSelectedItem(existingPatient.getBloodGrp());
            cmbHospital.setSelectedItem(existingPatient.getHospitalName());
        }
    }

    public void clearAllFields() {
        cmbPid.setSelectedIndex(1);
        txtName.setText("");
        genderBtnGrp.clearSelection();
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
            java.util.logging.Logger.getLogger(UpdatePatientForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UpdatePatientForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UpdatePatientForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UpdatePatientForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UpdatePatientForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnUpdate;
    private javax.swing.JComboBox cmbBloodGrp;
    private javax.swing.JComboBox cmbHospital;
    private javax.swing.JComboBox cmbPid;
    private javax.swing.JButton exitButton;
    private javax.swing.ButtonGroup genderBtnGrp;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel lWarning;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblGender;
    private javax.swing.JLabel lblHome;
    private javax.swing.JLabel lblHomeAddr;
    private javax.swing.JLabel lblMobile;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblOffAddr;
    private javax.swing.JLabel lblOffice;
    private javax.swing.JLabel lblTelNo;
    private javax.swing.JLabel lblWeight;
    private javax.swing.JLabel lbl_BloodGrp;
    private javax.swing.JLabel llbAge;
    private javax.swing.JRadioButton rdbtnFemale;
    private javax.swing.JRadioButton rdbtnMale;
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
