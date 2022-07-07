package Database;

import javax.swing.JOptionPane;

/**
 *
 * @author db2inst226
 */
public class Login extends javax.swing.JFrame {

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

        jPanelBack = new javax.swing.JPanel();
        userName = new javax.swing.JLabel();
        password = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        login = new javax.swing.JButton();
        txtPass = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Admin Login");
        setResizable(false);

        jPanelBack.setLayout(null);

        userName.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        userName.setText("USERNAME");
        jPanelBack.add(userName);
        userName.setBounds(90, 280, 80, 17);

        password.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        password.setText("PASSWORD");
        jPanelBack.add(password);
        password.setBounds(90, 350, 82, 17);

        txtUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsernameActionPerformed(evt);
            }
        });
        jPanelBack.add(txtUsername);
        txtUsername.setBounds(250, 280, 150, 30);

        login.setText("LOGIN");
        login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginActionPerformed(evt);
            }
        });
        jPanelBack.add(login);
        login.setBounds(310, 400, 80, 40);
        jPanelBack.add(txtPass);
        txtPass.setBounds(250, 340, 146, 30);

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\db2inst226\\Documents\\NetBeansProjects\\DB2HotelManagement\\src\\Database\\Background\\LoginBackground.jpg")); // NOI18N
        jPanelBack.add(jLabel1);
        jLabel1.setBounds(0, 0, 500, 500);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanelBack, javax.swing.GroupLayout.PREFERRED_SIZE, 498, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 1, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanelBack, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(500, 500));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsernameActionPerformed

    private void loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginActionPerformed
        String nama, pass;
        nama = txtUsername.getText();
        pass = txtPass.getText();
        
        if (nama.equals("admin") && pass.equals("admin")) {
            this.setVisible(false);
            new Main_Menu(this).setVisible(true);
        } else {
         JOptionPane.showMessageDialog(this, "Invalid Username or Password");
        }

    }//GEN-LAST:event_loginActionPerformed

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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanelBack;
    private javax.swing.JButton login;
    private javax.swing.JLabel password;
    private javax.swing.JPasswordField txtPass;
    private javax.swing.JTextField txtUsername;
    private javax.swing.JLabel userName;
    // End of variables declaration//GEN-END:variables
}
