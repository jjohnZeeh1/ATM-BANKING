//source code for delete account

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Atmbanking;
import java.sql.*;
import javax.swing.*;
/**
 *
 * @author HP
 */
public class delete extends javax.swing.JFrame {
Connection con;
Statement stmt;
PreparedStatement pstmt,pstmt1;
ResultSet rs1,rs;
String pin, user, nm, bl;
String driver = "com.mysql.cj.jdbc.Driver";
String uname = "root";
String pass = "";
String dbaseHost = "jdbc:mysql://localhost/banking1a";
    /**
     * Creates new form delete
     */
    public delete(String name, String balance) {
        initComponents();
        setLocationRelativeTo(null);
        lblname.setText(name);
        lblbalance.setText(balance);
        driver();
    }
    
    void driver(){
        try{
            Class.forName(driver);
        con = DriverManager.getConnection(dbaseHost,uname,pass);
        }catch(ClassNotFoundException | SQLException e){
            JOptionPane.showMessageDialog(null,e.getMessage());
        }
    }

    private delete() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtuser = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        lblname = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblbalance = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        btndelete = new javax.swing.JButton();
        btnback = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        lbltb = new javax.swing.JLabel();
        txtpin = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 153));
        jPanel1.setPreferredSize(new java.awt.Dimension(500, 500));

        txtuser.setBackground(new java.awt.Color(255, 255, 255));
        txtuser.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txtuser.setForeground(new java.awt.Color(0, 0, 0));
        txtuser.setPreferredSize(new java.awt.Dimension(150, 35));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Your username:");

        lblname.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lblname.setForeground(new java.awt.Color(255, 255, 255));
        lblname.setText("jLabel2");

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Your remaining balance is");

        lblbalance.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lblbalance.setForeground(new java.awt.Color(255, 255, 255));
        lblbalance.setText("jLabel1");

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator1.setPreferredSize(new java.awt.Dimension(50, 15));

        btndelete.setBackground(new java.awt.Color(11, 29, 111));
        btndelete.setForeground(new java.awt.Color(255, 255, 255));
        btndelete.setText("DELETE");
        btndelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndeleteActionPerformed(evt);
            }
        });

        btnback.setBackground(new java.awt.Color(11, 29, 111));
        btnback.setForeground(new java.awt.Color(255, 255, 255));
        btnback.setText("BACK");
        btnback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbackActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("DELETE YOUR ACCOUNT HERE");

        lbltb.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lbltb.setForeground(new java.awt.Color(255, 255, 255));
        lbltb.setText("Your pin:");

        txtpin.setBackground(new java.awt.Color(255, 255, 255));
        txtpin.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txtpin.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblbalance)
                                    .addComponent(lblname)
                                    .addComponent(jLabel3)))
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 479, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(152, 152, 152)
                                .addComponent(jLabel1))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(83, 83, 83)
                                        .addComponent(btndelete))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addContainerGap()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lbltb)
                                            .addComponent(jLabel2))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(btnback))
                                    .addComponent(txtuser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtpin, javax.swing.GroupLayout.Alignment.TRAILING))))
                        .addGap(66, 66, 66)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblname)
                .addGap(12, 12, 12)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblbalance)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtuser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbltb)
                    .addComponent(txtpin, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(61, 61, 61)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btndelete)
                    .addComponent(btnback))
                .addContainerGap(122, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btndeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndeleteActionPerformed
        // TODO add your handling code here:
        txtuser.getText();
        txtpin.getText();
        if(txtuser.getText().equals("") && txtpin.equals("")){
            JOptionPane.showMessageDialog(null, "All Field are Empty");
        }else if(txtuser.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Username Empty");
        }else if(txtpin.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Pin is Empty");
        }
        
        try{
            //get specific username value || input value
                user = txtuser.getText();
                String query = "SELECT * from userrecord " + "WHERE username = ? ";
                pstmt = con.prepareStatement(query);

                //get specific pin value || input value
                pin= txtpin.getText();
                String query1 = "SELECT * from userrecord " + "WHERE pin = ? ";
                pstmt1 = con.prepareStatement(query1);

                //set string value
                pstmt.setString(1,user);//value of username
                pstmt1.setString(1, pin);//value of pin

                //execute query
                rs = pstmt.executeQuery();//username
                rs1 = pstmt1.executeQuery();//pin
                
                if(rs.next()&&rs1.next()){
                   stmt = con.createStatement();
                   int ans = JOptionPane.showConfirmDialog(null, "Are you sure you want to delete your account? ");
                   if(ans == JOptionPane.YES_OPTION){
                       stmt = con.createStatement();
                       stmt.execute("DELETE from userrecord " + "WHERE pin = " + pin);
                       JOptionPane.showMessageDialog(null, "Account succesfully delete!");
                       //to open login page
                       new login().setVisible(true);
                   }//inner if 
                   else{
                       JOptionPane.showMessageDialog(null, "Delete Cancelled!");
                   }//end of inner if-else
                }//end of outer if
                else{
                    JOptionPane.showMessageDialog(null, "Username and Pin are not match");
                    int q = JOptionPane.showConfirmDialog(null, "Forget your username and Pin?");
                    if(q == JOptionPane.YES_OPTION){
                        //to open forget page
                        new forget().setVisible(true);
                    }//end of  if forget Question
                }//end of outer if
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_btndeleteActionPerformed

    private void btnbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbackActionPerformed
        // TODO add your handling code here:
        nm = lblname.getText();
        bl = lblbalance.getText();
        new menu(nm,bl).setVisible(true);
        dispose();
    }//GEN-LAST:event_btnbackActionPerformed

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
            java.util.logging.Logger.getLogger(delete.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(delete.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(delete.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(delete.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new delete().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnback;
    private javax.swing.JButton btndelete;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblbalance;
    private javax.swing.JLabel lblname;
    private javax.swing.JLabel lbltb;
    private javax.swing.JPasswordField txtpin;
    private javax.swing.JTextField txtuser;
    // End of variables declaration//GEN-END:variables
}