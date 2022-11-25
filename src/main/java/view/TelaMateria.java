/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import javax.swing.JOptionPane;
import model.dao.MateriaDao;
import model.dto.MateriaDTO;

/**
 *
 * @author Felipe V
 */
public class TelaMateria extends javax.swing.JFrame {

    /**
     * Creates new form TelaMateria
     */
    public TelaMateria() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabelMaterias = new javax.swing.JLabel();
        jLabelNomeMateria = new javax.swing.JLabel();
        jTextFieldNomeMateria = new javax.swing.JTextField();
        jButtonConsultar = new javax.swing.JButton();
        jButtonInserir = new javax.swing.JButton();
        jButtonAlterar = new javax.swing.JButton();
        jButtonExcluir = new javax.swing.JButton();
        jButtonVoltaMenu = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabelMaterias.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabelMaterias.setForeground(new java.awt.Color(30, 163, 163));
        jLabelMaterias.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelMaterias.setText("MATÉRIAS");

        jLabelNomeMateria.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelNomeMateria.setForeground(new java.awt.Color(30, 163, 163));
        jLabelNomeMateria.setText("Nome da matéria:");

        jTextFieldNomeMateria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNomeMateriaActionPerformed(evt);
            }
        });

        jButtonConsultar.setBackground(new java.awt.Color(30, 163, 163));
        jButtonConsultar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButtonConsultar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonConsultar.setText("Consultar");
        jButtonConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConsultarActionPerformed(evt);
            }
        });

        jButtonInserir.setBackground(new java.awt.Color(30, 112, 112));
        jButtonInserir.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButtonInserir.setForeground(new java.awt.Color(255, 255, 255));
        jButtonInserir.setText("Inserir");
        jButtonInserir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonInserirActionPerformed(evt);
            }
        });

        jButtonAlterar.setBackground(new java.awt.Color(30, 112, 112));
        jButtonAlterar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButtonAlterar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonAlterar.setText("Alterar");
        jButtonAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAlterarActionPerformed(evt);
            }
        });

        jButtonExcluir.setBackground(new java.awt.Color(30, 112, 112));
        jButtonExcluir.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButtonExcluir.setForeground(new java.awt.Color(255, 255, 255));
        jButtonExcluir.setText("Excluir");
        jButtonExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExcluirActionPerformed(evt);
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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelMaterias, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jButtonVoltaMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(0, 30, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelNomeMateria)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jButtonConsultar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jButtonInserir, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(40, 40, 40)
                            .addComponent(jButtonAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(40, 40, 40)
                            .addComponent(jButtonExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jTextFieldNomeMateria)))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jButtonVoltaMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jLabelMaterias)
                .addGap(36, 36, 36)
                .addComponent(jLabelNomeMateria)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldNomeMateria, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 85, Short.MAX_VALUE)
                .addComponent(jButtonConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonInserir, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(64, 64, 64))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 450, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonVoltaMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVoltaMenuActionPerformed
        TelaPrincipal telaPrincipal = new TelaPrincipal();
        this.dispose();
        telaPrincipal.setVisible(true);
    }//GEN-LAST:event_jButtonVoltaMenuActionPerformed

    private void jTextFieldNomeMateriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNomeMateriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNomeMateriaActionPerformed

    private void jButtonConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConsultarActionPerformed
        TelaConsultaMateria telaConsultaMateria = new TelaConsultaMateria();
        this.dispose();
        telaConsultaMateria.setVisible(true);
    }//GEN-LAST:event_jButtonConsultarActionPerformed

    private void jButtonInserirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonInserirActionPerformed
        String nome;
        
        nome = jTextFieldNomeMateria.getText();
        MateriaDTO materiaDto = new MateriaDTO();
        materiaDto.setNome_materia(nome);
        
        MateriaDao materiaDao = new MateriaDao();
        materiaDao.create(materiaDto);
    }//GEN-LAST:event_jButtonInserirActionPerformed

    private void jButtonAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAlterarActionPerformed
        String nome_materia, id_materia;
        
        id_materia = jTextFieldNomeMateria.getText();
        nome_materia = JOptionPane.showInputDialog(null,"Digite o novo nome: ");

        
        MateriaDTO materiaDto = new MateriaDTO();
        materiaDto.setNome_materia(nome_materia);
        materiaDto.setId_materia(id_materia);
        
        MateriaDao materiaDao = new MateriaDao();
        materiaDao.update(materiaDto);
    }//GEN-LAST:event_jButtonAlterarActionPerformed

    private void jButtonExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExcluirActionPerformed
        
        Object[] options = { "Sim", "Não" }; 
             int opcao = JOptionPane.showOptionDialog(null, "Deseja mesmo Exluir " +jTextFieldNomeMateria.getText() +"?", "Operação", JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE, null, options, options[0]);
        
        if (opcao == 0){
        String nome;
        
        nome = jTextFieldNomeMateria.getText();
        MateriaDTO materiaDto = new MateriaDTO();
        materiaDto.setNome_materia(nome);
        
        MateriaDao materiaDao = new MateriaDao();
        materiaDao.delete(materiaDto);
        } else {
            
        }
    }//GEN-LAST:event_jButtonExcluirActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAlterar;
    private javax.swing.JButton jButtonConsultar;
    private javax.swing.JButton jButtonExcluir;
    private javax.swing.JButton jButtonInserir;
    private javax.swing.JButton jButtonVoltaMenu;
    private javax.swing.JLabel jLabelMaterias;
    private javax.swing.JLabel jLabelNomeMateria;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextFieldNomeMateria;
    // End of variables declaration//GEN-END:variables
}