package eyeclinic;

import static com.sun.xml.internal.fastinfoset.alphabet.BuiltInRestrictedAlphabets.table;
import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.time.LocalDate;

public class appoitmentform extends javax.swing.JFrame {

    String uname = "root";
    String pass = "root";
    Connection con;
    String url = "jdbc:mysql://localhost:3306/eyeclinic";
    String id, fname,lname, date, month, year, apoit_detail, name, time;
    String flag = "true";
    

    public appoitmentform() {
        initComponents();
        this.setResizable(false);
      
        try {
            reportData();
        } catch (SQLException ex) {
            Logger.getLogger(appoitmentform.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtuserid = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jComboBoxtime = new javax.swing.JComboBox<>();
        btnSave = new javax.swing.JButton();
        btnback = new javax.swing.JButton();
        jComboBoxdate = new javax.swing.JComboBox<>();
        jComboBoxmonth = new javax.swing.JComboBox<>();
        btndelete = new javax.swing.JButton();
        jComboBoxyear = new javax.swing.JComboBox<>();
        btnupdate = new javax.swing.JButton();
        lblname = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Appoitment Form ");
        setBackground(new java.awt.Color(204, 0, 204));
        setBounds(new java.awt.Rectangle(500, 200, 1030, 600));

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        jLabel1.setFont(new java.awt.Font("Algerian", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 0));
        jLabel1.setText("Appoitment here ");

        jLabel2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("ID");

        txtuserid.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtuserid.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtuseridFocusLost(evt);
            }
        });
        txtuserid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtuseridActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Name");

        jLabel5.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Date ");

        jLabel4.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Timing");

        jComboBoxtime.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jComboBoxtime.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select time", "9-10", "11-12", "01-02", "02-03", " " }));
        jComboBoxtime.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jComboBoxtime.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jComboBoxtimeFocusLost(evt);
            }
        });

        btnSave.setBackground(new java.awt.Color(0, 0, 0));
        btnSave.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnSave.setForeground(new java.awt.Color(240, 240, 240));
        btnSave.setText("SAVE");
        btnSave.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnback.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnback.setIcon(new javax.swing.ImageIcon(getClass().getResource("/eyeclinic/backbtn.jpg"))); // NOI18N
        btnback.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbackActionPerformed(evt);
            }
        });

        jComboBoxdate.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jComboBoxdate.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Date", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "32", "23", "24", "25", "26", "27", "28", "29", "30" }));
        jComboBoxdate.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jComboBoxdateFocusLost(evt);
            }
        });

        jComboBoxmonth.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jComboBoxmonth.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Month", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" }));
        jComboBoxmonth.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jComboBoxmonthFocusLost(evt);
            }
        });

        btndelete.setBackground(new java.awt.Color(0, 0, 0));
        btndelete.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btndelete.setForeground(new java.awt.Color(240, 240, 240));
        btndelete.setText("Delete");
        btndelete.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btndelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndeleteActionPerformed(evt);
            }
        });

        jComboBoxyear.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jComboBoxyear.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Year", "2020", "2021", "2022" }));
        jComboBoxyear.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jComboBoxyearFocusLost(evt);
            }
        });
        jComboBoxyear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxyearActionPerformed(evt);
            }
        });

        btnupdate.setBackground(new java.awt.Color(0, 0, 0));
        btnupdate.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnupdate.setForeground(new java.awt.Color(240, 240, 240));
        btnupdate.setText("Update");
        btnupdate.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnupdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnupdateActionPerformed(evt);
            }
        });

        lblname.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lblname.setForeground(new java.awt.Color(240, 240, 240));

        jLabel6.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(240, 240, 240));
        jLabel6.setText("ID is Mobile Number");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel4))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGap(124, 124, 124)
                                            .addComponent(jComboBoxtime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(68, 68, 68))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGap(105, 105, 105)
                                            .addComponent(jComboBoxdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jComboBoxmonth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jComboBoxyear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(26, 26, 26)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnback, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(105, 105, 105)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblname)
                                            .addComponent(txtuserid, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel6)))))
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(138, 138, 138)
                        .addComponent(jLabel1)))
                .addContainerGap(30, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btndelete, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnupdate, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addGap(4, 4, 4)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtuserid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblname))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jComboBoxdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxmonth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxyear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jComboBoxtime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnback, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btndelete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSave, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnupdate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTable1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id", "name", "date", "time"
            }
        ));
        jTable1.setRowMargin(5);
        jTable1.getTableHeader().setResizingAllowed(false);
        jTable1.getTableHeader().setReorderingAllowed(false);
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 426, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 413, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        showData();
    }//GEN-LAST:event_jTable1MouseClicked

    private void btnupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnupdateActionPerformed
        try {
            updateData();
        } catch (SQLException ex) {
            Logger.getLogger(appoitmentform.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnupdateActionPerformed

    private void jComboBoxyearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxyearActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxyearActionPerformed

    private void jComboBoxyearFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jComboBoxyearFocusLost
        System.out.println("focus lost");
        year = String.valueOf(jComboBoxyear.getSelectedItem());
        System.out.println("selected year = "+year);
        if(year.equals("Year")){
            JOptionPane.showMessageDialog(this, "Please select proper Year !", "Month Validation", JOptionPane.ERROR_MESSAGE);
            flag = "false";
        }
        else{
            flag = "true";
        }
    }//GEN-LAST:event_jComboBoxyearFocusLost

    private void btndeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndeleteActionPerformed
        int a = JOptionPane.showConfirmDialog(this, "Are u sure you want to delete Appoitment ", "Conform Message", JOptionPane.YES_NO_OPTION);
        if (a == 0) {
            try {
                deleteData();
            } catch (SQLException ex) {
                Logger.getLogger(appoitmentform.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_btndeleteActionPerformed

    private void jComboBoxmonthFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jComboBoxmonthFocusLost
        month = String.valueOf(jComboBoxmonth.getSelectedItem());
        if (month.equals("Month")) {

            JOptionPane.showMessageDialog(this, "Please select proper Month !", "Month Validation", JOptionPane.ERROR_MESSAGE);
            flag = "false";
        } else {
            flag = "true";
        }
    }//GEN-LAST:event_jComboBoxmonthFocusLost

    private void jComboBoxdateFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jComboBoxdateFocusLost
        date = String.valueOf(jComboBoxdate.getSelectedItem());
        if (date.equals("Date")) {
            JOptionPane.showMessageDialog(this, "Please select proper Date !", "Date Validation", JOptionPane.ERROR_MESSAGE);
            flag = "false";
        } else {
            flag = "true";
        }
    }//GEN-LAST:event_jComboBoxdateFocusLost

    private void btnbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbackActionPerformed
        new HomePageClinic().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnbackActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        if (flag.equals("true")) {
            try {
                getData();
                JOptionPane.showMessageDialog(this, "Appoitment Successfully Booked", "Appoitment Details", JOptionPane.INFORMATION_MESSAGE);
            } catch (SQLException ex) {

            }
        }
    }//GEN-LAST:event_btnSaveActionPerformed

    private void jComboBoxtimeFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jComboBoxtimeFocusLost
        time = String.valueOf(jComboBoxtime.getSelectedItem());
        if (time.equals("Select time")) {
            JOptionPane.showMessageDialog(this, "Please select proper Time !", "Month Validation", JOptionPane.ERROR_MESSAGE);
            flag = "false";
        } else {
            flag = "true";
        }
    }//GEN-LAST:event_jComboBoxtimeFocusLost

    private void txtuseridActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtuseridActionPerformed

    }//GEN-LAST:event_txtuseridActionPerformed

    private void txtuseridFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtuseridFocusLost
        System.out.println("focus lost");
        try {
            search();
        } catch (SQLException ex) {
            Logger.getLogger(appoitmentform.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_txtuseridFocusLost

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
            java.util.logging.Logger.getLogger(appoitmentform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(appoitmentform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(appoitmentform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(appoitmentform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new appoitmentform().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnback;
    private javax.swing.JButton btndelete;
    private javax.swing.JButton btnupdate;
    private javax.swing.JComboBox<String> jComboBoxdate;
    private javax.swing.JComboBox<String> jComboBoxmonth;
    private javax.swing.JComboBox<String> jComboBoxtime;
    private javax.swing.JComboBox<String> jComboBoxyear;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblname;
    private javax.swing.JTextField txtuserid;
    // End of variables declaration//GEN-END:variables

    public void search() throws SQLException {
        con = DriverManager.getConnection(url, uname, pass);
        System.out.println("Connected successfully");
        id = txtuserid.getText();
        String query = "select fname from patience_ragistration where id=" + txtuserid.getText() + " ";
        Statement smt = con.createStatement();
        ResultSet rs = smt.executeQuery(query);
        while (rs.next()) {
            fname = rs.getString("fname");
            System.out.println("id = " + id);
            lblname.setText(fname);
        }
    }

    private void getData() throws SQLException {
        id = txtuserid.getText();
        name = lblname.getText();
        date = String.valueOf(jComboBoxdate.getSelectedItem());

        time = String.valueOf(jComboBoxtime.getSelectedItem());
        jComboBoxtime.removeItem(time);
        jComboBoxtime.addItem(time + "  time booked");
        jComboBoxtime.setSelectedIndex(1);
        //validation on time

        month = String.valueOf(jComboBoxmonth.getSelectedItem());
        year = String.valueOf(jComboBoxyear.getSelectedItem());

        apoit_detail = date + "-" + month + "-" + year;
        Connection con = DriverManager.getConnection(url, uname, pass);
        System.out.println("Connected successfully");
        PreparedStatement smt;
        String query = "insert into  appoitment_details values (?,?,?,?)  ";
        smt = con.prepareStatement(query);

        smt.setString(1, id);
        smt.setString(2, name);
        smt.setString(3, apoit_detail);
        smt.setString(4, time);
        smt.executeUpdate();
        System.out.println("Record added successfully");
        smt.close();
        con.close();

        String[] tbldata = {id, name, apoit_detail, time};
        DefaultTableModel dtbl = (DefaultTableModel) jTable1.getModel();
        dtbl.addRow(tbldata);
        
    }

    public void reportData() throws SQLException {
        Connection con = DriverManager.getConnection(url, uname, pass);
        System.out.println("Connected successfully");
        // connectivity 
        String query = "select * from appoitment_details";
        Statement smt = con.createStatement();
        ResultSet rs = smt.executeQuery(query);
        while (rs.next()) {
            id = rs.getString("id");
            name = rs.getString("name");
            date = rs.getString("date");
            time = rs.getString("time");

            String[] tbldata = {id, name, date, time,};
            DefaultTableModel dtbl = (DefaultTableModel) jTable1.getModel();
            dtbl.addRow(tbldata);
        }
    }

    private void showData() {
        DefaultTableModel tbl = (DefaultTableModel) jTable1.getModel();
        id = tbl.getValueAt(jTable1.getSelectedRow(), 0).toString();
        name = tbl.getValueAt(jTable1.getSelectedRow(), 1).toString();
        date = tbl.getValueAt(jTable1.getSelectedRow(), 2).toString();
        time = tbl.getValueAt(jTable1.getSelectedRow(), 3).toString();

        String[] s = date.split("-");
        date = s[0];
        month = s[1];
        year = s[2];
        jComboBoxdate.addItem(date);
        jComboBoxdate.setSelectedItem(date);

        jComboBoxmonth.addItem(month);
        jComboBoxmonth.setSelectedItem(month);
        
        jComboBoxyear.addItem(year);
        jComboBoxyear.setSelectedItem(year);
        
        txtuserid.setText(id);
        lblname.setText(name);

        jComboBoxtime.addItem(time);
        jComboBoxtime.setSelectedItem(time);
    }

    private void deleteData() throws SQLException {
        con = DriverManager.getConnection(url, uname, pass);
        System.out.println("Connected");
        String query3 = " delete from appoitment_details where id='" + txtuserid.getText() + "'";
        PreparedStatement smtt;
        smtt = con.prepareStatement(query3);
        smtt.executeUpdate();
        txtuserid.setText("");
        lblname.setText("");
        DefaultTableModel tbl = (DefaultTableModel) jTable1.getModel();
        tbl.removeRow(jTable1.getSelectedRow());
    }

    private void updateData() throws SQLException {
        con = DriverManager.getConnection(url, uname, pass);
        date = String.valueOf(jComboBoxdate.getSelectedItem());

        time = String.valueOf(jComboBoxtime.getSelectedItem());
        month = String.valueOf(jComboBoxmonth.getSelectedItem());
        year = String.valueOf(jComboBoxyear.getSelectedItem());
        apoit_detail = date + "-" + month + "-" + year;
        String query1 = " update appoitment_details set name = '" + lblname.getText() + "' , date = '" + apoit_detail + "' , time = '" + time + "' where id = '" + txtuserid.getText() + "'   ";
        PreparedStatement smtt;
        smtt = con.prepareStatement(query1);
        smtt.executeUpdate();
        JOptionPane.showMessageDialog(this, "Record updated Successfully", "Record update", JOptionPane.INFORMATION_MESSAGE);
        System.out.println("Updated Successfully");
        DefaultTableModel dtbl = (DefaultTableModel) jTable1.getModel();
        dtbl.setValueAt(id, jTable1.getSelectedRow(), 0);
        dtbl.setValueAt(name, jTable1.getSelectedRow(), 1);
        dtbl.setValueAt(apoit_detail, jTable1.getSelectedRow(), 2);
        dtbl.setValueAt(time, jTable1.getSelectedRow(), 3);
    }
}
