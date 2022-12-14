/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import controller.AlunoController;
import javax.swing.JOptionPane;
import model.dao.AlunoDao;
import model.dto.AlunoDTO;

/*
 * @author Felipe V
 */
public class TelaAluno extends javax.swing.JFrame {

    /*
     * Creates new form Aluno
     */
    public TelaAluno() {
        initComponents();
        
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelTituloAluno = new javax.swing.JLabel();
        jLabelNomeAluno = new javax.swing.JLabel();
        jTextFieldNomeAluno = new javax.swing.JTextField();
        jButtonConsultarAluno = new javax.swing.JButton();
        jButtonCadastrarAluno = new javax.swing.JButton();
        jButtonAlterarAluno = new javax.swing.JButton();
        jButtonExcluirAluno = new javax.swing.JButton();
        jButtonVoltaMenu = new javax.swing.JButton();
        jLabelMedia = new javax.swing.JLabel();
        jTextFieldMedia = new javax.swing.JTextField();
        jLabelSituacao = new javax.swing.JLabel();
        jTextFieldSituacao = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabelTituloAluno.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabelTituloAluno.setForeground(new java.awt.Color(30, 163, 163));
        jLabelTituloAluno.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTituloAluno.setText("P??GINA DO ALUNO");

        jLabelNomeAluno.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelNomeAluno.setForeground(new java.awt.Color(30, 163, 163));
        jLabelNomeAluno.setText("Nome:");

        jTextFieldNomeAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNomeAlunoActionPerformed(evt);
            }
        });

        jButtonConsultarAluno.setBackground(new java.awt.Color(30, 163, 163));
        jButtonConsultarAluno.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButtonConsultarAluno.setForeground(new java.awt.Color(255, 255, 255));
        jButtonConsultarAluno.setText("Consultar");
        jButtonConsultarAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConsultarAlunoActionPerformed(evt);
            }
        });

        jButtonCadastrarAluno.setBackground(new java.awt.Color(30, 112, 112));
        jButtonCadastrarAluno.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButtonCadastrarAluno.setForeground(new java.awt.Color(255, 255, 255));
        jButtonCadastrarAluno.setText("Cadastrar");
        jButtonCadastrarAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCadastrarAlunoActionPerformed(evt);
            }
        });

        jButtonAlterarAluno.setBackground(new java.awt.Color(30, 112, 112));
        jButtonAlterarAluno.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButtonAlterarAluno.setForeground(new java.awt.Color(255, 255, 255));
        jButtonAlterarAluno.setText("Alterar");
        jButtonAlterarAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAlterarAlunoActionPerformed(evt);
            }
        });

        jButtonExcluirAluno.setBackground(new java.awt.Color(30, 112, 112));
        jButtonExcluirAluno.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButtonExcluirAluno.setForeground(new java.awt.Color(255, 255, 255));
        jButtonExcluirAluno.setText("Excluir");
        jButtonExcluirAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExcluirAlunoActionPerformed(evt);
            }
        });

        jButtonVoltaMenu.setBackground(new java.awt.Color(28, 68, 135));
        jButtonVoltaMenu.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButtonVoltaMenu.setForeground(new java.awt.Color(255, 255, 255));
        jButtonVoltaMenu.setText("Menu");
        jButtonVoltaMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVoltaMenuActionPerformed(evt);
            }
        });

        jLabelMedia.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelMedia.setForeground(new java.awt.Color(30, 163, 163));
        jLabelMedia.setText("M??dia:");

        jTextFieldMedia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldMediaActionPerformed(evt);
            }
        });

        jLabelSituacao.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelSituacao.setForeground(new java.awt.Color(30, 163, 163));
        jLabelSituacao.setText("Situa????o (refor??o ou aprovado):");

        jTextFieldSituacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldSituacaoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelTituloAluno, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldMedia, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldNomeAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldSituacao, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelNomeAluno)
                            .addComponent(jLabelMedia)
                            .addComponent(jLabelSituacao)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(jButtonCadastrarAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(40, 40, 40)
                                    .addComponent(jButtonAlterarAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButtonExcluirAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jButtonConsultarAluno, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jButtonVoltaMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addComponent(jButtonVoltaMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabelTituloAluno)
                .addGap(18, 18, 18)
                .addComponent(jLabelNomeAluno)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldNomeAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelMedia)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldMedia, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelSituacao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldSituacao, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(jButtonConsultarAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonAlterarAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonExcluirAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonCadastrarAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonCadastrarAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCadastrarAlunoActionPerformed
        String nome, media, situacao;
        
        nome = jTextFieldNomeAluno.getText();
        media = jTextFieldMedia.getText();
        situacao = jTextFieldSituacao.getText();
        
        AlunoDTO alunoDto = new AlunoDTO();
        alunoDto.setNome_aluno(nome);
        alunoDto.setMedia_aluno(media);
        alunoDto.setSituacao_aluno(situacao);
        
        AlunoDao alunoDao = new AlunoDao();
        alunoDao.create(alunoDto);
    }//GEN-LAST:event_jButtonCadastrarAlunoActionPerformed

    private void jTextFieldNomeAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNomeAlunoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNomeAlunoActionPerformed

    private void jButtonVoltaMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVoltaMenuActionPerformed
        TelaPrincipal telaPrincipal = new TelaPrincipal();
        this.dispose();
        telaPrincipal.setVisible(true);
    }//GEN-LAST:event_jButtonVoltaMenuActionPerformed

    private void jTextFieldMediaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldMediaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldMediaActionPerformed

    private void jTextFieldSituacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldSituacaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldSituacaoActionPerformed

    private void jButtonConsultarAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConsultarAlunoActionPerformed
        TelaConsultaAluno telaConsultaAluno = new TelaConsultaAluno();
        this.dispose();
        telaConsultaAluno.setVisible(true);
    }//GEN-LAST:event_jButtonConsultarAlunoActionPerformed

    private void jButtonExcluirAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExcluirAlunoActionPerformed
        
        Object[] options = { "Sim", "N??o" }; 
             int opcao = JOptionPane.showOptionDialog(null, "Deseja mesmo Exluir " +jTextFieldNomeAluno.getText() +"?", "Opera????o", JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE, null, options, options[0]);
        
        if (opcao == 0){
        String nome_aluno; 
        
        nome_aluno = jTextFieldNomeAluno.getText();
        
        AlunoDTO alunoDto = new AlunoDTO();
        alunoDto.setNome_aluno(nome_aluno);
        
        AlunoDao alunoDao = new AlunoDao();
        alunoDao.delete(alunoDto);
        } else {
            
        }
    }//GEN-LAST:event_jButtonExcluirAlunoActionPerformed

    private void jButtonAlterarAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAlterarAlunoActionPerformed
        String nome_aluno, media_aluno, situacao_aluno, id_aluno;
        
        id_aluno = jTextFieldNomeAluno.getText();
        nome_aluno = JOptionPane.showInputDialog(null,"Digite o novo nome: ");
        media_aluno = JOptionPane.showInputDialog(null,"Digite a nova m??dia: ");
        situacao_aluno = JOptionPane.showInputDialog(null,"Digite a nova situa????o: ");
        
        AlunoDTO alunoDto = new AlunoDTO();
        alunoDto.setNome_aluno(nome_aluno);
        alunoDto.setMedia_aluno(media_aluno);
        alunoDto.setSituacao_aluno(situacao_aluno);
        alunoDto.setId_aluno(id_aluno);
        
        AlunoDao alunoDao = new AlunoDao();
        alunoDao.update(alunoDto);
        
    }//GEN-LAST:event_jButtonAlterarAlunoActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAlterarAluno;
    private javax.swing.JButton jButtonCadastrarAluno;
    private javax.swing.JButton jButtonConsultarAluno;
    private javax.swing.JButton jButtonExcluirAluno;
    private javax.swing.JButton jButtonVoltaMenu;
    private javax.swing.JLabel jLabelMedia;
    private javax.swing.JLabel jLabelNomeAluno;
    private javax.swing.JLabel jLabelSituacao;
    private javax.swing.JLabel jLabelTituloAluno;
    private javax.swing.JTextField jTextFieldMedia;
    private javax.swing.JTextField jTextFieldNomeAluno;
    private javax.swing.JTextField jTextFieldSituacao;
    // End of variables declaration//GEN-END:variables
}
