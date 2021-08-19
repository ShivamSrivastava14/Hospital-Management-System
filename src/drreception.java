import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

public class drreception extends javax.swing.JFrame {

    public drreception() {
        initComponents();
        showTableData();
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(JLabel.CENTER);
        apTable.setDefaultRenderer(String.class, centerRenderer);
        setResizable(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        panel2 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        DRNAME = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        apTable = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton3.setBackground(new java.awt.Color(255, 255, 255));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Back.png"))); // NOI18N
        jButton3.setBorder(null);
        jButton3.setBorderPainted(false);
        jButton3.setContentAreaFilled(false);
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/back-small.png"))); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 60, 50));

        panel2.setBackground(new java.awt.Color(255, 255, 255, 120));

        jLabel13.setFont(new java.awt.Font("Serif", 1, 40)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 55, 255));
        jLabel13.setText("DOCTOR DETAILS");

        jLabel19.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel19MouseClicked(evt);
            }
        });

        jLabel22.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel22MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panel2Layout = new javax.swing.GroupLayout(panel2);
        panel2.setLayout(panel2Layout);
        panel2Layout.setHorizontalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel13)
                .addGap(457, 457, 457)
                .addComponent(jLabel22)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel19)
                .addContainerGap())
        );
        panel2Layout.setVerticalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(panel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel22)
                    .addComponent(jLabel19))
                .addContainerGap(49, Short.MAX_VALUE))
        );

        jPanel1.add(panel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 440, -1));

        jLabel11.setFont(new java.awt.Font("Serif", 1, 40)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 55, 255));
        jLabel11.setText("DOCTOR ID");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 110, -1, 50));

        DRNAME.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        DRNAME.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DRNAMEActionPerformed(evt);
            }
        });
        DRNAME.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                DRNAMEKeyReleased(evt);
            }
        });
        jPanel1.add(DRNAME, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 110, 440, 50));

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 102, 255));
        jButton1.setText("SEARCH");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 110, -1, 50));

        jScrollPane2.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.black, java.awt.Color.black));

        apTable.setFont(new java.awt.Font("Serif", 0, 13)); // NOI18N
        apTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Doctor ID", "Name", "Surname", "Age", "Blood Group", "Gender", "Address", "Aadhaar No", "Marital Status", "City", "Specification", "Phone No", "Joining Date", "Time", "Days"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        apTable.getTableHeader().setResizingAllowed(false);
        apTable.getTableHeader().setReorderingAllowed(false);
        apTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                apTableMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                apTableMouseEntered(evt);
            }
        });
        jScrollPane2.setViewportView(apTable);
        if (apTable.getColumnModel().getColumnCount() > 0) {
            apTable.getColumnModel().getColumn(0).setResizable(false);
            apTable.getColumnModel().getColumn(0).setPreferredWidth(150);
            apTable.getColumnModel().getColumn(1).setResizable(false);
            apTable.getColumnModel().getColumn(1).setPreferredWidth(210);
            apTable.getColumnModel().getColumn(2).setResizable(false);
            apTable.getColumnModel().getColumn(2).setPreferredWidth(210);
            apTable.getColumnModel().getColumn(3).setResizable(false);
            apTable.getColumnModel().getColumn(3).setPreferredWidth(80);
            apTable.getColumnModel().getColumn(4).setResizable(false);
            apTable.getColumnModel().getColumn(4).setPreferredWidth(180);
            apTable.getColumnModel().getColumn(5).setResizable(false);
            apTable.getColumnModel().getColumn(5).setPreferredWidth(110);
            apTable.getColumnModel().getColumn(6).setResizable(false);
            apTable.getColumnModel().getColumn(6).setPreferredWidth(230);
            apTable.getColumnModel().getColumn(7).setResizable(false);
            apTable.getColumnModel().getColumn(7).setPreferredWidth(200);
            apTable.getColumnModel().getColumn(8).setResizable(false);
            apTable.getColumnModel().getColumn(8).setPreferredWidth(180);
            apTable.getColumnModel().getColumn(9).setResizable(false);
            apTable.getColumnModel().getColumn(9).setPreferredWidth(220);
            apTable.getColumnModel().getColumn(10).setResizable(false);
            apTable.getColumnModel().getColumn(10).setPreferredWidth(250);
            apTable.getColumnModel().getColumn(11).setResizable(false);
            apTable.getColumnModel().getColumn(11).setPreferredWidth(180);
            apTable.getColumnModel().getColumn(12).setResizable(false);
            apTable.getColumnModel().getColumn(12).setPreferredWidth(190);
            apTable.getColumnModel().getColumn(13).setResizable(false);
            apTable.getColumnModel().getColumn(13).setPreferredWidth(180);
            apTable.getColumnModel().getColumn(14).setResizable(false);
            apTable.getColumnModel().getColumn(14).setPreferredWidth(150);
        }

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 1240, 390));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/doctor-details-bg.jpg"))); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 630));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents


    private void jLabel19MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel19MouseClicked

    }//GEN-LAST:event_jLabel19MouseClicked

    private void jLabel22MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel22MouseClicked

    }//GEN-LAST:event_jLabel22MouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        ReceptionitActivity ra = new ReceptionitActivity();
        ra.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void DRNAMEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DRNAMEActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DRNAMEActionPerformed

    private void DRNAMEKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_DRNAMEKeyReleased
        DefaultTableModel table = (DefaultTableModel) apTable.getModel();
        String search1 = DRNAME.getText().toLowerCase();
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel>(table);
        apTable.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter(search1));
        showTableData();
    }//GEN-LAST:event_DRNAMEKeyReleased

    private void showTableData() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/hospitalmanagementsystem?useSSL=false", "root", "");
            PreparedStatement pst = conn.prepareStatement("SELECT * FROM hospitalmanagementsystem.doctor");
            ResultSet rs = pst.executeQuery();
            DefaultTableModel tm = (DefaultTableModel) apTable.getModel();
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
            conn.close();
        } catch (Exception e) {
        }
    }
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/hospitalmanagementsystem?useSSL=false", "root", "");
            PreparedStatement pst = conn.prepareStatement("SELECT * FROM hospitalmanagementsystem.doctor where D_id=?");
            pst.setString(1, DRNAME.getText());
            ResultSet rs = pst.executeQuery();
            DefaultTableModel tm = (DefaultTableModel) apTable.getModel();
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
            conn.close();
            showTableData();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void apTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_apTableMouseClicked
        int SelectedRow = apTable.getSelectedRow();
        DefaultTableModel table = (DefaultTableModel) apTable.getModel();
    }//GEN-LAST:event_apTableMouseClicked

    private void apTableMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_apTableMouseEntered
        
    }//GEN-LAST:event_apTableMouseEntered

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
            java.util.logging.Logger.getLogger(drreception.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(drreception.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(drreception.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(drreception.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new drreception().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField DRNAME;
    private javax.swing.JTable apTable;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPanel panel2;
    // End of variables declaration//GEN-END:variables
}
