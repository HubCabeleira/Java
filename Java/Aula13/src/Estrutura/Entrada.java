package Estrutura;

import com.sun.tools.javac.Main;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Entrada extends javax.swing.JFrame {
    
    Valores valores = new Valores();

    Comandos comandos = new Comandos(valores);
    
    public boolean cadastrando;
    
    static Aplicacao aplicacao = new Aplicacao();
    
    static Entrada entrada = new Entrada();
    
    public Entrada(){
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup5 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        senha1 = new javax.swing.JPasswordField();
        senha2 = new javax.swing.JPasswordField();
        Entrada = new javax.swing.JRadioButton();
        Cadastro = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Recarrega = new javax.swing.JButton();
        Enviar = new javax.swing.JButton();
        usuario = new javax.swing.JTextField();
        jMenuBar1 = new javax.swing.JMenuBar();
        Opcoes = new javax.swing.JMenu();
        sair = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        senha1.setText("jPasswordField1");
        senha1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                senha1ActionPerformed(evt);
            }
        });

        senha2.setText("jPasswordField2");
        senha2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                senha2ActionPerformed(evt);
            }
        });

        buttonGroup1.add(Entrada);
        Entrada.setText("Log In");
        Entrada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EntradaActionPerformed(evt);
            }
        });

        buttonGroup1.add(Cadastro);
        Cadastro.setText("Log On");
        Cadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CadastroActionPerformed(evt);
            }
        });

        jLabel1.setText("Password");

        jLabel2.setText("Nickname");

        jLabel3.setText("Password");

        Recarrega.setText("Reply");
        Recarrega.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RecarregaActionPerformed(evt);
            }
        });

        Enviar.setText("Send");
        Enviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EnviarActionPerformed(evt);
            }
        });

        usuario.setText("Insert Name");
        usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usuarioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(Entrada)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Cadastro))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 67, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(usuario, javax.swing.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(senha1, javax.swing.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE)
                                    .addComponent(senha2))))))
                .addGap(47, 94, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Recarrega)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Enviar)
                .addGap(33, 33, 33))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Entrada)
                    .addComponent(Cadastro))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(usuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(senha1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(senha2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Enviar)
                    .addComponent(Recarrega))
                .addGap(31, 31, 31))
        );

        Opcoes.setText("Options");
        Opcoes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OpcoesActionPerformed(evt);
            }
        });

        sair.setText("Exit");
        sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sairActionPerformed(evt);
            }
        });
        Opcoes.add(sair);

        jMenuBar1.add(Opcoes);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void sairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_sairActionPerformed

    private void OpcoesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OpcoesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_OpcoesActionPerformed

    private void EnviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EnviarActionPerformed
        if (cadastrando == true){
            String nomes = usuario.getText();
            if (nomes.length() >= 8) {
                if (senha1.getText().equals(senha2.getText())){
                    JOptionPane.showMessageDialog(null, "User logon sussefull!");
                    String senha = senha1.getText();
                    valores.setNome(nomes);
                    valores.setSenha(senha);
                    try {                   
                        comandos.inserirUsuario();
                    } catch (ClassNotFoundException ex) {
                        System.out.println("Exception in found class.");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Passwords worng!");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Insert name with eithg caractres or more.");
            }
        }else{
            String nomes = usuario.getText();
            try {
                comandos.verificaUsuario(nomes);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            }
            if(senha1.getText().equals(valores.getSenha())){
                JOptionPane.showMessageDialog(null, "User value!");
                aplicacao.setVisible(true);
                entrada.setVisible(false);
            }else{
                JOptionPane.showMessageDialog(null, "User invalue!");
            }
        }
    }//GEN-LAST:event_EnviarActionPerformed

    private void RecarregaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RecarregaActionPerformed
        usuario.setText(null);
        senha1.setText(null);
        senha2.setText(null);
    }//GEN-LAST:event_RecarregaActionPerformed

    private void CadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CadastroActionPerformed
        cadastrando = true;
        senha2.setVisible(true);
        jLabel3.setVisible(true);
    }//GEN-LAST:event_CadastroActionPerformed

    private void EntradaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EntradaActionPerformed
        cadastrando = false;
        senha2.setVisible(false);
        jLabel3.setVisible(false);
    }//GEN-LAST:event_EntradaActionPerformed

    private void senha2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_senha2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_senha2ActionPerformed

    private void senha1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_senha1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_senha1ActionPerformed

    private void usuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usuarioActionPerformed

    public void BemVindo() { 
        JOptionPane.showMessageDialog(null,
	"Do you logon, login in has account, insert has date and look!", 
        "Validate of anwsers ", JOptionPane.INFORMATION_MESSAGE); 
	 }    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton Cadastro;
    private javax.swing.JRadioButton Entrada;
    private javax.swing.JButton Enviar;
    private javax.swing.JMenu Opcoes;
    private javax.swing.JButton Recarrega;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JMenuItem sair;
    private javax.swing.JPasswordField senha1;
    private javax.swing.JPasswordField senha2;
    private javax.swing.JTextField usuario;
    // End of variables declaration//GEN-END:variables

}

