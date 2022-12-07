/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

import mundo.*;
import javax.swing.JOptionPane;
import java.util.*;
        
public class IER extends javax.swing.JFrame {

    /**
     * Creates new form interfazEmpleados
     */
    public IER() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

   //public static Usuario us [] = new Usuario [200];
   public static ArrayList <Usuario> usu = new ArrayList<Usuario>();
   static int i = 0;
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonRM = new javax.swing.JButton();
        jTextFieldTC = new javax.swing.JTextField();
        jTextFieldPasaporte = new javax.swing.JTextField();
        jTextFieldCedula = new javax.swing.JTextField();
        jTextFieldApellido = new javax.swing.JTextField();
        jTextFieldNombre = new javax.swing.JTextField();
        jLabelHabitación = new javax.swing.JLabel();
        jLabelTC = new javax.swing.JLabel();
        jLabelPasaporte = new javax.swing.JLabel();
        jLabelCedula = new javax.swing.JLabel();
        jLabelNombreApellido = new javax.swing.JLabel();
        jLabelNombre = new javax.swing.JLabel();
        jButtonRegistro = new javax.swing.JButton();
        jComboBoxInstalacion = new javax.swing.JComboBox<>();
        jButtonMo = new javax.swing.JButton();
        jFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButtonRM.setText("Menú");
        jButtonRM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRMActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonRM, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 370, 90, -1));

        jTextFieldTC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldTCActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldTC, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 240, 170, -1));
        getContentPane().add(jTextFieldPasaporte, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 180, 170, -1));
        getContentPane().add(jTextFieldCedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 130, 170, -1));

        jTextFieldApellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldApellidoActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 80, 170, -1));

        jTextFieldNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNombreActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 30, 170, -1));

        jLabelHabitación.setForeground(new java.awt.Color(255, 255, 255));
        jLabelHabitación.setText("¿Está en la instalación?");
        getContentPane().add(jLabelHabitación, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, 150, 30));

        jLabelTC.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTC.setText("Tarjeta Crédito");
        getContentPane().add(jLabelTC, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, 100, 20));

        jLabelPasaporte.setForeground(new java.awt.Color(255, 255, 255));
        jLabelPasaporte.setText("Pasaporte");
        getContentPane().add(jLabelPasaporte, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 80, 20));

        jLabelCedula.setForeground(new java.awt.Color(255, 255, 255));
        jLabelCedula.setText("Cédula");
        getContentPane().add(jLabelCedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 80, 20));

        jLabelNombreApellido.setForeground(new java.awt.Color(255, 255, 255));
        jLabelNombreApellido.setText("Apellido");
        getContentPane().add(jLabelNombreApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 80, 20));

        jLabelNombre.setForeground(new java.awt.Color(255, 255, 255));
        jLabelNombre.setText("Nombre");
        getContentPane().add(jLabelNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 80, 20));

        jButtonRegistro.setText("Registro");
        jButtonRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRegistroActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 370, -1, -1));

        jComboBoxInstalacion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sí ", "No" }));
        jComboBoxInstalacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxInstalacionActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBoxInstalacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 300, 170, -1));

        jButtonMo.setText("Modificar");
        jButtonMo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMoActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonMo, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 370, -1, -1));

        jFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfaz/imagenes/barranquilla_colombia.jpeg"))); // NOI18N
        getContentPane().add(jFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 430));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldTCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldTCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldTCActionPerformed

    private void jTextFieldNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNombreActionPerformed
        
    }//GEN-LAST:event_jTextFieldNombreActionPerformed

    private void jButtonRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRegistroActionPerformed
    String n,a;
    int c,p,tc,pr;
    n = jTextFieldNombre.getText().trim();
    a = jTextFieldApellido.getText().trim();
    
    try{
    c = Integer.parseInt(jTextFieldCedula.getText().trim());
    p = Integer.parseInt(jTextFieldPasaporte.getText().trim());
    tc = Integer.parseInt(jTextFieldTC.getText().trim());
    pr = jComboBoxInstalacion.getSelectedIndex();
    
    while (i<1000){
        Usuario b = new Usuario();
        b.setApellido(a);
        b.setNombre(n);
        b.setCedula(c);
        b.setPasaporte(p);
        b.setTarjetaC(tc);
        
        
        if (pr == 0) {
        b.setPresente(true);
        } else if(pr == 1){
        b.setPresente(false);
        }else {
        JOptionPane.showMessageDialog(null, "Por favor seleccione uno de los elementos de la lista.");
        }
        usu.add(b);
        i++;
        break;
    }
    JOptionPane.showMessageDialog(null, usu.get(0).getNombre());
    }catch(NumberFormatException e){
    JOptionPane.showMessageDialog(null, "Ingrese un nombre o números validos.");
    }
        

    jTextFieldNombre.setText("");
    jTextFieldCedula.setText("");
    jTextFieldPasaporte.setText("");
    jTextFieldTC.setText("");
    jTextFieldApellido.setText("");
    }//GEN-LAST:event_jButtonRegistroActionPerformed

    private void jButtonRMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRMActionPerformed
        IEM menu = new IEM();
        Lista list = new Lista();
        menu.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButtonRMActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        
    }//GEN-LAST:event_formWindowOpened

    private void jComboBoxInstalacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxInstalacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxInstalacionActionPerformed

    private void jTextFieldApellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldApellidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldApellidoActionPerformed

    private void jButtonMoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMoActionPerformed
        IEMo modificar = new IEMo();
        modificar.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButtonMoActionPerformed

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
            java.util.logging.Logger.getLogger(IER.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IER.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IER.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IER.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IER().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonMo;
    private javax.swing.JButton jButtonRM;
    private javax.swing.JButton jButtonRegistro;
    private javax.swing.JComboBox<String> jComboBoxInstalacion;
    private javax.swing.JLabel jFondo;
    private javax.swing.JLabel jLabelCedula;
    private javax.swing.JLabel jLabelHabitación;
    private javax.swing.JLabel jLabelNombre;
    private javax.swing.JLabel jLabelNombreApellido;
    private javax.swing.JLabel jLabelPasaporte;
    private javax.swing.JLabel jLabelTC;
    private javax.swing.JTextField jTextFieldApellido;
    private javax.swing.JTextField jTextFieldCedula;
    private javax.swing.JTextField jTextFieldNombre;
    private javax.swing.JTextField jTextFieldPasaporte;
    private javax.swing.JTextField jTextFieldTC;
    // End of variables declaration//GEN-END:variables
}
