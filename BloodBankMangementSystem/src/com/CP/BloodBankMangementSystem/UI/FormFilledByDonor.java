/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.CP.BloodBankMangementSystem.UI;

import com.CP.BloodBankManagementSystem.DBUtil.DBConnection;
import com.CP.BloodBankManagementSystem.Service.DonorService;
import com.CP.BloodBankManagementSystem.entity.Donor;
import java.awt.HeadlessException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Satish
 */
public class FormFilledByDonor extends javax.swing.JFrame {

    /**
     * Creates new form FormFilledByDonor
     */
    public FormFilledByDonor() {
        initComponents();
        FillCombo();
        
        lWarning.setText(null);
        rdbtnMale.setSelected(true);
        rdbtnMale.setActionCommand("Male");
        rdbtnFemale.setActionCommand("Female");
        setLocation(200, 100);
        setTitle("Add New Blood Donor Form");
       
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jInternalFrame1 = new javax.swing.JInternalFrame();
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
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jInternalFrame1.setVisible(true);

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

        buttonGroup1.add(rdbtnMale);
        rdbtnMale.setText("Male");
        rdbtnMale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbtnMaleActionPerformed(evt);
            }
        });

        buttonGroup1.add(rdbtnFemale);
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
        jLabel15.setText("Details of the Blood Donor");

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

        cmbBloodGrp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbBloodGrpActionPerformed(evt);
            }
        });

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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
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
                            .addComponent(lWarning)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lbl_OffAddr)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtOffAddr))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lbl_HAddr)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtHomeAddr, javax.swing.GroupLayout.PREFERRED_SIZE, 483, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbl_Email)
                                    .addComponent(lbl_BloodGrp, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtEmail)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(cmbBloodGrp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE)))))
                        .addGap(45, 341, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(saveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(exitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39))
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
                .addComponent(lWarning)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(saveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(exitButton))
                .addContainerGap())
        );

        pnl.addTab("Donor Details", jPanel1);

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/FormHeader.png"))); // NOI18N
        jLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnl)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnl, javax.swing.GroupLayout.PREFERRED_SIZE, 543, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jInternalFrame1)
                .addGap(2, 2, 2))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(573, 573, 573)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jInternalFrame1)
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
                DonorService donorService = new DonorService();
                Donor donor = new Donor();
                donor.setName(txtName.getText());
                donor.setGender(buttonGroup1.getSelection().getActionCommand());
                donor.setAge(Integer.parseInt(txtAge.getText()));
                donor.setWeight(Integer.parseInt(txtWeight.getText()));
                donor.setHomeAddr(txtHomeAddr.getText());
                donor.setOffAddr(txtOffAddr.getText());
                donor.setPhNo(txtHome.getText());
                donor.setOffNo(txtOffice.getText());
                donor.setMoNo(txtMob.getText());
                donor.seteMail(txtEmail.getText());
                donor.setBloodGrp(cmbBloodGrp.getSelectedItem().toString());
                
                donorService.insert(donor);
                JOptionPane.showMessageDialog(this, "Donor Added Successfully", "Add Donor", JOptionPane.INFORMATION_MESSAGE);
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

    private void cmbBloodGrpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbBloodGrpActionPerformed
        
    }//GEN-LAST:event_cmbBloodGrpActionPerformed
    public void clearAllFields() {

        txtName.setText("");
        buttonGroup1.clearSelection();
        txtAge.setText(null);
        txtWeight.setText(null);
        txtHomeAddr.setText("");
        txtOffAddr.setText("");
        txtHome.setText("");
        txtOffice.setText("");
        txtMob.setText("");
        txtEmail.setText("");
        cmbBloodGrp.setSelectedIndex(0);
   }
    private void FillCombo() {
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
    

    
  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox cmbBloodGrp;
    private javax.swing.JButton exitButton;
    private javax.swing.JInternalFrame jInternalFrame1;
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
