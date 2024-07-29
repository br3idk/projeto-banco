package View;

import java.awt.Toolkit;
import javax.swing.JOptionPane;

public class TelaLogin extends javax.swing.JFrame {
    
    //posso criar variáveis globais aqui

    private final String superAdm = "asd"; //final equivale a const
    private final String superSenha = "qwe";

    public TelaLogin() {
        initComponents();
        setTitle("Login do sistema"); 
        setResizable(false);
        setLocationRelativeTo(null);
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("\\Imagens\\login-icon.png")));
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        lblCardIcon = new javax.swing.JLabel();
        lblUNPBank = new javax.swing.JLabel();
        lblLogoFrase = new javax.swing.JLabel();
        lblAjuda = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        lblSenha = new javax.swing.JLabel();
        lblUsuario = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        txtSenha = new javax.swing.JPasswordField();
        lblBV = new javax.swing.JLabel();
        btnLogin = new javax.swing.JButton();
        checkBoxSenha = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(0, 153, 255));

        lblCardIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Imagens/card-icon.png"))); // NOI18N

        lblUNPBank.setBackground(new java.awt.Color(255, 255, 255));
        lblUNPBank.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblUNPBank.setForeground(new java.awt.Color(255, 255, 255));
        lblUNPBank.setText("UNPBank");

        lblLogoFrase.setBackground(new java.awt.Color(255, 255, 255));
        lblLogoFrase.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        lblLogoFrase.setForeground(new java.awt.Color(255, 255, 255));
        lblLogoFrase.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblLogoFrase.setText("Cadastro e consulta de contas");

        lblAjuda.setBackground(new java.awt.Color(255, 255, 255));
        lblAjuda.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        lblAjuda.setForeground(new java.awt.Color(255, 255, 255));
        lblAjuda.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAjuda.setText("Ajuda? Contate o suporte");
        lblAjuda.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblAjuda.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblAjudaMouseEntered(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        lblSenha.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblSenha.setForeground(new java.awt.Color(0, 0, 0));
        lblSenha.setText("Senha:");

        lblUsuario.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblUsuario.setForeground(new java.awt.Color(0, 0, 0));
        lblUsuario.setText("Usuário:");

        txtUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsuarioActionPerformed(evt);
            }
        });

        txtSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSenhaActionPerformed(evt);
            }
        });

        lblBV.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblBV.setForeground(new java.awt.Color(0, 0, 0));
        lblBV.setText("Bem - vindo (a)");

        btnLogin.setText("Entrar");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });
        btnLogin.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnLoginKeyPressed(evt);
            }
        });

        checkBoxSenha.setForeground(new java.awt.Color(255, 255, 255));
        checkBoxSenha.setText("Mostrar senha");
        checkBoxSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkBoxSenhaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblBV)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblUsuario)
                                    .addComponent(lblSenha))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtSenha)
                                    .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(88, 88, 88)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addComponent(btnLogin)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(checkBoxSenha, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE))))
                .addGap(25, 25, 25))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(lblBV)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUsuario)
                    .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSenha)
                    .addComponent(txtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(checkBoxSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addComponent(btnLogin)
                .addGap(31, 31, 31))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(lblUNPBank))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(lblAjuda))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblLogoFrase))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addComponent(lblCardIcon)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblUNPBank)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblCardIcon)
                .addGap(12, 12, 12)
                .addComponent(lblLogoFrase)
                .addGap(35, 35, 35)
                .addComponent(lblAjuda)
                .addGap(17, 17, 17))
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    

    
    private void txtUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsuarioActionPerformed

    private void checkBoxSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkBoxSenhaActionPerformed

        if (checkBoxSenha.isSelected()) {
            txtSenha.setEchoChar((char)0);   
        } else {
            txtSenha.setEchoChar('*');
        }
        
    }//GEN-LAST:event_checkBoxSenhaActionPerformed

    private void txtSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSenhaActionPerformed

    }//GEN-LAST:event_txtSenhaActionPerformed


    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
      
        String usuario = txtUsuario.getText();
        String senha = txtSenha.getText();
        
       if (usuario.equals(superAdm) && senha.equals(superSenha)) {
           
           JOptionPane.showMessageDialog(null, "Permissão concedida", "SUCESSO!", JOptionPane.INFORMATION_MESSAGE);
           System.out.println("Deu bom");
           
        } else if(usuario.isEmpty() || senha.isEmpty()) {
            
            JOptionPane.showMessageDialog(null, "Campos não preenchidos totalmente", "FALTAM DADOS!", JOptionPane.WARNING_MESSAGE);
            
        } else {
            JOptionPane.showMessageDialog(null, "Dados informados não coincidem em uma conta nos nossos registros", "DADOS INVÁLIDOS!", JOptionPane.ERROR_MESSAGE);
        }

        //display no console pra ver se deu tudo certo
        
        System.out.println(txtUsuario.getText());
        System.out.println(txtSenha.getText());

        
        

    }//GEN-LAST:event_btnLoginActionPerformed

    private void btnLoginKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnLoginKeyPressed
        //Logar();
    }//GEN-LAST:event_btnLoginKeyPressed

    private void lblAjudaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAjudaMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_lblAjudaMouseEntered

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
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogin;
    private javax.swing.JCheckBox checkBoxSenha;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblAjuda;
    private javax.swing.JLabel lblBV;
    private javax.swing.JLabel lblCardIcon;
    private javax.swing.JLabel lblLogoFrase;
    private javax.swing.JLabel lblSenha;
    private javax.swing.JLabel lblUNPBank;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JPasswordField txtSenha;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
