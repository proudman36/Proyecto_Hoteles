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
public class IEE extends javax.swing.JFrame {

    /** Creates new form Modificar */
    public IEE() {
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

        jCheckBox3 = new javax.swing.JCheckBox();
        jTextFieldApellido = new javax.swing.JTextField();
        jLabelApellido = new javax.swing.JLabel();
        jLabelTC = new javax.swing.JLabel();
        jLabelPasaporte = new javax.swing.JLabel();
        jLabelCedula = new javax.swing.JLabel();
        jTextFieldTC = new javax.swing.JTextField();
        jTextFieldPasaporte = new javax.swing.JTextField();
        jTextFieldCedula = new javax.swing.JTextField();
        jTextFieldNombre = new javax.swing.JTextField();
        jLabelNombre = new javax.swing.JLabel();
        jButtonMenu = new javax.swing.JButton();
        jButtonEliminar = new javax.swing.JButton();
        jCheckBoxCedula = new javax.swing.JCheckBox();
        jCheckBoxPas = new javax.swing.JCheckBox();
        jCheckBoxTC = new javax.swing.JCheckBox();
        jLabelFondo = new javax.swing.JLabel();

        jCheckBox3.setText("jCheckBox3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jTextFieldApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 100, 110, -1));

        jLabelApellido.setForeground(new java.awt.Color(255, 255, 255));
        jLabelApellido.setText("Apellido");
        getContentPane().add(jLabelApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, -1, 30));

        jLabelTC.setText("Tarjeta de Crédito");
        getContentPane().add(jLabelTC, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, -1, 30));

        jLabelPasaporte.setText("Pasaporte");
        getContentPane().add(jLabelPasaporte, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, -1, 30));

        jLabelCedula.setForeground(new java.awt.Color(255, 255, 255));
        jLabelCedula.setText("Cédula");
        getContentPane().add(jLabelCedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, -1, 30));
        getContentPane().add(jTextFieldTC, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 260, 110, -1));
        getContentPane().add(jTextFieldPasaporte, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 200, 110, -1));

        jTextFieldCedula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCedulaActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldCedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 150, 110, -1));
        getContentPane().add(jTextFieldNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 50, 110, -1));

        jLabelNombre.setForeground(new java.awt.Color(255, 255, 255));
        jLabelNombre.setText("Nombre");
        getContentPane().add(jLabelNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, -1, 30));

        jButtonMenu.setText("Menú");
        jButtonMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMenuActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 410, -1, -1));

        jButtonEliminar.setText("Eliminar");
        jButtonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEliminarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 410, -1, -1));

        jCheckBoxCedula.setText("jCheckBox1");
        jCheckBoxCedula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxCedulaActionPerformed(evt);
            }
        });
        getContentPane().add(jCheckBoxCedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 150, 30, -1));

        jCheckBoxPas.setText("jCheckBox1");
        jCheckBoxPas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxPasActionPerformed(evt);
            }
        });
        getContentPane().add(jCheckBoxPas, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 200, 30, -1));

        jCheckBoxTC.setText("jCheckBox1");
        jCheckBoxTC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxTCActionPerformed(evt);
            }
        });
        getContentPane().add(jCheckBoxTC, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 260, 30, -1));

        jLabelFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfaz/imagenes/descarga.jpeg"))); // NOI18N
        getContentPane().add(jLabelFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 350, 460));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldCedulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCedulaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldCedulaActionPerformed

    private void jButtonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEliminarActionPerformed

            if (!jCheckBoxCedula.isSelected() && !jCheckBoxPas.isSelected() && !jCheckBoxTC.isSelected()){
            try{
                for(int i=0;i<registro.usu.size();i++){
                if(this.jTextFieldNombre.getText().equalsIgnoreCase(registro.usu.get(i).getNombre()) && this.jTextFieldApellido.getText().equalsIgnoreCase(registro.usu.get(i).getApellido())){
                    registro.usu.remove(i);
                }
                }
            }catch(NullPointerException e){
        JOptionPane.showMessageDialog(null,"No se encuentra el usuario");
        }
            }else if (jTextFieldCedula.isEditable()){
            try{
                for (int i=0;i<registro.usu.size();i++){
                if (this.jTextFieldCedula.getText().equalsIgnoreCase(""+registro.usu.get(i).getCedula())){
                    registro.usu.remove(i);
                }
                }
            }catch(NullPointerException e){
            JOptionPane.showMessageDialog(null, "No se encuentra el usuario");
            }
            }else if(jTextFieldPasaporte.isEditable()){
            try{
                for (int i=0;i<registro.usu.size();i++){
                if(this.jTextFieldPasaporte.getText().equalsIgnoreCase(""+registro.usu.get(i).getPasaporte())){
                registro.usu.remove(i);
                }
                }
            }catch(NullPointerException e){
            JOptionPane.showMessageDialog(null, "No se encuentra el usuario");
            }
            }else if(jTextFieldTC.isEditable()){
                    try{
                    for (int i=0;i<registro.usu.size();i++){
                    if(this.jTextFieldTC.getText().equalsIgnoreCase(""+registro.usu.get(i).getTarjetaC())){
                    registro.usu.remove(i);
                    }
                    }
                    }
                    catch(NullPointerException e){
                    JOptionPane.showMessageDialog(null,"No se encuentra el usuario");
                    }
                    }
            jTextFieldNombre.setText("");
            jTextFieldApellido.setText("");
            jTextFieldCedula.setText("");
            jTextFieldPasaporte.setText("");
            jTextFieldTC.setText("");
            
    }//GEN-LAST:event_jButtonEliminarActionPerformed

    private void jButtonMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMenuActionPerformed
        IEM menu = new IEM();
        menu.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButtonMenuActionPerformed

    private void jCheckBoxCedulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxCedulaActionPerformed
        if(jCheckBoxCedula.isSelected()){
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
        } else {
        jTextFieldCedula.setEditable(false);
        if (!jCheckBoxPas.isSelected() && !jCheckBoxTC.isSelected()){
        jTextFieldNombre.setEditable(true);
        jTextFieldApellido.setEditable(true);
        }
        }
    }//GEN-LAST:event_jCheckBoxCedulaActionPerformed

    private void jCheckBoxPasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxPasActionPerformed
        if(jCheckBoxPas.isSelected()){
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
        } else {
        jTextFieldPasaporte.setEditable(false);
        if (!jCheckBoxCedula.isSelected() && !jCheckBoxTC.isSelected()){
        jTextFieldNombre.setEditable(true);
        jTextFieldApellido.setEditable(true);
        }
        }
    }//GEN-LAST:event_jCheckBoxPasActionPerformed

    private void jCheckBoxTCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxTCActionPerformed
         if(jCheckBoxTC.isSelected()){
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
        } else {
        jTextFieldTC.setEditable(false);
        if (!jCheckBoxPas.isSelected() && !jCheckBoxTC.isSelected()){
        jTextFieldNombre.setEditable(true);
        jTextFieldApellido.setEditable(true);
        }
        }
    }//GEN-LAST:event_jCheckBoxTCActionPerformed

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
            java.util.logging.Logger.getLogger(IEE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IEE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IEE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IEE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IEE().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonEliminar;
    private javax.swing.JButton jButtonMenu;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JCheckBox jCheckBoxCedula;
    private javax.swing.JCheckBox jCheckBoxPas;
    private javax.swing.JCheckBox jCheckBoxTC;
    private javax.swing.JLabel jLabelApellido;
    private javax.swing.JLabel jLabelCedula;
    private javax.swing.JLabel jLabelFondo;
    private javax.swing.JLabel jLabelNombre;
    private javax.swing.JLabel jLabelPasaporte;
    private javax.swing.JLabel jLabelTC;
    private javax.swing.JTextField jTextFieldApellido;
    private javax.swing.JTextField jTextFieldCedula;
    private javax.swing.JTextField jTextFieldNombre;
    private javax.swing.JTextField jTextFieldPasaporte;
    private javax.swing.JTextField jTextFieldTC;
    // End of variables declaration//GEN-END:variables

}
