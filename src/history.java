
import java.awt.Color;
import java.awt.HeadlessException;
import java.awt.print.PrinterException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class history extends javax.swing.JFrame {

    public history() {
        initComponents();
        panel2.setBackground(new Color(0, 153, 204, 200));
        text.setLineWrap(true);
        text.setWrapStyleWord(true);
        setResizable(false);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        printOut = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        panel2 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        patientid = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        text = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Check History");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255, 120));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        printOut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/print-btn.png"))); // NOI18N
        printOut.setBorder(null);
        printOut.setBorderPainted(false);
        printOut.setContentAreaFilled(false);
        printOut.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        printOut.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/print-btn-small.png"))); // NOI18N
        printOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printOutActionPerformed(evt);
            }
        });
        jPanel1.add(printOut, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 30, 60, 60));

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Home (1).png"))); // NOI18N
        jButton2.setBorder(null);
        jButton2.setBorderPainted(false);
        jButton2.setContentAreaFilled(false);
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Small-Home (1).png"))); // NOI18N
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1200, 30, 63, 60));

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
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 70, 60));

        panel2.setBackground(new java.awt.Color(255, 255, 255, 80));
        panel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel12.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("CHECK PATIENT HISTORY");
        panel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(447, 0, 470, 82));

        jLabel18.setBackground(new java.awt.Color(255, 255, 255,120));
        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/HISTORY-Icon.png"))); // NOI18N
        jLabel18.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel18.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel18MouseClicked(evt);
            }
        });
        panel2.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 0, -1, 80));

        jPanel1.add(panel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 1280, 80));

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 30)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 102, 255));
        jLabel4.setText("Patient ID");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 120, -1, 50));

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 102, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/search.png"))); // NOI18N
        jButton1.setBorder(null);
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/search-small.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 120, 60, 50));
        jPanel1.add(patientid, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 120, 467, 50));

        jScrollPane1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        jScrollPane1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        text.setEditable(false);
        text.setColumns(20);
        text.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        text.setForeground(new java.awt.Color(0, 102, 255));
        text.setRows(5);
        text.setBorder(null);
        text.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jScrollPane1.setViewportView(text);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 180, 1100, 430));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/historypic.jpg"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 630));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel18MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel18MouseClicked

        history da = new history();
        da.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel18MouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        DRPATIENTDETAILS DD = new DRPATIENTDETAILS();
        DD.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/hospitalmanagementsystem?useSSL=false", "root", "");
            PreparedStatement pst = conn.prepareStatement("select *from patient where P_id=?");
            pst.setString(1, patientid.getText());
            ResultSet rs = pst.executeQuery();

            if (rs.next()) {
                text.setText("                                 ************************************************        \n");
                text.setText(text.getText() + "                                       " + "  HISTORY" + " - " + rs.getString("Firstname") + "  " + rs.getString("SecondName") + 
                         "                             Date: " + rs.getString("Date") + "\n");
//                text.setText(text.getText() + "                                " + rs.getString("Firstname") + " " + rs.getString("SecondName") + 
//                        "          Date: " + rs.getString("Date") + "\n");
//                text.setText(text.getText() + "     "
//                        + "  HISTORY" + " - " + rs.getString("Firstname") + "  " + rs.getString("SecondName") + "                             Date: " + rs.getString("Date") + "\n");
                text.setText(text.getText() + "                                 ************************************************           \n");
                text.setText(text.getText() + " Patient Name:                             " + rs.getString("FirstName") + " " + rs.getString("SecondName"));
                text.setText(text.getText() + "\n Patient Age:                                " + rs.getString("Age"));
                text.setText(text.getText() + "\n Gender:                                       " + rs.getString("Gender"));
                text.setText(text.getText() + "\n Aadhaar No.:                               " + rs.getString("Aadhaar"));
                text.setText(text.getText() + "\n Patient Type:                               " + rs.getString("PatientType"));
                text.setText(text.getText() + "\n Disease:                                      " + rs.getString("disease"));
                text.setText(text.getText() + "\n Discription:                                  " + rs.getString("detail"));
                text.setText(text.getText() + "\n Medicine Recomended:               " + rs.getString("tabletname"));
                text.setText(text.getText() + "\n Daily Dose:                                  " + rs.getString("dailydose"));
                text.setText(text.getText() + "\n Company:                                    " + rs.getString("company"));
            } else {
                JOptionPane.showMessageDialog(null, "No Specific Id Found");
            }
        } catch (ClassNotFoundException | SQLException | HeadlessException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        doctoractivity da = new doctoractivity();
        da.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton2MouseClicked

    private void printOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printOutActionPerformed
        try {
            text.print();
        } catch (PrinterException ex) {
            Logger.getLogger(history.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_printOutActionPerformed

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
            java.util.logging.Logger.getLogger(history.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(history.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(history.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(history.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new history().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel panel2;
    private javax.swing.JTextField patientid;
    private javax.swing.JButton printOut;
    private javax.swing.JTextArea text;
    // End of variables declaration//GEN-END:variables
}
