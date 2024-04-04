/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vista;

import cites.Coordinador;
import database.SqlCoordinador;
import java.util.Set;
import javax.swing.JOptionPane;

/**
 *
 * @author PC
 */
public class FrRegistrarCoords extends javax.swing.JFrame {

    /**
     * Creates new form FrAlumnos
     */
    public FrRegistrarCoords() {
        initComponents();
    }

    public void registrarDatos(){
        //Coordinador vacio para rellenar
        Coordinador cord = new Coordinador();
        
        //Lo relleno con todos los campos
        cord.setCargo(txtFieldCargo.getText());
        cord.setContrasena(new String(passwordField.getPassword()));
        cord.setNombreCompleto(txtFieldNombre.getText());
        cord.setCorreoInstitucional(txtFieldCorreo.getText());
        cord.setNumeroControl(Integer.valueOf(txtFieldNumControl.getText()));
        
        SqlCoordinador sqlCord = new SqlCoordinador();
        
        sqlCord.crearCoordinador(cord);
        JOptionPane.showMessageDialog(null, "Se logro agregar el perfil", "Exito en agregar perfil", JOptionPane.INFORMATION_MESSAGE);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpanelFondoRefe = new javax.swing.JPanel();
        jPanelFondoRefe = new javax.swing.JPanel();
        lblCorreo = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        BtnAceptar = new javax.swing.JButton();
        BtnRegresar = new javax.swing.JButton();
        lblinstruccion = new javax.swing.JLabel();
        lblNumEmpleado = new javax.swing.JLabel();
        lblContrasenia = new javax.swing.JLabel();
        txtFieldNombre = new javax.swing.JTextField();
        txtFieldCorreo = new javax.swing.JTextField();
        txtFieldCargo = new javax.swing.JTextField();
        passwordField = new javax.swing.JPasswordField();
        txtFieldNumControl = new javax.swing.JTextField();
        lblNumEmpleado1 = new javax.swing.JLabel();
        lblContrasenia1 = new javax.swing.JLabel();
        passwordField1 = new javax.swing.JPasswordField();
        lblCites = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jpanelFondoRefe.setBackground(new java.awt.Color(15, 35, 50));
        jpanelFondoRefe.setMinimumSize(new java.awt.Dimension(1024, 768));
        jpanelFondoRefe.setPreferredSize(new java.awt.Dimension(1024, 768));
        jpanelFondoRefe.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanelFondoRefe.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblCorreo.setFont(new java.awt.Font("Eras Bold ITC", 0, 18)); // NOI18N
        lblCorreo.setText("Correo Institucional:");
        jPanelFondoRefe.add(lblCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, -1, 30));

        lblNombre.setFont(new java.awt.Font("Eras Bold ITC", 0, 18)); // NOI18N
        lblNombre.setText("Nombre Completo:");
        jPanelFondoRefe.add(lblNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 150, -1, 30));

        BtnAceptar.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        BtnAceptar.setText("ACEPTAR");
        BtnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAceptarActionPerformed(evt);
            }
        });
        jPanelFondoRefe.add(BtnAceptar, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 480, 150, 50));

        BtnRegresar.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        BtnRegresar.setText("REGRESAR");
        BtnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnRegresarActionPerformed(evt);
            }
        });
        jPanelFondoRefe.add(BtnRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 480, 150, 50));

        lblinstruccion.setFont(new java.awt.Font("Eras Bold ITC", 0, 24)); // NOI18N
        lblinstruccion.setText("Rellene sus datos para registrarse");
        jPanelFondoRefe.add(lblinstruccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 50, -1, -1));

        lblNumEmpleado.setFont(new java.awt.Font("Eras Bold ITC", 0, 18)); // NOI18N
        lblNumEmpleado.setText("Cargo:");
        jPanelFondoRefe.add(lblNumEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 300, -1, 30));

        lblContrasenia.setFont(new java.awt.Font("Eras Bold ITC", 0, 18)); // NOI18N
        lblContrasenia.setText("Repita Contraseña:");
        jPanelFondoRefe.add(lblContrasenia, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 400, -1, 30));

        txtFieldNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFieldNombreActionPerformed(evt);
            }
        });
        jPanelFondoRefe.add(txtFieldNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 150, 450, 30));

        txtFieldCorreo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFieldCorreoActionPerformed(evt);
            }
        });
        jPanelFondoRefe.add(txtFieldCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 200, 390, 30));

        txtFieldCargo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFieldCargoActionPerformed(evt);
            }
        });
        jPanelFondoRefe.add(txtFieldCargo, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 300, 200, 30));

        passwordField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordFieldActionPerformed(evt);
            }
        });
        jPanelFondoRefe.add(passwordField, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 400, 260, 30));

        txtFieldNumControl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFieldNumControlActionPerformed(evt);
            }
        });
        jPanelFondoRefe.add(txtFieldNumControl, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 250, 200, 30));

        lblNumEmpleado1.setFont(new java.awt.Font("Eras Bold ITC", 0, 18)); // NOI18N
        lblNumEmpleado1.setText("Num. de Empleado:");
        jPanelFondoRefe.add(lblNumEmpleado1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 250, -1, 30));

        lblContrasenia1.setFont(new java.awt.Font("Eras Bold ITC", 0, 18)); // NOI18N
        lblContrasenia1.setText("Contraseña:");
        jPanelFondoRefe.add(lblContrasenia1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 360, -1, 30));

        passwordField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordField1ActionPerformed(evt);
            }
        });
        jPanelFondoRefe.add(passwordField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 360, 260, 30));

        jpanelFondoRefe.add(jPanelFondoRefe, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 120, 860, 580));

        lblCites.setFont(new java.awt.Font("Eras Bold ITC", 0, 48)); // NOI18N
        lblCites.setForeground(new java.awt.Color(255, 255, 255));
        lblCites.setText("cITEs");
        jpanelFondoRefe.add(lblCites, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 50, -1, -1));

        getContentPane().add(jpanelFondoRefe, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1030, 770));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAceptarActionPerformed
    try {
        String Nombre = txtFieldNombre.getText().trim();
        String numControl = txtFieldNumControl.getText().trim();
        String correo = txtFieldCorreo.getText().trim();
        String cargo = txtFieldCargo.getText();
        char[] passwordChars = passwordField.getPassword();
        
        String password = new String(passwordChars);

        if (Nombre.isEmpty()) {
            throw new IllegalArgumentException("El campo de nombre está vacío."); // Lanzamos una excepción si el campo está vacío
        }

        // Verificamos si el nombre contiene números
        if (Nombre.matches(".*\\d.*")) { // Utilizamos una expresión regular para buscar dígitos
            throw new IllegalArgumentException("El correo no puede contener números."); // Lanzamos una excepción si el nombre contiene números
        }
        if (!numControl.matches("[0-9]+")) { // Utilizamos una expresión regular para verificar si hay caracteres que no sean dígitos
            throw new IllegalArgumentException("El número de control solo puede contener números."); // Lanzamos una excepción si se encuentran caracteres que no sean dígitos
        }
        
        if (correo.isEmpty()) {
            throw new IllegalArgumentException("El campo de correo electrónico está vacío.");
        }
        if (password.isEmpty()) {
            throw new IllegalArgumentException("El campo de contraseña está vacío.");
        }
        if (cargo.isEmpty()){
            throw new IllegalArgumentException("El campo de cargo");
        }
        
        //Comprobar si ambas contrase;as son iguales
        String contra = new String(passwordField.getPassword());
        if (! contra.equals(new String(passwordField1.getPassword()))){
            throw new IllegalArgumentException("Las contraseñas no son iguales.");
        }
                
        registrarDatos();
        
        FrCoords frame= new FrCoords ();
        frame.setVisible(true);

        //Para que se cierre la ventana 
        this.dispose();
        } catch (IllegalArgumentException e) {
        // Capturamos la excepción e imprimimos un mensaje de error
        JOptionPane.showMessageDialog(this, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_BtnAceptarActionPerformed

    private void BtnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnRegresarActionPerformed
        // TODO add your handling code here:
        FrMenuPrincipal inicio = new FrMenuPrincipal();
        
        //Mostramos la interfaz del menu principal
        inicio.setVisible(true);
        
        //Para que se cierre la ventana 
        this.dispose();
    }//GEN-LAST:event_BtnRegresarActionPerformed

    
    private void txtFieldCargoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFieldCargoActionPerformed

    }//GEN-LAST:event_txtFieldCargoActionPerformed

    private void txtFieldNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFieldNombreActionPerformed
    
    }//GEN-LAST:event_txtFieldNombreActionPerformed

    private void txtFieldCorreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFieldCorreoActionPerformed

    }//GEN-LAST:event_txtFieldCorreoActionPerformed

    private void passwordFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordFieldActionPerformed

    }//GEN-LAST:event_passwordFieldActionPerformed

    private void txtFieldNumControlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFieldNumControlActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFieldNumControlActionPerformed

    private void passwordField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordField1ActionPerformed
    //HASTA AQUI
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
            java.util.logging.Logger.getLogger(FrRegistrarCoords.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrRegistrarCoords.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrRegistrarCoords.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrRegistrarCoords.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrRegistrarCoords().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnAceptar;
    private javax.swing.JButton BtnRegresar;
    private javax.swing.JPanel jPanelFondoRefe;
    private javax.swing.JPanel jpanelFondoRefe;
    private javax.swing.JLabel lblCites;
    private javax.swing.JLabel lblContrasenia;
    private javax.swing.JLabel lblContrasenia1;
    private javax.swing.JLabel lblCorreo;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblNumEmpleado;
    private javax.swing.JLabel lblNumEmpleado1;
    private javax.swing.JLabel lblinstruccion;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JPasswordField passwordField1;
    private javax.swing.JTextField txtFieldCargo;
    private javax.swing.JTextField txtFieldCorreo;
    private javax.swing.JTextField txtFieldNombre;
    private javax.swing.JTextField txtFieldNumControl;
    // End of variables declaration//GEN-END:variables
}
