package Frames;

import Models.BatchDetails;
import Classes.DBConnection;
import Models.StudentDetails;

import com.formdev.flatlaf.FlatClientProperties;
import java.sql.Connection;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.regex.Pattern;
import com.formdev.flatlaf.themes.FlatMacLightLaf;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import javax.swing.table.DefaultTableModel;

public class BatchRegiFrame extends javax.swing.JFrame {

    DefaultTableModel model = new DefaultTableModel(new String[]{"Course Name", "Batch No", "Start Date", "Tution Fee"}, 0);
    ArrayList<BatchDetails> temp;
    ArrayList<Integer> ids = new ArrayList<>();
    Connection conn = null;

    public BatchRegiFrame() {
        initComponents();
        conn = DBConnection.getInstance().getConnection();
        populateComboBox();
        setDefault();
        tblCDetails1.setModel(model);
        autocodegenwithdate();
        
        
        //setExtendedState(MAXIMIZED_BOTH);
        placeHolder();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        cbCName = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        tfBNo = new javax.swing.JTextField();
        lblBNo = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lblDate = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        tfFee = new javax.swing.JTextField();
        lblFee = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        date = new com.toedter.calendar.JDateChooser();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        tCombo = new javax.swing.JComboBox<>();
        tfSearch = new javax.swing.JTextField();
        btnSave3 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tblCDetails1 = new javax.swing.JTable();

        jLabel1.setText("jLabel1");

        jLabel5.setText("jLabel5");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(1078, 509));

        jPanel2.setBackground(new java.awt.Color(102, 204, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        jPanel2.setPreferredSize(new java.awt.Dimension(1066, 79));

        jLabel2.setFont(new java.awt.Font("Colonna MT", 1, 36)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Batch Registration");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 950, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 63, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel6.setBackground(new java.awt.Color(102, 204, 255));
        jPanel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        jPanel6.setPreferredSize(new java.awt.Dimension(504, 294));

        cbCName.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cbCName.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Course" }));
        cbCName.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cbCNameMouseClicked(evt);
            }
        });
        cbCName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbCNameActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Cambria Math", 1, 20)); // NOI18N
        jLabel3.setText("Batch No");

        tfBNo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tfBNo.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                tfBNoCaretUpdate(evt);
            }
        });

        lblBNo.setForeground(new java.awt.Color(255, 0, 0));

        jLabel6.setFont(new java.awt.Font("Cambria Math", 1, 20)); // NOI18N
        jLabel6.setText("Start Date");

        lblDate.setForeground(new java.awt.Color(255, 0, 0));

        jLabel8.setFont(new java.awt.Font("Cambria Math", 1, 20)); // NOI18N
        jLabel8.setText("Tution Fee");

        tfFee.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tfFee.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                tfFeeCaretUpdate(evt);
            }
        });
        tfFee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfFeeActionPerformed(evt);
            }
        });

        lblFee.setForeground(new java.awt.Color(255, 0, 0));

        jLabel4.setFont(new java.awt.Font("Cambria Math", 1, 20)); // NOI18N
        jLabel4.setText("Course Name");

        jLabel7.setText("|  Batch Registration");

        jLabel9.setText("Dashboard");
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel4))
                        .addGap(60, 60, 60)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tfFee)
                            .addComponent(tfBNo, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(cbCName, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(date, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblFee, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblBNo, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(74, 74, 74)
                        .addComponent(lblDate, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(174, 174, 174)
                .addComponent(lblDate)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel7))
                .addContainerGap())
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbCName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfBNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblBNo, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(date, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(22, 22, 22)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfFee, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblFee, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(72, Short.MAX_VALUE))
        );

        jPanel10.setBackground(new java.awt.Color(102, 204, 255));
        jPanel10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));

        jButton1.setBackground(new java.awt.Color(0, 255, 255));
        jButton1.setFont(new java.awt.Font("Cambria Math", 1, 16)); // NOI18N
        jButton1.setText("Exit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(0, 255, 255));
        jButton2.setFont(new java.awt.Font("Cambria Math", 1, 16)); // NOI18N
        jButton2.setText("Update");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(0, 255, 255));
        jButton3.setFont(new java.awt.Font("Cambria Math", 1, 16)); // NOI18N
        jButton3.setText("Save");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(0, 255, 255));
        jButton4.setFont(new java.awt.Font("Cambria Math", 1, 16)); // NOI18N
        jButton4.setText("Reset");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton3)
                .addGap(53, 53, 53)
                .addComponent(jButton2)
                .addGap(53, 53, 53)
                .addComponent(jButton4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addContainerGap())
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel3.setBackground(new java.awt.Color(102, 204, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        jPanel3.setPreferredSize(new java.awt.Dimension(744, 49));

        tCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Search Type", "Course Name", "Batch No", "Fee", " " }));
        tCombo.setMinimumSize(new java.awt.Dimension(72, 26));

        tfSearch.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                tfSearchCaretUpdate(evt);
            }
        });

        btnSave3.setBackground(new java.awt.Color(0, 255, 255));
        btnSave3.setFont(new java.awt.Font("Cambria Math", 1, 16)); // NOI18N
        btnSave3.setText("Clear");
        btnSave3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSave3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tfSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSave3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnSave3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(0, 1, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );

        jPanel4.setBackground(new java.awt.Color(102, 204, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));

        tblCDetails1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblCDetails1MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tblCDetails1MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tblCDetails1MouseReleased(evt);
            }
        });
        jScrollPane4.setViewportView(tblCDetails1);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 470, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 966, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 966, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 474, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 978, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        new Dashboard().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        insertData();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        updateData();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void tfBNoCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_tfBNoCaretUpdate
//        String batchNumber = tfBNo.getText().trim();
//        validateBatchNumber(batchNumber);
    }//GEN-LAST:event_tfBNoCaretUpdate

    private void tfFeeCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_tfFeeCaretUpdate
        String tuitionFeeStr = tfFee.getText().trim();
        validateTuitionFee(tuitionFeeStr);
    }//GEN-LAST:event_tfFeeCaretUpdate

    private void tfFeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfFeeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfFeeActionPerformed

    private void tfSearchCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_tfSearchCaretUpdate
        searchstudentData();
    }//GEN-LAST:event_tfSearchCaretUpdate

    private void btnSave3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSave3ActionPerformed
        tfSearch.setText("");
        //setDefault();
        tCombo.setSelectedIndex(0);
    }//GEN-LAST:event_btnSave3ActionPerformed

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        new Dashboard().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel9MouseClicked

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        clear();
        
    }//GEN-LAST:event_jButton4ActionPerformed

    private void tblCDetails1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblCDetails1MouseClicked
       //setupTableClickListener();
       loadSelectedStudentData();
        
    }//GEN-LAST:event_tblCDetails1MouseClicked

    private void cbCNameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbCNameMouseClicked

    }//GEN-LAST:event_cbCNameMouseClicked

    private void cbCNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbCNameActionPerformed
        autoGenerateCourseCode();
    }//GEN-LAST:event_cbCNameActionPerformed

    private void tblCDetails1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblCDetails1MouseReleased
        //setupTableClickListener();
    }//GEN-LAST:event_tblCDetails1MouseReleased

    private void tblCDetails1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblCDetails1MousePressed
        
    }//GEN-LAST:event_tblCDetails1MousePressed

    public static void main(String args[]) {

        FlatMacLightLaf.setup();
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BatchRegiFrame().setVisible(true);
            }
        });
    }

    public void autoGenerateCourseCode() {
        // Step 1: Get course name from combo box
        String inputText = cbCName.getSelectedItem() != null ? cbCName.getSelectedItem().toString() : "";

        // Step 2: Extract level (e.g., "Level 4" → "L4")
        String levelPart = "";
        Matcher matcher = Pattern.compile("\\(([^)]+)\\)").matcher(inputText);
        if (matcher.find()) {
            String rawLevel = matcher.group(1);  // e.g., "Level 4"
            levelPart = "L" + rawLevel.replaceAll("[^0-9]", "");  // Keep digits only and prepend 'L'
        }

        // Step 3: Extract initials from main text (excluding the level part)
        String mainText = inputText.replaceAll("\\(.*\\)", "").trim();  // Remove "(Level 4)"
        String[] words = mainText.split("\\s+");
        StringBuilder initials = new StringBuilder();

        for (String word : words) {
            if (!word.isEmpty()) {
                initials.append(word.charAt(0));
            }
        }

        // Step 4: Get year from JDateChooser (e.g., dcStartDate from another panel)
        String yearPart = "";
        Date selectedDate = date.getDate();  // <- Ensure dcStartDate is accessible
        if (selectedDate != null) {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy");
            yearPart = sdf.format(selectedDate);
        }

        // Step 5: Combine all parts → SD(L4)2025
        String batchCode = initials.toString().toUpperCase() + "(" + levelPart + ")"+"/" + yearPart;

        // Step 6: Set result to tfBNo field
        tfBNo.setText(batchCode);
    }

    public void autocodegenwithdate() {
        date.getDateEditor().addPropertyChangeListener(evt -> {
            if ("date".equals(evt.getPropertyName())) {
                autoGenerateCourseCode();
            }
        });

    }
    
    
    //////////////////////////////////////////////////////hidden text field////////////////////////////////////////////////////
    
    // Assuming these components exist


public void setupTableClickListener() {
   tblCDetails1.addMouseListener(new java.awt.event.MouseAdapter() {
    @Override
    public void mouseClicked(java.awt.event.MouseEvent evt) {
        int selectedRow = tblCDetails1.getSelectedRow();
        if (selectedRow != -1) {
            // Read data from table
            String courseName = tblCDetails1.getValueAt(selectedRow, 0).toString();
            String batchNo = tblCDetails1.getValueAt(selectedRow, 1).toString();
            String startDate = tblCDetails1.getValueAt(selectedRow, 2).toString();
            String tuitionFee = tblCDetails1.getValueAt(selectedRow, 3).toString();

            // Set data to text fields
            cbCName.setSelectedItem(courseName);
            tfBNo.setText(batchNo);
            if (startDate != null) {
                try {
                    String birthDateStr = startDate.toString(); // Assume it's a string in MM/dd/yyyy
                    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
                    date.setDate(sdf.parse(birthDateStr));
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Invalid birth date format.");
                }
            }
            tfFee.setText(tuitionFee);

            // Disable the Batch No text field
            tfBNo.setEditable(true);
        }
    }
});

}


    private void placeHolder() {
//        if (tfSearch != null) {
//            tfSearch.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "Search");
//        }
//        
        if (tfBNo != null) {
            tfBNo.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "Please Enter Batch Number");
        }

        if (tfFee != null) {
            tfFee.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "Please Enter Course fee");
        }

    }

    //Validation 
    private boolean validateCourseName(String courseName) {
        if (courseName == null || courseName.trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Course name cannot be empty.");
            return false;
        }
        return true;
    }

    private boolean validateBatchNumber(String batchNumber) {
        if (batchNumber == null || batchNumber.trim().isEmpty()) {
            lblBNo.setText("Batch number cannot be empty.");
            return false;
        }
        if (!Pattern.matches("[A-Z0-9/]+", batchNumber)) {
            lblBNo.setText("Batch number must be alphanumeric.");
            return false;
        }
        lblBNo.setText("");
        return true;
    }

    private boolean validateStartDate(Date selectedDate) {
        if (selectedDate == null) {
            JOptionPane.showMessageDialog(null, "Start date cannot be empty.");
            return false;
        }
        return true;
    }

    private boolean validateTuitionFee(String tuitionFeeStr) {
        if (tuitionFeeStr == null || tuitionFeeStr.trim().isEmpty()) {
            lblFee.setText("Tuition fee cannot be empty.");
            return false;
        }
        try {
            double tuitionFee = Double.parseDouble(tuitionFeeStr);
            if (tuitionFee <= 0) {
                lblFee.setText("Tuition fee must be a positive number.");
                return false;
            }
        } catch (NumberFormatException e) {
            lblFee.setText("Tuition fee must be a valid number.");
            return false;
        }
        lblFee.setText("");
        return true;
    }

    private boolean finalBatchChecking() {
        String courseName = cbCName.getSelectedItem().toString().trim();
        //String batchNumber = tfBNo.getText().trim();
        Date selectedDate = date.getDate();
        String tuitionFeeStr = tfFee.getText().trim();

        if (validateCourseName(courseName)
                && validateStartDate(selectedDate) && validateTuitionFee(tuitionFeeStr)) {
            System.out.println("Ok");
            return true;
        }
        return false;
    }

    private void insertData() {

        if (finalBatchChecking()) {
//        if (!finalBatchChecking()) {
//            return;
//        }

            String selectedCourse = cbCName.getSelectedItem().toString().trim();
            String batchNumber = tfBNo.getText().trim();
            Date selectedDate = date.getDate();
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            String startDate = dateFormat.format(selectedDate);
            String tuitionFeeStr = tfFee.getText().trim();
            double tuitionFee = Double.parseDouble(tuitionFeeStr);

            if (isDuplicateRecord(batchNumber, -1)) {

                return;
            }
            
            if (selectedCourse.equals("Select Course")) {
            JOptionPane.showMessageDialog(this, "Please select a Course.", "Input Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

            // Split courseName and level from the selected combo box item
            String[] parts = selectedCourse.split(" \\(");
            String courseName = parts[0].trim();
            String courseLevel = parts[1].replace(")", "").trim();

            // Fetch the courseId based on courseName and level
            int courseId = getCourseId(courseName, courseLevel);

            if (courseId == -1) {
                JOptionPane.showMessageDialog(null, "Course not found.");
                return;
            }

            try {
                String sql = "INSERT INTO course_offering (courseName, batchNumber, startDate, tuitionFee, courseId) VALUES (?, ?, ?, ?, ?)";
                PreparedStatement pst = conn.prepareStatement(sql);
                pst.setString(1, selectedCourse);
                pst.setString(2, batchNumber);
                pst.setString(3, startDate);
                pst.setDouble(4, tuitionFee);
                pst.setInt(5, courseId);

                pst.executeUpdate();

                JOptionPane.showMessageDialog(null, "Batch Registration inserted successfully!");
                setDefault();
                clear();

            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Unable to insert the batch details.");
                System.out.println("Error: " + e.getMessage());
                e.printStackTrace();
            }
        } else {
            JOptionPane.showMessageDialog(null, "Please fill the all fields");
        }
    }

     private void updateData() {

        if (finalBatchChecking()) {
            int selectedRow = tblCDetails1.getSelectedRow();
//        if (!finalCourseChecking()) {
//            return;
//        }

            if (selectedRow == -1) {
                JOptionPane.showMessageDialog(null, "Please select a batch from the table.");
                return;
            }

            String Coursename = cbCName.getSelectedItem().toString();

            String batchno = tfBNo.getText();
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

            String date = dateFormat.format(this.date.getDate());
            String tutionfee = tfFee.getText();

//        Object idObj = tblCDetails1.getValueAt(selectedRow, 0);
//
//        int id = Integer.parseInt(idObj.toString());
            int id = ids.get(selectedRow);

//            if (isDuplicateRecord(batchno, id)) {
//                return;
//            }
            try {
                String sql = "UPDATE course_offering SET courseName = ?, batchNumber = ?, startDate = ?, tuitionFee = ?  WHERE courseOfferingNumber = ?";
                PreparedStatement pst = conn.prepareStatement(sql);
                pst.setString(1, Coursename);
                pst.setString(2, batchno);
                pst.setString(3, date);

                pst.setString(4, tutionfee);
                pst.setInt(5, id);

                pst.executeUpdate();

                JOptionPane.showMessageDialog(null, "Batch updated successfully!");
                setDefault();
                clear();

            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Unable to update the tutor. " + e.getMessage());
                System.out.println("Error: " + e.getMessage());
                e.printStackTrace();
            }
        } else {
            JOptionPane.showMessageDialog(null, "Please select a tutor from the table.");
        }
    }

    private int getCourseId(String courseName, String courseLevel) {
        int courseId = -1;
        try {
            String sql = "SELECT courseId FROM course WHERE courseName = ? AND level = ?";
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setString(1, courseName);
            pst.setString(2, courseLevel);
            ResultSet rs = pst.executeQuery();
            if (rs.next()) {
                courseId = rs.getInt("courseId");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error fetching course ID: " + e.getMessage());
            e.printStackTrace();
        }
        return courseId;
    }

    // Populate the course names into the combo box
    private ArrayList<String> getCourseNames() {
        ArrayList<String> courseNames = new ArrayList<>();

        String query = "SELECT courseName,level FROM course";

        try {
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(query);
            while (rs.next()) {
                String courseName = rs.getString("courseName");
                String level = rs.getString("level");
                courseNames.add(courseName + " (" + level + ")");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error fetching course names: " + e.getMessage(), "Database Error", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        }

        return courseNames;
    }

    private ArrayList<BatchDetails> getBatchList(String query) {
        ArrayList<BatchDetails> obj = new ArrayList<>();
        // List to store IDs

        Statement st;
        ResultSet rs;

        try {
            st = conn.createStatement();
            rs = st.executeQuery(query);

            BatchDetails course;
            while (rs.next()) {
                course = new BatchDetails(
                        rs.getInt("courseOfferingNumber"),
                        rs.getString("courseName"),
                        rs.getString("batchNumber"),
                        rs.getString("startDate"),
                        rs.getDouble("tuitionFee"),
                        rs.getInt("courseId")
                );
                obj.add(course);
                ids.add(rs.getInt("courseOfferingNumber")); // Store IDs
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Cannot display results: " + e.getMessage());
            System.out.println("Cannot display results: " + e.getMessage());
            e.printStackTrace();
        }

        return obj;
    }

    private void setCourseTableData(String query) {
        model.setRowCount(0);
        ArrayList<BatchDetails> temp = getBatchList(query);

        for (BatchDetails course : temp) {
            String courseName = course.getCourseName();
            String batchNo = course.getBatchNumber();
            String startDate = course.getStartDate();
            double tutionFee = course.getTuitionFee();
            int courseId = course.getCourseId();

            model.addRow(new Object[]{courseName, batchNo, startDate, tutionFee, courseId});
        }
    }

    private void setDefault() {
        String query = "SELECT*FROM course_offering";
        getBatchList(query);
        setCourseTableData(query);
    }

    private void loadSelectedStudentData() {
        int selectedRow = tblCDetails1.getSelectedRow();
        if (selectedRow != -1) {
            cbCName.setSelectedItem(tblCDetails1.getValueAt(selectedRow, 0).toString());
            tfBNo.setText(model.getValueAt(selectedRow, 1).toString());

            Object birthDateObj = model.getValueAt(selectedRow, 2);
            if (birthDateObj != null) {
                try {
                    String birthDateStr = birthDateObj.toString(); // Assume it's a string in MM/dd/yyyy
                    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
                    date.setDate(sdf.parse(birthDateStr));
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Invalid birth date format.");
                }
            }
            tfFee.setText(model.getValueAt(selectedRow, 3).toString());
            tfBNo.setEditable(false);

        } else {
            JOptionPane.showMessageDialog(null, "Please select a student from the table.");
        }
    }

    private void searchstudentData() {
        String searchType = tCombo.getSelectedItem().toString(); // Get selected search type from combo box
        String searchValue = tfSearch.getText().trim(); // Get the search input from text field

        // Reload all data if search field is empty
        if (searchValue.isEmpty()) {
            setDefault(); // Call method to load all data
            return;
        }

        // Validate search type and value
        if (searchType.equals("Select Search Type")) {
            JOptionPane.showMessageDialog(this, "Please select a valid search type.", "Input Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        String query = "";
        switch (searchType) {
            case "Course Name":
                query = "SELECT * FROM course_offering WHERE courseName LIKE ?";
                break;
            case "Batch No":
                query = "SELECT * FROM course_offering WHERE batchNumber LIKE ?";
                break;
            case "Fee":
                query = "SELECT * FROM course_offering WHERE tuitionFee LIKE ?";
                break;
            default:
                JOptionPane.showMessageDialog(this, "Invalid search type selected.", "Input Error", JOptionPane.ERROR_MESSAGE);
                return;
        }

        try {
            PreparedStatement pst = conn.prepareStatement(query);
            pst.setString(1, "%" + searchValue + "%"); // Use wildcard for partial match
            ResultSet rs = pst.executeQuery();

            // Clear existing table rows
            model.setRowCount(0);

            // Populate table with search results
            while (rs.next()) {
                Object[] rowData = {
                    //                    rs.getInt("courseId"),
                    rs.getString("courseName"),
                    rs.getString("batchNumber"),
                    rs.getString("startDate"),
                    rs.getString("tuitionFee"),};
                model.addRow(rowData);
            }

            // Notify if no results are found
            if (model.getRowCount() == 0) {
                // JOptionPane.showMessageDialog(this, "No customers found matching the search criteria.", "Search Result", JOptionPane.INFORMATION_MESSAGE);
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "No batch found matching the search criteria.", "Search Result", JOptionPane.INFORMATION_MESSAGE);
            e.printStackTrace();
        }

    }

    private void populateComboBox() {
        ArrayList<String> courseNames = getCourseNames();
        for (String courseName : courseNames) {
            cbCName.addItem(courseName);
        }
    }

    //Clear Fields
    private void clear() {
        tfBNo.setEditable(true);
        cbCName.setSelectedIndex(0);
        tfBNo.setText("");
        date.setDate(null);
        tfFee.setText("");
        lblBNo.setText("");
        lblDate.setText("");
        lblFee.setText("");
    }

    private boolean isDuplicateRecord(String batchNumber, int currentId) {
        try {
            // Check for duplicate courseCode
            String querystudentNo = "SELECT COUNT(*) FROM course_offering WHERE batchNumber = ? AND courseOfferingNumber != ?";
            PreparedStatement pststudentNo = conn.prepareStatement(querystudentNo);
            pststudentNo.setString(1, batchNumber);
            pststudentNo.setInt(2, currentId);
            ResultSet rsstudentNo = pststudentNo.executeQuery();

            if (rsstudentNo.next() && rsstudentNo.getInt(1) > 0) {
                JOptionPane.showMessageDialog(null, "The batch id already exists. Please use a unique batch no.", "Duplicate batch no", JOptionPane.WARNING_MESSAGE);
                return true;
            }

            /* // Check for duplicate courseName and level combination
            String querystudentNamestudentAddress = "SELECT COUNT(*) FROM manage_student WHERE studentName = ? AND studentAddress = ? AND studentIndex != ?";
            PreparedStatement pststudentNamestudentAddress = conn.prepareStatement(querystudentNamestudentAddress);
            pststudentNamestudentAddress.setString(1, studentName);
            pststudentNamestudentAddress.setString(2, studentAddress);
            pststudentNamestudentAddress.setInt(3, currentId);
            ResultSet rsstudentNamestudentAddress = pststudentNamestudentAddress.executeQuery();

            if (rsstudentNamestudentAddress.next() && rsstudentNamestudentAddress.getInt(1) > 0) {
                JOptionPane.showMessageDialog(null, "A student with the same name and address already exists. Please use unique details.", "Duplicate student Details", JOptionPane.WARNING_MESSAGE);
                return true;
            }*/
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Database error during validation: " + e.getMessage(), "Database Error", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        }
        return false;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSave3;
    private javax.swing.JComboBox<String> cbCName;
    private com.toedter.calendar.JDateChooser date;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JLabel lblBNo;
    private javax.swing.JLabel lblDate;
    private javax.swing.JLabel lblFee;
    private javax.swing.JComboBox<String> tCombo;
    private javax.swing.JTable tblCDetails1;
    private javax.swing.JTextField tfBNo;
    private javax.swing.JTextField tfFee;
    private javax.swing.JTextField tfSearch;
    // End of variables declaration//GEN-END:variables
}
