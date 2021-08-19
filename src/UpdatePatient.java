
import java.awt.HeadlessException;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class UpdatePatient extends javax.swing.JFrame {

    public UpdatePatient() {
        initComponents();
        update.setEnabled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        exit = new javax.swing.JButton();
        logout = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        search = new javax.swing.JButton();
        patientid = new javax.swing.JTextField();
        address = new javax.swing.JTextField();
        firstname = new javax.swing.JTextField();
        secondname = new javax.swing.JTextField();
        age = new javax.swing.JTextField();
        gender = new javax.swing.JComboBox();
        jLabel15 = new javax.swing.JLabel();
        status = new javax.swing.JComboBox();
        date = new javax.swing.JTextField();
        aadhaar = new javax.swing.JTextField();
        patienttype = new javax.swing.JComboBox();
        phoneno = new javax.swing.JTextField();
        update = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        searchpatient = new javax.swing.JMenuBar();
        addpatient = new javax.swing.JMenu();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        updatepatient = new javax.swing.JMenu();
        deletepatient = new javax.swing.JMenu();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        spatient = new javax.swing.JMenu();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        viewpatient = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Update Patient");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/exit-btn.png"))); // NOI18N
        exit.setBorder(null);
        exit.setBorderPainted(false);
        exit.setContentAreaFilled(false);
        exit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        exit.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/exit-btn-small.png"))); // NOI18N
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });
        getContentPane().add(exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(1180, 23, -1, 60));

        logout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logout (1) 50x52.png"))); // NOI18N
        logout.setBorder(null);
        logout.setBorderPainted(false);
        logout.setContentAreaFilled(false);
        logout.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        logout.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/LOGOUT (1) 40x42.png"))); // NOI18N
        logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutActionPerformed(evt);
            }
        });
        getContentPane().add(logout, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 20, -1, 60));

        jButton3.setBackground(new java.awt.Color(255, 255, 255));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Home (1).png"))); // NOI18N
        jButton3.setBorder(null);
        jButton3.setBorderPainted(false);
        jButton3.setContentAreaFilled(false);
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Small-Home (1).png"))); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 20, 50, 60));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255, 80));

        jLabel2.setFont(new java.awt.Font("Serif", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 55, 255));
        jLabel2.setText("UPDATE PATIENTS");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel2)
                .addContainerGap(24, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 380, 60));

        jLabel3.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 55, 255));
        jLabel3.setText("Name");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 190, 90, 30));

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 30)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 102, 255));
        jLabel4.setText("Patient ID");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 90, -1, 60));

        jLabel5.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 55, 255));
        jLabel5.setText("Maritial Status");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 290, -1, 30));

        jLabel6.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 55, 255));
        jLabel6.setText("Age");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 240, 80, 30));

        jLabel7.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 55, 255));
        jLabel7.setText("Phone No.");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 390, 105, 30));

        jLabel8.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 55, 255));
        jLabel8.setText("Aadhaar No");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 340, 140, 30));

        jLabel9.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 55, 255));
        jLabel9.setText("Gender");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 240, -1, 30));

        jLabel12.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 55, 255));
        jLabel12.setText("Surname");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 190, -1, 30));

        jLabel13.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 55, 255));
        jLabel13.setText("Address");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 340, 105, 30));

        jLabel14.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 55, 255));
        jLabel14.setText("Patient Type");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 290, 150, 30));

        search.setBackground(new java.awt.Color(255, 255, 255));
        search.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        search.setForeground(new java.awt.Color(0, 55, 255));
        search.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/search.png"))); // NOI18N
        search.setBorder(null);
        search.setBorderPainted(false);
        search.setContentAreaFilled(false);
        search.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        search.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/search-small.png"))); // NOI18N
        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });
        search.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                searchKeyPressed(evt);
            }
        });
        getContentPane().add(search, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 90, 50, 60));

        patientid.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        patientid.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        patientid.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        patientid.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                patientidKeyPressed(evt);
            }
        });
        getContentPane().add(patientid, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 90, 440, 60));

        address.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        address.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        address.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        address.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addressActionPerformed(evt);
            }
        });
        getContentPane().add(address, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 340, 240, 32));

        firstname.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        firstname.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        firstname.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        getContentPane().add(firstname, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 190, 240, 32));

        secondname.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        secondname.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        secondname.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        getContentPane().add(secondname, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 190, 240, 32));

        age.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        age.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        age.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        getContentPane().add(age, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 240, 240, 32));

        gender.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        gender.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select Gender", "Male", "Female", "Other" }));
        gender.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        gender.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        gender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                genderActionPerformed(evt);
            }
        });
        getContentPane().add(gender, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 240, 240, 33));

        jLabel15.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 55, 255));
        jLabel15.setText("Date");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 390, 48, 30));

        status.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        status.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select Maritial Status", "Single", "Married", "Engaged" }));
        status.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        status.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(status, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 290, 240, 33));

        date.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        date.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        date.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        getContentPane().add(date, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 390, 240, 32));

        aadhaar.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        aadhaar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        aadhaar.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        aadhaar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aadhaarActionPerformed(evt);
            }
        });
        getContentPane().add(aadhaar, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 340, 240, 32));

        patienttype.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        patienttype.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select Patient Type", "Indoor Patient", "Outdoor Patient" }));
        patienttype.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        patienttype.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        patienttype.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                patienttypeActionPerformed(evt);
            }
        });
        getContentPane().add(patienttype, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 290, 240, 33));

        phoneno.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        phoneno.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        phoneno.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        phoneno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                phonenoActionPerformed(evt);
            }
        });
        getContentPane().add(phoneno, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 390, 240, 32));

        update.setBackground(new java.awt.Color(0, 51, 255));
        update.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        update.setForeground(java.awt.Color.white);
        update.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/updateuser(2)-small.png"))); // NOI18N
        update.setText(" UPDATE");
        update.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.blue, java.awt.Color.blue));
        update.setContentAreaFilled(false);
        update.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        update.setOpaque(true);
        update.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/UPDATESMALL.png"))); // NOI18N
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });
        getContentPane().add(update, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 480, 170, 50));

        jButton1.setBackground(new java.awt.Color(0, 51, 255));
        jButton1.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        jButton1.setForeground(java.awt.Color.white);
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/clear-btn.png"))); // NOI18N
        jButton1.setText(" CLEAR");
        jButton1.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.blue, java.awt.Color.blue));
        jButton1.setContentAreaFilled(false);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.setOpaque(true);
        jButton1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/clear-btn-small.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 480, 170, 50));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/patientbackground1.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 590));

        addpatient.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        addpatient.setForeground(new java.awt.Color(0, 55, 255));
        addpatient.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/adduser.png"))); // NOI18N
        addpatient.setText("Add Patient");
        addpatient.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        addpatient.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        addpatient.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addpatientMouseClicked(evt);
            }
        });
        addpatient.add(jSeparator1);

        searchpatient.add(addpatient);

        updatepatient.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        updatepatient.setForeground(new java.awt.Color(0, 55, 255));
        updatepatient.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/UPDATESMALL.png"))); // NOI18N
        updatepatient.setText("Update Patient");
        updatepatient.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        updatepatient.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        updatepatient.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                updatepatientMouseClicked(evt);
            }
        });
        searchpatient.add(updatepatient);

        deletepatient.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        deletepatient.setForeground(new java.awt.Color(0, 55, 255));
        deletepatient.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/DELETESMALL.png"))); // NOI18N
        deletepatient.setText("Delete Patient");
        deletepatient.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        deletepatient.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        deletepatient.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deletepatientMouseClicked(evt);
            }
        });
        deletepatient.add(jSeparator3);

        searchpatient.add(deletepatient);

        spatient.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        spatient.setForeground(new java.awt.Color(0, 55, 255));
        spatient.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/search-patient.png"))); // NOI18N
        spatient.setText("Search Patient");
        spatient.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        spatient.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        spatient.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                spatientMouseClicked(evt);
            }
        });
        spatient.add(jSeparator2);

        searchpatient.add(spatient);

        viewpatient.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        viewpatient.setForeground(new java.awt.Color(0, 55, 255));
        viewpatient.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/viewuser-small.png"))); // NOI18N
        viewpatient.setText("View Patient");
        viewpatient.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        viewpatient.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        viewpatient.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                viewpatientMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                viewpatientMouseEntered(evt);
            }
        });
        searchpatient.add(viewpatient);

        setJMenuBar(searchpatient);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void addpatientMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addpatientMouseClicked
        PatientDetails pd = new PatientDetails();
        pd.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_addpatientMouseClicked

    private void deletepatientMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deletepatientMouseClicked
        DeletePatient dp = new DeletePatient();
        dp.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_deletepatientMouseClicked

    private void spatientMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_spatientMouseClicked
        SearchPatient sp = new SearchPatient();
        sp.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_spatientMouseClicked

    private void updatepatientMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updatepatientMouseClicked
        UpdatePatient up = new UpdatePatient();
        up.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_updatepatientMouseClicked

    private void viewpatientMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_viewpatientMouseClicked
        ViewPatient vp = new ViewPatient();
        vp.setVisible(true);
        this.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_viewpatientMouseClicked

    private void viewpatientMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_viewpatientMouseEntered

    }//GEN-LAST:event_viewpatientMouseEntered

    private void addressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addressActionPerformed

    private void genderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_genderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_genderActionPerformed

    private void aadhaarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aadhaarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_aadhaarActionPerformed

    private void patienttypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_patienttypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_patienttypeActionPerformed

    private void phonenoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_phonenoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_phonenoActionPerformed

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/hospitalmanagementsystem?useSSL=false", "root", "");
            PreparedStatement pst = conn.prepareStatement("UPDATE patient SET FirstName=?,SecondName=?,Age=?,MaritialStatus=?,Gender=?,Address=?,Aadhaar=?,PatientType=?,Date=?,PhoneNo=? WHERE P_id=?");
            pst.setString(1, firstname.getText());
            pst.setString(2, secondname.getText());
            pst.setString(3, age.getText());
            pst.setString(4, (String) status.getSelectedItem());
            pst.setString(5, (String) gender.getSelectedItem());
            pst.setString(6, address.getText());
            pst.setString(7, aadhaar.getText());
            pst.setString(8, (String) patienttype.getSelectedItem());
            pst.setString(9, date.getText());
            pst.setString(10, phoneno.getText());

            pst.setString(11, patientid.getText());
            pst.executeUpdate();
            JOptionPane.showMessageDialog(this, "Record Updated Sucessfully");
            patientid.setText(null);
            firstname.setText(null);
            secondname.setText(null);
            age.setText(null);
            address.setText(null);
            aadhaar.setText(null);
            date.setText(null);
            phoneno.setText(null);
            gender.setSelectedIndex(0);
            status.setSelectedIndex(0);
            patienttype.setSelectedIndex(0);
            patientid.setText(null);
            firstname.setText(null);
            secondname.setText(null);
            age.setText(null);
            address.setText(null);
            aadhaar.setText(null);
            date.setText(null);
            phoneno.setText(null);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_updateActionPerformed

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/hospitalmanagementsystem?useSSL=false", "root", "");
            PreparedStatement pst = conn.prepareStatement("select *from patient where P_id=?");
            pst.setString(1, patientid.getText());
            ResultSet rs = pst.executeQuery();

            if (rs.next()) {
                String fname = rs.getString("FirstName");
                firstname.setText(fname);
                String sname = rs.getString("SecondName");
                secondname.setText(sname);
                String age1 = rs.getString("Age");
                age.setText(age1);
                String mstatus = rs.getString("MaritialStatus");
                status.setSelectedItem(mstatus);
                String gen = rs.getString("Gender");
                gender.setSelectedItem(gen);
                String add = rs.getString("Address");
                address.setText(add);
                String AADHAAR = rs.getString("Aadhaar");
                aadhaar.setText(AADHAAR);
                String ptype = rs.getString("PatientType");
                patienttype.setSelectedItem(ptype);
                String datey = rs.getString("Date");
                date.setText(datey);
                String pno = rs.getString("Phoneno");
                phoneno.setText(pno);
            } else {
                JOptionPane.showMessageDialog(null, "No Specific Id Found");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_searchActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        adminpanel ap = new adminpanel();
        ap.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        patientid.setText(null);
        firstname.setText(null);
        secondname.setText(null);
        age.setText(null);
        address.setText(null);
        aadhaar.setText(null);
        date.setText(null);
        phoneno.setText(null);
        gender.setSelectedIndex(0);
        status.setSelectedIndex(0);
        patienttype.setSelectedIndex(0);
        patientid.setText(null);
        firstname.setText(null);
        secondname.setText(null);
        age.setText(null);
        address.setText(null);
        aadhaar.setText(null);
        date.setText(null);
        phoneno.setText(null);
    }//GEN-LAST:event_jButton1ActionPerformed
    private JFrame frame;
    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        frame = new JFrame();
        if (JOptionPane.showConfirmDialog(frame, "Confirm if you want to Exit", "Exit",
                JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION) {
            System.exit(0);
        }
    }//GEN-LAST:event_exitActionPerformed

    private void logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutActionPerformed
        frame = new JFrame();
        if (JOptionPane.showConfirmDialog(frame, "Confirm if you want to Logout", "Logout",
                JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION) {
            Adminlogin al = new Adminlogin();
            this.dispose();
            al.setVisible(true);
        }
    }//GEN-LAST:event_logoutActionPerformed

    private void searchKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchKeyPressed
        update.setEnabled(true);
    }//GEN-LAST:event_searchKeyPressed

    private void patientidKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_patientidKeyPressed

        if (evt.getKeyCode() == KeyEvent.VK_ENTER){
            try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/hospitalmanagementsystem?useSSL=false", "root", "");
            PreparedStatement pst = conn.prepareStatement("select *from patient where P_id=?");
            pst.setString(1, patientid.getText());
            ResultSet rs = pst.executeQuery();

            if (rs.next()) {
                String fname = rs.getString("FirstName");
                firstname.setText(fname);
                String sname = rs.getString("SecondName");
                secondname.setText(sname);
                String age1 = rs.getString("Age");
                age.setText(age1);
                String mstatus = rs.getString("MaritialStatus");
                status.setSelectedItem(mstatus);
                String gen = rs.getString("Gender");
                gender.setSelectedItem(gen);
                String add = rs.getString("Address");
                address.setText(add);
                String AADHAAR = rs.getString("Aadhaar");
                aadhaar.setText(AADHAAR);
                String ptype = rs.getString("PatientType");
                patienttype.setSelectedItem(ptype);
                String datey = rs.getString("Date");
                date.setText(datey);
                String pno = rs.getString("Phoneno");
                phoneno.setText(pno);
            } else {
                JOptionPane.showMessageDialog(null, "No Specific Id Found");
            }
        } catch (ClassNotFoundException | SQLException | HeadlessException e) {
            JOptionPane.showMessageDialog(null, e);
        }
            update.setEnabled(true);
        }
    }//GEN-LAST:event_patientidKeyPressed

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
            java.util.logging.Logger.getLogger(UpdatePatient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UpdatePatient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UpdatePatient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UpdatePatient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UpdatePatient().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField aadhaar;
    private javax.swing.JMenu addpatient;
    private javax.swing.JTextField address;
    private javax.swing.JTextField age;
    private javax.swing.JTextField date;
    private javax.swing.JMenu deletepatient;
    private javax.swing.JButton exit;
    private javax.swing.JTextField firstname;
    private javax.swing.JComboBox gender;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JButton logout;
    private javax.swing.JTextField patientid;
    private javax.swing.JComboBox patienttype;
    private javax.swing.JTextField phoneno;
    private javax.swing.JButton search;
    private javax.swing.JMenuBar searchpatient;
    private javax.swing.JTextField secondname;
    private javax.swing.JMenu spatient;
    private javax.swing.JComboBox status;
    private javax.swing.JButton update;
    private javax.swing.JMenu updatepatient;
    private javax.swing.JMenu viewpatient;
    // End of variables declaration//GEN-END:variables
}
