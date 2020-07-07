/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

/**
 *
 * @author PICHAU
 */
public class Index extends javax.swing.JFrame {

    /**
     * Creates new form Index
     */
    public Index() {
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

        jLabel1 = new javax.swing.JLabel();
        img = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jPessoaFisica = new javax.swing.JMenuItem();
        jPessoaJuridica = new javax.swing.JMenuItem();
        jMenuLogin = new javax.swing.JMenuItem();
        jSair = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Candara", 1, 48)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("BEM VINDO!");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(170, 110, 370, 60);

        img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/logo (1).png"))); // NOI18N
        getContentPane().add(img);
        img.setBounds(180, 210, 355, 170);

        jMenu1.setText("Iniciar");
        jMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu1ActionPerformed(evt);
            }
        });

        jPessoaFisica.setText("Cadastrar Pessoa Fisica");
        jPessoaFisica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPessoaFisicaActionPerformed(evt);
            }
        });
        jMenu1.add(jPessoaFisica);

        jPessoaJuridica.setText("Cadastrar Pessoa Juridica");
        jPessoaJuridica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPessoaJuridicaActionPerformed(evt);
            }
        });
        jMenu1.add(jPessoaJuridica);

        jMenuLogin.setText("Login");
        jMenuLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuLoginActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuLogin);

        jSair.setText("Sair");
        jSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSairActionPerformed(evt);
            }
        });
        jMenu1.add(jSair);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        setSize(new java.awt.Dimension(716, 639));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu1ActionPerformed
        // TODO add your handling code here:
      
     
    }//GEN-LAST:event_jMenu1ActionPerformed

    private void jPessoaFisicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPessoaFisicaActionPerformed
        // TODO add your handling code here:
        new PessoFisica().setVisible(true);
    }//GEN-LAST:event_jPessoaFisicaActionPerformed

    private void jPessoaJuridicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPessoaJuridicaActionPerformed
        // TODO add your handling code here:
        new PessoJuridica().setVisible(true);
    }//GEN-LAST:event_jPessoaJuridicaActionPerformed

    private void jMenuLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuLoginActionPerformed
        // TODO add your handling code here:
        new Login().setVisible(true);
    }//GEN-LAST:event_jMenuLoginActionPerformed

    private void jSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSairActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jSairActionPerformed

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
            java.util.logging.Logger.getLogger(Index.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Index.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Index.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Index.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Index().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel img;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuLogin;
    private javax.swing.JMenuItem jPessoaFisica;
    private javax.swing.JMenuItem jPessoaJuridica;
    private javax.swing.JMenuItem jSair;
    // End of variables declaration//GEN-END:variables
}