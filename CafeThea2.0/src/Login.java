
import Utilities.DatabaseManager;
import Utilities.DatabaseManager.DatabaseSetup;
import java.awt.Color;



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Bryce
 */
public class Login extends javax.swing.JFrame {
    
    private DatabaseManager db;
    
    /**
     * Creates new form Login
     */
    public Login() {
        initComponents();
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
        usernameTF = new javax.swing.JTextField();
        passwordTF = new javax.swing.JPasswordField();
        loginButton = new javax.swing.JButton();
        loginLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(400, 250));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        usernameTF.setForeground(new java.awt.Color(204, 204, 204));
        usernameTF.setText("Username");
        usernameTF.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                usernameTFFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                usernameTFFocusLost(evt);
            }
        });

        passwordTF.setForeground(new java.awt.Color(204, 204, 204));
        passwordTF.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                passwordTFFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                passwordTFFocusLost(evt);
            }
        });

        loginButton.setText("Login");
        loginButton.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        loginButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        loginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginButtonActionPerformed(evt);
            }
        });

        loginLabel.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        loginLabel.setText("Login");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(passwordTF, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(167, 167, 167)
                                .addComponent(loginLabel))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(68, 68, 68)
                                .addComponent(usernameTF, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(158, 158, 158)
                        .addComponent(loginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(72, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(loginLabel)
                .addGap(18, 18, 18)
                .addComponent(usernameTF, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(passwordTF, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(loginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void loginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginButtonActionPerformed
        // TODO add your handling code here:
        if (usernameTF.getText().equals("user") && passwordTF.getText().equals("password")){
            dispose();
            DailyOrders orderstoday = new DailyOrders();
            orderstoday.show();
            db = new DatabaseManager();
        }
        
            
    }//GEN-LAST:event_loginButtonActionPerformed

    private void usernameTFFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_usernameTFFocusGained
        // TODO add your handling code here:
        if(usernameTF.getText().equals("Username"))
        {
            usernameTF.setText("");
            usernameTF.setForeground(new Color(153,153,153));
        } 
    }//GEN-LAST:event_usernameTFFocusGained

    private void usernameTFFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_usernameTFFocusLost
        // TODO add your handling code here:
        if(usernameTF.getText().equals(""))
        {
            usernameTF.setText("Username");
            usernameTF.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_usernameTFFocusLost

    private void passwordTFFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_passwordTFFocusGained
        // TODO add your handling code here:
        if(passwordTF.getText().equals("Password"))
        {
            passwordTF.setText("");
            passwordTF.setForeground(new Color(153,153,153));
        } 
    }//GEN-LAST:event_passwordTFFocusGained

    private void passwordTFFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_passwordTFFocusLost
        // TODO add your handling code here:
        if(passwordTF.getText().equals(""))
        {
            passwordTF.setText("Password");
            passwordTF.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_passwordTFFocusLost

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton loginButton;
    private javax.swing.JLabel loginLabel;
    private javax.swing.JPasswordField passwordTF;
    private javax.swing.JTextField usernameTF;
    // End of variables declaration//GEN-END:variables
}
