import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

public class ViewPatient extends javax.swing.JFrame {

    public ViewPatient() {
        initComponents();
        showTableData();
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(JLabel.CENTER);
        patienttable.setDefaultRenderer(String.class, centerRenderer);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton3 = new javax.swing.JButton();
        logout = new javax.swing.JButton();
        exit = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        search = new javax.swing.JTextField();
        searchMessage = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        patienttable = new javax.swing.JTable();
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
        setTitle("View Patient");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 30, 50, 70));

        logout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/LOGOUT (1) 50x52.png"))); // NOI18N
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
        getContentPane().add(logout, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 30, 60, 70));

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
        getContentPane().add(exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(1190, 30, 60, 70));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255,120));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Serif", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 55, 255));
        jLabel2.setText("VIEW PATIENTS");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 0, 300, 70));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 340, 70));

        jLabel11.setFont(new java.awt.Font("Serif", 1, 40)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 55, 255));
        jLabel11.setText("Search");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 120, 140, 50));

        search.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        search.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
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
        getContentPane().add(search, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 120, 430, 47));

        searchMessage.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        searchMessage.setForeground(java.awt.Color.red);
        getContentPane().add(searchMessage, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 170, 280, 30));

        jScrollPane1.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.black, java.awt.Color.black));

        patienttable.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        patienttable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Patient Id", "First Name", "Surname", "Age", "Marital Status", "Gender", "Address", "Aadhaar No.", "Patient Type", "Date", "Phone No", "Bed No"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        patienttable.setEnabled(false);
        patienttable.getTableHeader().setResizingAllowed(false);
        patienttable.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(patienttable);
        if (patienttable.getColumnModel().getColumnCount() > 0) {
            patienttable.getColumnModel().getColumn(0).setResizable(false);
            patienttable.getColumnModel().getColumn(0).setPreferredWidth(150);
            patienttable.getColumnModel().getColumn(1).setResizable(false);
            patienttable.getColumnModel().getColumn(1).setPreferredWidth(180);
            patienttable.getColumnModel().getColumn(2).setResizable(false);
            patienttable.getColumnModel().getColumn(2).setPreferredWidth(180);
            patienttable.getColumnModel().getColumn(3).setResizable(false);
            patienttable.getColumnModel().getColumn(3).setPreferredWidth(80);
            patienttable.getColumnModel().getColumn(4).setResizable(false);
            patienttable.getColumnModel().getColumn(4).setPreferredWidth(140);
            patienttable.getColumnModel().getColumn(5).setResizable(false);
            patienttable.getColumnModel().getColumn(5).setPreferredWidth(140);
            patienttable.getColumnModel().getColumn(6).setResizable(false);
            patienttable.getColumnModel().getColumn(6).setPreferredWidth(220);
            patienttable.getColumnModel().getColumn(7).setResizable(false);
            patienttable.getColumnModel().getColumn(7).setPreferredWidth(210);
            patienttable.getColumnModel().getColumn(8).setResizable(false);
            patienttable.getColumnModel().getColumn(8).setPreferredWidth(180);
            patienttable.getColumnModel().getColumn(9).setResizable(false);
            patienttable.getColumnModel().getColumn(9).setPreferredWidth(140);
            patienttable.getColumnModel().getColumn(10).setResizable(false);
            patienttable.getColumnModel().getColumn(10).setPreferredWidth(150);
            patienttable.getColumnModel().getColumn(11).setResizable(false);
            patienttable.getColumnModel().getColumn(11).setPreferredWidth(80);
        }

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 1220, 340));

        jLabel1.setIcon(new javax.swing.ImageIcon("E:\\Hospital Management System\\src\\images\\backgroundpatiennt.png")); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 610));

        searchpatient.setBackground(new java.awt.Color(255, 255, 255));

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
        spatient.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/search-small.png"))); // NOI18N
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

        setSize(new java.awt.Dimension(1296, 669));
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
        this.dispose();
    }//GEN-LAST:event_viewpatientMouseClicked

    private void viewpatientMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_viewpatientMouseEntered

    }//GEN-LAST:event_viewpatientMouseEntered
    public final void showTableData() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/hospitalmanagementsystem?useSSL=false", "root", "")) {
                PreparedStatement pst = conn.prepareStatement("SELECT * FROM hospitalmanagementsystem.patient");
                ResultSet rs = pst.executeQuery();
                DefaultTableModel tm = (DefaultTableModel) patienttable.getModel();
                tm.setRowCount(0);
                while (rs.next()) {
                    Object o[] = {
                        rs.getString("P_id"),
                        rs.getString("FirstName"),
                        rs.getString("SecondName"),
                        rs.getString("Age"),
                        rs.getString("MaritialStatus"),
                        rs.getString("Gender"),
                        rs.getString("Address"),
                        rs.getString("Aadhaar"),
                        rs.getString("PatientType"),
                        rs.getString("Date"),
                        rs.getString("PhoneNo"),
                        rs.getString("BedNo")
                    };
                    tm.addRow(o);
                }
            }
        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        adminpanel ap = new adminpanel();
        ap.setVisible(true);
        this.dispose();

    }//GEN-LAST:event_jButton3ActionPerformed

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchActionPerformed

    private void searchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchKeyReleased
        DefaultTableModel table = (DefaultTableModel) patienttable.getModel();
        String search1 = search.getText().toLowerCase();
//        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel>(table);
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<>(table);
        patienttable.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter(search1));

        String PATTERN = "^[0-9]{0,5}$";
        Pattern patt = Pattern.compile(PATTERN);
        Matcher match = patt.matcher(search.getText());
        if (!match.matches()) {
            searchMessage.setText("Patient Id is incorrect!");
        } else {
            searchMessage.setText(null);
        }

    }//GEN-LAST:event_searchKeyReleased
    private JFrame frame;
    private void logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutActionPerformed
        frame = new JFrame();
        if (JOptionPane.showConfirmDialog(frame, "Confirm if you want to Logout", "Logout",
                JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION) {
            Adminlogin al = new Adminlogin();
            this.dispose();
            al.setVisible(true);
        }
    }//GEN-LAST:event_logoutActionPerformed

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        frame = new JFrame();
        if (JOptionPane.showConfirmDialog(frame, "Confirm if you want to Exit", "Exit",
                JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION) {
            System.exit(0);
        }
    }//GEN-LAST:event_exitActionPerformed

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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewPatient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new ViewPatient().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu addpatient;
    private javax.swing.JMenu deletepatient;
    private javax.swing.JButton exit;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JButton logout;
    private javax.swing.JTable patienttable;
    private javax.swing.JTextField search;
    private javax.swing.JLabel searchMessage;
    private javax.swing.JMenuBar searchpatient;
    private javax.swing.JMenu spatient;
    private javax.swing.JMenu updatepatient;
    private javax.swing.JMenu viewpatient;
    // End of variables declaration//GEN-END:variables
}
