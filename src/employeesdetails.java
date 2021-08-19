
import java.awt.event.KeyEvent;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

public class employeesdetails extends javax.swing.JFrame {

    public employeesdetails() {
        initComponents();
        showTableData();
        setResizable(false);
        update.setEnabled(false);
        adddoctor.setEnabled(false);
    }
    String s;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        adddoctor = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        update = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        logout = new javax.swing.JButton();
        exit = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        eid = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        gender = new javax.swing.JComboBox();
        age = new javax.swing.JTextField();
        firstname = new javax.swing.JTextField();
        address = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        aadhaar = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        phoneno = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        city = new javax.swing.JTextField();
        secondname = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        search = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        etype = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Lower Staff Details");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        adddoctor.setBackground(new java.awt.Color(255, 255, 255));
        adddoctor.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        adddoctor.setForeground(new java.awt.Color(0, 102, 204));
        adddoctor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/add-employee.png"))); // NOI18N
        adddoctor.setBorder(null);
        adddoctor.setBorderPainted(false);
        adddoctor.setContentAreaFilled(false);
        adddoctor.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        adddoctor.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/add-employee-small.png"))); // NOI18N
        adddoctor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adddoctorActionPerformed(evt);
            }
        });
        getContentPane().add(adddoctor, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 20, 60, 70));

        jButton4.setBackground(new java.awt.Color(255, 255, 255));
        jButton4.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jButton4.setForeground(new java.awt.Color(0, 102, 204));
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/delete-btn.png"))); // NOI18N
        jButton4.setBorder(null);
        jButton4.setBorderPainted(false);
        jButton4.setContentAreaFilled(false);
        jButton4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton4.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/delete-btn-small.png"))); // NOI18N
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 20, -1, 70));

        update.setBackground(new java.awt.Color(255, 255, 255));
        update.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        update.setForeground(new java.awt.Color(0, 102, 204));
        update.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/updateuser (2).png"))); // NOI18N
        update.setBorder(null);
        update.setBorderPainted(false);
        update.setContentAreaFilled(false);
        update.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        update.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/updateuser(2)-small.png"))); // NOI18N
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });
        getContentPane().add(update, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 20, 60, 70));

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
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 20, 60, 70));

        logout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/LOGOUT (1) 60x63.png"))); // NOI18N
        logout.setBorder(null);
        logout.setBorderPainted(false);
        logout.setContentAreaFilled(false);
        logout.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        logout.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/LOGOUT (1) 50x52.png"))); // NOI18N
        logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutActionPerformed(evt);
            }
        });
        getContentPane().add(logout, new org.netbeans.lib.awtextra.AbsoluteConstraints(1140, 20, -1, 70));

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
        getContentPane().add(exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(1210, 20, -1, 70));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255, 120));

        jLabel2.setFont(new java.awt.Font("Serif", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 51, 255));
        jLabel2.setText("LOWER STAFF DETAILS");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel2)
                .addContainerGap(830, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 1280, 70));

        jLabel4.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 204));
        jLabel4.setText("Staff ID");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, -1, 35));

        eid.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        eid.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                eidKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                eidKeyTyped(evt);
            }
        });
        getContentPane().add(eid, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 170, 240, 30));

        jLabel3.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 204));
        jLabel3.setText("Name");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 170, 60, 30));

        jLabel6.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 204));
        jLabel6.setText("Age");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 210, 105, 30));

        jLabel12.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 204));
        jLabel12.setText("Surname");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 170, 100, 30));

        jLabel9.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 204));
        jLabel9.setText("Gender");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 250, -1, 30));

        jLabel13.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 204));
        jLabel13.setText("Address");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 105, -1));

        gender.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select Gender", "Male", "Female", "Other" }));
        gender.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        gender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                genderActionPerformed(evt);
            }
        });
        getContentPane().add(gender, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 250, 250, 30));

        age.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        getContentPane().add(age, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 210, 250, 30));

        firstname.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        getContentPane().add(firstname, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 170, 250, 30));

        address.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        address.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addressActionPerformed(evt);
            }
        });
        getContentPane().add(address, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 250, 240, 30));

        jLabel8.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 204));
        jLabel8.setText("Aadhaar No.");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 140, 30));

        aadhaar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        aadhaar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aadhaarActionPerformed(evt);
            }
        });
        getContentPane().add(aadhaar, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 210, 240, 30));

        jLabel7.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 204));
        jLabel7.setText("Phone No.");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 210, 105, 30));

        phoneno.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        phoneno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                phonenoActionPerformed(evt);
            }
        });
        getContentPane().add(phoneno, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 210, 250, 30));

        jLabel18.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(0, 0, 204));
        jLabel18.setText("City & State");
        getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 250, 140, 30));

        city.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        city.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cityActionPerformed(evt);
            }
        });
        getContentPane().add(city, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 250, 250, 30));

        secondname.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        getContentPane().add(secondname, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 170, 250, 30));

        jScrollPane1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Employee ID", "First Name", "Surname", "Address", "Aadhaar No.", "Age", "Gender", "City", "Phone No.", "Employee Type"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.getTableHeader().setResizingAllowed(false);
        jTable1.getTableHeader().setReorderingAllowed(false);
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jTable1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTable1KeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(1).setResizable(false);
            jTable1.getColumnModel().getColumn(2).setResizable(false);
            jTable1.getColumnModel().getColumn(3).setResizable(false);
            jTable1.getColumnModel().getColumn(4).setResizable(false);
            jTable1.getColumnModel().getColumn(5).setResizable(false);
            jTable1.getColumnModel().getColumn(6).setResizable(false);
            jTable1.getColumnModel().getColumn(7).setResizable(false);
            jTable1.getColumnModel().getColumn(8).setResizable(false);
            jTable1.getColumnModel().getColumn(9).setResizable(false);
        }

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 340, 1170, 250));

        search.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });
        search.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchKeyReleased(evt);
            }
        });
        getContentPane().add(search, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 110, 320, 40));

        jLabel19.setFont(new java.awt.Font("Serif", 1, 36)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(0, 0, 204));
        jLabel19.setText("Search");
        getContentPane().add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 110, 110, 35));

        jLabel20.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(0, 0, 204));
        jLabel20.setText("Staff Type");
        getContentPane().add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, -1, -1));

        etype.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select Staff Type", "Nurse", "Therapist ", "Medical Assistants", "Pharmacists", "Accountant", "Food Service", "volunteers ", "ward clerks " }));
        etype.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        etype.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                etypeActionPerformed(evt);
            }
        });
        getContentPane().add(etype, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 290, 240, 33));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/back1.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 630));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        adminpanel ap = new adminpanel();
        ap.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void genderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_genderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_genderActionPerformed

    private void addressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addressActionPerformed

    private void aadhaarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aadhaarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_aadhaarActionPerformed

    private void phonenoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_phonenoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_phonenoActionPerformed

    private void cityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cityActionPerformed
    public void showTableData() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/hospitalmanagementsystem?useSSL=false", "root", "");
            PreparedStatement pst = conn.prepareStatement("SELECT * FROM hospitalmanagementsystem.employees");
            ResultSet rs = pst.executeQuery();
            DefaultTableModel tm = (DefaultTableModel) jTable1.getModel();
            tm.setRowCount(0);
            while (rs.next()) {
                Object o[] = {
                    rs.getString("E_id"),
                    rs.getString("firstname"),
                    rs.getString("secondname"),
                    rs.getString("address"),
                    rs.getString("aadhaar"),
                    rs.getString("age"),
                    rs.getString("gender"),
                    rs.getString("city"),
                    rs.getString("phoneno"),
                    rs.getString("emptype"),};
                tm.addRow(o);
            }
            conn.close();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Internal Error");
            System.out.println(e);
        }
    }
    private void adddoctorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adddoctorActionPerformed

        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/hospitalmanagementsystem?useSSL=false", "root", "");
            PreparedStatement pst = conn.prepareStatement("insert into employees"
                    + "(E_id,firstname,secondname,address,aadhaar,age,gender,city,phoneno,emptype)"
                    + " values(?,?,?,?,?,?,?,?,?,?)");
            if (eid.getText().isEmpty() | firstname.getText().isEmpty() | secondname.getText().isEmpty() | age.getText().isEmpty() | gender.getSelectedItem() == "Select Gender" | aadhaar.getText().isEmpty() | phoneno.getText().isEmpty() | address.getText().isEmpty() | city.getText().isEmpty() | etype.getSelectedItem() == "Select Staff Type") {
                JOptionPane.showMessageDialog(this, "Please filled all necessary details!");
            } else {
                pst.setString(1, eid.getText());
                pst.setString(2, firstname.getText());
                pst.setString(3, secondname.getText());
                pst.setString(4, address.getText());
                pst.setString(5, aadhaar.getText());
                pst.setString(6, age.getText());
                pst.setString(7, (String) gender.getSelectedItem());
                pst.setString(8, city.getText());
                pst.setString(9, phoneno.getText());
                pst.setString(10, (String) etype.getSelectedItem());
                pst.executeUpdate();
                JOptionPane.showMessageDialog(this, "Record Inserted Sucessfully");
                showTableData();
                eid.setText(null);
                firstname.setText(null);
                secondname.setText(null);
                address.setText(null);
                aadhaar.setText(null);
                age.setText(null);
                gender.setSelectedIndex(0);
                city.setText(null);
                phoneno.setText(null);
                etype.setSelectedIndex(0);
                adddoctor.setEnabled(false);
                update.setEnabled(false);
            }
        } catch (ClassNotFoundException | SQLException | HeadlessException e) {
            JOptionPane.showMessageDialog(this, "Staff ID is already exists!");
            System.out.println(e);
        }
    }//GEN-LAST:event_adddoctorActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/hospitalmanagementsystem?useSSL=false", "root", "");
            PreparedStatement pst = conn.prepareStatement("delete from employees where E_id =?");
            pst.setString(1, eid.getText());
            DefaultTableModel table = (DefaultTableModel) jTable1.getModel();
            int SelectedRowIndex = jTable1.getSelectedRow();
            table.removeRow(SelectedRowIndex);
            pst.executeUpdate();
            JOptionPane.showMessageDialog(this, "Record Deleted Sucessfully");
            showTableData();
            eid.setText(null);
            firstname.setText(null);
            secondname.setText(null);
            address.setText(null);
            aadhaar.setText(null);
            age.setText(null);
            gender.setSelectedIndex(0);
            city.setText(null);
            phoneno.setText(null);
            etype.setSelectedIndex(0);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Please select a row from table you want to delete!");
            System.out.println(e);
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
        try {
            Class.forName("com.mysql.jdbc.Driver");

            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/hospitalmanagementsystem?useSSL=false", "root", "");
            PreparedStatement pst = conn.prepareStatement("UPDATE employees SET firstname=?,secondname=?,address=?,aadhaar=?,age=?,gender=?,city=?,phoneno=?,emptype=? WHERE E_id=?");

            pst.setString(1, firstname.getText());
            pst.setString(2, secondname.getText());
            pst.setString(3, address.getText());
            pst.setString(4, aadhaar.getText());
            pst.setString(5, age.getText());
            pst.setString(6, (String) gender.getSelectedItem());
            pst.setString(7, city.getText());
            pst.setString(8, phoneno.getText());
            pst.setString(9, (String) etype.getSelectedItem());
            pst.setString(10, eid.getText());

            pst.executeUpdate();
            JOptionPane.showMessageDialog(this, "Record Updated Sucessfully");
            showTableData();
            eid.setText(null);
            firstname.setText(null);
            secondname.setText(null);
            address.setText(null);
            aadhaar.setText(null);
            age.setText(null);
            gender.setSelectedIndex(0);
            city.setText(null);
            phoneno.setText(null);
            etype.setSelectedIndex(0);

            update.setEnabled(false);
            eid.setEditable(true);

        } catch (ClassNotFoundException | SQLException | HeadlessException e) {
            JOptionPane.showMessageDialog(this, "Please select a row from table you want to update!");
            System.out.println(e);
        }
    }//GEN-LAST:event_updateActionPerformed

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchActionPerformed

    private void searchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchKeyReleased
        DefaultTableModel table = (DefaultTableModel) jTable1.getModel();
        String search1 = search.getText().toLowerCase();
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel>(table);
        jTable1.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter(search1));
    }//GEN-LAST:event_searchKeyReleased

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        int SelectedRow = jTable1.getSelectedRow();
        int modelRow = jTable1.convertRowIndexToModel(SelectedRow);
        DefaultTableModel table = (DefaultTableModel) jTable1.getModel();
        eid.setText(table.getValueAt(modelRow, 0).toString());
        firstname.setText(table.getValueAt(modelRow, 1).toString());
        secondname.setText(table.getValueAt(modelRow, 2).toString());

        address.setText(table.getValueAt(modelRow, 3).toString());
        aadhaar.setText(table.getValueAt(modelRow, 4).toString());
        age.setText(table.getValueAt(modelRow, 5).toString());
        gender.setSelectedItem(table.getValueAt(modelRow, 6).toString());
        city.setText(table.getValueAt(modelRow, 7).toString());
        phoneno.setText(table.getValueAt(modelRow, 8).toString());
        etype.setSelectedItem(table.getValueAt(modelRow, 9).toString());

        update.setEnabled(true);
        eid.setEditable(false);
    }//GEN-LAST:event_jTable1MouseClicked

    private void etypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_etypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_etypeActionPerformed
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

    private void eidKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_eidKeyPressed

    }//GEN-LAST:event_eidKeyPressed

    private void eidKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_eidKeyTyped
        adddoctor.setEnabled(true);
    }//GEN-LAST:event_eidKeyTyped

    private void jTable1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTable1KeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_DELETE) {
            try {
                Class.forName("com.mysql.jdbc.Driver");
                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/hospitalmanagementsystem?useSSL=false", "root", "");
                PreparedStatement pst = conn.prepareStatement("delete from employees where E_id =?");
                pst.setString(1, eid.getText());
                DefaultTableModel table = (DefaultTableModel) jTable1.getModel();
                int SelectedRowIndex = jTable1.getSelectedRow();
                table.removeRow(SelectedRowIndex);
                pst.executeUpdate();
                JOptionPane.showMessageDialog(this, "Record Deleted Sucessfully");
                showTableData();
                eid.setText(null);
                firstname.setText(null);
                secondname.setText(null);
                address.setText(null);
                aadhaar.setText(null);
                age.setText(null);
                gender.setSelectedIndex(0);
                city.setText(null);
                phoneno.setText(null);
                etype.setSelectedIndex(0);

            } catch (ClassNotFoundException | SQLException | HeadlessException e) {
                JOptionPane.showMessageDialog(this, "Please select a row from table you want to delete!");
            }
        }
        else if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            int SelectedRow = jTable1.getSelectedRow();
        int modelRow = jTable1.convertRowIndexToModel(SelectedRow);
        DefaultTableModel table = (DefaultTableModel) jTable1.getModel();
        eid.setText(table.getValueAt(modelRow, 0).toString());
        firstname.setText(table.getValueAt(modelRow, 1).toString());
        secondname.setText(table.getValueAt(modelRow, 2).toString());

        address.setText(table.getValueAt(modelRow, 3).toString());
        aadhaar.setText(table.getValueAt(modelRow, 4).toString());
        age.setText(table.getValueAt(modelRow, 5).toString());
        gender.setSelectedItem(table.getValueAt(modelRow, 6).toString());
        city.setText(table.getValueAt(modelRow, 7).toString());
        phoneno.setText(table.getValueAt(modelRow, 8).toString());
        etype.setSelectedItem(table.getValueAt(modelRow, 9).toString());

        update.setEnabled(true);
        }
    }//GEN-LAST:event_jTable1KeyPressed

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
            java.util.logging.Logger.getLogger(employeesdetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(employeesdetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(employeesdetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(employeesdetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new employeesdetails().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField aadhaar;
    private javax.swing.JButton adddoctor;
    private javax.swing.JTextField address;
    private javax.swing.JTextField age;
    private javax.swing.JTextField city;
    private javax.swing.JTextField eid;
    private javax.swing.JComboBox etype;
    private javax.swing.JButton exit;
    private javax.swing.JTextField firstname;
    private javax.swing.JComboBox gender;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton logout;
    private javax.swing.JTextField phoneno;
    private javax.swing.JTextField search;
    private javax.swing.JTextField secondname;
    private javax.swing.JButton update;
    // End of variables declaration//GEN-END:variables

}
