//source code for create account

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Atmbanking;
import javax.swing.*;
import java.awt.*;
import java.sql.*;
/**
 *
 * @author HP
 */
public class create extends javax.swing.JFrame {
Connection con;
Statement stmt;
PreparedStatement pstmt,pstmt1;
ResultSet rs1,rs;
String actname, actuname, actpin, actconpin, name, username, actbal;//
String driver = "com.mysql.cj.jdbc.Driver";
String uname = "root";
String pass = "";
String dbaseHost = "jdbc:mysql://localhost/";
    /**
     * Creates new form create
     */
    public create() {
        initComponents();
        setLocationRelativeTo(null);
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
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtname = new javax.swing.JTextField();
        txtuname = new javax.swing.JTextField();
        lblname = new javax.swing.JLabel();
        lbluser = new javax.swing.JLabel();
        lblpin = new javax.swing.JLabel();
        txtpin = new javax.swing.JTextField();
        lblconpin = new javax.swing.JLabel();
        jpasspin = new javax.swing.JPasswordField();
        btncreate = new javax.swing.JButton();
        btnback = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        lbltitle = new javax.swing.JLabel();
        lblconpin1 = new javax.swing.JLabel();
        txtbalance = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(21, 21, 134));
        jPanel1.setPreferredSize(new java.awt.Dimension(500, 550));

        txtname.setBackground(new java.awt.Color(255, 255, 255));
        txtname.setForeground(new java.awt.Color(0, 0, 0));
        txtname.setPreferredSize(new java.awt.Dimension(232, 40));

        txtuname.setBackground(new java.awt.Color(255, 255, 255));
        txtuname.setForeground(new java.awt.Color(0, 0, 0));
        txtuname.setPreferredSize(new java.awt.Dimension(232, 40));

        lblname.setBackground(new java.awt.Color(255, 255, 255));
        lblname.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        lblname.setForeground(new java.awt.Color(255, 255, 255));
        lblname.setText("NAME");

        lbluser.setBackground(new java.awt.Color(255, 255, 255));
        lbluser.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        lbluser.setForeground(new java.awt.Color(255, 255, 255));
        lbluser.setText("USERNAME");

        lblpin.setBackground(new java.awt.Color(255, 255, 255));
        lblpin.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        lblpin.setForeground(new java.awt.Color(255, 255, 255));
        lblpin.setText("PIN NUMBER");

        txtpin.setBackground(new java.awt.Color(255, 255, 255));
        txtpin.setForeground(new java.awt.Color(0, 0, 0));
        txtpin.setPreferredSize(new java.awt.Dimension(232, 40));

        lblconpin.setBackground(new java.awt.Color(255, 255, 255));
        lblconpin.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        lblconpin.setForeground(new java.awt.Color(255, 255, 255));
        lblconpin.setText("CONFIRM PIN");

        jpasspin.setBackground(new java.awt.Color(255, 255, 255));
        jpasspin.setForeground(new java.awt.Color(0, 0, 0));
        jpasspin.setPreferredSize(new java.awt.Dimension(232, 40));

        btncreate.setBackground(new java.awt.Color(11, 29, 111));
        btncreate.setForeground(new java.awt.Color(255, 255, 255));
        btncreate.setText("CREATE");
        btncreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncreateActionPerformed(evt);
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

        jPanel2.setBackground(new java.awt.Color(21, 21, 134));

        lbltitle.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        lbltitle.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lbltitle.setText("CREATE YOUR ACCOUNT HERE");
        lbltitle.setToolTipText("");
        lbltitle.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        lbltitle.setVerticalTextPosition(javax.swing.SwingConstants.TOP);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(101, 101, 101)
                .addComponent(lbltitle)
                .addContainerGap(103, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(lbltitle)
                .addGap(0, 12, Short.MAX_VALUE))
        );

        lblconpin1.setBackground(new java.awt.Color(255, 255, 255));
        lblconpin1.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        lblconpin1.setForeground(new java.awt.Color(255, 255, 255));
        lblconpin1.setText("INITIAL BALANCE");

        txtbalance.setBackground(new java.awt.Color(255, 255, 255));
        txtbalance.setForeground(new java.awt.Color(0, 0, 0));
        txtbalance.setPreferredSize(new java.awt.Dimension(232, 40));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtbalance, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblconpin1)
                    .addComponent(lblname)
                    .addComponent(lblpin)
                    .addComponent(lbluser)
                    .addComponent(txtname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btncreate)
                        .addGap(95, 95, 95)
                        .addComponent(btnback))
                    .addComponent(txtuname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jpasspin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblconpin)
                    .addComponent(txtpin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(130, 130, 130))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblname)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lbluser)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtuname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblpin)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtpin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblconpin)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpasspin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblconpin1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtbalance, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btncreate)
                    .addComponent(btnback))
                .addContainerGap(72, Short.MAX_VALUE))
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

    private void btncreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncreateActionPerformed
        actname = txtname.getText();
        actuname = txtuname.getText();
        actpin = txtpin.getText();
        actconpin = jpasspin.getText();
        actbal = txtbalance.getText();

        if(actname.equals("") && actuname.equals("") && actpin.equals("") && actconpin.equals("") && actbal.equals("")){//identify if all field are null
            JOptionPane.showMessageDialog(null, "All Field are Empty");
        }else if(actname.equals("")){//identify if name is null
            JOptionPane.showMessageDialog(null, "Name is Empty");
        }else if(actuname.equals("")){//identify if user is null
            JOptionPane.showMessageDialog(null, "Username is Empty");
        }else if(actpin.equals("")){//identify if pin is null
            JOptionPane.showMessageDialog(null, "Pin is Empty");
        }else if(actconpin.equals("")){//identify if confirm pin is null
            JOptionPane.showMessageDialog(null, "Confirm Pin is Empty ");
        }else if(actbal.equals("")){
            JOptionPane.showMessageDialog(null, "Account Balance is Empty ");
        }
        
        try{
            //get specific name value || input value
            name = txtname.getText();
            String query = "SELECT * from userrecord " + "WHERE name = ? ";
            pstmt = con.prepareStatement(query);
            
            //get specific username value || input value
            username = txtuname.getText();
            String query1 = "SELECT * from userrecord " + "WHERE username = ? ";
            pstmt1 = con.prepareStatement(query1);
            
            //set String Value
            pstmt.setString(1,name);
            pstmt1.setString(1, username);
            
            //execute select query
            rs = pstmt.executeQuery();//name
            rs1 = pstmt1.executeQuery();//usernanme
            
            //check if account already exist
            if(rs.next()){
                //identify if name and username already exist
                JOptionPane.showMessageDialog(null, "Account name already exists");
            }//end of identify if name and username already exist
            else if(rs1.next()){
                //identify if username already exist
                JOptionPane.showMessageDialog(null, "Username already used");
            }//
            else if(!rs.next() && !rs1.next()){//if not use field open
                txtpin.setVisible(true);//txtfield pin
                jpasspin.setVisible(true);//txtfield passpin
                lblpin.setVisible(true);//label pin
                lblconpin.setVisible(true);//label passpin   
            }//end of check account exist
            
            //to insert account
            //to check if pin is match
            if(actpin.equals(actconpin)){
                try{    
                    stmt = con.createStatement();
                    stmt.executeUpdate("INSERT into userrecord " + "(pin,name,username,balance) VALUES('" + actconpin + "', '" + actname + "', '" + actuname + "', " + actbal + ")");
                    JOptionPane.showMessageDialog(null, "CREATE SUCCESSFULLY");
                }catch(HeadlessException | SQLException e){
                    JOptionPane.showMessageDialog(null, "Create Cancelled ");
                }//end of inner try
            }//end of check pin match
            else{ 
                JOptionPane.showMessageDialog(null, "PIN NOT MATCH");
            }//end of check pin match
            
        }catch(HeadlessException | SQLException e){
            JOptionPane.showMessageDialog(null, e);
        }//outertry
    }//GEN-LAST:event_btncreateActionPerformed

    private void btnbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbackActionPerformed
        try{
            //open login page
            new login().setVisible(true);
        }finally{
            //close current page
            new create();setVisible(false);
        }

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
            java.util.logging.Logger.getLogger(create.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(create.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(create.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(create.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new create().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnback;
    private javax.swing.JButton btncreate;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField jpasspin;
    private javax.swing.JLabel lblconpin;
    private javax.swing.JLabel lblconpin1;
    private javax.swing.JLabel lblname;
    private javax.swing.JLabel lblpin;
    private javax.swing.JLabel lbltitle;
    private javax.swing.JLabel lbluser;
    private javax.swing.JTextField txtbalance;
    private javax.swing.JTextField txtname;
    private javax.swing.JTextField txtpin;
    private javax.swing.JTextField txtuname;
    // End of variables declaration//GEN-END:variables
}
