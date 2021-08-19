import java.awt.HeadlessException;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

public class DeleteDoctor extends javax.swing.JFrame {

    public DeleteDoctor() {
        initComponents();
        combo();
        setResizable(false);
        setLocationRelativeTo(null);
        jButton4.setEnabled(false);
    }
    String s;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
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
        jButton4 = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        specialization = new javax.swing.JComboBox();
        jLabel20 = new javax.swing.JLabel();
        timing = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        date = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        docId = new javax.swing.JLabel();
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
        setTitle("Delete Doctor Details");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255, 80));
        jPanel2.setMaximumSize(new java.awt.Dimension(1280, 630));
        jPanel2.setMinimumSize(new java.awt.Dimension(1280, 630));
        jPanel2.setOpaque(false);
        jPanel2.setPreferredSize(new java.awt.Dimension(1280, 630));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel3.setText("First Name");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 140, 105, 35));

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 30)); // NOI18N
        jLabel4.setText("Doctor ID");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 40, -1, 50));

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel5.setText("Blood Group");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 290, -1, 35));

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel6.setText("Age");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 240, 100, 35));

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel7.setText("Phone No.");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 410, 105, 30));

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel8.setText("Aadhaar No.");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 190, 120, 35));

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel9.setText("Gender");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 290, -1, 35));

        jLabel11.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel11.setText("Joining Date");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 410, 120, 30));

        jLabel12.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel12.setText("Surname");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 140, -1, 35));

        jLabel13.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel13.setText("Address");
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 190, 105, 35));

        jLabel14.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel14.setText("Maritial Status");
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 350, 130, 40));

        search.setBackground(new java.awt.Color(255, 255, 255));
        search.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        search.setForeground(new java.awt.Color(0, 102, 204));
        search.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/search.png"))); // NOI18N
        search.setBorder(null);
        search.setBorderPainted(false);
        search.setContentAreaFilled(false);
        search.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/search-small.png"))); // NOI18N
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
        jPanel2.add(search, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 40, 60, 50));

        doctorid.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        doctorid.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        doctorid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                doctoridActionPerformed(evt);
            }
        });
        doctorid.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                doctoridKeyReleased(evt);
            }
        });
        jPanel2.add(doctorid, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 40, 320, 50));

        address.setEditable(false);
        address.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        address.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addressActionPerformed(evt);
            }
        });
        jPanel2.add(address, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 190, 210, 32));

        firstname.setEditable(false);
        firstname.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        jPanel2.add(firstname, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 140, 210, 32));

        secondname.setEditable(false);
        secondname.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        secondname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                secondnameActionPerformed(evt);
            }
        });
        jPanel2.add(secondname, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 140, 210, 32));

        age.setEditable(false);
        age.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        jPanel2.add(age, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 240, 210, 32));

        gender.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select Gender", "Male", "Female", "Other" }));
        gender.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        gender.setEnabled(false);
        gender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                genderActionPerformed(evt);
            }
        });
        jPanel2.add(gender, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 290, 210, 40));

        bloodgroup.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select", "A+", "A-", "B+", "B-" }));
        bloodgroup.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        bloodgroup.setEnabled(false);
        jPanel2.add(bloodgroup, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 290, 210, 40));

        aadhaar.setEditable(false);
        aadhaar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        aadhaar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aadhaarActionPerformed(evt);
            }
        });
        jPanel2.add(aadhaar, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 190, 210, 32));

        status.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select Maritial Status", "Single", "Married" }));
        status.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        status.setEnabled(false);
        status.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                statusActionPerformed(evt);
            }
        });
        jPanel2.add(status, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 350, 210, 40));

        phoneno.setEditable(false);
        phoneno.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        phoneno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                phonenoActionPerformed(evt);
            }
        });
        jPanel2.add(phoneno, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 410, 210, 32));

        joiningdate.setEditable(false);
        joiningdate.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        joiningdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                joiningdateActionPerformed(evt);
            }
        });
        jPanel2.add(joiningdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 410, 210, 32));

        city.setEditable(false);
        city.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        city.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cityActionPerformed(evt);
            }
        });
        jPanel2.add(city, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 240, 210, 32));

        jLabel17.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel17.setText("Password");
        jPanel2.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 510, 105, 30));

        jLabel18.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel18.setText("City");
        jPanel2.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 240, 80, 30));

        doctoruser.setEditable(false);
        doctoruser.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        doctoruser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                doctoruserActionPerformed(evt);
            }
        });
        jPanel2.add(doctoruser, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 510, 210, 32));

        doctorpassword.setEditable(false);
        doctorpassword.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        doctorpassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                doctorpasswordActionPerformed(evt);
            }
        });
        jPanel2.add(doctorpassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 510, 210, 32));

        jLabel19.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel19.setText("Username");
        jPanel2.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 510, 105, 30));

        jButton4.setBackground(new java.awt.Color(0, 51, 255));
        jButton4.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/delete-doctor.png"))); // NOI18N
        jButton4.setText("DELETE");
        jButton4.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 51, 255), new java.awt.Color(0, 51, 255)));
        jButton4.setBorderPainted(false);
        jButton4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton4.setIconTextGap(10);
        jButton4.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/small-delete-doctor.png"))); // NOI18N
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 140, 160, 60));

        jLabel15.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel15.setText("Department");
        jPanel2.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 350, 118, 40));

        specialization.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select Department" }));
        specialization.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        specialization.setEnabled(false);
        specialization.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                specializationActionPerformed(evt);
            }
        });
        jPanel2.add(specialization, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 350, 210, 38));

        jLabel20.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel20.setText("Visit Timing");
        jPanel2.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 460, 105, 30));

        timing.setEditable(false);
        timing.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        timing.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                timingActionPerformed(evt);
            }
        });
        jPanel2.add(timing, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 460, 210, 32));

        jLabel21.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel21.setText("Days");
        jPanel2.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 460, 105, 30));

        date.setEditable(false);
        date.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        date.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dateActionPerformed(evt);
            }
        });
        jPanel2.add(date, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 460, 210, 32));

        jButton3.setBackground(new java.awt.Color(255, 255, 255));
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
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
        jPanel2.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1180, 30, 80, 70));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255, 120));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 102, 204));
        jLabel2.setText("Delete Doctors");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 1, 280, 70));

        jPanel2.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 340, 70));

        docId.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        docId.setForeground(new java.awt.Color(255, 255, 255));
        docId.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel2.add(docId, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 100, 190, 20));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 590));

        jLabel1.setIcon(new javax.swing.ImageIcon("E:\\Hospital Management System\\src\\images\\D3 (1).jpg")); // NOI18N
        jLabel1.setMaximumSize(new java.awt.Dimension(1280, 630));
        jLabel1.setMinimumSize(new java.awt.Dimension(1280, 630));
        jLabel1.setPreferredSize(new java.awt.Dimension(1280, 630));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 590));

        searchdoct.setBackground(new java.awt.Color(255, 255, 255));
        searchdoct.setBorder(null);
        searchdoct.setBorderPainted(false);
        searchdoct.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        adddoc.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        adddoc.setForeground(new java.awt.Color(0, 102, 204));
        adddoc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/adduser.png"))); // NOI18N
        adddoc.setText("Add Doctors ");
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
        deletedoc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/small-delete-doctor.png"))); // NOI18N
        deletedoc.setText("Delete Doctors ");
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
        searchdoc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/search-small.png"))); // NOI18N
        searchdoc.setText("Search Doctors ");
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
        updatedoc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/UPDATESMALL.png"))); // NOI18N
        updatedoc.setText("Update Doctors ");
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
        viewdoc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/viewuser-small.png"))); // NOI18N
        viewdoc.setText("View Doctors ");
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
                String aadhaarNo = rs.getString("aadhaar");
                aadhaar.setText(aadhaarNo);
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
        } catch (ClassNotFoundException | SQLException | HeadlessException e) {
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

        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/hospitalmanagementsystem?useSSL=false", "root", "");
            PreparedStatement pst = conn.prepareStatement("delete from doctor where D_id =?");
            pst.setString(1, doctorid.getText());
            pst.executeUpdate();
            JOptionPane.showMessageDialog(this, "Record Deleted Sucessfully");
            doctorid.setText(null);
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
            timing.setText(null);
            date.setText(null);
            city.setText(null);
            
            jButton4.setEnabled(false);
        } catch (ClassNotFoundException | SQLException | HeadlessException e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void specializationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_specializationActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_specializationActionPerformed

    private void timingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_timingActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_timingActionPerformed

    private void dateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dateActionPerformed

    private void secondnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_secondnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_secondnameActionPerformed

    private void doctoridKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_doctoridKeyReleased

        if (evt.getKeyCode() == KeyEvent.VK_ENTER){
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
                String aadhaarNo = rs.getString("aadhaar");
                aadhaar.setText(aadhaarNo);
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
        } catch (ClassNotFoundException | SQLException | HeadlessException e) {
            JOptionPane.showMessageDialog(null, e);
        }
            jButton4.setEnabled(true);
        }
        
        String PATTERN = "^[0-9]{0,6}$";
        Pattern patt = Pattern.compile(PATTERN);
        Matcher match = patt.matcher(doctorid.getText());
        if(!match.matches()){
            docId.setText("Doctor Id is incorrect!");
        }
        else{
            docId.setText(null);
        }
    }//GEN-LAST:event_doctoridKeyReleased

    private void doctoridActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_doctoridActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_doctoridActionPerformed

    private void searchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchMouseClicked
        jButton4.setEnabled(true);
    }//GEN-LAST:event_searchMouseClicked

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
            java.util.logging.Logger.getLogger(DeleteDoctor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DeleteDoctor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DeleteDoctor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DeleteDoctor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new DeleteDoctor().setVisible(true);
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
    private javax.swing.JLabel docId;
    private javax.swing.JTextField doctorid;
    private javax.swing.JTextField doctorpassword;
    private javax.swing.JTextField doctoruser;
    private javax.swing.JTextField firstname;
    private javax.swing.JComboBox gender;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
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
    private javax.swing.JPanel jPanel2;
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
    private javax.swing.JMenu updatedoc;
    private javax.swing.JMenu viewdoc;
    // End of variables declaration//GEN-END:variables

}
