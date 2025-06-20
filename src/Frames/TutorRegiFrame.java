package Frames;

import Classes.DBConnection;
import Models.StudentDetails;
import Models.TutorDetails;
import com.formdev.flatlaf.FlatClientProperties;
import java.sql.Connection;
import java.sql.PreparedStatement;
import com.formdev.flatlaf.themes.FlatMacLightLaf;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class TutorRegiFrame extends javax.swing.JFrame {

    DefaultTableModel model = new DefaultTableModel(new String[]{"Tutor Name", "Tutor NIC", "Tutor Address", "Employment Date", "Course Name"}, 0);
    Connection conn = null;
    ArrayList<TutorDetails> temp;
    ArrayList<Integer> ids = new ArrayList<>();

    public TutorRegiFrame() {
        initComponents();
        //setExtendedState(MAXIMIZED_BOTH);
        tblCDetails1.setModel(model);
        placeHolder();
        conn = DBConnection.getInstance().getConnection();
        setDefault();
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
        tfname = new javax.swing.JTextField();
        lblname = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        tfnic = new javax.swing.JTextField();
        lblCNic = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        lbladd = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        tfadd = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
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
        tblCDetails1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel3.setBackground(new java.awt.Color(0, 255, 255));

        jPanel4.setBackground(new java.awt.Color(102, 204, 255));
        jPanel4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));
        jPanel4.setPreferredSize(new java.awt.Dimension(1066, 79));

        jLabel3.setBackground(new java.awt.Color(0, 0, 255));
        jLabel3.setFont(new java.awt.Font("Colonna MT", 1, 36)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Tutor Registration");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 958, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        jPanel7.setBackground(new java.awt.Color(102, 204, 255));
        jPanel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));

        jLabel6.setFont(new java.awt.Font("Cambria Math", 1, 20)); // NOI18N
        jLabel6.setText("Tutor Name");

        tfname.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tfname.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                tfnameCaretUpdate(evt);
            }
        });
        tfname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfnameActionPerformed(evt);
            }
        });

        lblname.setForeground(new java.awt.Color(255, 0, 0));

        jLabel8.setFont(new java.awt.Font("Cambria Math", 1, 20)); // NOI18N
        jLabel8.setText("Tutor NIC");

        tfnic.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tfnic.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                tfnicCaretUpdate(evt);
            }
        });
        tfnic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfnicActionPerformed(evt);
            }
        });

        lblCNic.setForeground(new java.awt.Color(255, 0, 0));

        jLabel9.setFont(new java.awt.Font("Cambria Math", 1, 20)); // NOI18N
        jLabel9.setText("Employment Date");

        lbladd.setForeground(new java.awt.Color(255, 0, 0));

        jLabel10.setFont(new java.awt.Font("Cambria Math", 1, 20)); // NOI18N
        jLabel10.setText("Tutor Address");

        tfadd.setPreferredSize(new java.awt.Dimension(64, 26));
        tfadd.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                tfaddCaretUpdate(evt);
            }
        });
        tfadd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfaddActionPerformed(evt);
            }
        });

        jLabel2.setText("|  Tutor Registration");

        jLabel1.setText("Dashboard");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Cambria Math", 1, 20)); // NOI18N
        jLabel11.setText("Course Name");

        tfDesc1.setPreferredSize(new java.awt.Dimension(72, 26));
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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbladd, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfadd, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(lblCNic, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(tfname, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 239, Short.MAX_VALUE)
                                .addComponent(tfnic, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblname, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(date, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(tfDesc1, javax.swing.GroupLayout.Alignment.LEADING, 0, 240, Short.MAX_VALUE)))))
                .addGap(359, 359, 359))
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(607, 607, 607))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblname, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfnic, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(5, 5, 5)
                .addComponent(lblCNic, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfadd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbladd, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel9)
                    .addComponent(date, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(tfDesc1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
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
                .addComponent(btnSave1, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnUpdate1, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnDelete1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnReset1)
                .addGap(12, 12, 12)
                .addComponent(btnExit1)
                .addContainerGap(9, Short.MAX_VALUE))
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
        jPanel1.setPreferredSize(new java.awt.Dimension(744, 49));

        tCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Search Type", "Tutor Name", "NIC", "Address", "Course" }));
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSave3, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 1, Short.MAX_VALUE))
                    .addComponent(btnSave3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(102, 204, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        jPanel2.setPreferredSize(new java.awt.Dimension(512, 293));

        tblCDetails1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblCDetails1MouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(tblCDetails1);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 509, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, 442, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 525, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 974, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, 974, Short.MAX_VALUE))
                .addGap(70, 70, 70))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 351, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 996, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void tfnameCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_tfnameCaretUpdate
        String courseCode = tfname.getText();
        validatetutorName(courseCode);
    }//GEN-LAST:event_tfnameCaretUpdate

    private void tfnicCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_tfnicCaretUpdate
        String courseCode = tfnic.getText();
        validatetutornic(courseCode);
    }//GEN-LAST:event_tfnicCaretUpdate

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

    private void tblCDetails1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblCDetails1MouseClicked
        loadSelectedTutorData();
    }//GEN-LAST:event_tblCDetails1MouseClicked

    private void tfaddCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_tfaddCaretUpdate
        String courseCode = tfadd.getText();
        validateaddress(courseCode);
    }//GEN-LAST:event_tfaddCaretUpdate

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        new Dashboard().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel1MouseClicked

    private void tfnicActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfnicActionPerformed
        tfadd.grabFocus();
    }//GEN-LAST:event_tfnicActionPerformed

    private void tfnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfnameActionPerformed
        tfnic.grabFocus();
    }//GEN-LAST:event_tfnameActionPerformed

    private void tfaddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfaddActionPerformed

    }//GEN-LAST:event_tfaddActionPerformed

    private void tfDesc1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfDesc1ActionPerformed
        btnSave1.grabFocus();
    }//GEN-LAST:event_tfDesc1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        FlatMacLightLaf.setup();
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TutorRegiFrame().setVisible(true);
            }
        });
    }

    private ArrayList<TutorDetails> getTutorList(String query) {
        ArrayList<TutorDetails> obj = new ArrayList<>();
        // List to store IDs

        Statement st;
        ResultSet rs;

        try {
            st = conn.createStatement();
            rs = st.executeQuery(query);

            TutorDetails course;
            while (rs.next()) {
                course = new TutorDetails(
                        rs.getInt("id"),
                        rs.getString("tutorName"),
                        rs.getString("tutorNic"),
                        rs.getString("tutorAddress"),
                        rs.getString("empDate"),
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
        ArrayList<TutorDetails> temp = getTutorList(query);

        for (TutorDetails course : temp) {
            String tutorName = course.getTutorName();
            String tutornic = course.getTutorNIC();
            String tutorAddress = course.getTutorAddress();
            String empNo = course.getEmploymentDate();
            String coursename = course.getCourseName();

            model.addRow(new Object[]{tutorName, tutornic, tutorAddress, empNo, coursename});
        }
    }

    private void setDefault() {
        String query = "SELECT*FROM tutor_details";
        getTutorList(query);
        setCourseTableData(query);
    }

    /////////////////////////////////////////////////////////////////////////////
    private void insertData() {

        if (finalCourseChecking()) {

            String name = tfname.getText();
            String nic = tfnic.getText();
            String address = tfadd.getText();
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            String tdate = dateFormat.format(this.date.getDate());
            String selectedCourse = tfDesc1.getSelectedItem().toString();

//            if (!finalCourseChecking()) {
//                return;
//            }
            if (isDuplicateRecord(nic, -1)) {

                return;
            }

            // Split courseName and level from the selected combo box item
            String[] parts = selectedCourse.split(" \\(");
            String courseName = parts[0];
            String courseLevel = parts[1].replace(")", "");

            // Fetch the courseId based on courseName and level
            int courseId = getCourseId(courseName, courseLevel);

            if (courseId == -1) {
                JOptionPane.showMessageDialog(null, "Course not found. Please check the course name and level.");
                return;
            }

            try {
                String sql = "INSERT INTO tutor_details (tutorName, tutorNic, tutorAddress, empDate, courseName, courseId) VALUES ( ?, ?, ?, ?, ?, ?)";
                PreparedStatement pst = conn.prepareStatement(sql);
                pst.setString(1, name);
                pst.setString(2, nic);
                pst.setString(3, address);
                pst.setString(4, tdate);
                pst.setString(5, selectedCourse);// Use the correct column name: tutionFee
                pst.setInt(6, courseId);

                int rowsInserted = pst.executeUpdate();
                if (rowsInserted > 0) {
                    JOptionPane.showMessageDialog(null, "Tutor inserted successfully!");
                    clear();
                    setDefault();
                } else {
                    JOptionPane.showMessageDialog(null, "Insertion failed. No rows affected.");
                }

            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Unable to insert the tutor." + e.getMessage());
                System.out.println("SQL Error: " + e.getMessage());
                e.printStackTrace();
            }
        } else {
            JOptionPane.showMessageDialog(null, "Please fill the all fields");
        }

    }

    /////////////////////////////////////////////////////////////////////////////
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
        tblCDetails1.getColumnModel().getColumn(0).setMinWidth(0);
        tblCDetails1.getColumnModel().getColumn(0).setMaxWidth(0);
        tblCDetails1.getColumnModel().getColumn(0).setWidth(0);
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

    private void deleteData() {
        int selectedRow = tblCDetails1.getSelectedRow();

        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(null, "Please select a student from the table.");
            return;
        }

        int id = ids.get(selectedRow);

        int deleteConfirm = JOptionPane.showConfirmDialog(this, "Are you sure you want to delete this tutor?", "Confirm Delete", JOptionPane.YES_NO_OPTION);
        if (deleteConfirm == JOptionPane.YES_OPTION) {
            try {

                Statement stmt = conn.createStatement();
                stmt.execute("SET FOREIGN_KEY_CHECKS = 0");

//                String updateSql = "UPDATE  tutor_details SET courseId  = NULL WHERE courseId  = ?";
//                PreparedStatement pstUpdate = conn.prepareStatement(updateSql);
//                pstUpdate.setInt(1, id);
//                pstUpdate.executeUpdate();
                String deleteSql = "DELETE FROM  tutor_details WHERE id = ?";
                PreparedStatement pstDelete = conn.prepareStatement(deleteSql);
                pstDelete.setInt(1, id);
                pstDelete.executeUpdate();
                setDefault();

                stmt.execute("SET FOREIGN_KEY_CHECKS = 1");

                JOptionPane.showMessageDialog(null, "Tutor has been deleted successfully.");

                // loadData();
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Error while deleting member: " + e.getMessage(), "Database Error", JOptionPane.ERROR_MESSAGE);
                e.printStackTrace();
            }
        }
    }
////////////////////////////Update Data/////////////////////////////////////////////////

    private void updateData() {
        
        if(finalCourseChecking()){
        int selectedRow = tblCDetails1.getSelectedRow();
//        if (!finalCourseChecking()) {
//            return;
//        }

        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(null, "Please select a tutor from the table.");
            return;
        }

        String name = tfname.getText();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String nic = tfnic.getText();
        String address = tfadd.getText();
        String date = dateFormat.format(this.date.getDate());
        String selectedCourse = tfDesc1.getSelectedItem().toString();

//        Object idObj = tblCDetails1.getValueAt(selectedRow, 0);
//
//        int id = Integer.parseInt(idObj.toString());
        int id = ids.get(selectedRow);

        if (isDuplicateRecord(nic, id)) {
            return;
        }
        try {
            String sql = "UPDATE tutor_details SET tutorName = ?, tutorNic = ?, tutorAddress = ?, empDate = ?, `courseName`= ? WHERE id = ?";
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setString(1, name);
            pst.setString(2, nic);
            pst.setString(3, address);
            pst.setString(4, date);
            pst.setString(5, selectedCourse);
            pst.setInt(6, id);

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

        tfname.setText("");
        lblname.setText("");
        tfnic.setText("");
        lblCNic.setText("");
        date.setDate(null);
        tfadd.setText("");
        lbladd.setText("");
        tfDesc1.setSelectedIndex(0);
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
            case "Tutor Name":
                query = "SELECT * FROM tutor_details WHERE tutorName LIKE ?";
                break;
            case "NIC":
                query = "SELECT * FROM tutor_details WHERE tutorNic LIKE ?";
                break;
            case "Address":
                query = "SELECT * FROM tutor_details WHERE tutorAddress LIKE ?";
                break;
            case "Course":
                query = "SELECT * FROM tutor_details WHERE courseName LIKE ?";
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
                    rs.getString("tutorName"),
                    rs.getString("tutorNic"),
                    rs.getString("tutorAddress"),
                    rs.getString("empDate"),};
                rs.getString("courseName");
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
//

    private void placeHolder() {
        if (tfSearch != null) {
            tfSearch.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "Search");
        }

        if (tfname != null) {
            tfname.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "Please Enter Name With Capital Letter");
        }

        if (tfnic != null) {
            tfnic.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "example : xxxxxxxxxxxxx");
        }

        if (tfadd != null) {
            tfadd.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "Please Enter Address");
        }

    }
//

    private void loadSelectedTutorData() {
        int selectedRow = tblCDetails1.getSelectedRow();
        if (selectedRow != -1) {
            tfname.setText(model.getValueAt(selectedRow, 0).toString());
            tfnic.setText(model.getValueAt(selectedRow, 1).toString());
            tfadd.setText(model.getValueAt(selectedRow, 2).toString());
            // Get date from table and set it on the tBirth JDateChooser
            Object birthDateObj = model.getValueAt(selectedRow, 3);
            if (birthDateObj != null) {
                try {
                    String birthDateStr = birthDateObj.toString(); // Assume it's a string in MM/dd/yyyy
                    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
                    date.setDate(sdf.parse(birthDateStr));
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Invalid birth date format.");
                }
            }
            tfDesc1.setSelectedItem(model.getValueAt(selectedRow, 4));

        } else {
            JOptionPane.showMessageDialog(null, "Please select a tutor from the table.");
        }
    }

    //validation
    private boolean validatetutorName(String tutorName) {
        if (tutorName.isEmpty()) {
            lblname.setText("Tutor Name cannot be empty");
            return false;
        } else if (!Pattern.matches("^([A-Z][a-z]+)(\\s[A-Z][a-z]+)*$", tutorName)) {
            lblname.setText("Invalid Course Name");
            return false;
        }
        lblname.setText("");
        return true;
    }

    private boolean validatetutornic(String tutornic) {
        // Example: Course code must be alphanumeric and non-empty
        if (tutornic == null || tutornic.trim().isEmpty()) {
            lblCNic.setText("Tutor NIC naver cannot be empty.");
            return false;
        }
        if (!Pattern.matches("^(\\d{9}[v]|\\d{12})$", tutornic)) {
            lblCNic.setText("Tutor NIC must be valid.");
            return false;
        }
        lblCNic.setText("");
        return true;
    }

    private boolean validateaddress(String address) {
        // Example: Description must be non-empty and less than 200 characters
        if (address == null || address.trim().isEmpty()) {
            lbladd.setText("Description cannot be empty.");
            return false;
        }
        if (address.length() > 200) {
            lbladd.setText("Address must be less than 200 characters.");
            return false;
        }
        lbladd.setText("");
        return true;
    }

    private boolean finalCourseChecking() {
        String courseCode = tfname.getText().trim();
        String courseName = tfnic.getText().trim();
        String courseDescription = tfadd.getText().trim();

        if (validatetutorName(courseCode) && validatetutornic(courseName)
                && validateaddress(courseDescription)) {
            System.out.println("Ok");
            return true;
        }
        return false;
    }

    private boolean isDuplicateRecord(String nic, int currentId) {
        try {
            // Check for duplicate courseCode
            String querytutorNic = "SELECT COUNT(*) FROM tutor_details WHERE tutorNic = ? AND id != ?";
            PreparedStatement psttutorNic = conn.prepareStatement(querytutorNic);
            psttutorNic.setString(1, nic);
            psttutorNic.setInt(2, currentId);
            ResultSet rstutorNic = psttutorNic.executeQuery();

            if (rstutorNic.next() && rstutorNic.getInt(1) > 0) {
                JOptionPane.showMessageDialog(null, "The tutor NIC already exists. Please use a unique tutor NIC.", "Duplicate tutor NIC", JOptionPane.WARNING_MESSAGE);
                return true;
            }

//            // Check for duplicate courseName and level combination
//            String tutorAddress = "SELECT COUNT(*) FROM tutor_details WHERE tutorName = ? AND tutorAddress = ? AND id != ?";
//            PreparedStatement psttutorNametutorAddress = conn.prepareStatement(tutorAddress);
//            psttutorNametutorAddress.setString(1, tutorName);
//            psttutorNametutorAddress.setString(2, tutorAddress);
//            psttutorNametutorAddress.setInt(3, currentId);
//            ResultSet rstutorNametutorAddress = psttutorNametutorAddress.executeQuery();
//
//            if (rstutorNametutorAddress.next() && rstutorNametutorAddress.getInt(1) > 0) {
//                JOptionPane.showMessageDialog(null, "A tutor with the same name and address already exists. Please use unique details.", "Duplicate tutor Details", JOptionPane.WARNING_MESSAGE);
//                return true;
//            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Database error during validation: " + e.getMessage(), "Database Error", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        }
        return false;
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
    private javax.swing.JLabel jLabel11;
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
    private javax.swing.JLabel lblCNic;
    private javax.swing.JLabel lbladd;
    private javax.swing.JLabel lblname;
    private javax.swing.JComboBox<String> tCombo;
    private javax.swing.JTable tblCDetails1;
    private javax.swing.JComboBox<String> tfDesc1;
    private javax.swing.JTextField tfSearch;
    private javax.swing.JTextField tfadd;
    private javax.swing.JTextField tfname;
    private javax.swing.JTextField tfnic;
    // End of variables declaration//GEN-END:variables
}
