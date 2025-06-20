package Frames;

import Models.CourseDetails;
import java.sql.Connection;
import Classes.DBConnection;
import com.formdev.flatlaf.FlatClientProperties;
import com.formdev.flatlaf.themes.FlatMacLightLaf;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

public class CourseRegiFrame extends javax.swing.JFrame {

    DefaultTableModel model = new DefaultTableModel(new String[]{"Course Code", "Course Name", "Course Description", "Course Level"}, 0);
    Connection conn = null;
    ArrayList<CourseDetails> temp;
    ArrayList<Integer> ids = new ArrayList<>();

    Connection con = null;
    PreparedStatement pst = null;
    ResultSet r = null;
    
    public CourseRegiFrame() {
        initComponents();
        //setExtendedState(MAXIMIZED_BOTH);
        tblCDetails.setModel(model);
        conn = DBConnection.getInstance().getConnection();
        adjustTableColumnWidths();
        setDefault();
        placeHolder();
        //setExtendedState(MAXIMIZED_BOTH);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        tfCode = new javax.swing.JTextField();
        lblCName = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        tfCName = new javax.swing.JTextField();
        lblCode = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lblCDesc = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        cbCLevel = new javax.swing.JComboBox<>();
        tfDesc = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        btnExit = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        tCombo = new javax.swing.JComboBox<>();
        tfSearch = new javax.swing.JTextField();
        btnSave3 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblCDetails = new javax.swing.JTable();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(0, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(1078, 509));

        jPanel2.setBackground(new java.awt.Color(102, 204, 255));
        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));
        jPanel2.setMinimumSize(new java.awt.Dimension(1066, 79));
        jPanel2.setPreferredSize(new java.awt.Dimension(1066, 79));
        jPanel2.setRequestFocusEnabled(false);

        jLabel1.setBackground(new java.awt.Color(0, 0, 255));
        jLabel1.setFont(new java.awt.Font("Colonna MT", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Course Registration");
        jLabel1.setMinimumSize(new java.awt.Dimension(337, 39));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 920, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(136, Short.MAX_VALUE)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 75, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        jPanel6.setBackground(new java.awt.Color(102, 204, 255));
        jPanel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        jPanel6.setPreferredSize(new java.awt.Dimension(504, 294));

        jLabel2.setFont(new java.awt.Font("Cambria Math", 1, 20)); // NOI18N
        jLabel2.setText("Course Name ");

        tfCode.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tfCode.setEnabled(false);
        tfCode.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                tfCodeCaretUpdate(evt);
            }
        });

        lblCName.setForeground(new java.awt.Color(255, 0, 0));

        jLabel4.setFont(new java.awt.Font("Cambria Math", 1, 20)); // NOI18N
        jLabel4.setText("Course Code");

        tfCName.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tfCName.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                tfCNameCaretUpdate(evt);
            }
        });

        lblCode.setForeground(new java.awt.Color(255, 0, 0));

        jLabel5.setFont(new java.awt.Font("Cambria Math", 1, 20)); // NOI18N
        jLabel5.setText("Course Description");

        lblCDesc.setForeground(new java.awt.Color(255, 0, 0));

        jLabel7.setFont(new java.awt.Font("Cambria Math", 1, 20)); // NOI18N
        jLabel7.setText("Course Level");

        cbCLevel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cbCLevel.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Level", "Level 3", "Level 4", "Level 5", "Level 6", "Level 7" }));
        cbCLevel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbCLevelActionPerformed(evt);
            }
        });

        tfDesc.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                tfDescCaretUpdate(evt);
            }
        });

        jLabel3.setText("Dashboard");
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });

        jLabel6.setText("|  Course Registration");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(tfCName, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel6))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGap(194, 194, 194)
                                .addComponent(lblCode, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(cbCLevel, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblCDesc, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblCName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tfDesc, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tfCode, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tfCName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblCode, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(tfCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblCName, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(cbCLevel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfDesc, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblCDesc, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel6))
                .addContainerGap())
        );

        jPanel10.setBackground(new java.awt.Color(102, 204, 255));
        jPanel10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));

        btnExit.setBackground(new java.awt.Color(0, 255, 255));
        btnExit.setFont(new java.awt.Font("Cambria Math", 1, 16)); // NOI18N
        btnExit.setText("Exit");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        btnReset.setBackground(new java.awt.Color(0, 255, 255));
        btnReset.setFont(new java.awt.Font("Cambria Math", 1, 16)); // NOI18N
        btnReset.setText("Reset");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });

        btnDelete.setBackground(new java.awt.Color(0, 255, 255));
        btnDelete.setFont(new java.awt.Font("Cambria Math", 1, 16)); // NOI18N
        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnUpdate.setBackground(new java.awt.Color(0, 255, 255));
        btnUpdate.setFont(new java.awt.Font("Cambria Math", 1, 16)); // NOI18N
        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnSave.setBackground(new java.awt.Color(0, 255, 255));
        btnSave.setFont(new java.awt.Font("Cambria Math", 1, 16)); // NOI18N
        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addContainerGap(26, Short.MAX_VALUE)
                .addComponent(btnSave)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnUpdate)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnDelete)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnReset)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnExit)
                .addGap(21, 21, 21))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnExit)
                    .addComponent(btnReset)
                    .addComponent(btnDelete)
                    .addComponent(btnUpdate)
                    .addComponent(btnSave))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(102, 204, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        jPanel3.setPreferredSize(new java.awt.Dimension(744, 49));

        tCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Search Type", "Course Code", "Course Name" }));
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

        tblCDetails.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblCDetailsMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tblCDetails);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 466, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 966, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 966, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, 478, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, 309, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(8, 8, 8))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 978, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 512, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        insertData();
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        updateData();
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        deleteData();
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        clear();
    }//GEN-LAST:event_btnResetActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        new Dashboard().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnExitActionPerformed

    private void cbCLevelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbCLevelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbCLevelActionPerformed

    private void tfCNameCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_tfCNameCaretUpdate
        String courseName = tfCName.getText();
        validateCourseName(courseName);
        autoGenerateCourseCode();
    }//GEN-LAST:event_tfCNameCaretUpdate

    private void tfCodeCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_tfCodeCaretUpdate
        String courseCode = tfCode.getText();
        validateCourseCode(courseCode);
        
    }//GEN-LAST:event_tfCodeCaretUpdate

    private void tblCDetailsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblCDetailsMouseClicked
        loadSelectedStudentData();
    }//GEN-LAST:event_tblCDetailsMouseClicked

    private void tfSearchCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_tfSearchCaretUpdate
        searchCourseData();
    }//GEN-LAST:event_tfSearchCaretUpdate

    private void btnSave3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSave3ActionPerformed
        tfSearch.setText("");
        setDefault();
        tCombo.setSelectedIndex(0);
    }//GEN-LAST:event_btnSave3ActionPerformed

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        new Dashboard().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel3MouseClicked

    private void tfDescCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_tfDescCaretUpdate
        String courseName = tfDesc.getText();
        validateDescription(courseName);
    }//GEN-LAST:event_tfDescCaretUpdate

    public static void main(String args[]) {

        FlatMacLightLaf.setup();
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CourseRegiFrame().setVisible(true);
            }
        });
    }

    
    //////corse code generate////////
    
    
    public void autoGenerateCourseCode() {
        String inputText = tfCName.getText();
        String[] words = inputText.split("\\s+");
        String initials = "";

        for (String word : words) {
            if (!word.isEmpty()) {
                initials += word.charAt(0);
            }
        }

        tfCode.setText(initials.toUpperCase());
    }
    
    
    
    
    private void placeHolder() {
        if (tfSearch != null) {
            tfSearch.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "Search");
        }

        if (tfCode != null) {
            tfCode.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "example : 200428102868");
        }

        if (tfCName != null) {
            tfCName.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "Please Enter Name With Capital Letter");
        }

        if (tfDesc != null) {
            tfDesc.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "Please Enter Description");
        }

    }

    // Adjust table columns 
    private void adjustTableColumnWidths() {

        TableColumn column;

        column = tblCDetails.getColumnModel().getColumn(0);
        column.setPreferredWidth(70);

        column = tblCDetails.getColumnModel().getColumn(1);
        column.setPreferredWidth(200);

        column = tblCDetails.getColumnModel().getColumn(2);
        column.setPreferredWidth(70);

        column = tblCDetails.getColumnModel().getColumn(3);
        column.setPreferredWidth(70);
    }

//    private void textAreaOrganize() {
//        JTextArea textArea = new JTextArea();
//        tfDesc.setLineWrap(true);
//        tfDesc.setWrapStyleWord(true);
//
//    }
    //Validation
    private boolean validateCourseCode(String courseCode) {
        // Example: Course code must be alphanumeric and non-empty
        if (courseCode == null || courseCode.trim().isEmpty()) {
            lblCName.setText("Course code never cannot be empty.");
            return false;
        }
        if (!Pattern.matches("[A-Z0-9/]+", courseCode)) {
            lblCName.setText("Course code must be valid.");
            return false;
        }
        lblCName.setText("");
        return true;
    }

    private boolean validateCourseName(String courseName) {
        if (courseName.isEmpty()) {
            lblCode.setText("Course Name cannot be empty");
            return false;
        } else if (!Pattern.matches("^([A-Z][a-z]+)(\\s[A-Z][a-z]+)*$", courseName)) {
            lblCode.setText("Invalid Course Name");
            return false;
        }
        lblCode.setText("");
        return true;
    }

    private boolean validateDescription(String description) {
        // Example: Description must be non-empty and less than 200 characters
        if (description == null || description.trim().isEmpty()) {
            lblCDesc.setText("Description cannot be empty.");
            return false;
        }
        if (description.length() > 200) {
            lblCDesc.setText("Description must be less than 200 characters.");
            return false;
        }
        lblCDesc.setText("");
        return true;
    }

    private boolean validateLevel(String levelStr) {
        if (levelStr == "Select Level" || levelStr.trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Level cannot be empty.");
            return false;
        }
        return true;
    }

    private boolean finalCourseChecking() {
        String courseCode = tfCode.getText().trim();
        String courseName = tfCName.getText().trim();
        String courseDescription = tfDesc.getText().trim();
        String courseLevel = cbCLevel.getSelectedItem().toString().trim();

        if (validateCourseCode(courseCode) && validateCourseName(courseName)
                && validateDescription(courseDescription) && validateLevel(courseLevel)) {
            System.out.println("Ok");
            return true;
        }
        return false;
    }

    //System Operations 
    private ArrayList<CourseDetails> getCourseList(String query) {
        ArrayList<CourseDetails> obj = new ArrayList<>();
        // List to store IDs

        Statement st;
        ResultSet rs;

        try {
            st = conn.createStatement();
            rs = st.executeQuery(query);

            CourseDetails course;
            while (rs.next()) {
                course = new CourseDetails(
                        rs.getInt("courseId"),
                        rs.getString("courseCode"),
                        rs.getString("courseName"),
                        rs.getString("description"),
                        rs.getString("level")
                );
                obj.add(course);
                ids.add(rs.getInt("courseId")); // Store IDs
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
        ArrayList<CourseDetails> temp = getCourseList(query);

        for (CourseDetails course : temp) {
            String courseCode = course.getCourseCode();
            String courseName = course.getCourseName();
            String description = course.getDescription();
            String level = course.getLevel();

            model.addRow(new Object[]{courseCode, courseName, description, level});
        }
    }

    private void setDefault() {
        String query = "SELECT*FROM course";
        getCourseList(query);
        setCourseTableData(query);
    }

    private void insertData() {

        if (finalCourseChecking()) {
            String courseCode = tfCode.getText().trim();
            String courseName = tfCName.getText().trim();
            String courseDescription = tfDesc.getText().trim();
            String courseLevel = cbCLevel.getSelectedItem().toString().trim();

//        if (!finalCourseChecking()) {
//            return;
//        }
               
            if (isDuplicateRecord(courseCode, courseName, courseLevel, -1)) {

                return;
            }

            int insertConfirm = JOptionPane.showConfirmDialog(this, "Are you sure you want to insert this course?", "Confirm Insert", JOptionPane.YES_NO_OPTION);
            if (insertConfirm == JOptionPane.YES_OPTION) {
                try {
                    
                    String qry = "INSERT INTO course (courseCode, courseName, description, level) VALUES (?, ?, ?, ?)";
                    PreparedStatement pst = conn.prepareStatement(qry);
                    pst.setString(1, courseCode);
                    pst.setString(2, courseName);
                    pst.setString(3, courseDescription);
                    pst.setString(4, courseLevel);
                    pst.executeUpdate();

                    JOptionPane.showMessageDialog(null, "Course has been added successfully.");
                    setDefault();
                    clear();

                } catch (SQLException e) {
                    JOptionPane.showMessageDialog(null, "Error while inserting course: " + e.getMessage(), "Database Error", JOptionPane.ERROR_MESSAGE);
                    e.printStackTrace();
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "Please fill the all fields");
        }
    }
   

    // Update data 
    private void updateData() {

        if(finalCourseChecking()){
        int selectedRow = tblCDetails.getSelectedRow();
//        if (!finalCourseChecking()) {
//            return;
//        }

        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(null, "Please select a course from the table.");
            return;
        }

        String courseCode = tfCode.getText().trim();
        String courseName = tfCName.getText().trim();
        String courseDescription = tfDesc.getText().trim();
        String courseLevel = cbCLevel.getSelectedItem().toString().trim();
        int id = ids.get(selectedRow);

        if (!finalCourseChecking()) {
            return;
        }

        if (isDuplicateRecord(courseCode, courseName, courseLevel, id)) {
            return;
        }

        try {
            String sql = "UPDATE course SET courseCode = ?, courseName = ?, description = ?, level = ? WHERE courseId = ?";
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setString(1, courseCode);
            pst.setString(2, courseName);
            pst.setString(3, courseDescription);
            pst.setString(4, courseLevel);
            pst.setInt(5, id);

            pst.executeUpdate();

            JOptionPane.showMessageDialog(null, "Course updated successfully!");
            setDefault();
            clear();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Unable to update the course.");
            System.out.println("Error: " + e.getMessage());
            e.printStackTrace();
        }
        } else {
            JOptionPane.showMessageDialog(null, "Please select the row and load the data");
        }
    }

    //Data load to fields from table
    private void loadSelectedStudentData() {
        int selectedRow = tblCDetails.getSelectedRow();
        if (selectedRow != -1) {
            tfCode.setText(model.getValueAt(selectedRow, 0).toString());
            tfCName.setText(model.getValueAt(selectedRow, 1).toString());
            tfDesc.setText(model.getValueAt(selectedRow, 2).toString());
            cbCLevel.setSelectedItem(tblCDetails.getValueAt(selectedRow, 3).toString());
        } else {
            JOptionPane.showMessageDialog(null, "Please select a student from the table.");
        }
    }

    //Delete data
    private void deleteData() {
        int selectedRow = tblCDetails.getSelectedRow();

        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(null, "Please select a course from the table.");
            return;
        }

        int check = JOptionPane.showConfirmDialog(this, "Do you want to delete this course?", "Confirm Delete", JOptionPane.YES_NO_OPTION);

        if (check == 0) {
            try {
                int id = ids.get(selectedRow);

                // Disable foreign key checks
                Statement stmt = conn.createStatement();
                stmt.execute("SET FOREIGN_KEY_CHECKS = 0");

                // Delete the course
                String sqlDeleteCourse = "DELETE FROM course WHERE courseId = ?";
                PreparedStatement pstDeleteCourse = conn.prepareStatement(sqlDeleteCourse);
                pstDeleteCourse.setInt(1, id);
                pstDeleteCourse.executeUpdate();

                // foreign key checks
                stmt.execute("SET FOREIGN_KEY_CHECKS = 1");

                setDefault();
                clear();
                JOptionPane.showMessageDialog(null, "Course deleted!");

            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Unable to delete the course.");
                System.out.println("Error: " + e.getMessage());
                e.printStackTrace();
            }
        }
    }

    //Clear Fields 
    private void clear() {
        tfCode.setText("");
        tfCName.setText("");
        tfDesc.setText("");
        cbCLevel.setSelectedIndex(0);
        lblCDesc.setText("");
        lblCode.setText("");
        lblCName.setText("");
        tblCDetails.clearSelection();

    }

    private boolean isDuplicateRecord(String courseCode, String courseName, String level, int currentId) {
        try {
            // Check for duplicate courseCode
            String queryCourseCode = "SELECT COUNT(*) FROM course WHERE courseCode = ? AND courseId != ?";
            PreparedStatement pstCourseCode = conn.prepareStatement(queryCourseCode);
            pstCourseCode.setString(1, courseCode);
            pstCourseCode.setInt(2, currentId);
            ResultSet rsCourseCode = pstCourseCode.executeQuery();

            if (rsCourseCode.next() && rsCourseCode.getInt(1) > 0) {
                JOptionPane.showMessageDialog(null, "The course code already exists. Please use a unique course code.", "Duplicate Course Code", JOptionPane.WARNING_MESSAGE);
                return true;
            }

            // Check for duplicate courseName and level combination
            String queryCourseNameLevel = "SELECT COUNT(*) FROM course WHERE courseName = ? AND level = ? AND courseId != ?";
            PreparedStatement pstCourseNameLevel = conn.prepareStatement(queryCourseNameLevel);
            pstCourseNameLevel.setString(1, courseName);
            pstCourseNameLevel.setString(2, level);
            pstCourseNameLevel.setInt(3, currentId);
            ResultSet rsCourseNameLevel = pstCourseNameLevel.executeQuery();

            if (rsCourseNameLevel.next() && rsCourseNameLevel.getInt(1) > 0) {
                JOptionPane.showMessageDialog(null, "A course with the same name and level already exists. Please use unique details.", "Duplicate Course Details", JOptionPane.WARNING_MESSAGE);
                return true;
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Database error during validation: " + e.getMessage(), "Database Error", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        }
        return false;
    }

    private void searchCourseData() {
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
            case "Course Code":
                query = "SELECT * FROM course WHERE courseCode LIKE ?";
                break;
            case "Course Name":
                query = "SELECT * FROM course WHERE courseName LIKE ?";
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
                    rs.getString("courseCode"),
                    rs.getString("courseName"),
                    rs.getString("description"),
                    rs.getString("level"),};
                model.addRow(rowData);
            }

            // Notify if no results are found
            if (model.getRowCount() == 0) {
                // JOptionPane.showMessageDialog(this, "No customers found matching the search criteria.", "Search Result", JOptionPane.INFORMATION_MESSAGE);
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "No tutor found matching the search criteria.", "Search Result", JOptionPane.INFORMATION_MESSAGE);
            e.printStackTrace();
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnSave3;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JComboBox<String> cbCLevel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblCDesc;
    private javax.swing.JLabel lblCName;
    private javax.swing.JLabel lblCode;
    private javax.swing.JComboBox<String> tCombo;
    private javax.swing.JTable tblCDetails;
    private javax.swing.JTextField tfCName;
    private javax.swing.JTextField tfCode;
    private javax.swing.JTextField tfDesc;
    private javax.swing.JTextField tfSearch;
    // End of variables declaration//GEN-END:variables
}
