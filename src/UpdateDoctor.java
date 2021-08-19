
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class UpdateDoctor extends javax.swing.JFrame {

    public UpdateDoctor() {
        initComponents();
        combo();
        setResizable(false);
        update.setEnabled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        search = new javax.swing.JButton();
        doctorid = new javax.swing.JTextField();
        address = new javax.swing.JTextField();
        firstname = new javax.swing.JTextField();
        secondname = new javax.swing.JTextField();
        age = new javax.swing.JTextField();
        gender = new javax.swing.JComboBox();
        bloodgroup = new javax.swing.JComboBox();
        aadhaar = new javax.swing.JTextField();
        status = new javax.swing.JComboBox();
        phoneno = new javax.swing.JTextField();
        joiningdate = new javax.swing.JTextField();
        city = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        doctoruser = new javax.swing.JTextField();
        doctorpassword = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        update = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        specialization = new javax.swing.JComboBox();
        jLabel20 = new javax.swing.JLabel();
        timing = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        date = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        searchdoct = new javax.swing.JMenuBar();
        adddoc = new javax.swing.JMenu();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        deletedoc = new javax.swing.JMenu();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        searchdoc = new javax.swing.JMenu();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        updatedoc = new javax.swing.JMenu();
        viewdoc = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Update Doctor Details");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255, 80));

        jLabel2.setFont(new java.awt.Font("Serif", 1, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 102, 204));
        jLabel2.setText("Update Doctor");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 330, 70));

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
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1191, 40, 50, 60));

        jLabel3.setFont(new java.awt.Font("Serif", 1, 20)); // NOI18N
        jLabel3.setText("First Name");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 190, 120, 35));

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 30)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 102, 255));
        jLabel4.setText("Doctor ID");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 90, -1, 50));

        jLabel5.setFont(new java.awt.Font("Serif", 1, 20)); // NOI18N
        jLabel5.setText("Blood Group");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 390, 120, -1));

        jLabel6.setFont(new java.awt.Font("Serif", 1, 20)); // NOI18N
        jLabel6.setText("Age");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 240, 70, 35));

        jLabel7.setFont(new java.awt.Font("Serif", 1, 20)); // NOI18N
        jLabel7.setText("Phone No.");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 440, 100, 30));

        jLabel8.setFont(new java.awt.Font("Serif", 1, 20)); // NOI18N
        jLabel8.setText("Aadhaar No.");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 240, 120, 35));

        jLabel9.setFont(new java.awt.Font("Serif", 1, 20)); // NOI18N
        jLabel9.setText("Gender");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 290, 80, 35));

        jLabel11.setFont(new java.awt.Font("Serif", 1, 20)); // NOI18N
        jLabel11.setText("Joining Date");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 440, 120, 30));

        jLabel12.setFont(new java.awt.Font("Serif", 1, 20)); // NOI18N
        jLabel12.setText("Second Name");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 190, 130, 35));

        jLabel13.setFont(new java.awt.Font("Serif", 1, 20)); // NOI18N
        jLabel13.setText("Address");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 340, 120, 30));

        jLabel14.setFont(new java.awt.Font("Serif", 1, 20)); // NOI18N
        jLabel14.setText("Maritial Status");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 290, 130, 35));

        search.setBackground(new java.awt.Color(0, 102, 204));
        search.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        search.setForeground(new java.awt.Color(255, 255, 255));
        search.setIcon(new javax.swing.ImageIcon("E:\\Hospital Management System\\src\\images\\search.png")); // NOI18N
        search.setBorder(null);
        search.setBorderPainted(false);
        search.setContentAreaFilled(false);
        search.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        search.setRolloverIcon(new javax.swing.ImageIcon("E:\\Hospital Management System\\src\\images\\search-small.png")); // NOI18N
        search.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                searchMouseClicked(evt);
            }
        });
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
        getContentPane().add(search, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 90, 50, 50));

        doctorid.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        doctorid.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                doctoridKeyPressed(evt);
            }
        });
        getContentPane().add(doctorid, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 90, 380, 50));

        address.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        address.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addressActionPerformed(evt);
            }
        });
        getContentPane().add(address, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 340, 200, 32));

        firstname.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        getContentPane().add(firstname, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 190, 200, 32));

        secondname.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        getContentPane().add(secondname, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 190, 200, 32));

        age.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        getContentPane().add(age, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 240, 200, 32));

        gender.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select Gender", "Male", "Female", "Other" }));
        gender.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        gender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                genderActionPerformed(evt);
            }
        });
        getContentPane().add(gender, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 290, 200, 33));

        bloodgroup.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select", "A+", "A-", "B+", "B-" }));
        bloodgroup.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        bloodgroup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bloodgroupActionPerformed(evt);
            }
        });
        getContentPane().add(bloodgroup, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 390, 200, 33));

        aadhaar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        aadhaar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aadhaarActionPerformed(evt);
            }
        });
        getContentPane().add(aadhaar, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 240, 202, 32));

        status.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select Maritial Status", "Single", "Married" }));
        status.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        status.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                statusActionPerformed(evt);
            }
        });
        getContentPane().add(status, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 290, 200, 33));

        phoneno.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        phoneno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                phonenoActionPerformed(evt);
            }
        });
        getContentPane().add(phoneno, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 440, 203, 32));

        joiningdate.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        joiningdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                joiningdateActionPerformed(evt);
            }
        });
        getContentPane().add(joiningdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 440, 202, 32));

        city.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        city.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cityActionPerformed(evt);
            }
        });
        getContentPane().add(city, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 340, 203, 32));

        jLabel17.setFont(new java.awt.Font("Serif", 1, 20)); // NOI18N
        jLabel17.setText("Password");
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, 100, 30));

        jLabel18.setFont(new java.awt.Font("Serif", 1, 20)); // NOI18N
        jLabel18.setText("City");
        getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 340, 70, 30));

        doctoruser.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        doctoruser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                doctoruserActionPerformed(evt);
            }
        });
        getContentPane().add(doctoruser, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 270, 182, 32));

        doctorpassword.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        doctorpassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                doctorpasswordActionPerformed(evt);
            }
        });
        getContentPane().add(doctorpassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 320, 182, 32));

        jLabel19.setFont(new java.awt.Font("Serif", 1, 20)); // NOI18N
        jLabel19.setText("Username");
        getContentPane().add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, 100, -1));

        update.setBackground(new java.awt.Color(0, 102, 204));
        update.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        update.setForeground(new java.awt.Color(255, 255, 255));
        update.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/update-med-btn.png"))); // NOI18N
        update.setBorder(null);
        update.setBorderPainted(false);
        update.setContentAreaFilled(false);
        update.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        update.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/update-med-btn-small.png"))); // NOI18N
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });
        getContentPane().add(update, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 420, 155, 60));

        jLabel15.setFont(new java.awt.Font("Serif", 1, 20)); // NOI18N
        jLabel15.setText("Department");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 390, 130, -1));

        specialization.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select Department" }));
        specialization.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        getContentPane().add(specialization, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 390, 200, 30));

        jLabel20.setFont(new java.awt.Font("Serif", 1, 20)); // NOI18N
        jLabel20.setText("Visit Timing");
        getContentPane().add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 490, 120, 30));

        timing.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        timing.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                timingActionPerformed(evt);
            }
        });
        getContentPane().add(timing, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 490, 202, 32));

        jLabel21.setFont(new java.awt.Font("Serif", 1, 20)); // NOI18N
        jLabel21.setText("Days");
        getContentPane().add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 490, 80, 30));

        date.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        date.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dateActionPerformed(evt);
            }
        });
        getContentPane().add(date, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 490, 203, 32));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/D3 (1).jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 590));

        adddoc.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        adddoc.setForeground(new java.awt.Color(0, 102, 204));
        adddoc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/adduser.png"))); // NOI18N
        adddoc.setText("Add Doctors  ");
        adddoc.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        adddoc.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        adddoc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                adddocMouseClicked(evt);
            }
        });
        adddoc.add(jSeparator1);

        searchdoct.add(adddoc);

        deletedoc.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        deletedoc.setForeground(new java.awt.Color(0, 102, 204));
        deletedoc.setIcon(new javax.swing.ImageIcon("E:\\Hospital Management System\\src\\images\\small-delete-doctor.png")); // NOI18N
        deletedoc.setText("Delete Doctors  ");
        deletedoc.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        deletedoc.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        deletedoc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deletedocMouseClicked(evt);
            }
        });
        deletedoc.add(jSeparator3);

        searchdoct.add(deletedoc);

        searchdoc.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        searchdoc.setForeground(new java.awt.Color(0, 102, 204));
        searchdoc.setIcon(new javax.swing.ImageIcon("E:\\Hospital Management System\\src\\images\\search-small.png")); // NOI18N
        searchdoc.setText("Search Doctors");
        searchdoc.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        searchdoc.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        searchdoc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                searchdocMouseClicked(evt);
            }
        });
        searchdoc.add(jSeparator2);

        searchdoct.add(searchdoc);

        updatedoc.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        updatedoc.setForeground(new java.awt.Color(0, 102, 204));
        updatedoc.setIcon(new javax.swing.ImageIcon("E:\\Hospital Management System\\src\\images\\UPDATESMALL.png")); // NOI18N
        updatedoc.setText("Update Doctors");
        updatedoc.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        updatedoc.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        updatedoc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                updatedocMouseClicked(evt);
            }
        });
        searchdoct.add(updatedoc);

        viewdoc.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        viewdoc.setForeground(new java.awt.Color(0, 102, 204));
        viewdoc.setIcon(new javax.swing.ImageIcon("E:\\Hospital Management System\\src\\images\\viewuser-small.png")); // NOI18N
        viewdoc.setText("View Doctors");
        viewdoc.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        viewdoc.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        viewdoc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                viewdocMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                viewdocMouseEntered(evt);
            }
        });
        searchdoct.add(viewdoc);

        setJMenuBar(searchdoct);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void adddocMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_adddocMouseClicked
        DoctorDetails dd = new DoctorDetails();
        dd.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_adddocMouseClicked

    private void deletedocMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deletedocMouseClicked
        DeleteDoctor dd1 = new DeleteDoctor();
        dd1.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_deletedocMouseClicked

    private void searchdocMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchdocMouseClicked
        SearchDoctor sd = new SearchDoctor();
        sd.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_searchdocMouseClicked

    private void updatedocMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updatedocMouseClicked
        UpdateDoctor ud = new UpdateDoctor();
        ud.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_updatedocMouseClicked

    private void viewdocMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_viewdocMouseClicked
        ViewDoctor vp = new ViewDoctor();
        vp.setVisible(true);
        this.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_viewdocMouseClicked

    private void viewdocMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_viewdocMouseEntered

    }//GEN-LAST:event_viewdocMouseEntered

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        adminpanel ap = new adminpanel();
        ap.setVisible(true);
        this.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void addressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addressActionPerformed

    private void genderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_genderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_genderActionPerformed

    private void aadhaarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aadhaarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_aadhaarActionPerformed

    private void statusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_statusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_statusActionPerformed

    private void phonenoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_phonenoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_phonenoActionPerformed

    private void joiningdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_joiningdateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_joiningdateActionPerformed

    private void cityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cityActionPerformed

    private void doctoruserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_doctoruserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_doctoruserActionPerformed

    private void doctorpasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_doctorpasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_doctorpasswordActionPerformed

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/hospitalmanagementsystem?useSSL=false", "root", "");
            PreparedStatement pst = conn.prepareStatement("select *from doctor where D_id=?");
            pst.setString(1, doctorid.getText());
            ResultSet rs = pst.executeQuery();

            if (rs.next()) {
                String fname = rs.getString("firstname");
                firstname.setText(fname);
                String sname = rs.getString("secondname");
                secondname.setText(sname);
                String age1 = rs.getString("age");
                age.setText(age1);
                String mstatus = rs.getString("maritialstatus");
                status.setSelectedItem(mstatus);
                String gen = rs.getString("gender");
                gender.setSelectedItem(gen);
                String add = rs.getString("address");
                address.setText(add);
                String AADHAAR = rs.getString("aadhaar");
                aadhaar.setText(AADHAAR);
                String bg = rs.getString("bloodgroup");
                bloodgroup.setSelectedItem(bg);
                String jdatey = rs.getString("joiningdate");
                joiningdate.setText(jdatey);
                String pno = rs.getString("phoneno");
                phoneno.setText(pno);
                String cty = rs.getString("city");
                city.setText(cty);
                String duser = rs.getString("username");
                doctoruser.setText(duser);
                String dpass = rs.getString("password");
                doctorpassword.setText(dpass);
                String sp = rs.getString("specialization");
                specialization.setSelectedItem(sp);
                String ti = rs.getString("timing");
                timing.setText(ti);
                String da = rs.getString("days");
                date.setText(da);
            } else {
                JOptionPane.showMessageDialog(null, "No Specific Id Found");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_searchActionPerformed
    private void combo() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/hospitalmanagementsystem?useSSL=false", "root", "");

            PreparedStatement pst = conn.prepareStatement("SELECT * FROM hospitalmanagementsystem.department");
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                specialization.addItem(rs.getString("departmentname"));
            }

            pst.execute();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }
    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/hospitalmanagementsystem?useSSL=false", "root", "");
            PreparedStatement pst = conn.prepareStatement("UPDATE doctor SET firstname=?,secondname=?,age=?,maritialstatus=?,gender=?,address=?,aadhaar=?,bloodgroup=?,joiningdate=?,phoneno=?,city=?,username=?,password=?,specialization=?,timing=?,days=? WHERE D_id=?");

            pst.setString(1, firstname.getText());
            pst.setString(2, secondname.getText());
            pst.setString(3, age.getText());
            pst.setString(4, (String) status.getSelectedItem());
            pst.setString(5, (String) gender.getSelectedItem());
            pst.setString(6, address.getText());
            pst.setString(7, aadhaar.getText());
            pst.setString(8, (String) bloodgroup.getSelectedItem());
            pst.setString(9, joiningdate.getText());
            pst.setString(10, phoneno.getText());
            pst.setString(11, city.getText());
            pst.setString(12, doctoruser.getText());
            pst.setString(13, doctorpassword.getText());
            pst.setString(14, (String) specialization.getSelectedItem());
            pst.setString(15, timing.getText());
            pst.setString(16, date.getText());
            pst.setString(17, doctorid.getText());
            pst.executeUpdate();
            JOptionPane.showMessageDialog(this, "Record Updated Sucessfully");
            doctorid.setText(null);
            firstname.setText(null);
            secondname.setText(null);
            age.setText(null);
            address.setText(null);
            aadhaar.setText(null);
            specialization.setSelectedIndex(0);
            phoneno.setText(null);
            joiningdate.setText(null);
            gender.setSelectedIndex(0);
            bloodgroup.setSelectedIndex(0);
            status.setSelectedIndex(0);
            doctoruser.setText(null);
            doctorpassword.setText(null);
            city.setText(null);
            timing.setText(null);
            date.setText(null);

            /* Update button is disable after updation of records.*/
            update.setEnabled(false);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_updateActionPerformed

    private void timingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_timingActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_timingActionPerformed

    private void dateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dateActionPerformed

    private void bloodgroupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bloodgroupActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bloodgroupActionPerformed

    private void searchKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchKeyPressed

    private void searchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchMouseClicked
        // TODO add your handling code here:
        update.setEnabled(true);
    }//GEN-LAST:event_searchMouseClicked

    private void doctoridKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_doctoridKeyPressed

        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            try {
                Class.forName("com.mysql.jdbc.Driver");
                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/hospitalmanagementsystem?useSSL=false", "root", "");
                PreparedStatement pst = conn.prepareStatement("select *from doctor where D_id=?");
                pst.setString(1, doctorid.getText());
                ResultSet rs = pst.executeQuery();

                if (rs.next()) {
                    String fname = rs.getString("firstname");
                    firstname.setText(fname);
                    String sname = rs.getString("secondname");
                    secondname.setText(sname);
                    String age1 = rs.getString("age");
                    age.setText(age1);
                    String mstatus = rs.getString("maritialstatus");
                    status.setSelectedItem(mstatus);
                    String gen = rs.getString("gender");
                    gender.setSelectedItem(gen);
                    String add = rs.getString("address");
                    address.setText(add);
                    String AADHAAR = rs.getString("aadhaar");
                    aadhaar.setText(AADHAAR);
                    String bg = rs.getString("bloodgroup");
                    bloodgroup.setSelectedItem(bg);
                    String jdatey = rs.getString("joiningdate");
                    joiningdate.setText(jdatey);
                    String pno = rs.getString("phoneno");
                    phoneno.setText(pno);
                    String cty = rs.getString("city");
                    city.setText(cty);
                    String duser = rs.getString("username");
                    doctoruser.setText(duser);
                    String dpass = rs.getString("password");
                    doctorpassword.setText(dpass);
                    String sp = rs.getString("specialization");
                    specialization.setSelectedItem(sp);
                    String ti = rs.getString("timing");
                    timing.setText(ti);
                    String da = rs.getString("days");
                    date.setText(da);
                } else {
                    JOptionPane.showMessageDialog(null, "No Specific Id Found");
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
            update.setEnabled(true);
        }
    }//GEN-LAST:event_doctoridKeyPressed

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
            java.util.logging.Logger.getLogger(UpdateDoctor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UpdateDoctor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UpdateDoctor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UpdateDoctor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UpdateDoctor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField aadhaar;
    private javax.swing.JMenu adddoc;
    private javax.swing.JTextField address;
    private javax.swing.JTextField age;
    private javax.swing.JComboBox bloodgroup;
    private javax.swing.JTextField city;
    private javax.swing.JTextField date;
    private javax.swing.JMenu deletedoc;
    private javax.swing.JTextField doctorid;
    private javax.swing.JTextField doctorpassword;
    private javax.swing.JTextField doctoruser;
    private javax.swing.JTextField firstname;
    private javax.swing.JComboBox gender;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
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
    private javax.swing.JTextField joiningdate;
    private javax.swing.JTextField phoneno;
    private javax.swing.JButton search;
    private javax.swing.JMenu searchdoc;
    private javax.swing.JMenuBar searchdoct;
    private javax.swing.JTextField secondname;
    private javax.swing.JComboBox specialization;
    private javax.swing.JComboBox status;
    private javax.swing.JTextField timing;
    private javax.swing.JButton update;
    private javax.swing.JMenu updatedoc;
    private javax.swing.JMenu viewdoc;
    // End of variables declaration//GEN-END:variables

}
