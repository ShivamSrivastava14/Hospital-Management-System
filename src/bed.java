import java.awt.Color;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class bed extends javax.swing.JFrame {

    public bed() {
        initComponents();
        panel2.setBackground(new Color(255, 255, 255));
        showTableData();
        setResizable(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel2 = new javax.swing.JPanel();
        home = new javax.swing.JButton();
        jLabel35 = new javax.swing.JLabel();
        room = new javax.swing.JTextField();
        bedno = new javax.swing.JTextField();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        category = new javax.swing.JComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        depttable = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Bed Details");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panel2.setBackground(new java.awt.Color(255, 255, 255));
        panel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        home.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Home (1).png"))); // NOI18N
        home.setBorder(null);
        home.setBorderPainted(false);
        home.setContentAreaFilled(false);
        home.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        home.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Small-Home (1).png"))); // NOI18N
        home.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeActionPerformed(evt);
            }
        });
        panel2.add(home, new org.netbeans.lib.awtextra.AbsoluteConstraints(1170, 20, -1, 70));

        jLabel35.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(0, 55, 255));
        jLabel35.setText("Bed Number");
        panel2.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 180, -1, 40));

        room.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        room.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                roomrefActionPerformed(evt);
            }
        });
        panel2.add(room, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 300, 230, 40));

        bedno.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        bedno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bednonameActionPerformed(evt);
            }
        });
        panel2.add(bedno, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 180, 230, 40));

        jLabel36.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(0, 55, 255));
        jLabel36.setText("Room No.");
        panel2.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 300, -1, 40));

        jLabel37.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(0, 55, 255));
        jLabel37.setText("Category");
        panel2.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 240, -1, 40));

        jButton3.setBackground(new java.awt.Color(0, 55, 255));
        jButton3.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/bed-button.png"))); // NOI18N
        jButton3.setText("  ADD BED");
        jButton3.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.blue, java.awt.Color.blue));
        jButton3.setContentAreaFilled(false);
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.setOpaque(true);
        jButton3.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/bed-button-small.png"))); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3jButton1ActionPerformed(evt);
            }
        });
        panel2.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 450, 240, 70));

        jButton8.setBackground(new java.awt.Color(0, 55, 255));
        jButton8.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        jButton8.setForeground(new java.awt.Color(255, 255, 255));
        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/remove-bed.png"))); // NOI18N
        jButton8.setText(" REMOVE BED");
        jButton8.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.blue, java.awt.Color.blue));
        jButton8.setContentAreaFilled(false);
        jButton8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton8.setOpaque(true);
        jButton8.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/remove-bed-small.png"))); // NOI18N
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8jButton4ActionPerformed(evt);
            }
        });
        panel2.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 450, 240, 70));

        jButton9.setBackground(new java.awt.Color(0, 55, 255));
        jButton9.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        jButton9.setForeground(new java.awt.Color(255, 255, 255));
        jButton9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/update-bed.png"))); // NOI18N
        jButton9.setText(" UPDATE BED");
        jButton9.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.blue, java.awt.Color.blue));
        jButton9.setContentAreaFilled(false);
        jButton9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton9.setOpaque(true);
        jButton9.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/update-bed-small.png"))); // NOI18N
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9jButton5ActionPerformed(evt);
            }
        });
        panel2.add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 450, 240, 70));

        jButton7.setBackground(new java.awt.Color(255, 255, 255));
        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Back.png"))); // NOI18N
        jButton7.setBorder(null);
        jButton7.setBorderPainted(false);
        jButton7.setContentAreaFilled(false);
        jButton7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton7.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/back-small.png"))); // NOI18N
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        panel2.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 60, 60));

        category.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select Category", "ICU", "CCU", "Genernal Ward", "Emergency" }));
        category.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        category.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                categoryActionPerformed(evt);
            }
        });
        panel2.add(category, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 240, 230, 40));

        depttable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Bed No.", "Category", "Room No."
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
            depttable.getColumnModel().getColumn(1).setResizable(false);
            depttable.getColumnModel().getColumn(2).setResizable(false);
        }

        panel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 150, 320, 220));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255, 120));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 102, 204));
        jLabel4.setText("BED DETAILS");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(919, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
        );

        panel2.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 1280, 70));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/bed (2).jpg"))); // NOI18N
        jLabel1.setMaximumSize(new java.awt.Dimension(1280, 630));
        jLabel1.setMinimumSize(new java.awt.Dimension(1280, 6300));
        jLabel1.setPreferredSize(new java.awt.Dimension(1280, 630));
        panel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 630));

        getContentPane().add(panel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 630));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void roomrefActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_roomrefActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_roomrefActionPerformed

    private void bednonameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bednonameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bednonameActionPerformed

    private void jButton3jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3jButton1ActionPerformed
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn;
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/hospitalmanagementsystem?useSSL=false", "root", "");
            PreparedStatement pst = conn.prepareStatement("insert into bed" + "(bid,category,room)" + " values(?,?,?)");
            pst.setString(1, bedno.getText());
            pst.setString(2, category.getSelectedItem().toString());
            pst.setString(3, room.getText());

            pst.executeUpdate();
            JOptionPane.showMessageDialog(this, "BED Added Sucessfully");
            showTableData();
            bedno.setText(null);
            category.setSelectedIndex(0);
            room.setText(null);

        } catch (ClassNotFoundException | SQLException | HeadlessException e) {
            JOptionPane.showMessageDialog(this, "Please fill all fields!");
            System.out.println(e);

        }
    }//GEN-LAST:event_jButton3jButton1ActionPerformed
    public final void showTableData() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn;
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/hospitalmanagementsystem?useSSL=false", "root", "");
            PreparedStatement pst = conn.prepareStatement("SELECT * FROM hospitalmanagementsystem.bed");
            ResultSet rs = pst.executeQuery();
            DefaultTableModel tm = (DefaultTableModel) depttable.getModel();
            tm.setRowCount(0);
            while (rs.next()) {
                Object o[] = {
                    rs.getString("bid"),
                    rs.getString("category"),
                    rs.getString("room")
                };
                tm.addRow(o);
            }
            conn.close();
        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(this, "Internal error!");
            System.out.println(e);
        }
    }
    private void jButton8jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8jButton4ActionPerformed
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/hospitalmanagementsystem?useSSL=false", "root", "");
            PreparedStatement pst = conn.prepareStatement("delete from bed where bid=?");
            pst.setString(1, bedno.getText());
            pst.executeUpdate();
            JOptionPane.showMessageDialog(this, "Record Deleted Sucessfully");
            showTableData();
            bedno.setText(null);
            category.setSelectedIndex(0);
            room.setText(null);
        } catch (ClassNotFoundException | SQLException | HeadlessException e) {
            JOptionPane.showMessageDialog(this, "Please select atleast one entry!");
            System.out.println(e);
        }
    }//GEN-LAST:event_jButton8jButton4ActionPerformed

    private void jButton9jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9jButton5ActionPerformed
        try {
            Class.forName("com.mysql.jdbc.Driver");

            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/hospitalmanagementsystem?useSSL=false", "root", "");
            PreparedStatement pst = conn.prepareStatement("UPDATE bed SET category=?,room=? WHERE bid=?");

            pst.setString(2, room.getText());
            pst.setString(1, category.getSelectedItem().toString());
            pst.setString(3, bedno.getText());

            pst.executeUpdate();
            JOptionPane.showMessageDialog(this, "Record Updated Sucessfully");
            showTableData();
            room.setText(null);
            category.setSelectedIndex(0);
            bedno.setText(null);
        } catch (ClassNotFoundException | SQLException | HeadlessException e) {
            JOptionPane.showMessageDialog(this, "Please select atleast one entry!");
            System.out.println(e);
        }
    }//GEN-LAST:event_jButton9jButton5ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        adminpanel ap = new adminpanel();
        ap.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton7ActionPerformed

    private void categoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_categoryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_categoryActionPerformed

    private void depttableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_depttableMouseClicked
        // TODO add your handling code here:
        int SelectedRow = depttable.getSelectedRow();
        DefaultTableModel table = (DefaultTableModel) depttable.getModel();
        bedno.setText(table.getValueAt(SelectedRow, 0).toString());
        category.setSelectedItem(table.getValueAt(SelectedRow, 1).toString());
        room.setText(table.getValueAt(SelectedRow, 2).toString());
    }//GEN-LAST:event_depttableMouseClicked

    private void homeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeActionPerformed
        adminpanel ap = new adminpanel();
        ap.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_homeActionPerformed

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
            java.util.logging.Logger.getLogger(bed.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new bed().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField bedno;
    private javax.swing.JComboBox category;
    private javax.swing.JTable depttable;
    private javax.swing.JButton home;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel panel2;
    private javax.swing.JTextField room;
    // End of variables declaration//GEN-END:variables
}
