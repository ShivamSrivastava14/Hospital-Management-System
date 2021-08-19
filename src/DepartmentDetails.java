import java.awt.HeadlessException;
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

public class DepartmentDetails extends javax.swing.JFrame {

    public DepartmentDetails() {
        initComponents();
        showTableData();
        setResizable(false);
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(JLabel.CENTER);
        depttable.setDefaultRenderer(String.class, centerRenderer);
        adddept.setEnabled(false);
        updatedept.setEnabled(false);
        dno.setEditable(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton7 = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        depttable = new javax.swing.JTable();
        adddept = new javax.swing.JButton();
        updatedept = new javax.swing.JButton();
        deldept = new javax.swing.JButton();
        ddiscription = new javax.swing.JTextField();
        dname = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        dno = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        search = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Department Section");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton7.setBackground(new java.awt.Color(255, 255, 255));
        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Home (1).png"))); // NOI18N
        jButton7.setBorder(null);
        jButton7.setBorderPainted(false);
        jButton7.setContentAreaFilled(false);
        jButton7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton7.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Small-Home (1).png"))); // NOI18N
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(1167, 30, 60, 60));

        jPanel6.setBackground(new java.awt.Color(255, 255, 255, 120));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Serif", 1, 36)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 55, 255));
        jLabel7.setText("DEPARTMENT SECTION");
        jPanel6.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, -1, 60));

        getContentPane().add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 480, 60));

        jScrollPane1.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.black, java.awt.Color.black));

        depttable.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        depttable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Department No", "Department Name", "Department Discription"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        depttable.getTableHeader().setResizingAllowed(false);
        depttable.getTableHeader().setReorderingAllowed(false);
        depttable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                depttableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(depttable);
        if (depttable.getColumnModel().getColumnCount() > 0) {
            depttable.getColumnModel().getColumn(0).setResizable(false);
            depttable.getColumnModel().getColumn(0).setPreferredWidth(60);
            depttable.getColumnModel().getColumn(1).setResizable(false);
            depttable.getColumnModel().getColumn(1).setPreferredWidth(80);
            depttable.getColumnModel().getColumn(2).setResizable(false);
            depttable.getColumnModel().getColumn(2).setPreferredWidth(210);
        }

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 260, 480, 190));

        adddept.setBackground(new java.awt.Color(0, 55, 255));
        adddept.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        adddept.setForeground(new java.awt.Color(255, 255, 255));
        adddept.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/add-employee.png"))); // NOI18N
        adddept.setText(" ADD");
        adddept.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.blue, java.awt.Color.blue));
        adddept.setContentAreaFilled(false);
        adddept.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        adddept.setOpaque(true);
        adddept.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/add-employee-small.png"))); // NOI18N
        adddept.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adddeptActionPerformed(evt);
            }
        });
        adddept.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                adddeptKeyPressed(evt);
            }
        });
        getContentPane().add(adddept, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 500, 170, 60));

        updatedept.setBackground(new java.awt.Color(0, 55, 255));
        updatedept.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        updatedept.setForeground(new java.awt.Color(255, 255, 255));
        updatedept.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/updateuser (2).png"))); // NOI18N
        updatedept.setText(" UPDATE ");
        updatedept.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.blue, java.awt.Color.blue));
        updatedept.setContentAreaFilled(false);
        updatedept.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        updatedept.setOpaque(true);
        updatedept.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/UPDATESMALL.png"))); // NOI18N
        updatedept.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updatedeptActionPerformed(evt);
            }
        });
        getContentPane().add(updatedept, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 500, 180, 60));

        deldept.setBackground(new java.awt.Color(0, 55, 255));
        deldept.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        deldept.setForeground(new java.awt.Color(255, 255, 255));
        deldept.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/delete-btn.png"))); // NOI18N
        deldept.setText(" DELETE ");
        deldept.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.blue, java.awt.Color.blue));
        deldept.setContentAreaFilled(false);
        deldept.setOpaque(true);
        deldept.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/delete-btn-small.png"))); // NOI18N
        deldept.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deldeptActionPerformed(evt);
            }
        });
        getContentPane().add(deldept, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 500, 180, 60));

        ddiscription.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        ddiscription.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.black, java.awt.Color.black));
        getContentPane().add(ddiscription, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 410, 310, 40));

        dname.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        dname.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.black, java.awt.Color.black));
        getContentPane().add(dname, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 340, 310, 40));

        jLabel8.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 55, 255));
        jLabel8.setText("Department Name");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 340, -1, 40));

        jLabel9.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 55, 255));
        jLabel9.setText("Department Discription");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 410, -1, 40));

        jLabel10.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 55, 255));
        jLabel10.setText("Department No.");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 260, -1, 40));

        dno.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        dno.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.black, java.awt.Color.black));
        dno.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                dnoKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                dnoKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                dnoKeyTyped(evt);
            }
        });
        getContentPane().add(dno, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 260, 310, 40));

        jLabel11.setFont(new java.awt.Font("Serif", 1, 40)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 55, 255));
        jLabel11.setText("Search");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 140, -1, 60));

        search.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
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
        getContentPane().add(search, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 140, 440, 60));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/appointment.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 630));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        adminpanel ap = new adminpanel();
        ap.setVisible(true);
        this.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton7ActionPerformed

    private void adddeptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adddeptActionPerformed
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/hospitalmanagementsystem?useSSL=false", "root", "");
            PreparedStatement pst = conn.prepareStatement("insert into department" + "(D_no,departmentname,departmentdiscription)" + " values(?,?,?)");
            pst.setString(1, dno.getText());
            pst.setString(2, dname.getText());
            pst.setString(3, ddiscription.getText());
            
            if (dno.getText().isEmpty() | dname.getText().isEmpty() | ddiscription.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Please filled all necessary details!");
            } 
            else {
//                pst.executeUpdate();
                pst.execute();
                JOptionPane.showMessageDialog(this, "Record Inserted Sucessfully");
                showTableData();
                dno.setText(null);
                dname.setText(null);
                ddiscription.setText(null);
            }
        } 
        catch (ClassNotFoundException | SQLException | HeadlessException e) {
            JOptionPane.showMessageDialog(this, "Duplicate entry is not allowed!");
            System.out.println(e);
        }


    }//GEN-LAST:event_adddeptActionPerformed

    private void deldeptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deldeptActionPerformed
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/hospitalmanagementsystem?useSSL=false", "root", "");
            PreparedStatement pst = conn.prepareStatement("delete from department where D_no =?");
            pst.setString(1, dno.getText());
            DefaultTableModel table = (DefaultTableModel) depttable.getModel();
            int SelectedRowIndex = depttable.getSelectedRow();
            table.removeRow(SelectedRowIndex);
            pst.executeUpdate();
            JOptionPane.showMessageDialog(this, "Record Deleted Sucessfully");
            showTableData();
            dno.setText(null);
            dname.setText(null);
            ddiscription.setText(null);
        } catch (ClassNotFoundException | SQLException | HeadlessException e) {
            JOptionPane.showMessageDialog(this, "Please select a row you want to delete!");
            System.out.println(e);
        }
    }//GEN-LAST:event_deldeptActionPerformed

    private void updatedeptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updatedeptActionPerformed
        try {
            Class.forName("com.mysql.jdbc.Driver");

            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/hospitalmanagementsystem?useSSL=false", "root", "");
            PreparedStatement pst = conn.prepareStatement("UPDATE department SET departmentname=?,departmentdiscription=? WHERE D_no=?");

            pst.setString(1, dname.getText());
            pst.setString(2, ddiscription.getText());
            pst.setString(3, dno.getText());
            pst.executeUpdate();
            JOptionPane.showMessageDialog(this, "Record Updated Sucessfully");
            showTableData();
            dno.setText(null);
            dname.setText(null);
            ddiscription.setText(null);

            updatedept.setEnabled(false);
            dno.setEditable(true);
        } catch (ClassNotFoundException | SQLException | HeadlessException e) {
            JOptionPane.showMessageDialog(this, "Server Error");
            System.out.println(e);
        }
    }//GEN-LAST:event_updatedeptActionPerformed

    private void searchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchKeyReleased
        DefaultTableModel table = (DefaultTableModel) depttable.getModel();
        String search1 = search.getText().toLowerCase();
//        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel>(table);
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<>(table);
        depttable.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter(search1));

    }//GEN-LAST:event_searchKeyReleased

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchActionPerformed

    private void depttableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_depttableMouseClicked
        int SelectedRow = depttable.getSelectedRow();
        int modelRow = depttable.convertRowIndexToModel(SelectedRow);
        DefaultTableModel table = (DefaultTableModel) depttable.getModel();
        dno.setText(table.getValueAt(modelRow, 0).toString());
        dname.setText(table.getValueAt(modelRow, 1).toString());
        ddiscription.setText(table.getValueAt(modelRow, 2).toString());
        updatedept.setEnabled(true);
        dno.setEditable(false);
    }//GEN-LAST:event_depttableMouseClicked

    private void adddeptKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_adddeptKeyPressed

    }//GEN-LAST:event_adddeptKeyPressed

    private void dnoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_dnoKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_dnoKeyPressed

    private void dnoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_dnoKeyReleased

    }//GEN-LAST:event_dnoKeyReleased

    private void dnoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_dnoKeyTyped
        adddept.setEnabled(true);
    }//GEN-LAST:event_dnoKeyTyped
    public final void showTableData() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/hospitalmanagementsystem?useSSL=false", "root", "")) {
                PreparedStatement pst = conn.prepareStatement("SELECT * FROM hospitalmanagementsystem.department");
                ResultSet rs = pst.executeQuery();
                DefaultTableModel tm = (DefaultTableModel) depttable.getModel();
                tm.setRowCount(0);
                while (rs.next()) {
                    Object o[] = {
                        rs.getString("D_no"),
                        rs.getString("departmentname"),
                        rs.getString("departmentdiscription")
                    };
                    tm.addRow(o);
                }
                conn.close();
            }
        } catch (ClassNotFoundException | SQLException e) {
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
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(DepartmentDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DepartmentDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DepartmentDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DepartmentDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new DepartmentDetails().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton adddept;
    private javax.swing.JTextField ddiscription;
    private javax.swing.JButton deldept;
    private javax.swing.JTable depttable;
    private javax.swing.JTextField dname;
    private javax.swing.JTextField dno;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField search;
    private javax.swing.JButton updatedept;
    // End of variables declaration//GEN-END:variables

}
