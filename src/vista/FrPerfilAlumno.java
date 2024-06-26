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
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author PC
 */
public class FrPerfilAlumno extends javax.swing.JFrame {
     Alumno usuario;
    /**
     * Creates new form FrAlumnos
     */
    public FrPerfilAlumno(Alumno usuario) {
        this.usuario = usuario;
        initComponents();
        cargarDatosUsuario(usuario.getContrasena(), usuario.getCorreoInstitucional());
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

    public void cargarDatosUsuario(String correoUsuario, String contrasenaUsuario) {
        // 06-03-2024
        
        // Consultar la base de datos para obtener los datos del alumno
        SqlAlumno sqlAlumno = new SqlAlumno();
        Alumno alumno = sqlAlumno.consultarAlumno(correoUsuario, contrasenaUsuario);
        // Mostrar los datos del alumno en el frame de Perfil de usuario
        if (alumno != null) {
            txtfieldNombre.setText(alumno.getNombreCompleto());
            txtFieldCorreo1.setText(alumno.getCorreoInstitucional());
            txtNumControl.setText(String.valueOf(alumno.getNumeroControl()));
           
        } else {
            // No se encontró el alumno en la base de datos
            JOptionPane.showMessageDialog(this, "Usuario no encontrado", "Error", JOptionPane.ERROR_MESSAGE);
        }
       
        setVisible(true);
    }

    public boolean comprobarCampos(){
         boolean bandera = false;
        
        //Reviso que ningun campo este vacio
        if (txtNumControl.getText().isBlank()){
            JOptionPane.showMessageDialog(this, "Por favor no deje vacio el campo de numero de control", "Error", JOptionPane.ERROR_MESSAGE);
            bandera = true;
        } else if(txtFieldCorreo1.getText().isBlank()){
            JOptionPane.showMessageDialog(this, "Por favor lno deje vacio el campo de correo institucional", "Error", JOptionPane.ERROR_MESSAGE);
            bandera = true;
        } else if(txtfieldNombre.getText().isBlank()){
            JOptionPane.showMessageDialog(this, "Por favor no deje vacio el campo de nombre", "Error", JOptionPane.ERROR_MESSAGE);
            bandera = true;
        } 
        
        
        if (bandera == true) { return bandera;}
        
        //Si hay algo en el campo contrasenia cambio el campo
        if(pswFieldContra.getPassword().length != 0){
            String contra = new String(pswFieldContra.getPassword());
            System.out.println(contra);

            String contConfirmada = new String(pswFieldConfirmar.getPassword());
            System.out.println(contConfirmada);

            if (! contra.equals(contConfirmada)){
                JOptionPane.showMessageDialog(this, "Las contrasenias no son iguales", "Error", JOptionPane.ERROR_MESSAGE);
                bandera = true;
            }
        }
        
        return bandera;
    }
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpanelFondoRefe = new javax.swing.JPanel();
        jPanelFondoRefe = new javax.swing.JPanel();
        lblContrasenia = new javax.swing.JLabel();
        txtNumControl = new javax.swing.JTextField();
        lblNombre = new javax.swing.JLabel();
        pswFieldConfirmar = new javax.swing.JPasswordField();
        BtnAceptar = new javax.swing.JButton();
        BtnRegresar = new javax.swing.JButton();
        lblCuenta = new javax.swing.JLabel();
        lblCorreo = new javax.swing.JLabel();
        txtfieldNombre = new javax.swing.JTextField();
        lblUsuarioPng = new javax.swing.JLabel();
        lblCorreo3 = new javax.swing.JLabel();
        txtFieldCorreo1 = new javax.swing.JTextField();
        lblContrasenia1 = new javax.swing.JLabel();
        pswFieldContra = new javax.swing.JPasswordField();
        lblCites = new javax.swing.JLabel();
        lblBienvenida = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jpanelFondoRefe.setBackground(new java.awt.Color(153, 204, 255));
        jpanelFondoRefe.setMinimumSize(new java.awt.Dimension(1024, 768));
        jpanelFondoRefe.setPreferredSize(new java.awt.Dimension(1024, 768));
        jpanelFondoRefe.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanelFondoRefe.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblContrasenia.setFont(new java.awt.Font("Eras Bold ITC", 0, 24)); // NOI18N
        lblContrasenia.setText("Confrimar contraseña:");
        jPanelFondoRefe.add(lblContrasenia, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 340, -1, -1));

        txtNumControl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNumControlActionPerformed(evt);
            }
        });
        jPanelFondoRefe.add(txtNumControl, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 210, 440, 30));

        lblNombre.setFont(new java.awt.Font("Eras Bold ITC", 0, 24)); // NOI18N
        lblNombre.setText("Nombre:");
        jPanelFondoRefe.add(lblNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 120, -1, 30));

        pswFieldConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pswFieldConfirmarActionPerformed(evt);
            }
        });
        jPanelFondoRefe.add(pswFieldConfirmar, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 340, 260, 30));

        BtnAceptar.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        BtnAceptar.setText("MODIFICAR");
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
        lblCuenta.setText("Cambie los campos que desee alterar");
        jPanelFondoRefe.add(lblCuenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 60, -1, 30));

        lblCorreo.setFont(new java.awt.Font("Eras Bold ITC", 0, 24)); // NOI18N
        lblCorreo.setText("Numero de control:");
        jPanelFondoRefe.add(lblCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, -1, 30));

        txtfieldNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtfieldNombreActionPerformed(evt);
            }
        });
        jPanelFondoRefe.add(txtfieldNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 120, 440, 30));

        lblUsuarioPng.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/4105943-accounts-group-people-user-user-group-users_113923.png"))); // NOI18N
        jPanelFondoRefe.add(lblUsuarioPng, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 40, -1, -1));

        lblCorreo3.setFont(new java.awt.Font("Eras Bold ITC", 0, 24)); // NOI18N
        lblCorreo3.setText("Correo Institucional:");
        jPanelFondoRefe.add(lblCorreo3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, -1, 30));

        txtFieldCorreo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFieldCorreo1ActionPerformed(evt);
            }
        });
        jPanelFondoRefe.add(txtFieldCorreo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 160, 440, 30));

        lblContrasenia1.setFont(new java.awt.Font("Eras Bold ITC", 0, 24)); // NOI18N
        lblContrasenia1.setText("Contraseña nueva:");
        jPanelFondoRefe.add(lblContrasenia1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, -1, -1));

        pswFieldContra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pswFieldContraActionPerformed(evt);
            }
        });
        jPanelFondoRefe.add(pswFieldContra, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 300, 260, 30));

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
        if (comprobarCampos()){
            //
        }
        else
        {
            //Cosas que pasan si todo esta bien
            //crear nuevo objeto de alumno
            Alumno alumno = this.usuario;
            //Asignar nuevos valores
            alumno.setNombreCompleto(txtfieldNombre.getText());
            alumno.setCorreoInstitucional(txtFieldCorreo1.getText());
            alumno.setNumeroControl(Integer.valueOf(txtNumControl.getText()));
            
                //Reviso si hay algo en la contrasenia, si es asi le asigno tambieneso
            if (pswFieldContra.getPassword().length != 0){
                alumno.setContrasena(new String(pswFieldContra.getPassword()));
            }

            //Enviar a sql
            SqlAlumno alumnDb = new SqlAlumno();
            alumnDb.modificarAlumno(alumno);
            
            //Asignar atributos actuales a objeto actual
            this.usuario = alumno;
            
            //Enviar informacion al usuario
            JOptionPane.showMessageDialog(null, "Se logro modificar el perfil", "Exito en cambiar perfil", JOptionPane.INFORMATION_MESSAGE);
        }
        
    }//GEN-LAST:event_BtnAceptarActionPerformed

    private void BtnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnRegresarActionPerformed
        // TODO add your handling code here:
        FrMenuAlumnos menuAlumnos = new FrMenuAlumnos(this.usuario);
        
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

    private void txtNumControlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumControlActionPerformed
        // TODO add your handling code here:
         try {
        String correo = txtNumControl.getText().trim(); // Obtenemos el texto del campo y eliminamos espacios en blanco al inicio y al final

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
    }//GEN-LAST:event_txtNumControlActionPerformed

    private void pswFieldConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pswFieldConfirmarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pswFieldConfirmarActionPerformed

    private void txtFieldCorreo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFieldCorreo1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFieldCorreo1ActionPerformed

    private void pswFieldContraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pswFieldContraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pswFieldContraActionPerformed

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
            java.util.logging.Logger.getLogger(FrPerfilAlumno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrPerfilAlumno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrPerfilAlumno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrPerfilAlumno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Alumno alumno = new Alumno();
                new FrPerfilAlumno(alumno).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnAceptar;
    private javax.swing.JButton BtnRegresar;
    private javax.swing.JPanel jPanelFondoRefe;
    private javax.swing.JPanel jpanelFondoRefe;
    private javax.swing.JLabel lblBienvenida;
    private javax.swing.JLabel lblCites;
    private javax.swing.JLabel lblContrasenia;
    private javax.swing.JLabel lblContrasenia1;
    private javax.swing.JLabel lblCorreo;
    private javax.swing.JLabel lblCorreo3;
    private javax.swing.JLabel lblCuenta;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblUsuarioPng;
    private javax.swing.JPasswordField pswFieldConfirmar;
    private javax.swing.JPasswordField pswFieldContra;
    private javax.swing.JTextField txtFieldCorreo1;
    private javax.swing.JTextField txtNumControl;
    private javax.swing.JTextField txtfieldNombre;
    // End of variables declaration//GEN-END:variables
}
