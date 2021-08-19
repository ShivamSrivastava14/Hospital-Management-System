import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

import org.jdesktop.beansbinding.AutoBinding;

import java.util.regex.*;


public class DoctorDetails extends javax.swing.JFrame {

    public DoctorDetails() {
        initComponents();
        combo();
        setResizable(false);
        D_id_message.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
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
        D_id_message = new javax.swing.JLabel();
        doctorid = new javax.swing.JTextField();
        address = new javax.swing.JTextField();
        firstname = new javax.swing.JTextField();
        secondname = new javax.swing.JTextField();
        age = new javax.swing.JTextField();
        gender = new javax.swing.JComboBox();
        jLabel15 = new javax.swing.JLabel();
        bloodgroup = new javax.swing.JComboBox();
        aadhaar = new javax.swing.JTextField();
        status = new javax.swing.JComboBox();
        phoneno = new javax.swing.JTextField();
        adddoctor = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        city = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        doctoruser = new javax.swing.JTextField();
        doctorpassword = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        specialization = new javax.swing.JComboBox();
        jLabel20 = new javax.swing.JLabel();
        timing = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        date = new javax.swing.JTextField();
        fname = new javax.swing.JLabel();
        sname = new javax.swing.JLabel();
        ageMessage = new javax.swing.JLabel();
        aadhaarCard = new javax.swing.JLabel();
        phonenoMessage = new javax.swing.JLabel();
        joiningdate = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
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
        setTitle("Add Doctor Details");
        setMaximumSize(new java.awt.Dimension(1280, 630));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255, 120));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Serif", 1, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 102, 204));
        jLabel2.setText("Add Doctor");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, 270, 80));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 310, 80));

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel3.setText("First Name");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 140, 105, 35));

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 30)); // NOI18N
        jLabel4.setText("Doctor ID");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 50, -1, 40));

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel5.setText("Blood Group");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 340, 110, 40));

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel6.setText("Age");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 240, 90, 35));

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel7.setText("Phone No.");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 190, 105, 35));

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel8.setText("Aadhaar No.");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 190, -1, 35));

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel9.setText("Gender");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 340, -1, 40));

        jLabel11.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel11.setText("Joining Date");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 290, 120, 35));

        jLabel12.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel12.setText("Surname");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 140, 101, 35));

        jLabel13.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel13.setText("Address");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 240, 90, 30));

        jLabel14.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel14.setText("Maritial Status");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 400, 130, 40));

        D_id_message.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        D_id_message.setForeground(new java.awt.Color(255, 255, 255));
        D_id_message.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/warning-24.png"))); // NOI18N
        getContentPane().add(D_id_message, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 50, 40, 40));

        doctorid.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
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
        getContentPane().add(doctorid, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 50, 300, 40));

        address.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        address.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        address.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addressActionPerformed(evt);
            }
        });
        address.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                addressKeyReleased(evt);
            }
        });
        getContentPane().add(address, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 240, 210, 30));

        firstname.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        firstname.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        firstname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                firstnameActionPerformed(evt);
            }
        });
        firstname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                firstnameKeyReleased(evt);
            }
        });
        getContentPane().add(firstname, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 140, 210, 32));

        secondname.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        secondname.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        secondname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                secondnameKeyReleased(evt);
            }
        });
        getContentPane().add(secondname, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 140, 210, 32));

        age.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        age.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        age.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                ageKeyReleased(evt);
            }
        });
        getContentPane().add(age, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 240, 210, 32));

        gender.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        gender.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select Gender", "Male", "Female", "Other" }));
        gender.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        gender.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        gender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                genderActionPerformed(evt);
            }
        });
        getContentPane().add(gender, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 340, 210, 40));

        jLabel15.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel15.setText("Department");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 400, 118, 40));

        bloodgroup.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        bloodgroup.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select", "A+", "A-", "B+", "B-", "AB+", "AB-", "O+", "O-" }));
        bloodgroup.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        bloodgroup.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        bloodgroup.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                bloodgroupKeyReleased(evt);
            }
        });
        getContentPane().add(bloodgroup, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 340, 210, 40));

        aadhaar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        aadhaar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        aadhaar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aadhaarActionPerformed(evt);
            }
        });
        aadhaar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                aadhaarKeyReleased(evt);
            }
        });
        getContentPane().add(aadhaar, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 190, 210, 32));

        status.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        status.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select Maritial Status", "Single", "Married" }));
        status.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        status.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        status.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                statusActionPerformed(evt);
            }
        });
        getContentPane().add(status, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 400, 210, 40));

        phoneno.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        phoneno.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        phoneno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                phonenoActionPerformed(evt);
            }
        });
        phoneno.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                phonenoKeyReleased(evt);
            }
        });
        getContentPane().add(phoneno, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 190, 210, 32));

        adddoctor.setBackground(new java.awt.Color(0, 51, 255));
        adddoctor.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        adddoctor.setForeground(new java.awt.Color(255, 255, 255));
        adddoctor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/add-doctor.png"))); // NOI18N
        adddoctor.setAlignmentX(0.5F);
        adddoctor.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 51, 204), new java.awt.Color(0, 51, 255)));
        adddoctor.setBorderPainted(false);
        adddoctor.setContentAreaFilled(false);
        adddoctor.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        adddoctor.setIconTextGap(10);
        adddoctor.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/add-doctor-small.png"))); // NOI18N
        adddoctor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adddoctorActionPerformed(evt);
            }
        });
        getContentPane().add(adddoctor, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 160, 100, 60));

        jButton4.setBackground(new java.awt.Color(0, 51, 255));
        jButton4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/clear1.png"))); // NOI18N
        jButton4.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 51, 255), new java.awt.Color(0, 51, 255)));
        jButton4.setBorderPainted(false);
        jButton4.setContentAreaFilled(false);
        jButton4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton4.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/clear-small.png"))); // NOI18N
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 160, 108, 60));

        city.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        city.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        city.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cityActionPerformed(evt);
            }
        });
        getContentPane().add(city, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 290, 210, 32));

        jLabel17.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel17.setText("Password");
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 340, 90, 30));

        jLabel18.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel18.setText("City");
        getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 290, 100, 35));

        doctoruser.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        doctoruser.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        doctoruser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                doctoruserActionPerformed(evt);
            }
        });
        getContentPane().add(doctoruser, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 290, 182, 32));

        doctorpassword.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        doctorpassword.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        doctorpassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                doctorpasswordActionPerformed(evt);
            }
        });
        getContentPane().add(doctorpassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 340, 182, 32));

        jLabel19.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel19.setText("Username");
        getContentPane().add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, 90, 30));

        specialization.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        specialization.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select Department", "Dentist" }));
        specialization.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        specialization.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        AutoBinding<Object, Object, Object, Object> binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, specialization, org.jdesktop.beansbinding.ObjectProperty.create(), specialization, org.jdesktop.beansbinding.BeanProperty.create("selectedItem"));
        bindingGroup.addBinding(binding);

        specialization.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                specializationMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                specializationMouseEntered(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                specializationMouseReleased(evt);
            }
        });
        getContentPane().add(specialization, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 400, 210, 40));

        jLabel20.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel20.setText("Visit Timing");
        getContentPane().add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 460, 105, 30));

        timing.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        timing.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        timing.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                timingActionPerformed(evt);
            }
        });
        getContentPane().add(timing, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 460, 210, 32));

        jLabel21.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel21.setText("Days");
        getContentPane().add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 460, 50, 30));

        date.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        date.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        date.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dateActionPerformed(evt);
            }
        });
        getContentPane().add(date, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 460, 210, 32));

        fname.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        fname.setForeground(new java.awt.Color(255, 255, 255));
        fname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                fnameKeyReleased(evt);
            }
        });
        getContentPane().add(fname, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 170, 130, 20));

        sname.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        sname.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(sname, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 170, 140, 20));

        ageMessage.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        ageMessage.setForeground(new java.awt.Color(255, 255, 255));
        ageMessage.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                ageMessageKeyReleased(evt);
            }
        });
        getContentPane().add(ageMessage, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 270, 130, 20));

        aadhaarCard.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        aadhaarCard.setForeground(new java.awt.Color(255, 255, 255));
        aadhaarCard.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                aadhaarCardKeyReleased(evt);
            }
        });
        getContentPane().add(aadhaarCard, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 220, 190, 20));

        phonenoMessage.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        phonenoMessage.setForeground(new java.awt.Color(255, 255, 255));
        phonenoMessage.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                phonenoMessageKeyReleased(evt);
            }
        });
        getContentPane().add(phonenoMessage, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 220, 170, 20));

        joiningdate.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        joiningdate.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        joiningdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                joiningdateActionPerformed(evt);
            }
        });
        joiningdate.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                joiningdateKeyReleased(evt);
            }
        });
        getContentPane().add(joiningdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 290, 210, 31));

        jButton3.setBackground(new java.awt.Color(255, 255, 255, 80));
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
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1180, 30, 60, 60));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/D3 (1).jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 590));

        searchdoct.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        adddoc.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        adddoc.setForeground(new java.awt.Color(0, 102, 204));
        adddoc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/adduser.png"))); // NOI18N
        adddoc.setText("Add Doctors");
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
        deletedoc.setText("Delete Doctors  ");
        deletedoc.setToolTipText("");
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
        updatedoc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/UPDATESMALL.png"))); // NOI18N
        updatedoc.setText("Update Doctors");
        updatedoc.setToolTipText("");
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
        viewdoc.setText("View Doctors");
        viewdoc.setToolTipText("");
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

        bindingGroup.bind();

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

    private void adddoctorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adddoctorActionPerformed
        try {
            Class.forName("com.mysql.jdbc.Driver");
            try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/hospitalmanagementsystem?useSSL=false", "root", "")) {
                PreparedStatement pst = conn.prepareStatement("insert into doctor" +
                        "(D_id,firstname,secondname,age,bloodgroup,gender,address,aadhaar,maritialstatus,city,specialization,phoneno,joiningdate,username,password,timing,days)" +
                        " values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
                
                pst.setString(1, doctorid.getText());
                pst.setString(2, firstname.getText());
                pst.setString(3, secondname.getText());
                pst.setString(4, age.getText());
                pst.setString(5, (String) bloodgroup.getSelectedItem());
                pst.setString(6, (String) gender.getSelectedItem());
                pst.setString(7, address.getText());
                pst.setString(8, aadhaar.getText());
                pst.setString(9, (String) status.getSelectedItem());
                pst.setString(10, city.getText());
                pst.setString(11, (String) specialization.getSelectedItem());
                pst.setString(12, phoneno.getText());
                pst.setString(13, joiningdate.getText());
                pst.setString(14, doctoruser.getText());
                pst.setString(15, doctorpassword.getText());
                pst.setString(16, timing.getText());
                pst.setString(17, date.getText());
                pst.executeUpdate();
                JOptionPane.showMessageDialog(this, "Record Inserted Sucessfully");
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
            }
        } catch (ClassNotFoundException | SQLException | HeadlessException e) {
            JOptionPane.showMessageDialog(this, "Please filled all necessary details!");
        }
    }//GEN-LAST:event_adddoctorActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
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

    }//GEN-LAST:event_jButton4ActionPerformed

    private void cityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cityActionPerformed

    private void doctoruserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_doctoruserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_doctoruserActionPerformed

    private void doctorpasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_doctorpasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_doctorpasswordActionPerformed

    private void specializationMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_specializationMouseClicked


    }//GEN-LAST:event_specializationMouseClicked

    private void specializationMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_specializationMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_specializationMouseEntered

    private void specializationMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_specializationMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_specializationMouseReleased

    private void timingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_timingActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_timingActionPerformed

    private void dateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dateActionPerformed

    private void firstnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_firstnameActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_firstnameActionPerformed

    private void doctoridActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_doctoridActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_doctoridActionPerformed

    private void doctoridKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_doctoridKeyReleased
        // TODO add your handling code here:
        String PATTERN = "^[0-9]{0,5}$";
        Pattern patt = Pattern.compile(PATTERN);
        Matcher match = patt.matcher(doctorid.getText());
        if(!match.matches()){
            D_id_message.setVisible(true);
        }
        else{
            D_id_message.setVisible(false);
        }
    }//GEN-LAST:event_doctoridKeyReleased

    private void fnameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fnameKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_fnameKeyReleased

    private void firstnameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_firstnameKeyReleased
        // TODO add your handling code here:
        String PATTERN = "^[a-zA-Z]{0,100}$";
        Pattern patt = Pattern.compile(PATTERN);
        Matcher match = patt.matcher(firstname.getText());
        if(!match.matches()){
            fname.setText("Name is incorrect!");
        }
        else{
            fname.setText(null);
        }
    }//GEN-LAST:event_firstnameKeyReleased

    private void secondnameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_secondnameKeyReleased
        // TODO add your handling code here:
        String PATTERN = "^[a-zA-Z]{0,100}$";
        Pattern patt = Pattern.compile(PATTERN);
        Matcher match = patt.matcher(secondname.getText());
        if(!match.matches()){
            sname.setText("Surname is incorrect!");
        }
        else{
            sname.setText(null);
        }
    }//GEN-LAST:event_secondnameKeyReleased

    private void ageKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ageKeyReleased
        // TODO add your handling code here:
        String PATTERN = "^[0-9]{0,4}$";
        Pattern patt = Pattern.compile(PATTERN);
        Matcher match = patt.matcher(age.getText());
        if(!match.matches()){
            ageMessage.setText("Age is incorrect!");
        }
        else{
            ageMessage.setText(null);
        }
    }//GEN-LAST:event_ageKeyReleased

    private void ageMessageKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ageMessageKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_ageMessageKeyReleased

    private void bloodgroupKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_bloodgroupKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_bloodgroupKeyReleased

    private void addressKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_addressKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_addressKeyReleased

    private void aadhaarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_aadhaarKeyReleased
        // TODO add your handling code here:
        String PATTERN = "^[0-9]{0,13}$";
        Pattern patt = Pattern.compile(PATTERN);
        Matcher match = patt.matcher(aadhaar.getText());
        if(!match.matches()){
            aadhaarCard.setText("Aadhaar number is incorrect!");
        }
        else{
            aadhaarCard.setText(null);
        }
    }//GEN-LAST:event_aadhaarKeyReleased

    private void aadhaarCardKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_aadhaarCardKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_aadhaarCardKeyReleased

    private void phonenoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_phonenoKeyReleased
        // TODO add your handling code here:
        String PATTERN = "^[0-9]{0,13}$";
        Pattern patt = Pattern.compile(PATTERN);
        Matcher match = patt.matcher(phoneno.getText());
        if(!match.matches()){
            phonenoMessage.setText("Phone number is incorrect!");
        }
        else{
            phonenoMessage.setText(null);
        }
    }//GEN-LAST:event_phonenoKeyReleased

    private void phonenoMessageKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_phonenoMessageKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_phonenoMessageKeyReleased

    private void joiningdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_joiningdateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_joiningdateActionPerformed

    private void joiningdateKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_joiningdateKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_joiningdateKeyReleased

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        adminpanel ap = new adminpanel();
        ap.setVisible(true);
        this.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed
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
            java.util.logging.Logger.getLogger(DoctorDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DoctorDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DoctorDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DoctorDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new DoctorDetails().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel D_id_message;
    private javax.swing.JTextField aadhaar;
    private javax.swing.JLabel aadhaarCard;
    private javax.swing.JMenu adddoc;
    private javax.swing.JButton adddoctor;
    private javax.swing.JTextField address;
    private javax.swing.JTextField age;
    private javax.swing.JLabel ageMessage;
    private javax.swing.JComboBox bloodgroup;
    private javax.swing.JTextField city;
    private javax.swing.JTextField date;
    private javax.swing.JMenu deletedoc;
    private javax.swing.JTextField doctorid;
    private javax.swing.JTextField doctorpassword;
    private javax.swing.JTextField doctoruser;
    private javax.swing.JTextField firstname;
    private javax.swing.JLabel fname;
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
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JTextField joiningdate;
    private javax.swing.JTextField phoneno;
    private javax.swing.JLabel phonenoMessage;
    private javax.swing.JMenu searchdoc;
    private javax.swing.JMenuBar searchdoct;
    private javax.swing.JTextField secondname;
    private javax.swing.JLabel sname;
    private javax.swing.JComboBox specialization;
    private javax.swing.JComboBox status;
    private javax.swing.JTextField timing;
    private javax.swing.JMenu updatedoc;
    private javax.swing.JMenu viewdoc;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
}
