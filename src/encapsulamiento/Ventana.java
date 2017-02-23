/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encapsulamiento;

import javax.swing.JComboBox;
import javax.swing.JOptionPane;

/**
 *
 * @author dyno
 */
public class Ventana extends javax.swing.JFrame {

    MiFecha miFecha = new MiFecha();

    public Ventana() {

        initComponents();
        this.setLocationRelativeTo(null); // centra Ventana
        this.setResizable(false); //prohibe que ajusten la ventana
        this.setTitle("Encapsulamiento");
        //Agregar Items al ComboBox
        jComboBox_opciones.addItem("Día");
        jComboBox_opciones.addItem("Mes");
        jComboBox_opciones.addItem("Año");
        jLabel_fechaResultado.setText(String.valueOf(miFecha.getDia()) + "/" + String.valueOf(miFecha.getMes()) + "/" + String.valueOf(miFecha.getAnio()));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel_fechaActual = new javax.swing.JLabel();
        jLabel_fechaResultado = new javax.swing.JLabel();
        jButton_Ingresar = new javax.swing.JButton();
        jTextField_texto = new javax.swing.JTextField();
        jComboBox_opciones = new javax.swing.JComboBox<>();
        jLabel_mensajeResultado = new javax.swing.JLabel();
        jButton_limpiar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel_fechaActual.setText("Fecha Actual:");

        jButton_Ingresar.setText("Ingresar");
        jButton_Ingresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_IngresarActionPerformed(evt);
            }
        });

        jComboBox_opciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox_opcionesActionPerformed(evt);
            }
        });

        jLabel_mensajeResultado.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        jButton_limpiar.setText("Limpiar");
        jButton_limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_limpiarActionPerformed(evt);
            }
        });

        jLabel1.setText("Seleccione:");

        jLabel2.setText("Ingrese un numero/fecha:");

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Arial", 2, 10)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 102, 102));
        jLabel3.setText("Hecho por Carlos Sedano De La Torre");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(425, 425, 425))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel_mensajeResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 382, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBox_opciones, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel_fechaActual)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel_fechaResultado))
                                    .addComponent(jLabel1))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jTextField_texto, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton_Ingresar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton_limpiar))
                            .addComponent(jLabel2))))
                .addGap(46, 46, 46))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_fechaActual)
                    .addComponent(jLabel_fechaResultado))
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_Ingresar)
                    .addComponent(jTextField_texto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox_opciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_limpiar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel_mensajeResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addGap(24, 24, 24))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox_opcionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox_opcionesActionPerformed

    }//GEN-LAST:event_jComboBox_opcionesActionPerformed

    private void jButton_IngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_IngresarActionPerformed
        try {

            switch (jComboBox_opciones.getSelectedItem().toString()) {
                case "Día":
                    if (miFecha.setDia(Integer.parseInt(jTextField_texto.getText()), miFecha.getMes(), miFecha.getAnio())) {
                        jLabel_mensajeResultado.setText("¡Modificación del Día exitosa!");
                    } else {
                        jLabel_mensajeResultado.setText("Conflicto con el Día ingresado: " + jTextField_texto.getText());
                        jTextField_texto.requestFocus();
                    }
                    break;

                case "Mes":
                    if (miFecha.setMes(miFecha.getDia(), Integer.parseInt(jTextField_texto.getText()), miFecha.getAnio())) {
                        jLabel_mensajeResultado.setText("¡Modificación del Mes exitosa!");
                    } else {
                        jLabel_mensajeResultado.setText("Conflicto con el Mes ingresado: " + jTextField_texto.getText());
                        jTextField_texto.requestFocus();
                    }
                    break;

                case "Año":
                    if (miFecha.setAnio(miFecha.getDia(), miFecha.getMes(), Integer.parseInt(jTextField_texto.getText()))) {
                        jLabel_mensajeResultado.setText("¡Modificación del Año exitosa!");
                    } else {
                        jLabel_mensajeResultado.setText("Conflicto con el Año ingresado: " + jTextField_texto.getText());
                        jTextField_texto.requestFocus();
                    }
                    break;

                default:
                    break;
            }
            jLabel_fechaResultado.setText(String.valueOf(miFecha.getDia()) + "/" + String.valueOf(miFecha.getMes()) + "/" + String.valueOf(miFecha.getAnio()));
            jTextField_texto.setText("");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Verifique la fecha que ingreso", "Error", JOptionPane.ERROR_MESSAGE);
            jTextField_texto.setText("");
            jTextField_texto.requestFocus();
        }

    }//GEN-LAST:event_jButton_IngresarActionPerformed

    private void jButton_limpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_limpiarActionPerformed
        jTextField_texto.setText("");
        jLabel_mensajeResultado.setText("");
        jTextField_texto.requestFocus();
    }//GEN-LAST:event_jButton_limpiarActionPerformed

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
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_Ingresar;
    private javax.swing.JButton jButton_limpiar;
    private javax.swing.JComboBox<String> jComboBox_opciones;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel_fechaActual;
    private javax.swing.JLabel jLabel_fechaResultado;
    private javax.swing.JLabel jLabel_mensajeResultado;
    private javax.swing.JTextField jTextField_texto;
    // End of variables declaration//GEN-END:variables
}
