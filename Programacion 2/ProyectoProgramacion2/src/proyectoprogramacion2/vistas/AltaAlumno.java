/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoprogramacion2.vistas;


import datechooser.beans.DateChooserCombo;
import javax.swing.JButton;
import javax.swing.JTextField;

/**
 *
 * @author Guillermo Marinero
 */
public class AltaAlumno extends javax.swing.JFrame {

    /**
     * Creates new form AltaAlumno
     */
    public AltaAlumno() {
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

        jPanelAltaAlumno = new javax.swing.JPanel();
        jLabelNombre = new javax.swing.JLabel();
        jLabelApellido = new javax.swing.JLabel();
        jLabelDNI = new javax.swing.JLabel();
        jLabelDom = new javax.swing.JLabel();
        jLabelTel = new javax.swing.JLabel();
        jTextFieldNombre = new javax.swing.JTextField();
        jTextFieldApellido = new javax.swing.JTextField();
        jTextFieldDNI = new javax.swing.JTextField();
        jTextFieldDom = new javax.swing.JTextField();
        jTextFieldTel = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jButtonAceptarAltaAlumno = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanelAltaAlumno.setBackground(new java.awt.Color(204, 204, 204));

        jLabelNombre.setText("NOMBRE:");

        jLabelApellido.setText("APELLIDO:");

        jLabelDNI.setText("DOCUMENTO:");

        jLabelDom.setText("DOMICILIO:");

        jLabelTel.setText("TELEFONO:");

        javax.swing.GroupLayout jPanelAltaAlumnoLayout = new javax.swing.GroupLayout(jPanelAltaAlumno);
        jPanelAltaAlumno.setLayout(jPanelAltaAlumnoLayout);
        jPanelAltaAlumnoLayout.setHorizontalGroup(
            jPanelAltaAlumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelAltaAlumnoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelAltaAlumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanelAltaAlumnoLayout.createSequentialGroup()
                        .addComponent(jLabelNombre)
                        .addGap(18, 18, 18)
                        .addComponent(jTextFieldNombre))
                    .addGroup(jPanelAltaAlumnoLayout.createSequentialGroup()
                        .addComponent(jLabelApellido)
                        .addGap(18, 18, 18)
                        .addComponent(jTextFieldApellido))
                    .addGroup(jPanelAltaAlumnoLayout.createSequentialGroup()
                        .addComponent(jLabelDNI)
                        .addGap(18, 18, 18)
                        .addComponent(jTextFieldDNI, javax.swing.GroupLayout.DEFAULT_SIZE, 193, Short.MAX_VALUE))
                    .addGroup(jPanelAltaAlumnoLayout.createSequentialGroup()
                        .addComponent(jLabelDom)
                        .addGap(18, 18, 18)
                        .addComponent(jTextFieldDom))
                    .addGroup(jPanelAltaAlumnoLayout.createSequentialGroup()
                        .addComponent(jLabelTel)
                        .addGap(18, 18, 18)
                        .addComponent(jTextFieldTel)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelAltaAlumnoLayout.setVerticalGroup(
            jPanelAltaAlumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelAltaAlumnoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelAltaAlumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNombre)
                    .addComponent(jTextFieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelAltaAlumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelApellido)
                    .addComponent(jTextFieldApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelAltaAlumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelDNI)
                    .addComponent(jTextFieldDNI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(56, 56, 56)
                .addGroup(jPanelAltaAlumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelDom)
                    .addComponent(jTextFieldDom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelAltaAlumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelTel)
                    .addComponent(jTextFieldTel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(47, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));

        jButtonAceptarAltaAlumno.setText("ACEPTAR");

        jButtonCancelar.setText("CANCELAR");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButtonAceptarAltaAlumno)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 115, Short.MAX_VALUE)
                .addComponent(jButtonCancelar)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonAceptarAltaAlumno, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
                    .addComponent(jButtonCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanelAltaAlumno, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelAltaAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(AltaAlumno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AltaAlumno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AltaAlumno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AltaAlumno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AltaAlumno().setVisible(true);
            }
        });
    }

 

    public JButton getjButtonCancelar() {
        return jButtonCancelar;
    }

    public JTextField getjTextFieldApellido() {
        return jTextFieldApellido;
    }

   

    public JTextField getjTextFieldDNI() {
        return jTextFieldDNI;
    }

    public JTextField getjTextFieldDom() {
        return jTextFieldDom;
    }

 

    public JTextField getjTextFieldNombre() {
        return jTextFieldNombre;
    }

    public JTextField getjTextFieldTel() {
        return jTextFieldTel;
    }



    public JButton getjButtonAceptarAltaAlumno() {
        return jButtonAceptarAltaAlumno;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAceptarAltaAlumno;
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JLabel jLabelApellido;
    private javax.swing.JLabel jLabelDNI;
    private javax.swing.JLabel jLabelDom;
    private javax.swing.JLabel jLabelNombre;
    private javax.swing.JLabel jLabelTel;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanelAltaAlumno;
    private javax.swing.JTextField jTextFieldApellido;
    private javax.swing.JTextField jTextFieldDNI;
    private javax.swing.JTextField jTextFieldDom;
    private javax.swing.JTextField jTextFieldNombre;
    private javax.swing.JTextField jTextFieldTel;
    // End of variables declaration//GEN-END:variables
}
