package Estrutura;

import static Estrutura.Entrada.entrada;
import static Estrutura.Entrada.aplicacao;
import com.sun.tools.javac.Main;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Aplicacao extends javax.swing.JFrame {
    
    Valores valores = new Valores();

    Comandos comandos = new Comandos(valores); 
    
    public Aplicacao(){
        initComponents();
        try {
            carregaTabela();
        } catch (ClassNotFoundException ex) {
            System.out.println("Exception in load table.");
        }
    }
           
    public void carregaTabela() throws ClassNotFoundException{ 
        DefaultTableModel modelo = new DefaultTableModel();
        jTable2.setModel(modelo);        
        modelo.addColumn("Activity");
        modelo.addColumn("Matter");
        modelo.addColumn("Date");
        modelo.addColumn("Anwsers");
        modelo.addColumn("Questions");
        modelo.setRowCount(0);
        try {
            List<Valores> valores = comandos.getValor();
            for (Valores v : valores) {
                modelo.addRow(new Object[] {
                    v.getAtividade(),
                    v.getMateria(),
                    v.getData(),
                    v.getRespostas(),
                    v.getQuestoes()
                });
            }
        } catch (SQLException e) {
            System.out.println("Sql exception load table.");
        }
        jTable2.getSelectionModel().addListSelectionListener(e -> {
            int linhaSelecionada = jTable2.getSelectedRow();
            if (linhaSelecionada != -1) {
                try {                
                valores.setAtividade(((String) modelo.getValueAt(linhaSelecionada, 0)));
                Atividade.setText(valores.getAtividade());
                Materia.setText((String) modelo.getValueAt(linhaSelecionada, 1));
                Data.setText((String) modelo.getValueAt(linhaSelecionada, 2));
                Respostas.setText((String) modelo.getValueAt(linhaSelecionada, 3));
                Questoes.setValue(Integer.valueOf((String) modelo.getValueAt(linhaSelecionada, 4)));
                } catch (Exception ex) {
                       System.out.println("Exception select in new row table.");
                }
            }
        });
    }

    @SuppressWarnings("unchecked")
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        Data = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        Questao = new javax.swing.JLabel();
        Questoes = new javax.swing.JSpinner();
        jScrollPane1 = new javax.swing.JScrollPane();
        Respostas = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();
        Alterecao = new javax.swing.JButton();
        Recarregar = new javax.swing.JButton();
        Enviar = new javax.swing.JButton();
        Remove = new javax.swing.JButton();
        Atualiza = new javax.swing.JButton();
        Materia = new javax.swing.JTextField();
        Atividade = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jMenuBar1 = new javax.swing.JMenuBar();
        Opcoes = new javax.swing.JMenu();
        sair = new javax.swing.JMenuItem();

        jMenu1.setText("File");
        jMenuBar2.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar2.add(jMenu2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel3.setText("Matter");

        jLabel1.setText("Date");

        Data.setText(" ");

        jLabel4.setText("Activity");

        Questao.setText("Questions");

        Respostas.setColumns(20);
        Respostas.setRows(5);
        jScrollPane1.setViewportView(Respostas);

        jLabel5.setText("Awnsers");

        Alterecao.setText("Update");
        Alterecao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AlterecaoActionPerformed(evt);
            }
        });

        Recarregar.setText("Reload");
        Recarregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RecarregarActionPerformed(evt);
            }
        });

        Enviar.setText("Insert");
        Enviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EnviarActionPerformed(evt);
            }
        });

        Remove.setText("Remove");
        Remove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RemoveActionPerformed(evt);
            }
        });

        Atualiza.setText("Reload");
        Atualiza.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AtualizaActionPerformed(evt);
            }
        });

        Materia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MateriaActionPerformed(evt);
            }
        });

        Atividade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AtividadeActionPerformed(evt);
            }
        });

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        Opcoes.setText("Options");
        Opcoes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OpcoesActionPerformed(evt);
            }
        });

        sair.setText("Logof");
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
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 389, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Recarregar, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(50, 50, 50)
                                .addComponent(Alterecao, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(41, 41, 41)
                                .addComponent(Enviar, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                        .addContainerGap(38, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(22, 22, 22)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(Materia, javax.swing.GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE)
                            .addComponent(Atividade))
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(Questao))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Data)
                            .addComponent(Questoes, javax.swing.GroupLayout.DEFAULT_SIZE, 127, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Remove, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(64, 64, 64)
                .addComponent(Atualiza, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(85, 85, 85))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Materia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1)
                        .addComponent(jLabel3))
                    .addComponent(Data, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(Atividade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Questao))
                    .addComponent(Questoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Alterecao)
                    .addComponent(Recarregar)
                    .addComponent(Enviar))
                .addGap(30, 30, 30)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Atualiza)
                    .addComponent(Remove))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

 
    private void RecarregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RecarregarActionPerformed
            Atividade.setText("");
            Materia.setText("");
            Data.setText("");
            Respostas.setText("");
            Questoes.setValue(0);
    }//GEN-LAST:event_RecarregarActionPerformed

    private void EnviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EnviarActionPerformed
        try {
            comandos.verificaAtividade(Atividade.getText());
        } catch (ClassNotFoundException ex) {
            System.out.println("Exception in verifily table.");
        }
        if(!"".equals(Atividade.getText())){
            if( !(valores.getAtividade().equals(Atividade.getText())) ){
                try {
                    valores.setAtividade(Atividade.getText());
                    valores.setMateria(Materia.getText());
                    valores.setData(Data.getText());
                    valores.setRespostas(Respostas.getText());
                    valores.setQuestoes(Integer.toString((Integer)Questoes.getValue()));
                    comandos.inserirAtividade();
                    JOptionPane.showMessageDialog(null, "Activity insert sussefuly!");
                } catch (ClassNotFoundException ex) {
                    System.out.println("Exception in insert row table.");
                }     
            } else {
                JOptionPane.showMessageDialog(null, "Don't, insert new activity.");
                }
        }else{
                JOptionPane.showMessageDialog(null, "Don't, insert name activity.");
            }        
    }//GEN-LAST:event_EnviarActionPerformed

    private void AtividadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AtividadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AtividadeActionPerformed

    private void MateriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MateriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MateriaActionPerformed

    private void sairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sairActionPerformed
        aplicacao.setVisible(false);
        entrada.setVisible(true);
    }//GEN-LAST:event_sairActionPerformed

    private void OpcoesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OpcoesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_OpcoesActionPerformed

    private void RemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RemoveActionPerformed
        int linhaSelecionada = -1;
        linhaSelecionada = jTable2.getSelectedRow();
        if (linhaSelecionada >= 0) {
            try {
                String Linha = (String) jTable2.getValueAt(linhaSelecionada, 0);
                valores.setAtividade(Linha);
                comandos.removeAtividade();
            } catch (ClassNotFoundException ex) {
                System.out.println("Exception in remove row table.");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Is need selection a row.");
        }
    }//GEN-LAST:event_RemoveActionPerformed

    private void AtualizaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AtualizaActionPerformed
        try {
            carregaTabela();
        } catch (ClassNotFoundException ex) {
            System.out.println("Exception in reload table.");
        }
    }//GEN-LAST:event_AtualizaActionPerformed

    private void AlterecaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AlterecaoActionPerformed
        try {
            comandos.verificaAtividade(Atividade.getText());
        } catch (ClassNotFoundException ex) {
            System.out.println("Exception in verifily table.");
        }
        if(!"".equals(Atividade.getText())){
            if(valores.getAtividade().equals(Atividade.getText())){
                valores.setAtividade(Atividade.getText());
                valores.setMateria(Materia.getText());
                valores.setData(Data.getText());
                valores.setRespostas(Respostas.getText());
                valores.setQuestoes(Integer.toString((Integer)Questoes.getValue()));        
                comandos.AlteraAtividade();
            }else{
                JOptionPane.showMessageDialog(null, "Activity didn't alter!");
            }
        }else{
            JOptionPane.showMessageDialog(null, "Select a row for alter.");
        }
    }//GEN-LAST:event_AlterecaoActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            System.out.println("Exception in classe of mathod run.");
        } catch (InstantiationException ex) {
            System.out.println("Exception in instantiation.");
        } catch (IllegalAccessException ex) {
            System.out.println("Exception of illegal access.");
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            System.out.println("Exception in javax swing.");
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                entrada.BemVindo();
                entrada.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Alterecao;
    private javax.swing.JTextField Atividade;
    private javax.swing.JButton Atualiza;
    private javax.swing.JTextField Data;
    private javax.swing.JButton Enviar;
    private javax.swing.JTextField Materia;
    private javax.swing.JMenu Opcoes;
    private javax.swing.JLabel Questao;
    private javax.swing.JSpinner Questoes;
    private javax.swing.JButton Recarregar;
    private javax.swing.JButton Remove;
    private javax.swing.JTextArea Respostas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    public javax.swing.JTable jTable2;
    private javax.swing.JMenuItem sair;
    // End of variables declaration//GEN-END:variables
}
