import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

public class ViewDoctor extends javax.swing.JFrame {

    public ViewDoctor() {
        initComponents();
        showTableData();
        setResizable(false);
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(JLabel.CENTER);
        doctortable.setDefaultRenderer(String.class, centerRenderer);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        doctortable = new javax.swing.JTable();
        jLabel11 = new javax.swing.JLabel();
        search = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        searchdoctMenu = new javax.swing.JMenuBar();
        adddoc = new javax.swing.JMenu();
        deletedoc = new javax.swing.JMenu();
        searchdoc = new javax.swing.JMenu();
        updatedoc = new javax.swing.JMenu();
        viewdoc = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("View Doctor Details");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255, 120));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 51, 255));
        jLabel2.setText("VIEW DOCTORS");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 320, -1));

        jScrollPane2.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));

        doctortable.setFont(new java.awt.Font("Serif", 0, 12)); // NOI18N
        doctortable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Doctor ID", "First Name", "Surname", "Age", "Blood Group", "Gender", "Address", "Aadhaar No.", "Maritialstatus", "City & State", "Specialization", "Phone No"
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
        doctortable.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        doctortable.setSelectionBackground(new java.awt.Color(0, 51, 255));
        doctortable.getTableHeader().setResizingAllowed(false);
        doctortable.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(doctortable);
        if (doctortable.getColumnModel().getColumnCount() > 0) {
            doctortable.getColumnModel().getColumn(0).setResizable(false);
            doctortable.getColumnModel().getColumn(0).setPreferredWidth(100);
            doctortable.getColumnModel().getColumn(1).setResizable(false);
            doctortable.getColumnModel().getColumn(1).setPreferredWidth(180);
            doctortable.getColumnModel().getColumn(2).setResizable(false);
            doctortable.getColumnModel().getColumn(2).setPreferredWidth(180);
            doctortable.getColumnModel().getColumn(3).setResizable(false);
            doctortable.getColumnModel().getColumn(3).setPreferredWidth(150);
            doctortable.getColumnModel().getColumn(4).setResizable(false);
            doctortable.getColumnModel().getColumn(4).setPreferredWidth(150);
            doctortable.getColumnModel().getColumn(5).setResizable(false);
            doctortable.getColumnModel().getColumn(5).setPreferredWidth(150);
            doctortable.getColumnModel().getColumn(6).setResizable(false);
            doctortable.getColumnModel().getColumn(6).setPreferredWidth(210);
            doctortable.getColumnModel().getColumn(7).setResizable(false);
            doctortable.getColumnModel().getColumn(7).setPreferredWidth(210);
            doctortable.getColumnModel().getColumn(8).setResizable(false);
            doctortable.getColumnModel().getColumn(8).setPreferredWidth(150);
            doctortable.getColumnModel().getColumn(9).setResizable(false);
            doctortable.getColumnModel().getColumn(9).setPreferredWidth(220);
            doctortable.getColumnModel().getColumn(10).setResizable(false);
            doctortable.getColumnModel().getColumn(10).setPreferredWidth(220);
            doctortable.getColumnModel().getColumn(11).setResizable(false);
            doctortable.getColumnModel().getColumn(11).setPreferredWidth(150);
        }

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 1230, 340));

        jLabel11.setFont(new java.awt.Font("Serif", 1, 40)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 51, 255));
        jLabel11.setText("Search");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 120, -1, 40));

        search.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.black, java.awt.Color.black));
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
        getContentPane().add(search, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 120, 430, 44));

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
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1180, 40, 60, 60));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/doctor-details-bg.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 600));

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
        searchdoctMenu.add(adddoc);

        deletedoc.setForeground(new java.awt.Color(0, 102, 204));
        deletedoc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/small-delete-doctor.png"))); // NOI18N
        deletedoc.setText("Delete Doctors  ");
        deletedoc.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        deletedoc.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        deletedoc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deletedocMouseClicked(evt);
            }
        });
        searchdoctMenu.add(deletedoc);

        searchdoc.setForeground(new java.awt.Color(0, 102, 204));
        searchdoc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/search-small.png"))); // NOI18N
        searchdoc.setText("Search Doctors  ");
        searchdoc.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        searchdoc.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        searchdoc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                searchdocMouseClicked(evt);
            }
        });
        searchdoctMenu.add(searchdoc);

        updatedoc.setForeground(new java.awt.Color(0, 102, 204));
        updatedoc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/UPDATESMALL.png"))); // NOI18N
        updatedoc.setText("Update Doctors  ");
        updatedoc.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        updatedoc.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        updatedoc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                updatedocMouseClicked(evt);
            }
        });
        searchdoctMenu.add(updatedoc);

        viewdoc.setForeground(new java.awt.Color(0, 102, 204));
        viewdoc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/viewuser-small.png"))); // NOI18N
        viewdoc.setText("View Doctors");
        viewdoc.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        viewdoc.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        viewdoc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                viewdocMouseClicked(evt);
            }
        });
        searchdoctMenu.add(viewdoc);

        setJMenuBar(searchdoctMenu);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        adminpanel ap = new adminpanel();
        ap.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchActionPerformed

    private void searchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchKeyReleased
        DefaultTableModel table = (DefaultTableModel) doctortable.getModel();
        String search1 = search.getText().toLowerCase();
//        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel>(table);
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<>(table);
        doctortable.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter(search1));
    }//GEN-LAST:event_searchKeyReleased

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
        this.dispose();
    }//GEN-LAST:event_viewdocMouseClicked
    public final void showTableData() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/hospitalmanagementsystem?useSSL=false", "root", "")) {
                PreparedStatement pst = conn.prepareStatement("SELECT * FROM hospitalmanagementsystem.doctor");
                ResultSet rs = pst.executeQuery();
                DefaultTableModel tm = (DefaultTableModel) doctortable.getModel();
                tm.setRowCount(0);
                while (rs.next()) {
                    Object o[] = {
                        rs.getString("D_id"),
                        rs.getString("firstname"),
                        rs.getString("secondname"),
                        rs.getString("age"),
                        rs.getString("bloodgroup"),
                        rs.getString("gender"),
                        rs.getString("address"),
                        rs.getString("aadhaar"),
                        rs.getString("maritialstatus"),
                        rs.getString("city"),
                        rs.getString("specialization"),
                        rs.getString("phoneno"),
                        rs.getString("joiningdate"),
                        rs.getString("timing"),
                        rs.getString("days")
                    };
                    tm.addRow(o);
                }
            }
        } 
        catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }

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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewDoctor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new ViewDoctor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu adddoc;
    private javax.swing.JMenu deletedoc;
    private javax.swing.JTable doctortable;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField search;
    private javax.swing.JMenu searchdoc;
    private javax.swing.JMenuBar searchdoctMenu;
    private javax.swing.JMenu updatedoc;
    private javax.swing.JMenu viewdoc;
    // End of variables declaration//GEN-END:variables
}
