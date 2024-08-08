/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import javax.swing.JOptionPane;
import java.sql.ResultSet;
import java.sql.SQLException;


/**
 *
 * @author Leticia
 */
import DAO.UsuarioDAO;
import DTO.UEPA_LoginDTO;

public class UEPA_TelaLogin extends javax.swing.JFrame {

    /**
     * Creates new form UEPA_TelaLogin
     */
    public UEPA_TelaLogin() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txt_Usuario = new javax.swing.JTextField();
        jbl_Usuario = new javax.swing.JLabel();
        jbl_Senha = new javax.swing.JLabel();
        Senha = new javax.swing.JPasswordField();
        Btn_Logar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 249, 235));
        setBounds(new java.awt.Rectangle(0, 0, 0, 0));
        setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        setLocation(new java.awt.Point(10, 10));
        setMaximizedBounds(new java.awt.Rectangle(0, 0, 0, 0));
        setSize(new java.awt.Dimension(500, 500));
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.MatteBorder(null), new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        jPanel1.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.setMaximumSize(new java.awt.Dimension(200, 300));
        jPanel1.setPreferredSize(new java.awt.Dimension(500, 500));
        jPanel1.setLayout(null);

        txt_Usuario.setBackground(new java.awt.Color(153, 153, 255));
        txt_Usuario.setForeground(new java.awt.Color(0, 0, 0));
        txt_Usuario.setBorder(null);
        txt_Usuario.setCaretColor(new java.awt.Color(0, 0, 0));
        txt_Usuario.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        txt_Usuario.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txt_Usuario.setMaximumSize(new java.awt.Dimension(100, 50));
        txt_Usuario.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        txt_Usuario.setSelectionColor(new java.awt.Color(0, 0, 0));
        txt_Usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_UsuarioActionPerformed(evt);
            }
        });
        jPanel1.add(txt_Usuario);
        txt_Usuario.setBounds(130, 50, 290, 30);

        jbl_Usuario.setBackground(new java.awt.Color(204, 204, 204));
        jbl_Usuario.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 14)); // NOI18N
        jbl_Usuario.setForeground(new java.awt.Color(0, 0, 0));
        jbl_Usuario.setText("USUARIO:");
        jbl_Usuario.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jbl_Usuario);
        jbl_Usuario.setBounds(50, 50, 80, 30);

        jbl_Senha.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 14)); // NOI18N
        jbl_Senha.setForeground(new java.awt.Color(0, 0, 0));
        jbl_Senha.setText("SENHA:");
        jPanel1.add(jbl_Senha);
        jbl_Senha.setBounds(60, 100, 60, 30);

        Senha.setBackground(new java.awt.Color(153, 153, 255));
        Senha.setBorder(null);
        Senha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SenhaActionPerformed(evt);
            }
        });
        jPanel1.add(Senha);
        Senha.setBounds(130, 100, 290, 30);

        Btn_Logar.setBackground(new java.awt.Color(0, 0, 204));
        Btn_Logar.setForeground(new java.awt.Color(255, 255, 255));
        Btn_Logar.setText("Logar");
        Btn_Logar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Btn_Logar.setMaximumSize(new java.awt.Dimension(60, 50));
        Btn_Logar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_LogarActionPerformed(evt);
            }
        });
        jPanel1.add(Btn_Logar);
        Btn_Logar.setBounds(210, 150, 110, 30);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon_user.png"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(-30, -10, 370, 290);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(10, 0, 440, 210);

        setBounds(0, 0, 473, 252);
    }// </editor-fold>//GEN-END:initComponents

    private void SenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SenhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SenhaActionPerformed

    private void txt_UsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_UsuarioActionPerformed
        
    }//GEN-LAST:event_txt_UsuarioActionPerformed

    private void Btn_LogarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_LogarActionPerformed
        Logar();
    }//GEN-LAST:event_Btn_LogarActionPerformed

    public static void main(String args[]) {

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
            java.util.logging.Logger.getLogger(UEPA_TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UEPA_TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UEPA_TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UEPA_TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UEPA_TelaLogin().setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Btn_Logar;
    private javax.swing.JPasswordField Senha;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel jbl_Senha;
    private javax.swing.JLabel jbl_Usuario;
    private javax.swing.JTextField txt_Usuario;
    // End of variables declaration//GEN-END:variables

    private void Logar() {
        try {
            String usuario, senha;

            usuario = txt_Usuario.getText();
            senha = new String (Senha.getPassword());

            UEPA_LoginDTO objUsuariodto = new UEPA_LoginDTO();
            objUsuariodto.setUsuario(usuario);
            objUsuariodto.setSenha(senha); //envia dado inserido para as variáveis

            UsuarioDAO objUsuariodao = new UsuarioDAO();
            ResultSet rsusuariodao = objUsuariodao.autenticacaoUsuario(objUsuariodto); //conecta com dao

            if (rsusuariodao.next()) {
                //mensagem e chama a proxima tela
                JOptionPane.showMessageDialog(this, "Login bem sucedido!");
                JOptionPane.showMessageDialog(this, "Abrindo área do aluno...");
                UEPA_TelaDados tela2 = new UEPA_TelaDados();
                tela2.setVisible(true);
                
                dispose();
            } else {
                JOptionPane.showMessageDialog(this, "Usuário ou senha inválidos!");
            }
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "UEPA_TelaLogin" + erro);
        }
    }

}
