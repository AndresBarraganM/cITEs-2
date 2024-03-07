/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vista;

import javax.swing.JOptionPane;
import database.SqlAlumno;
import database.SqlCoordinador;
import cites.Alumno;
import cites.Coordinador;

/**
 *
 * @author PC
 */
public class FrPerfilUsuario extends javax.swing.JFrame {

    /**
     * Creates new form FrAlumnos
     */
    public FrPerfilUsuario() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     * @param correoUsuario
     * @param contrasenaUsuario
     * @param tipoUsuario
     */
    @SuppressWarnings("unchecked")

    public void cargarDatosUsuario(String correoUsuario, String contrasenaUsuario, String tipoUsuario) {
        // 06-03-2024
        if (tipoUsuario.equals("alumno")) {
            // Consultar la base de datos para obtener los datos del alumno
            SqlAlumno sqlAlumno = new SqlAlumno();
            Alumno alumno = sqlAlumno.consultarAlumno(correoUsuario, contrasenaUsuario);
            // Mostrar los datos del alumno en el frame de Perfil de usuario
            if (alumno != null) {
                txtfieldNombre.setText(alumno.getNombreCompleto());
                txtFieldCorreo.setText(alumno.getCorreoInstitucional());
                passwordField.setText(alumno.getContrasena());
            } else {
                // No se encontró el alumno en la base de datos
                JOptionPane.showMessageDialog(this, "Usuario no encontrado", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } else if (tipoUsuario.equals("coordinador")) {
            // Consultar la base de datos para obtener los datos del coordinador
            SqlCoordinador sqlCoordinador = new SqlCoordinador();
            Coordinador coordinador = sqlCoordinador.consultarCoordinador(correoUsuario, contrasenaUsuario);
            // Mostrar los datos del coordinador en el frame de Perfil de usuario
            if (coordinador != null) {
                txtfieldNombre.setText(coordinador.getNombreCompleto());
                txtFieldCorreo.setText(coordinador.getCorreoInstitucional());
                passwordField.setText(coordinador.getContrasena());
            } else {
                // No se encontró el coordinador en la base de datos
                JOptionPane.showMessageDialog(this, "Usuario no encontrado", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
        // Hacer visible el frame de Perfil de usuario
        setVisible(true);
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpanelFondoRefe = new javax.swing.JPanel();
        jPanelFondoRefe = new javax.swing.JPanel();
        lblContrasenia = new javax.swing.JLabel();
        txtFieldCorreo = new javax.swing.JTextField();
        lblNombre = new javax.swing.JLabel();
        passwordField = new javax.swing.JPasswordField();
        btnMostrarContra = new javax.swing.JButton();
        BtnAceptar = new javax.swing.JButton();
        BtnRegresar = new javax.swing.JButton();
        lblCuenta = new javax.swing.JLabel();
        lblCorreo = new javax.swing.JLabel();
        txtfieldNombre = new javax.swing.JTextField();
        lblUsuarioPng = new javax.swing.JLabel();
        lblCites = new javax.swing.JLabel();
        lblBienvenida = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jpanelFondoRefe.setBackground(new java.awt.Color(153, 204, 255));
        jpanelFondoRefe.setMinimumSize(new java.awt.Dimension(1024, 768));
        jpanelFondoRefe.setPreferredSize(new java.awt.Dimension(1024, 768));
        jpanelFondoRefe.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanelFondoRefe.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblContrasenia.setFont(new java.awt.Font("Eras Bold ITC", 0, 24)); // NOI18N
        lblContrasenia.setText("Contraseña:");
        jPanelFondoRefe.add(lblContrasenia, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 310, -1, -1));

        txtFieldCorreo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFieldCorreoActionPerformed(evt);
            }
        });
        jPanelFondoRefe.add(txtFieldCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 250, 440, 30));

        lblNombre.setFont(new java.awt.Font("Eras Bold ITC", 0, 24)); // NOI18N
        lblNombre.setText("Nombre:");
        jPanelFondoRefe.add(lblNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 180, -1, 30));

        passwordField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordFieldActionPerformed(evt);
            }
        });
        jPanelFondoRefe.add(passwordField, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 310, 260, 30));

        btnMostrarContra.setText("....");
        jPanelFondoRefe.add(btnMostrarContra, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 310, 30, 30));

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

        lblCuenta.setFont(new java.awt.Font("Eras Bold ITC", 0, 24)); // NOI18N
        lblCuenta.setText("Mi Cuenta:");
        jPanelFondoRefe.add(lblCuenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, -1, 30));

        lblCorreo.setFont(new java.awt.Font("Eras Bold ITC", 0, 24)); // NOI18N
        lblCorreo.setText("Correo Institucional:");
        jPanelFondoRefe.add(lblCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, -1, 30));

        txtfieldNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtfieldNombreActionPerformed(evt);
            }
        });
        jPanelFondoRefe.add(txtfieldNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 180, 440, 30));

        lblUsuarioPng.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/4105943-accounts-group-people-user-user-group-users_113923.png"))); // NOI18N
        jPanelFondoRefe.add(lblUsuarioPng, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 40, -1, -1));

        jpanelFondoRefe.add(jPanelFondoRefe, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 120, 860, 560));

        lblCites.setFont(new java.awt.Font("Eras Bold ITC", 0, 48)); // NOI18N
        lblCites.setText("cITEs");
        jpanelFondoRefe.add(lblCites, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 20, -1, -1));

        lblBienvenida.setFont(new java.awt.Font("Eras Bold ITC", 0, 24)); // NOI18N
        lblBienvenida.setText("¡BIENVENIDO ALBATRO!");
        jpanelFondoRefe.add(lblBienvenida, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 80, -1, -1));

        getContentPane().add(jpanelFondoRefe, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1030, 770));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAceptarActionPerformed
        // TODO add your handling code here:
        FrMenuAlumnos menuAlumnos = new FrMenuAlumnos();
        
        //Mostramos la interfaz del menu alumnos
        menuAlumnos.setVisible(true);
        
        //Para que se cierre la ventana 
        this.dispose();
    }//GEN-LAST:event_BtnAceptarActionPerformed

    private void BtnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnRegresarActionPerformed
        // TODO add your handling code here:
        FrMenuAlumnos menuAlumnos = new FrMenuAlumnos();
        
        //Mostramos la interfaz del menu alumnos
        menuAlumnos.setVisible(true);
        
        //Para que se cierre la ventana 
        this.dispose();
    }//GEN-LAST:event_BtnRegresarActionPerformed

    private void txtfieldNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtfieldNombreActionPerformed
        // TODO add your handling code here:
         try {
        String Nombre = txtfieldNombre.getText().trim(); // Obtenemos el texto del campo y eliminamos espacios en blanco al inicio y al final

        if (Nombre.isEmpty()) {
            throw new IllegalArgumentException("El campo de nombre está vacío."); // Lanzamos una excepción si el campo está vacío
        }

        // Verificamos si el nombre contiene números
        if (Nombre.matches(".*\\d.*")) { // Utilizamos una expresión regular para buscar dígitos
            throw new IllegalArgumentException("El correo no puede contener números."); // Lanzamos una excepción si el nombre contiene números
        }

        // Si no se lanzó ninguna excepción, el correo es válido
        // Aquí podrías realizar otras operaciones con el correo válido
    } catch (IllegalArgumentException e) {
        // Capturamos la excepción e imprimimos un mensaje de error
        JOptionPane.showMessageDialog(this, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    }      
        
    }//GEN-LAST:event_txtfieldNombreActionPerformed

    private void txtFieldCorreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFieldCorreoActionPerformed
        // TODO add your handling code here:
         try {
        String correo = txtFieldCorreo.getText().trim(); // Obtenemos el texto del campo y eliminamos espacios en blanco al inicio y al final

        // Verificar si el campo de correo electrónico está vacío
        if (correo.isEmpty()) {
            throw new IllegalArgumentException("El campo de correo electrónico está vacío.");
        }

        // Verificar si el correo electrónico excede la longitud máxima permitida
       // int longitudMaxima = 100; // Definir la longitud máxima permitida
        //if (correo.length() > longitudMaxima) {
          //  throw new IllegalArgumentException("La longitud del correo electrónico excede el límite permitido.");
        //}

        // Si no se lanzó ninguna excepción, el correo electrónico es válido
        // Aquí podrías realizar otras operaciones con el correo electrónico válido
    } catch (IllegalArgumentException e) {
        // Capturar la excepción e imprimir un mensaje de error
        JOptionPane.showMessageDialog(this, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_txtFieldCorreoActionPerformed

    private void passwordFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordFieldActionPerformed
        // TODO add your handling code here:
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
            java.util.logging.Logger.getLogger(FrPerfilUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrPerfilUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrPerfilUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrPerfilUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrPerfilUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnAceptar;
    private javax.swing.JButton BtnRegresar;
    private javax.swing.JButton btnMostrarContra;
    private javax.swing.JPanel jPanelFondoRefe;
    private javax.swing.JPanel jpanelFondoRefe;
    private javax.swing.JLabel lblBienvenida;
    private javax.swing.JLabel lblCites;
    private javax.swing.JLabel lblContrasenia;
    private javax.swing.JLabel lblCorreo;
    private javax.swing.JLabel lblCuenta;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblUsuarioPng;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JTextField txtFieldCorreo;
    private javax.swing.JTextField txtfieldNombre;
    // End of variables declaration//GEN-END:variables
}