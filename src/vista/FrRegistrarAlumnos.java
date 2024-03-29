/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vista;

import javax.swing.JOptionPane;

/**
 *
 * @author PC
 */
public class FrRegistrarAlumnos extends javax.swing.JFrame {

    /**
     * Creates new form FrAlumnos
     */
    public FrRegistrarAlumnos() {
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
        lblCorreo = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        BtnAceptar = new javax.swing.JButton();
        BtnRegresar = new javax.swing.JButton();
        lblinstruccion = new javax.swing.JLabel();
        lblNumControl = new javax.swing.JLabel();
        lblContrasenia = new javax.swing.JLabel();
        txtFieldNombre = new javax.swing.JTextField();
        txtFieldCorreo = new javax.swing.JTextField();
        txtFieldNumControl = new javax.swing.JTextField();
        passwordField = new javax.swing.JPasswordField();
        btnMostrarContra = new javax.swing.JButton();
        lblCites = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jpanelFondoRefe.setBackground(new java.awt.Color(153, 204, 255));
        jpanelFondoRefe.setMinimumSize(new java.awt.Dimension(1024, 768));
        jpanelFondoRefe.setPreferredSize(new java.awt.Dimension(1024, 768));
        jpanelFondoRefe.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanelFondoRefe.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblCorreo.setFont(new java.awt.Font("Eras Bold ITC", 0, 18)); // NOI18N
        lblCorreo.setText("Correo Institucional:");
        jPanelFondoRefe.add(lblCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 220, -1, 30));

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
        jPanelFondoRefe.add(lblinstruccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 50, -1, -1));

        lblNumControl.setFont(new java.awt.Font("Eras Bold ITC", 0, 18)); // NOI18N
        lblNumControl.setText("Num. de Control:");
        jPanelFondoRefe.add(lblNumControl, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 280, -1, 30));

        lblContrasenia.setFont(new java.awt.Font("Eras Bold ITC", 0, 18)); // NOI18N
        lblContrasenia.setText("Contraseña:");
        jPanelFondoRefe.add(lblContrasenia, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 340, -1, 30));

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
        jPanelFondoRefe.add(txtFieldCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 220, 390, 30));

        txtFieldNumControl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFieldNumControlActionPerformed(evt);
            }
        });
        jPanelFondoRefe.add(txtFieldNumControl, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 280, 200, 30));

        passwordField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordFieldActionPerformed(evt);
            }
        });
        jPanelFondoRefe.add(passwordField, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 340, 260, 30));

        btnMostrarContra.setBackground(new java.awt.Color(242, 242, 242));
        btnMostrarContra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/3844476-eye-see-show-view-watch_110339.png"))); // NOI18N
        btnMostrarContra.setContentAreaFilled(false);
        btnMostrarContra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarContraActionPerformed(evt);
            }
        });
        jPanelFondoRefe.add(btnMostrarContra, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 340, 30, 30));

        jpanelFondoRefe.add(jPanelFondoRefe, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 120, 860, 580));

        lblCites.setFont(new java.awt.Font("Eras Bold ITC", 0, 48)); // NOI18N
        lblCites.setText("cITEs");
        jpanelFondoRefe.add(lblCites, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 50, -1, -1));

        getContentPane().add(jpanelFondoRefe, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1030, 770));

        pack();
    }// </editor-fold>//GEN-END:initComponents

   private void BtnAceptarActionPerformed(java.awt.event.ActionEvent evt) {                                           
        // TODO add your handling code here:
        FrMenuAlumnos menuAlumnos = new FrMenuAlumnos();
      // 05-03-2024
        try {
            nombreAlumnos = txtFieldNombre.getText();
            correoAlumnos = txtFieldCorreo.getText();
            numControl = txtFieldNumControl.getText();
           

            if (txtFieldNombre.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Error: Indicar el Nombre del Alumno");
                //para que en el error el focus se ponga aquí
                focus = "nombreAlumnos";
                return; // Se agrega un return para salir del método si hay un error
            }

            if (txtFieldCorreo.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Error: Indicar el Correo Institucional");
                //para que en el error el focus se ponga aquí
                focus = "correoAlumnos";
                return; // Se agrega un return para salir del método si hay un error
            }

            if (txtFieldNumControl.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Error: Indicar el Numero de Control");
                //para que en el error el focus se ponga aquí
                focus = "numControl";
                return; // Se agrega un return para salir del método si hay un error
            }
            String numControl = txtFieldNumControl.getText().trim(); // Obtenemos el texto del campo y eliminamos espacios en blanco al inicio y al final

        // Verificamos si el número de control contiene caracteres que no sean dígitos
        if (!numControl.matches("[0-9]+")) { // Utilizamos una expresión regular para verificar si hay caracteres que no sean dígitos
        throw new IllegalArgumentException("El número de control solo puede contener números."); // Lanzamos una excepción si se encuentran caracteres que no sean dígitos
         }
        char[] passwordChars = passwordField.getPassword(); // Obtener la contraseña como un arreglo de caracteres

        // Convertir el arreglo de caracteres en una cadena de caracteres
        String password = new String(passwordChars);

        // Verificar si el campo de contraseña está vacío
        if (password.isEmpty()) {
            throw new IllegalArgumentException("El campo de contraseña está vacío.");
        }

            //Mostramos la interfaz del menu alumnos
            menuAlumnos.setVisible(true);

            //Para que se cierre la ventana 
            this.dispose();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            switch(focus){
                case "nombreAlumnos": txtFieldNombre.grabFocus(); break;
                case "correoAlumno": txtFieldCorreo.grabFocus(); break;
                case "numControl": txtFieldNumControl.grabFocus(); break;
                default: break;
            }
        }                                                                         
          
    }                                       
  
                               
    private void BtnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnRegresarActionPerformed
        // TODO add your handling code here:
        FrMenuPrincipal inicio = new FrMenuPrincipal();
        
        //Mostramos la interfaz del menu principal
        inicio.setVisible(true);
        
        //Para que se cierre la ventana 
        this.dispose();
    }//GEN-LAST:event_BtnRegresarActionPerformed

    private void txtFieldNumControlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFieldNumControlActionPerformed
       try {
        String numControl = txtFieldNumControl.getText().trim(); // Obtenemos el texto del campo y eliminamos espacios en blanco al inicio y al final

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
    }//GEN-LAST:event_txtFieldNumControlActionPerformed

    private void btnMostrarContraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarContraActionPerformed
        // TODO add your handling code here:
    if(btnMostrarContra.getText().equals("Mostrar")) {
        passwordField.setEchoChar((char)0); // Mostrar la contraseña
        
        btnMostrarContra.setText("Ocultar");
    } 
    else {
        passwordField.setEchoChar('*'); // Ocultar la contraseña
        btnMostrarContra.setText("Mostrar");
    }
        
    }//GEN-LAST:event_btnMostrarContraActionPerformed

    //IGNORAR DE AQUI
    private void txtFieldNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFieldNombreActionPerformed
   
    }//GEN-LAST:event_txtFieldNombreActionPerformed

    private void txtFieldCorreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFieldCorreoActionPerformed

    }//GEN-LAST:event_txtFieldCorreoActionPerformed

    private void passwordFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordFieldActionPerformed

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
            java.util.logging.Logger.getLogger(FrRegistrarAlumnos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrRegistrarAlumnos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrRegistrarAlumnos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrRegistrarAlumnos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrRegistrarAlumnos().setVisible(true);
            }
        });
    }

    // Variables Globales
    String focus="", nombreAlumnos="", correoAlumnos="", numControl="", password="";
    char[] passwordChars;
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnAceptar;
    private javax.swing.JButton BtnRegresar;
    private javax.swing.JButton btnMostrarContra;
    private javax.swing.JPanel jPanelFondoRefe;
    private javax.swing.JPanel jpanelFondoRefe;
    private javax.swing.JLabel lblCites;
    private javax.swing.JLabel lblContrasenia;
    private javax.swing.JLabel lblCorreo;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblNumControl;
    private javax.swing.JLabel lblinstruccion;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JTextField txtFieldCorreo;
    private javax.swing.JTextField txtFieldNombre;
    private javax.swing.JTextField txtFieldNumControl;
    // End of variables declaration//GEN-END:variables
}    
    

