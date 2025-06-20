package Frames;

import Classes.DBConnection;
import Models.CourseDetails;
import Models.StudentDetails;
import com.formdev.flatlaf.FlatClientProperties;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import com.formdev.flatlaf.themes.FlatMacLightLaf;

public class StudentRegiFrame extends javax.swing.JFrame {

    DefaultTableModel model = new DefaultTableModel(new String[]{"Student No", "Student Name", "Student Birthday", "Course name",}, 0);
    Connection conn = null;
    ArrayList<StudentDetails> temp;
    ArrayList<Integer> ids = new ArrayList<>();

    public StudentRegiFrame() {
        initComponents();
        //setExtendedState(MAXIMIZED_BOTH);
        tblCDetails.setModel(model);
        conn = DBConnection.getInstance().getConnection();
        setDefault();
        placeHolder();
        populateComboBox();
        //hideColumns();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        tfCode1 = new javax.swing.JTextField();
        lblCode1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        tfCName1 = new javax.swing.JTextField();
        lblCName1 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        lblCDesc1 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        tfDesc1 = new javax.swing.JComboBox<>();
        date = new com.toedter.calendar.JDateChooser();
        jPanel11 = new javax.swing.JPanel();
        btnExit1 = new javax.swing.JButton();
        btnReset1 = new javax.swing.JButton();
        btnDelete1 = new javax.swing.JButton();
        btnUpdate1 = new javax.swing.JButton();
        btnSave1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        tCombo = new javax.swing.JComboBox<>();
        tfSearch = new javax.swing.JTextField();
        btnSave3 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tblCDetails = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel3.setBackground(new java.awt.Color(0, 255, 255));

        jPanel4.setBackground(new java.awt.Color(102, 204, 255));
        jPanel4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));

        jLabel3.setBackground(new java.awt.Color(0, 0, 255));
        jLabel3.setFont(new java.awt.Font("Colonna MT", 1, 36)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Student Registration");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 950, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(58, Short.MAX_VALUE)))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        jPanel7.setBackground(new java.awt.Color(102, 204, 255));
        jPanel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));

        jLabel6.setFont(new java.awt.Font("Cambria Math", 1, 20)); // NOI18N
        jLabel6.setText("Student No");

        tfCode1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tfCode1.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                tfCode1CaretUpdate(evt);
            }
        });
        tfCode1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfCode1ActionPerformed(evt);
            }
        });

        lblCode1.setForeground(new java.awt.Color(255, 0, 0));

        jLabel8.setFont(new java.awt.Font("Cambria Math", 1, 20)); // NOI18N
        jLabel8.setText("Student Name");

        tfCName1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tfCName1.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                tfCName1CaretUpdate(evt);
            }
        });
        tfCName1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfCName1ActionPerformed(evt);
            }
        });

        lblCName1.setForeground(new java.awt.Color(255, 0, 0));

        jLabel9.setFont(new java.awt.Font("Cambria Math", 1, 20)); // NOI18N
        jLabel9.setText("Course Name");

        lblCDesc1.setForeground(new java.awt.Color(255, 0, 0));

        jLabel10.setFont(new java.awt.Font("Cambria Math", 1, 20)); // NOI18N
        jLabel10.setText("Student Birthday");

        jLabel1.setText("Dashboard");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        jLabel2.setText("|  Student Registration");

        tfDesc1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfDesc1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel10))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tfDesc1, 0, 250, Short.MAX_VALUE)
                            .addComponent(date, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(18, 18, 18))
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)))
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblCode1, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblCName1, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfCName1, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfCode1, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(173, 173, 173)
                        .addComponent(lblCDesc1, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(tfCode1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblCode1, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(tfCName1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addComponent(lblCName1, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addComponent(date, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(tfDesc1, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE))
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblCDesc1, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addContainerGap())
        );

        jPanel11.setBackground(new java.awt.Color(102, 204, 255));
        jPanel11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));

        btnExit1.setBackground(new java.awt.Color(0, 255, 255));
        btnExit1.setFont(new java.awt.Font("Cambria Math", 1, 16)); // NOI18N
        btnExit1.setText("Exit");
        btnExit1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExit1ActionPerformed(evt);
            }
        });

        btnReset1.setBackground(new java.awt.Color(0, 255, 255));
        btnReset1.setFont(new java.awt.Font("Cambria Math", 1, 16)); // NOI18N
        btnReset1.setText("Reset");
        btnReset1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReset1ActionPerformed(evt);
            }
        });

        btnDelete1.setBackground(new java.awt.Color(0, 255, 255));
        btnDelete1.setFont(new java.awt.Font("Cambria Math", 1, 16)); // NOI18N
        btnDelete1.setText("Delete");
        btnDelete1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDelete1ActionPerformed(evt);
            }
        });

        btnUpdate1.setBackground(new java.awt.Color(0, 255, 255));
        btnUpdate1.setFont(new java.awt.Font("Cambria Math", 1, 16)); // NOI18N
        btnUpdate1.setText("Update");
        btnUpdate1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdate1ActionPerformed(evt);
            }
        });

        btnSave1.setBackground(new java.awt.Color(0, 255, 255));
        btnSave1.setFont(new java.awt.Font("Cambria Math", 1, 16)); // NOI18N
        btnSave1.setText("Save");
        btnSave1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSave1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnSave1)
                .addGap(18, 18, 18)
                .addComponent(btnUpdate1)
                .addGap(18, 18, 18)
                .addComponent(btnDelete1)
                .addGap(18, 18, 18)
                .addComponent(btnReset1)
                .addGap(18, 18, 18)
                .addComponent(btnExit1)
                .addContainerGap(8, Short.MAX_VALUE))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnExit1)
                    .addComponent(btnReset1)
                    .addComponent(btnDelete1)
                    .addComponent(btnUpdate1)
                    .addComponent(btnSave1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.setBackground(new java.awt.Color(102, 204, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));

        tCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Search Type", "Student No", "Student Name", "Course Name" }));
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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tfSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSave3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnSave3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(102, 204, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));

        tblCDetails.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblCDetailsMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(tblCDetails);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 531, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, 466, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void tfCode1CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_tfCode1CaretUpdate
        String courseCode = tfCode1.getText();
        validateStudentNo(courseCode);
    }//GEN-LAST:event_tfCode1CaretUpdate

    private void tfCName1CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_tfCName1CaretUpdate
        String courseName = tfCName1.getText();
        validateStudentName(courseName);
    }//GEN-LAST:event_tfCName1CaretUpdate

    private void tblCDetailsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblCDetailsMouseClicked
        loadSelectedTutorData();
    }//GEN-LAST:event_tblCDetailsMouseClicked

    private void btnExit1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExit1ActionPerformed
        new Dashboard().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnExit1ActionPerformed

    private void btnReset1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReset1ActionPerformed
        clear();
    }//GEN-LAST:event_btnReset1ActionPerformed

    private void btnDelete1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDelete1ActionPerformed
        deleteData();
    }//GEN-LAST:event_btnDelete1ActionPerformed

    private void btnUpdate1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdate1ActionPerformed
        updateData();
    }//GEN-LAST:event_btnUpdate1ActionPerformed

    private void btnSave1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSave1ActionPerformed
        insertData();
    }//GEN-LAST:event_btnSave1ActionPerformed

    private void tfSearchCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_tfSearchCaretUpdate
        searchstudentData();
    }//GEN-LAST:event_tfSearchCaretUpdate

    private void btnSave3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSave3ActionPerformed
        tfSearch.setText("");
        tCombo.setSelectedIndex(0);
        setDefault();
    }//GEN-LAST:event_btnSave3ActionPerformed

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        new Dashboard().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel1MouseClicked

    private void tfCName1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfCName1ActionPerformed

    }//GEN-LAST:event_tfCName1ActionPerformed

    private void tfDesc1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfDesc1ActionPerformed
        btnSave1.grabFocus();
    }//GEN-LAST:event_tfDesc1ActionPerformed

    private void tfCode1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfCode1ActionPerformed
        tfCName1.grabFocus();
    }//GEN-LAST:event_tfCode1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        FlatMacLightLaf.setup();
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StudentRegiFrame().setVisible(true);
            }
        });
    }

    private ArrayList<StudentDetails> getCourseList(String query) {
        ArrayList<StudentDetails> obj = new ArrayList<>();
        // List to store IDs

        Statement st;
        ResultSet rs;

        try {
            st = conn.createStatement();
            rs = st.executeQuery(query);

            StudentDetails course;
            while (rs.next()) {
                course = new StudentDetails(
                        rs.getInt("id"),
                        rs.getString("studentNo"),
                        rs.getString("studentName"),
                        rs.getString("studentBirthday"),
                        rs.getString("courseName")
                );
                obj.add(course);
                ids.add(rs.getInt("id")); // Store IDs
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
        ArrayList<StudentDetails> temp = getCourseList(query);

        for (StudentDetails course : temp) {
            String studentNo = course.getStudentNo();
            String studentName = course.getStudentName();
            String studentBirth = course.getStudentBirthday();
            String courseName = course.getCourseName();

            model.addRow(new Object[]{studentNo, studentName, studentBirth, courseName});
        }
    }

    private void setDefault() {
        String query = "SELECT*FROM student_details";
        getCourseList(query);
        setCourseTableData(query);
    }

    private void placeHolder() {

        if (tfSearch != null) {
            tfSearch.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "Search");
        }

        if (tfCode1 != null) {
            tfCode1.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "Please Enter only numbers");
        }

        if (tfCName1 != null) {
            tfCName1.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "Please Enter Name With Capital Letter");
        }

//         if(tfDesc1 != null){
//            tfDesc1.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "Please Enter Course Name");
//        }
    }

    //validation
    private boolean validateStudentNo(String courseCode) {
        // Example: Course code must be alphanumeric and non-empty
        if (courseCode == null || courseCode.trim().isEmpty()) {
            lblCode1.setText("Student No naver cannot be empty.");
            return false;
        }
        if (!Pattern.matches("[0-9/]+", courseCode)) {
            lblCode1.setText("Student No must be valid.");
            return false;
        }
        lblCode1.setText("");
        return true;
    }

    private boolean validateStudentName(String StudentName) {
        if (StudentName.isEmpty()) {
            lblCName1.setText("student Name cannot be empty");
            return false;
        } else if (!Pattern.matches("^([A-Z][a-z]+)(\\s[A-Z][a-z]+)*$", StudentName)) {
            lblCName1.setText("Invalid Student Name");
            return false;
        }
        lblCName1.setText("");
        return true;
    }

    private boolean isDuplicateRecord(String studentNo, int currentId) {
        try {
            // Check for duplicate courseCode
            String querystudentNo = "SELECT COUNT(*) FROM student_details WHERE studentNo = ? AND id != ?";
            PreparedStatement pststudentNo = conn.prepareStatement(querystudentNo);
            pststudentNo.setString(1, studentNo);
            pststudentNo.setInt(2, currentId);
            ResultSet rsstudentNo = pststudentNo.executeQuery();

            if (rsstudentNo.next() && rsstudentNo.getInt(1) > 0) {
                JOptionPane.showMessageDialog(null, "The student id already exists. Please use a unique student id.", "Duplicate student id", JOptionPane.WARNING_MESSAGE);
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

//    private boolean validateCourseName(String courseName) {
//        if (courseName.isEmpty()) {
//            lblCDesc1.setText("Course Name cannot be empty");
//            return false;
//        } else if (!Pattern.matches("^[a-zA-Z\\s]+$", courseName)) {
//            lblCDesc1.setText("Invalid Course Name");
//            return false;
//        }
//        lblCDesc1.setText("");
//        return true;
//    }
    private boolean finalCourseChecking() {
        String courseCode = tfCode1.getText().trim();
        String courseName = tfCName1.getText().trim();
        String courseDescription = tfDesc1.getSelectedItem().toString();

        if (validateStudentNo(courseCode) && validateStudentName(courseName)) {
            System.out.println("Ok");
            return true;
        }
        return false;
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

    private void hideColumns() {
        tblCDetails.getColumnModel().getColumn(0).setMinWidth(0);
        tblCDetails.getColumnModel().getColumn(0).setMaxWidth(0);
        tblCDetails.getColumnModel().getColumn(0).setWidth(0);
    }

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

    private void populateComboBox() {
        ArrayList<String> courseNames = getCourseNames();
        for (String courseName : courseNames) {
            tfDesc1.addItem(courseName);
        }
    }

    ///insert
    private void insertData() {
//        if (!finalCourseChecking()) {
//            return;
//        }
        if (finalCourseChecking()) {

            String code = tfCode1.getText();
            String name = tfCName1.getText();

            if (isDuplicateRecord(code, -1)) {

                return;
            }

            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            String birth = dateFormat.format(date.getDate());
            String selectedCourse = tfDesc1.getSelectedItem().toString();

            // Split courseName and level from the selected combo box item
            String[] parts = selectedCourse.split(" \\(");
            String courseName = parts[0];
            String courseLevel = parts[1].replace(")", "");

            // Fetch the courseId based on courseName and level
            int courseId = getCourseId(courseName, courseLevel);

            if (courseId == -1) {
                JOptionPane.showMessageDialog(null, "Student not found. Please check the course name and level.");
                return;
            }

            try {
                String sql = "INSERT INTO student_details (studentNo, studentName, studentBirthday, courseName, courseId) VALUES (?, ?, ?, ? , ?)";
                PreparedStatement pst = conn.prepareStatement(sql);
                pst.setString(1, code);
                pst.setString(2, name);
                pst.setString(3, birth);
                pst.setString(4, selectedCourse);
                pst.setInt(5, courseId);

                int rowsInserted = pst.executeUpdate();
                if (rowsInserted > 0) {
                    JOptionPane.showMessageDialog(null, "Student inserted successfully!");
                    //clear();
                    setDefault();
                    clear();
                } else {
                    JOptionPane.showMessageDialog(null, "Insertion failed. No rows affected.");
                }

            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Unable to insert the student. " + e.getMessage());
                System.out.println("SQL Error: " + e.getMessage());
                e.printStackTrace();
            }
        } else {
            JOptionPane.showMessageDialog(null, "Please fill the all fields");
        }
    }
//

    private void updateData() {

        if (finalCourseChecking()) {
            int selectedRow = tblCDetails.getSelectedRow();
//        if (!finalCourseChecking()) {
//            return;
//        }

            if (selectedRow == -1) {
                JOptionPane.showMessageDialog(null, "Please select a tutor from the table.");
                return;
            }

            String studentNO = tfCode1.getText();

            String nic = tfCName1.getText();
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

            String date = dateFormat.format(this.date.getDate());
            String selectedCourse = tfDesc1.getSelectedItem().toString();

//        Object idObj = tblCDetails1.getValueAt(selectedRow, 0);
//
//        int id = Integer.parseInt(idObj.toString());
            int id = ids.get(selectedRow);

            if (isDuplicateRecord(studentNO, id)) {
                return;
            }
            try {
                String sql = "UPDATE student_details SET studentNo = ?, studentName = ?, studentBirthday = ?, courseName = ?  WHERE id = ?";
                PreparedStatement pst = conn.prepareStatement(sql);
                pst.setString(1, studentNO);
                pst.setString(2, nic);
                pst.setString(3, date);

                pst.setString(4, selectedCourse);
                pst.setInt(5, id);

                pst.executeUpdate();

                JOptionPane.showMessageDialog(null, "Tutor updated successfully!");
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
//

    private void clear() {

        tfCode1.setText("");
        lblCode1.setText("");
        tfCName1.setText("");
        lblCName1.setText("");
        date.setDate(null);
        tfDesc1.setSelectedIndex(0);
    }

    private void deleteData() {
        int selectedRow = tblCDetails.getSelectedRow();

        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(null, "Please select a student from the table.");
            return;
        }

        int id = ids.get(selectedRow);

        int deleteConfirm = JOptionPane.showConfirmDialog(this, "Are you sure you want to delete this student?", "Confirm Delete", JOptionPane.YES_NO_OPTION);
        if (deleteConfirm == JOptionPane.YES_OPTION) {
            try {

                Statement stmt = conn.createStatement();
                stmt.execute("SET FOREIGN_KEY_CHECKS = 0");

//                String updateSql = "UPDATE student_details SET courseId  = NULL WHERE courseId  = ?";
//                PreparedStatement pstUpdate = conn.prepareStatement(updateSql);
//                pstUpdate.setInt(1, id);
//                pstUpdate.executeUpdate();
                String deleteSql = "DELETE FROM student_details WHERE id = ?";
                PreparedStatement pstDelete = conn.prepareStatement(deleteSql);
                pstDelete.setInt(1, id);
                pstDelete.executeUpdate();

                stmt.execute("SET FOREIGN_KEY_CHECKS = 1");

                JOptionPane.showMessageDialog(null, "Student has been deleted successfully.");

                setDefault();
                clear();
                // loadData();
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Error while deleting member: " + e.getMessage(), "Database Error", JOptionPane.ERROR_MESSAGE);
                e.printStackTrace();
            }
        }
    }

//
    private void loadSelectedTutorData() {
        int selectedRow = tblCDetails.getSelectedRow();
        if (selectedRow != -1) {
            tfCode1.setText(model.getValueAt(selectedRow, 0).toString());
            tfCName1.setText(model.getValueAt(selectedRow, 1).toString());

            // Get date from table and set it on the tBirth JDateChooser
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
            tfDesc1.setSelectedItem(model.getValueAt(selectedRow, 3));

        } else {
            JOptionPane.showMessageDialog(null, "Please select a tutor from the table.");
        }
    }
//

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
            case "Student No":
                query = "SELECT * FROM student_details WHERE studentNo LIKE ?";
                break;
            case "Student Name":
                query = "SELECT * FROM student_details WHERE studentName LIKE ?";
                break;
            case "Course Name":
                query = "SELECT * FROM student_details WHERE courseName LIKE ?";
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
                    rs.getString("studentNo"),
                    rs.getString("studentName"),
                    rs.getString("studentBirthday"),
                    rs.getString("courseName"),};
                model.addRow(rowData);
            }

            // Notify if no results are found
            if (model.getRowCount() == 0) {
                // JOptionPane.showMessageDialog(this, "No customers found matching the search criteria.", "Search Result", JOptionPane.INFORMATION_MESSAGE);
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "No student found matching the search criteria.", "Search Result", JOptionPane.INFORMATION_MESSAGE);
            e.printStackTrace();
        }

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete1;
    private javax.swing.JButton btnExit1;
    private javax.swing.JButton btnReset1;
    private javax.swing.JButton btnSave1;
    private javax.swing.JButton btnSave3;
    private javax.swing.JButton btnUpdate1;
    private com.toedter.calendar.JDateChooser date;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JLabel lblCDesc1;
    private javax.swing.JLabel lblCName1;
    private javax.swing.JLabel lblCode1;
    private javax.swing.JComboBox<String> tCombo;
    private javax.swing.JTable tblCDetails;
    private javax.swing.JTextField tfCName1;
    private javax.swing.JTextField tfCode1;
    private javax.swing.JComboBox<String> tfDesc1;
    private javax.swing.JTextField tfSearch;
    // End of variables declaration//GEN-END:variables
}
