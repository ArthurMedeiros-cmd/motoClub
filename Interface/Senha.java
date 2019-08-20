/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import model.bean.motoClub;
import model.bean.pessoa;
import model.bean.usuario;
import model.dao.mcDAO;
import model.dao.pessoaDAO;
import model.dao.usuarioDAO;

/**
 *
 * @author papiro
 */
public class Senha extends javax.swing.JFrame {

    /**
     * Creates new form Senha
     */
    private String nome;
    private mcDAO form;
    private usuarioDAO form1;
    private pessoaDAO form2;
    private pessoa pessoa;
    private usuario usuario;
    private motoClub mc;
    private List<motoClub> motoClubs;
    
    public Senha() {
        initComponents();
        form1 = new usuarioDAO();
        form2 = new pessoaDAO();
        form = new mcDAO();
        mc = new motoClub();
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
        txtSenha = new javax.swing.JPasswordField();
        btnOk = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 128, 0));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Confirmar Senha", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 12))); // NOI18N
        jPanel1.setForeground(new java.awt.Color(1, 1, 1));

        btnOk.setBackground(new java.awt.Color(1, 1, 1));
        btnOk.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        btnOk.setForeground(new java.awt.Color(254, 254, 254));
        btnOk.setText("Confirmar");
        btnOk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOkActionPerformed(evt);
            }
        });

        btnCancelar.setBackground(new java.awt.Color(1, 1, 1));
        btnCancelar.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        btnCancelar.setForeground(new java.awt.Color(254, 254, 254));
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/atencao.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(txtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(btnOk)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(162, 162, 162))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(txtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnOk)
                    .addComponent(btnCancelar))
                .addGap(21, 21, 21))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 345, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnOkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOkActionPerformed
        // TODO add your handling code here:
        String senha = txtSenha.getText();
        if(nome.equals("usuario")){
            excluirUsuario(usuario,senha,pessoa);
        }else if(nome.equals("mc")){
            excluirMc(mc, usuario,senha);
        }
        txtSenha.setText("");
        dispose();
    }//GEN-LAST:event_btnOkActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    
     public void excluirUsuario(usuario u,String senha, pessoa p){
        boolean cont = false;
        String user = u.getNome();
        String pass = senha;
        for(usuario u1:form1.Validar()){
            if(u1.getNome().equals(user)){
                if(u1.getSenha().equals(pass)){
                    cont = true;
                    break;                
                }
            }
        }
        if(cont){
            if(form1.Excluir(u)){
                if(form2.Excluir(p))
                JOptionPane.showMessageDialog(null,"EXCLUÍDO COM SUCESSO!");
            }else
                JOptionPane.showMessageDialog(null,"ERRO! SENHA INVÁLIDA!");
        }else{
            JOptionPane.showMessageDialog(null,"SENHA INCORRETA!");
        }
        System.exit(0);
    }
    
    public void excluirMc (motoClub mc, usuario u,String senha){
        boolean cont = false;
        boolean cont1 = false;
        String user = u.getNome();
        String pass = senha;

        for(motoClub u1:motoClubs){
            if(u1.getId() == u.getIdmc()){
                mc = u1;
                mc.setIntegrantes(0);
                form.CadastrarIntegrante(mc);
                break;
            }
        }
                
        for(usuario u2:form1.Validar()){
            if(u2.getIdmc() == mc.getId()){
                u2.setIdmc(4);
                form1.Alterar(u2, "MotoClub");
                cont1 = true;
            }
        }
        
        for(usuario u2:form1.Validar()){
            if(u2.getNome().equals(user)){
                if(u2.getSenha().equals(pass)){
                    cont = true;
                    break;                
                }
            }
        }
  
        if(cont == true && cont1 == true){
            if(form.Excluir(mc)){
                JOptionPane.showMessageDialog(null,"EXCLUÍDO COM SUCESSO!");
            }else
                JOptionPane.showMessageDialog(null,"ERRO! SENHA INVÁLIDA!");
        }else{
            JOptionPane.showMessageDialog(null,"SENHA INCORRETA!");
        }
        dispose();
    }
    
    public void confirmar(String nome, usuario u, motoClub mc, pessoa p, List<motoClub> mcs){ 
        this.nome = nome;
        usuario = u;
        this.mc = mc;
        pessoa = p;
        motoClubs = mcs;
        System.out.println("NOME: "+mc.getNome());
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
            java.util.logging.Logger.getLogger(Senha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Senha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Senha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Senha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Senha().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnOk;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField txtSenha;
    // End of variables declaration//GEN-END:variables
}