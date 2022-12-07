/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

import javax.swing.JOptionPane;
import mundo.*;

public class IEC extends javax.swing.JFrame {

    
    
    public IEC() {
        initComponents();
        this.setLocationRelativeTo(null);
        jTextFieldCedula.setEditable(false);
        jTextFieldPasaporte.setEditable(false);
        jTextFieldTC.setEditable(false);
        
    }
    IER registro = new IER();
    
    
   
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonList = new javax.swing.JButton();
        jButtonConsulta = new javax.swing.JButton();
        jTextFieldTC = new javax.swing.JTextField();
        jTextFieldPasaporte = new javax.swing.JTextField();
        jTextFieldCedula = new javax.swing.JTextField();
        jTextFieldApellido = new javax.swing.JTextField();
        jTextFieldNombre = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButtonRM = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jCheckBox3 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        jCheckBox1 = new javax.swing.JCheckBox();
        jLabelFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButtonList.setText("Lista");
        jButtonList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonListActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonList, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 400, 100, -1));

        jButtonConsulta.setText("Consultar");
        jButtonConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConsultaActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonConsulta, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 400, 100, -1));
        getContentPane().add(jTextFieldTC, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 250, 170, -1));
        getContentPane().add(jTextFieldPasaporte, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 200, 170, -1));
        getContentPane().add(jTextFieldCedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 160, 170, -1));

        jTextFieldApellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldApellidoActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 110, 170, -1));

        jTextFieldNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNombreActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 60, 170, -1));

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Apellido");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, 60, -1));

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Tarjeta de crédito");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, 120, 20));

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Pasaporte");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, 70, 20));

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Cédula");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, 60, 20));

        jButtonRM.setText("Menú");
        jButtonRM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRMActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonRM, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 400, 100, -1));

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Nombre");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, 60, -1));

        jCheckBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox3ActionPerformed(evt);
            }
        });
        getContentPane().add(jCheckBox3, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 250, -1, -1));

        jCheckBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox2ActionPerformed(evt);
            }
        });
        getContentPane().add(jCheckBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 200, -1, -1));

        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });
        getContentPane().add(jCheckBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 160, -1, -1));

        jLabelFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfaz/imagenes/Guajira.jpeg"))); // NOI18N
        getContentPane().add(jLabelFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 440, 440));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonRMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRMActionPerformed
        IEM menu = new IEM();
        menu.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButtonRMActionPerformed

    private void jTextFieldNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNombreActionPerformed
        
    }//GEN-LAST:event_jTextFieldNombreActionPerformed

    private void jButtonConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConsultaActionPerformed
    if (!jCheckBox1.isSelected() && !jCheckBox2.isSelected() && !jCheckBox3.isSelected()){
        try {for (int i=0;i<registro.usu.size();i++){
    
        if (this.jTextFieldNombre.getText().equalsIgnoreCase(registro.usu.get(i).getNombre()) && this.jTextFieldApellido.getText().equalsIgnoreCase(registro.usu.get(i).getApellido())){
            this.jTextFieldCedula.setText(""+registro.usu.get(i).getCedula());
            this.jTextFieldPasaporte.setText(""+registro.usu.get(i).getPasaporte());
            this.jTextFieldTC.setText(""+registro.usu.get(i).getTarjetaC());
            break;
    
        }
    }
    }catch (NullPointerException e){
        JOptionPane.showMessageDialog(null, "No se encuentra el usuario.");
    }
    }else if (jTextFieldCedula.isEditable()){
    
        try{
            for (int i=0;i<registro.usu.size();i++){
            
                if(this.jTextFieldCedula.getText().equals(""+registro.usu.get(i).getCedula())){
                this.jTextFieldNombre.setText(registro.usu.get(i).getNombre());
                this.jTextFieldApellido.setText(registro.usu.get(i).getApellido());
                this.jTextFieldPasaporte.setText(""+registro.usu.get(i).getPasaporte());
                this.jTextFieldTC.setText(""+registro.usu.get(i).getTarjetaC());
                }
            }
        }catch (NullPointerException e){
            
        }
    }else if (jTextFieldPasaporte.isEditable()){
    
        try{
        
            for (int i=0;i<registro.usu.size();i++){
            
                if(this.jTextFieldPasaporte.getText().equals(""+registro.usu.get(i).getPasaporte())){
                
                this.jTextFieldCedula.setText(""+registro.usu.get(i).getCedula());
                this.jTextFieldNombre.setText(registro.usu.get(i).getNombre());
                this.jTextFieldApellido.setText(registro.usu.get(i).getApellido());
                this.jTextFieldTC.setText(""+registro.usu.get(i).getTarjetaC());
            }
            }
        }catch(NullPointerException e){
        
        }
    }
    else if (jTextFieldTC.isEditable()){
    
        try{
        
            for  (int i=0;i<registro.usu.size();i++){
            
            
                if (this.jTextFieldTC.getText().equals(""+registro.usu.get(i).getTarjetaC())){
                    
                    this.jTextFieldNombre.setText(registro.usu.get(i).getNombre());
                    this.jTextFieldCedula.setText(""+registro.usu.get(i).getCedula());
                    this.jTextFieldApellido.setText(registro.usu.get(i).getApellido());
                    this.jTextFieldPasaporte.setText(""+registro.usu.get(i).getPasaporte());
            
            }
            }
            
            
        }catch(NullPointerException e){
        
        }
    }
                     
    }//GEN-LAST:event_jButtonConsultaActionPerformed

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
            if(!jCheckBox2.isSelected() && !jCheckBox3.isSelected()){
            jTextFieldNombre.setEditable(true);
            jTextFieldApellido.setEditable(true);
            }
        }
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void jCheckBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox3ActionPerformed
        if(jCheckBox3.isSelected()){
            jTextFieldTC.setEditable(true);
            jTextFieldCedula.setEditable(false);
            jTextFieldNombre.setEditable(false);
            jTextFieldApellido.setEditable(false);
            jTextFieldPasaporte.setEditable(false);
            jTextFieldCedula.setText("");
            jTextFieldNombre.setText("");
            jTextFieldApellido.setText("");
            jTextFieldPasaporte.setText("");
            jTextFieldTC.setText("");
        }else{
            jTextFieldTC.setEditable(false);
            if (!jCheckBox1.isSelected() && !jCheckBox2.isSelected()){
            jTextFieldNombre.setEditable(true);
            jTextFieldApellido.setEditable(true);
            }
        }
    }//GEN-LAST:event_jCheckBox3ActionPerformed

    private void jCheckBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox2ActionPerformed
        if(jCheckBox2.isSelected()){
            jTextFieldPasaporte.setEditable(true);
            jTextFieldCedula.setEditable(false);
            jTextFieldNombre.setEditable(false);
            jTextFieldApellido.setEditable(false);
            jTextFieldTC.setEditable(false);
            jTextFieldCedula.setText("");
            jTextFieldNombre.setText("");
            jTextFieldApellido.setText("");
            jTextFieldPasaporte.setText("");
            jTextFieldTC.setText("");
        }else{
           jTextFieldPasaporte.setEditable(false);
           if(!jCheckBox1.isSelected() && !jCheckBox3.isSelected()){
            jTextFieldNombre.setEditable(true);
            jTextFieldApellido.setEditable(true);
            }
        }
    }//GEN-LAST:event_jCheckBox2ActionPerformed

    private void jButtonListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonListActionPerformed
        Lista list = new Lista();
        this.setVisible(false);
        list.setVisible(true);
    }//GEN-LAST:event_jButtonListActionPerformed

    private void jTextFieldApellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldApellidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldApellidoActionPerformed

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
            java.util.logging.Logger.getLogger(IEC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IEC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IEC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IEC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IEC().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonConsulta;
    private javax.swing.JButton jButtonList;
    private javax.swing.JButton jButtonRM;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabelFondo;
    private javax.swing.JTextField jTextFieldApellido;
    private javax.swing.JTextField jTextFieldCedula;
    private javax.swing.JTextField jTextFieldNombre;
    private javax.swing.JTextField jTextFieldPasaporte;
    private javax.swing.JTextField jTextFieldTC;
    // End of variables declaration//GEN-END:variables
}
