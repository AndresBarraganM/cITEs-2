/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vista;

import javax.swing.JOptionPane;
import cites.Coordinador;
/**
 *
 * @author PC
 */
public class FrCoords extends javax.swing.JFrame {

    /**
     * Creates new form FrAlumnos
     */
    public FrCoords() {
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

        jpanelFondoRefe = new javax.swing.JPanel();
        jPanelFondoRefe = new javax.swing.JPanel();
        lblContrasenia = new javax.swing.JLabel();
        txtNumEmpleado = new javax.swing.JTextField();
        lblNoEmpleado = new javax.swing.JLabel();
        passwordField = new javax.swing.JPasswordField();
        btnMostrarContra = new javax.swing.JButton();
        BtnAceptar = new javax.swing.JButton();
        BtnRegresar = new javax.swing.JButton();
        lblRegistro = new javax.swing.JLabel();
        btnRegistrarme = new javax.swing.JButton();
        lblBienvenida = new javax.swing.JLabel();
        lblCites = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jpanelFondoRefe.setBackground(new java.awt.Color(15, 35, 50));
        jpanelFondoRefe.setMinimumSize(new java.awt.Dimension(1024, 768));
        jpanelFondoRefe.setPreferredSize(new java.awt.Dimension(1024, 768));
        jpanelFondoRefe.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanelFondoRefe.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblContrasenia.setFont(new java.awt.Font("Eras Bold ITC", 0, 24)); // NOI18N
        lblContrasenia.setText("Contraseña:");
        jPanelFondoRefe.add(lblContrasenia, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 260, -1, -1));

        txtNumEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNumEmpleadoActionPerformed(evt);
            }
        });
        jPanelFondoRefe.add(txtNumEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 190, 440, 30));

        lblNoEmpleado.setFont(new java.awt.Font("Eras Bold ITC", 0, 24)); // NOI18N
        lblNoEmpleado.setText("No. de Empleado:");
        jPanelFondoRefe.add(lblNoEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 190, -1, 30));

        passwordField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordFieldActionPerformed(evt);
            }
        });
        jPanelFondoRefe.add(passwordField, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 260, 260, 30));

        btnMostrarContra.setText("....");
        jPanelFondoRefe.add(btnMostrarContra, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 260, 30, 30));

        BtnAceptar.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        BtnAceptar.setText("ACEPTAR");
        BtnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAceptarActionPerformed(evt);
            }
        });
        jPanelFondoRefe.add(BtnAceptar, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 400, 150, 50));

        BtnRegresar.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        BtnRegresar.setText("REGRESAR");
        BtnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnRegresarActionPerformed(evt);
            }
        });
        jPanelFondoRefe.add(BtnRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 400, 150, 50));

        lblRegistro.setText("¿No esta registrado? Registrese Aqui -------->");
        jPanelFondoRefe.add(lblRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 506, -1, 30));

        btnRegistrarme.setText("Registrarme");
        btnRegistrarme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarmeActionPerformed(evt);
            }
        });
        jPanelFondoRefe.add(btnRegistrarme, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 510, -1, -1));

        lblBienvenida.setFont(new java.awt.Font("Eras Bold ITC", 0, 24)); // NOI18N
        lblBienvenida.setText("¡BIENVENIDO COORDINADOR!");
        jPanelFondoRefe.add(lblBienvenida, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 80, -1, -1));

        jpanelFondoRefe.add(jPanelFondoRefe, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 120, 860, 560));

        lblCites.setFont(new java.awt.Font("Eras Bold ITC", 0, 48)); // NOI18N
        lblCites.setForeground(new java.awt.Color(255, 255, 255));
        lblCites.setText("cITEs");
        jpanelFondoRefe.add(lblCites, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 60, -1, -1));

        getContentPane().add(jpanelFondoRefe, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1030, 770));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAceptarActionPerformed
        // TODO add your handling code here:
         FrMenuCoords inicioCoords = new FrMenuCoords();
        
        //Mostramos la interfaz del menu principal
        inicioCoords.setVisible(true);
        
        this.dispose();
    }//GEN-LAST:event_BtnAceptarActionPerformed

    private void BtnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnRegresarActionPerformed
        // TODO add your handling code here:
        
         FrMenuPrincipal inicio = new FrMenuPrincipal();
        
        //Mostramos la interfaz del menu principal
        inicio.setVisible(true);
        
        //Para que se cierre la ventana 
        this.dispose();
    }//GEN-LAST:event_BtnRegresarActionPerformed

    private void btnRegistrarmeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarmeActionPerformed
        // TODO add your handling code here:
        FrRegistrarCoords registrarCoords = new FrRegistrarCoords();
        
        //Mostramos la interfaz del menu principal
        registrarCoords.setVisible(true);
        
        //Para que se cierre la ventana 
        this.dispose();
        
    }//GEN-LAST:event_btnRegistrarmeActionPerformed

    private void txtNumEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumEmpleadoActionPerformed
        // TODO add your handling code here:
         try {
        String numControl = txtNumEmpleado.getText().trim();
                // Obtenemos el texto del campo y eliminamos espacios en blanco al inicio y al final

        // Verificamos si el número de control contiene caracteres que no sean dígitos
        if (!numControl.matches("[0-9]+")) { // Utilizamos una expresión regular para verificar si hay caracteres que no sean dígitos
            throw new IllegalArgumentException("El número de control solo puede contener números."); // Lanzamos una excepción si se encuentran caracteres que no sean dígitos
        }

        // Si no se lanzó ninguna excepción, el número de control es válido
        // Aquí podrías realizar otras operaciones con el número de control válido
    } catch (IllegalArgumentException e) {
        // Capturamos la excepción e imprimimos un mensaje de error
        JOptionPane.showMessageDialog(this, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_txtNumEmpleadoActionPerformed

    private void passwordFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordFieldActionPerformed
        // TODO add your handling code here:
         try {
        char[] passwordChars = passwordField.getPassword(); // Obtener la contraseña como un arreglo de caracteres

        // Convertir el arreglo de caracteres en una cadena de caracteres
        String password = new String(passwordChars);

        // Verificar si el campo de contraseña está vacío
        if (password.isEmpty()) {
            throw new IllegalArgumentException("El campo de contraseña está vacío.");
        }
        // Verificar si la longitud de la contraseña es suficiente
        //int longitudMinima = 6; // Definir la longitud mínima requerida para la contraseña
        //if (password.length() < longitudMinima) {
           // throw new IllegalArgumentException("La contraseña debe tener al menos " + longitudMinima + " caracteres.");
        //}

        // Si no se lanzó ninguna excepción, la contraseña es válida
        // Aquí podrías realizar otras operaciones con la contraseña válida
    } catch (IllegalArgumentException e) {
        // Capturar la excepción e imprimir un mensaje de error
        JOptionPane.showMessageDialog(this, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_passwordFieldActionPerformed

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
            java.util.logging.Logger.getLogger(FrCoords.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrCoords.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrCoords.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrCoords.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrCoords().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnAceptar;
    private javax.swing.JButton BtnRegresar;
    private javax.swing.JButton btnMostrarContra;
    private javax.swing.JButton btnRegistrarme;
    private javax.swing.JPanel jPanelFondoRefe;
    private javax.swing.JPanel jpanelFondoRefe;
    private javax.swing.JLabel lblBienvenida;
    private javax.swing.JLabel lblCites;
    private javax.swing.JLabel lblContrasenia;
    private javax.swing.JLabel lblNoEmpleado;
    private javax.swing.JLabel lblRegistro;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JTextField txtNumEmpleado;
    // End of variables declaration//GEN-END:variables
}
