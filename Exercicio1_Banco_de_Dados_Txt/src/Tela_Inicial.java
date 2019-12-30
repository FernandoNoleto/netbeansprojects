
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Fernando
 */
public class Tela_Inicial extends javax.swing.JFrame {


    public Tela_Inicial() {
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

        label_adicionar = new javax.swing.JLabel();
        Text_Disciplina = new javax.swing.JTextField();
        Button_Inserir = new javax.swing.JButton();
        Label_Carga_Horaria = new javax.swing.JLabel();
        Text_Carga_Horaria = new javax.swing.JTextField();
        Label_Periodo = new javax.swing.JLabel();
        ComboBox_Periodo = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Inserir Disciplinas");
        setResizable(false);

        label_adicionar.setText("Adicionar disciplina:");
        label_adicionar.setToolTipText("");

        Text_Disciplina.setToolTipText("Nome da Disciplina");

        Button_Inserir.setText("Inserir");
        Button_Inserir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_InserirActionPerformed(evt);
            }
        });

        Label_Carga_Horaria.setText("Carga horária (h):");

        Text_Carga_Horaria.setToolTipText("Carga Horária");

        Label_Periodo.setText("Período:");
        Label_Periodo.setToolTipText("");

        ComboBox_Periodo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1 Período", "2 Período", "3 Período", "4 Período", "5 Período", "6 Período", "7 Período", "8 Período" }));
        ComboBox_Periodo.setToolTipText("Período");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Button_Inserir)
                .addGap(126, 126, 126))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label_adicionar)
                    .addComponent(Label_Carga_Horaria)
                    .addComponent(Label_Periodo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(ComboBox_Periodo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(Text_Disciplina, javax.swing.GroupLayout.DEFAULT_SIZE, 199, Short.MAX_VALUE)
                    .addComponent(Text_Carga_Horaria))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_adicionar)
                    .addComponent(Text_Disciplina, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Label_Carga_Horaria)
                    .addComponent(Text_Carga_Horaria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Label_Periodo)
                    .addComponent(ComboBox_Periodo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addComponent(Button_Inserir)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    int i = 1;
    
    private void Button_InserirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_InserirActionPerformed
            
        String texto = (String) Text_Disciplina.getText();
        int periodo = ComboBox_Periodo.getSelectedIndex();
        ++periodo;
        String carga_horaria = (String) Text_Carga_Horaria.getText();
        
        
        try {
            File arq = new File("Disciplinas.txt");
            FileWriter fw = new FileWriter(arq, true);
            BufferedWriter escrever =  new BufferedWriter(fw);
            escrever.write("Cod: "+i+" Disciplina: "+texto+" Carga Horária: "+carga_horaria+" Período: "+periodo);
            i++;
            
            escrever.newLine();
            escrever.close();
            fw.close();
            
            JOptionPane.showMessageDialog(null, "Disciplina salva com sucesso!");
            Text_Disciplina.setText("");
            ComboBox_Periodo.setSelectedIndex(0);
            Text_Carga_Horaria.setText("");
        } catch (Exception ex) {
            Logger.getLogger(Tela_Inicial.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Problemas ao criar arquivo! Erro: "+ex);
        }
        
        
    }//GEN-LAST:event_Button_InserirActionPerformed

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
            java.util.logging.Logger.getLogger(Tela_Inicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tela_Inicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tela_Inicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tela_Inicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tela_Inicial().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Button_Inserir;
    private javax.swing.JComboBox<String> ComboBox_Periodo;
    private javax.swing.JLabel Label_Carga_Horaria;
    private javax.swing.JLabel Label_Periodo;
    private javax.swing.JTextField Text_Carga_Horaria;
    private javax.swing.JTextField Text_Disciplina;
    private javax.swing.JLabel label_adicionar;
    // End of variables declaration//GEN-END:variables
}
