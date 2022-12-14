/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import javax.swing.JOptionPane;

/**
 *
 * @author Felipe V
 */
public class TelaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form TelaPrincipal
     */
    public TelaPrincipal() {
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

        jMenuItem1 = new javax.swing.JMenuItem();
        jRadioButtonMenuItem1 = new javax.swing.JRadioButtonMenuItem();
        jRadioButtonMenuItem2 = new javax.swing.JRadioButtonMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jLabel2 = new javax.swing.JLabel();
        jMenuBarTelaPrincipal = new javax.swing.JMenuBar();
        jMenuCadastro = new javax.swing.JMenu();
        jMenuItemAluno = new javax.swing.JMenuItem();
        jMenuItemTurmas = new javax.swing.JMenuItem();
        jMenuItemMateria = new javax.swing.JMenuItem();
        jMenuItemAvaliacoes = new javax.swing.JMenuItem();
        jMenuItemProfessor = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jMenuItemLogout = new javax.swing.JMenuItem();

        jMenuItem1.setText("jMenuItem1");

        jRadioButtonMenuItem1.setSelected(true);
        jRadioButtonMenuItem1.setText("jRadioButtonMenuItem1");

        jRadioButtonMenuItem2.setSelected(true);
        jRadioButtonMenuItem2.setText("jRadioButtonMenuItem2");

        jMenuItem2.setText("jMenuItem2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(400, 450));

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\venez\\Documents\\GitGui\\Projetos Java\\Sae-main\\src\\main\\java\\imagens\\sae imagem final.png")); // NOI18N
        jLabel2.setAlignmentY(0.0F);
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLabel2, java.awt.BorderLayout.CENTER);

        jMenuBarTelaPrincipal.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jMenuBarTelaPrincipal.setForeground(new java.awt.Color(30, 163, 163));
        jMenuBarTelaPrincipal.setMaximumSize(new java.awt.Dimension(85, 34));
        jMenuBarTelaPrincipal.setPreferredSize(new java.awt.Dimension(80, 34));

        jMenuCadastro.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jMenuCadastro.setForeground(new java.awt.Color(28, 68, 135));
        jMenuCadastro.setText("Cadastro");
        jMenuCadastro.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jMenuCadastro.setPreferredSize(new java.awt.Dimension(55, 30));

        jMenuItemAluno.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jMenuItemAluno.setForeground(new java.awt.Color(30, 163, 163));
        jMenuItemAluno.setIcon(new javax.swing.ImageIcon("C:\\Users\\venez\\Documents\\GitGui\\Projetos Java\\Sae-main\\src\\main\\java\\imagens\\seta-preta4.png")); // NOI18N
        jMenuItemAluno.setText("Aluno");
        jMenuItemAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemAlunoActionPerformed(evt);
            }
        });
        jMenuCadastro.add(jMenuItemAluno);

        jMenuItemTurmas.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jMenuItemTurmas.setForeground(new java.awt.Color(30, 163, 163));
        jMenuItemTurmas.setIcon(new javax.swing.ImageIcon("C:\\Users\\venez\\Documents\\GitGui\\Projetos Java\\Sae-main\\src\\main\\java\\imagens\\seta-preta4.png")); // NOI18N
        jMenuItemTurmas.setText("Turmas");
        jMenuItemTurmas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemTurmasActionPerformed(evt);
            }
        });
        jMenuCadastro.add(jMenuItemTurmas);

        jMenuItemMateria.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jMenuItemMateria.setForeground(new java.awt.Color(30, 163, 163));
        jMenuItemMateria.setIcon(new javax.swing.ImageIcon("C:\\Users\\venez\\Documents\\GitGui\\Projetos Java\\Sae-main\\src\\main\\java\\imagens\\seta-preta4.png")); // NOI18N
        jMenuItemMateria.setText("Mat??rias");
        jMenuItemMateria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemMateriaActionPerformed(evt);
            }
        });
        jMenuCadastro.add(jMenuItemMateria);

        jMenuItemAvaliacoes.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jMenuItemAvaliacoes.setForeground(new java.awt.Color(30, 163, 163));
        jMenuItemAvaliacoes.setIcon(new javax.swing.ImageIcon("C:\\Users\\venez\\Documents\\GitGui\\Projetos Java\\Sae-main\\src\\main\\java\\imagens\\seta-preta4.png")); // NOI18N
        jMenuItemAvaliacoes.setText("Avalia????es");
        jMenuItemAvaliacoes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemAvaliacoesActionPerformed(evt);
            }
        });
        jMenuCadastro.add(jMenuItemAvaliacoes);

        jMenuItemProfessor.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jMenuItemProfessor.setForeground(new java.awt.Color(30, 163, 163));
        jMenuItemProfessor.setIcon(new javax.swing.ImageIcon("C:\\Users\\venez\\Documents\\GitGui\\Projetos Java\\Sae-main\\src\\main\\java\\imagens\\seta-preta4.png")); // NOI18N
        jMenuItemProfessor.setText("Professores");
        jMenuItemProfessor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemProfessorActionPerformed(evt);
            }
        });
        jMenuCadastro.add(jMenuItemProfessor);

        jMenuBarTelaPrincipal.add(jMenuCadastro);

        jMenu1.setForeground(new java.awt.Color(28, 68, 135));
        jMenu1.setText("Sair");
        jMenu1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jMenuItemLogout.setForeground(new java.awt.Color(30, 163, 163));
        jMenuItemLogout.setIcon(new javax.swing.ImageIcon("C:\\Users\\venez\\Documents\\GitGui\\Projetos Java\\Sae-main\\src\\main\\java\\imagens\\seta-preta4.png")); // NOI18N
        jMenuItemLogout.setText("Fazer Logout");
        jMenuItemLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemLogoutActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItemLogout);

        jMenuBarTelaPrincipal.add(jMenu1);

        setJMenuBar(jMenuBarTelaPrincipal);
        jMenuBarTelaPrincipal.getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItemAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemAlunoActionPerformed
        TelaAluno telaAluno = new TelaAluno();
        this.dispose();
        telaAluno.setVisible(true);
    }//GEN-LAST:event_jMenuItemAlunoActionPerformed

    private void jMenuItemTurmasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemTurmasActionPerformed
        TelaTurma telaTurma = new TelaTurma();
        this.dispose();
        telaTurma.setVisible(true);
    }//GEN-LAST:event_jMenuItemTurmasActionPerformed

    private void jMenuItemMateriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemMateriaActionPerformed
        TelaMateria telaMateria = new TelaMateria();
        this.dispose();
        telaMateria.setVisible(true);
    }//GEN-LAST:event_jMenuItemMateriaActionPerformed

    private void jMenuItemAvaliacoesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemAvaliacoesActionPerformed
        TelaAvaliacao telaAvaliacao = new TelaAvaliacao();
        this.dispose();
        telaAvaliacao.setVisible(true);
    }//GEN-LAST:event_jMenuItemAvaliacoesActionPerformed

    private void jMenuItemProfessorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemProfessorActionPerformed
        TelaProfessor telaProfessor = new TelaProfessor();
        this.dispose();
        telaProfessor.setVisible(true);
    }//GEN-LAST:event_jMenuItemProfessorActionPerformed

    private void jMenuItemLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemLogoutActionPerformed
        TelaLogin telaLogin = new TelaLogin();
        JOptionPane.showMessageDialog(null,"Logout efetuado.");
        this.dispose();
        telaLogin.setVisible(true);
    }//GEN-LAST:event_jMenuItemLogoutActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBarTelaPrincipal;
    private javax.swing.JMenu jMenuCadastro;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItemAluno;
    private javax.swing.JMenuItem jMenuItemAvaliacoes;
    private javax.swing.JMenuItem jMenuItemLogout;
    private javax.swing.JMenuItem jMenuItemMateria;
    private javax.swing.JMenuItem jMenuItemProfessor;
    private javax.swing.JMenuItem jMenuItemTurmas;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem1;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem2;
    // End of variables declaration//GEN-END:variables
}
