/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

import javax.swing.JOptionPane;

/**
 *
 * @author juanestebanmoralesquevedo
 */
public class IEMo extends javax.swing.JFrame {

    /**
     * Creates new form IEMo
     */
    public IEMo() {
        initComponents();
        setLocationRelativeTo(null);
        jTextFieldCedula.setEditable(false);
        jTextFieldPasaporte.setEditable(false);
        jTextFieldTC.setEditable(false);
    }

    
    IER registro = new IER();
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelPresente = new javax.swing.JLabel();
        jTextFieldTC = new javax.swing.JTextField();
        jTextFieldPasaporte = new javax.swing.JTextField();
        jTextFieldCedula = new javax.swing.JTextField();
        jTextFieldApellido = new javax.swing.JTextField();
        jTextFieldNombre = new javax.swing.JTextField();
        jLabelTC = new javax.swing.JLabel();
        jLabelPasaporte = new javax.swing.JLabel();
        jLabelCedula = new javax.swing.JLabel();
        jLabelApellido = new javax.swing.JLabel();
        jLabelNombre = new javax.swing.JLabel();
        jButtonRegistro = new javax.swing.JButton();
        jButtonCambiar = new javax.swing.JButton();
        jCheckBox3 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        jCheckBox1 = new javax.swing.JCheckBox();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabelFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelPresente.setText("¿Está en la Instalación?");
        getContentPane().add(jLabelPresente, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, -1, -1));
        getContentPane().add(jTextFieldTC, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 230, 160, -1));
        getContentPane().add(jTextFieldPasaporte, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 180, 160, -1));
        getContentPane().add(jTextFieldCedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 130, 160, -1));
        getContentPane().add(jTextFieldApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 80, 160, -1));

        jTextFieldNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNombreActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 30, 160, -1));

        jLabelTC.setText("Tarjeta Crédito");
        getContentPane().add(jLabelTC, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, -1, -1));

        jLabelPasaporte.setText("Pasaporte");
        getContentPane().add(jLabelPasaporte, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, -1, -1));

        jLabelCedula.setText("Cédula");
        getContentPane().add(jLabelCedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, -1, -1));

        jLabelApellido.setText("Apellido");
        getContentPane().add(jLabelApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, -1, -1));

        jLabelNombre.setText("Nombre");
        getContentPane().add(jLabelNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, -1, -1));

        jButtonRegistro.setText("Registro");
        jButtonRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRegistroActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 420, -1, -1));

        jButtonCambiar.setText("Cambiar");
        jButtonCambiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCambiarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonCambiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 420, -1, -1));

        jCheckBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox3ActionPerformed(evt);
            }
        });
        getContentPane().add(jCheckBox3, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 230, 30, -1));

        jCheckBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox2ActionPerformed(evt);
            }
        });
        getContentPane().add(jCheckBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 180, 30, -1));

        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });
        getContentPane().add(jCheckBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 130, 30, -1));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sí", "No" }));
        getContentPane().add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 280, 100, -1));
        getContentPane().add(jLabelFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 360, 459));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNombreActionPerformed

    private void jButtonCambiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCambiarActionPerformed
        int pr;
        pr = jComboBox1.getSelectedIndex();
        if(!jCheckBox1.isSelected() && !jCheckBox2.isSelected() && !jCheckBox3.isSelected()){
        
            try{
                for(int i=0;i<registro.usu.size();i++){
                if(this.jTextFieldNombre.getText().equalsIgnoreCase(registro.usu.get(i).getNombre()) && this.jTextFieldApellido.getText().equalsIgnoreCase(registro.usu.get(i).getApellido())){
                if(pr==0){
                registro.usu.get(i).setPresente(true);
                } else if(pr==1){
                registro.usu.get(i).setPresente(false);
                }
                }
                }
            }catch(NullPointerException e){
            JOptionPane.showMessageDialog(null, "No se encuentra el usuario");
            }
        } else if(jTextFieldCedula.isEditable()){
        try{
            for(int i=0;i<registro.usu.size();i++){
            if (this.jTextFieldCedula.getText().equalsIgnoreCase(""+registro.usu.get(i).getCedula())){
            if(pr==0){
            registro.usu.get(i).setPresente(true);
            }else if (pr == 1){
            registro.usu.get(i).setPresente(false);
            }
            }
            }
        }catch(NullPointerException e){
        JOptionPane.showMessageDialog(null, "No se encuentra el usuario");
        }
        }else if (jTextFieldPasaporte.isEditable()){
        try {
        for(int i=0;i<registro.usu.size();i++){
        if(this.jTextFieldPasaporte.getText().equalsIgnoreCase(""+registro.usu.get(i).getPasaporte())){
        if(pr==0){
        registro.usu.get(i).setPresente(true);
        }else if (pr==1){
        registro.usu.get(i).setPresente(false);
        }
        }
        }
        }catch(NullPointerException e){
        JOptionPane.showMessageDialog(null, "No se encuentra el usuario");
        }
        }else if (jTextFieldTC.isEditable()){
        try{
            for(int i = 0;i<registro.usu.size();i++){
            if(this.jTextFieldTC.getText().equalsIgnoreCase(""+registro.usu.get(i).getTarjetaC())){
            if(pr==0){
            registro.usu.get(i).setPresente(true);
            } else if (pr==1){
            registro.usu.get(i).setPresente(false);
            }
            }
            }
        }catch(NullPointerException e){
        JOptionPane.showMessageDialog(null, "No se encuentra el usuario");
        }
        }
        jTextFieldNombre.setText("");
        jTextFieldApellido.setText("");
        jTextFieldCedula.setText("");
        jTextFieldPasaporte.setText("");
        jTextFieldTC.setText("");
    }//GEN-LAST:event_jButtonCambiarActionPerformed

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        if(jCheckBox1.isSelected()){
           jTextFieldCedula.setEditable(true);
           jTextFieldNombre.setEditable(false);
           jTextFieldApellido.setEditable(false);
           jTextFieldPasaporte.setEditable(false);
           jTextFieldTC.setEditable(false);
           jTextFieldCedula.setText("");
           jTextFieldNombre.setText("");
           jTextFieldApellido.setText("");
           jTextFieldPasaporte.setText("");
           jTextFieldTC.setText("");
        }else {
        jTextFieldCedula.setEditable(false);
        if (!jCheckBox2.isSelected() && !jCheckBox3.isSelected()){
        jTextFieldNombre.setEditable(true);
        jTextFieldApellido.setEditable(true);
        }
        }
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void jCheckBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox2ActionPerformed
        if(jCheckBox2.isSelected()){
           jTextFieldCedula.setEditable(false);
           jTextFieldNombre.setEditable(false);
           jTextFieldApellido.setEditable(false);
           jTextFieldPasaporte.setEditable(true);
           jTextFieldTC.setEditable(false);
           jTextFieldCedula.setText("");
           jTextFieldNombre.setText("");
           jTextFieldApellido.setText("");
           jTextFieldPasaporte.setText("");
           jTextFieldTC.setText("");
        }else {
        jTextFieldPasaporte.setEditable(false);
        if (!jCheckBox1.isSelected() && !jCheckBox3.isSelected()){
        jTextFieldNombre.setEditable(true);
        jTextFieldApellido.setEditable(true);
        }
        }
    }//GEN-LAST:event_jCheckBox2ActionPerformed

    private void jCheckBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox3ActionPerformed
        if(jCheckBox1.isSelected()){
           jTextFieldCedula.setEditable(false);
           jTextFieldNombre.setEditable(false);
           jTextFieldApellido.setEditable(false);
           jTextFieldPasaporte.setEditable(false);
           jTextFieldTC.setEditable(true);
           jTextFieldCedula.setText("");
           jTextFieldNombre.setText("");
           jTextFieldApellido.setText("");
           jTextFieldPasaporte.setText("");
           jTextFieldTC.setText("");
        }else {
        jTextFieldTC.setEditable(false);
        if (!jCheckBox1.isSelected() && !jCheckBox2.isSelected()){
        jTextFieldNombre.setEditable(true);
        jTextFieldApellido.setEditable(true);
        }
        }
    }//GEN-LAST:event_jCheckBox3ActionPerformed

    private void jButtonRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRegistroActionPerformed
        registro.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButtonRegistroActionPerformed

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
            java.util.logging.Logger.getLogger(IEMo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IEMo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IEMo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IEMo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IEMo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCambiar;
    private javax.swing.JButton jButtonRegistro;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabelApellido;
    private javax.swing.JLabel jLabelCedula;
    private javax.swing.JLabel jLabelFondo;
    private javax.swing.JLabel jLabelNombre;
    private javax.swing.JLabel jLabelPasaporte;
    private javax.swing.JLabel jLabelPresente;
    private javax.swing.JLabel jLabelTC;
    private javax.swing.JTextField jTextFieldApellido;
    private javax.swing.JTextField jTextFieldCedula;
    private javax.swing.JTextField jTextFieldNombre;
    private javax.swing.JTextField jTextFieldPasaporte;
    private javax.swing.JTextField jTextFieldTC;
    // End of variables declaration//GEN-END:variables
}
