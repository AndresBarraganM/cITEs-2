/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vista;

/**
 *
 * @author PC
 */
public class FrAlumnos extends javax.swing.JFrame {

    /**
     * Creates new form FrAlumnos
     */
    public FrAlumnos() {
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
        txtFieldCorreo = new javax.swing.JTextField();
        lblCorreo = new javax.swing.JLabel();
        passwordField = new javax.swing.JPasswordField();
        btnMostrarContra = new javax.swing.JButton();
        BtnAceptar = new javax.swing.JButton();
        BtnRegresar = new javax.swing.JButton();
        lblRegistro = new javax.swing.JLabel();
        btnRegistrarme = new javax.swing.JButton();
        lblBienvenida = new javax.swing.JLabel();
        lblCites = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1024, 768));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jpanelFondoRefe.setBackground(new java.awt.Color(153, 204, 255));
        jpanelFondoRefe.setMinimumSize(new java.awt.Dimension(1024, 768));
        jpanelFondoRefe.setPreferredSize(new java.awt.Dimension(1024, 768));
        jpanelFondoRefe.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanelFondoRefe.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblContrasenia.setFont(new java.awt.Font("Eras Bold ITC", 0, 24)); // NOI18N
        lblContrasenia.setText("Contraseña:");
        jPanelFondoRefe.add(lblContrasenia, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 260, -1, -1));
        jPanelFondoRefe.add(txtFieldCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 190, 440, 30));

        lblCorreo.setFont(new java.awt.Font("Eras Bold ITC", 0, 24)); // NOI18N
        lblCorreo.setText("Correo Institucional:");
        jPanelFondoRefe.add(lblCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 190, -1, 30));
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

        lblRegistro.setText("¿No estas registrado? Registrate Aqui -------->");
        jPanelFondoRefe.add(lblRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 506, -1, 30));

        btnRegistrarme.setText("Registrarme");
        btnRegistrarme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarmeActionPerformed(evt);
            }
        });
        jPanelFondoRefe.add(btnRegistrarme, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 510, -1, -1));

        lblBienvenida.setFont(new java.awt.Font("Eras Bold ITC", 0, 24)); // NOI18N
        lblBienvenida.setText("¡BIENVENIDO ALBATRO!");
        jPanelFondoRefe.add(lblBienvenida, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 80, -1, -1));

        jpanelFondoRefe.add(jPanelFondoRefe, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 120, 860, 560));

        lblCites.setFont(new java.awt.Font("Eras Bold ITC", 0, 48)); // NOI18N
        lblCites.setText("cITEs");
        jpanelFondoRefe.add(lblCites, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 50, -1, -1));

        getContentPane().add(jpanelFondoRefe, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1030, 770));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAceptarActionPerformed
        // TODO add your handling code here:
        FrMenuAlumnos menuAlumnos = new FrMenuAlumnos();
        
        //Mostramos la interfaz del menu principal
        menuAlumnos.setVisible(true);
        
        //Para que se cierre la ventana 
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
        FrRegistrarAlumnos registroAlumnos = new FrRegistrarAlumnos();
        
        //Mostramos la interfaz del menu principal
        registroAlumnos.setVisible(true);
        
        //Para que se cierre la ventana 
        this.dispose();
       
    }//GEN-LAST:event_btnRegistrarmeActionPerformed

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
            java.util.logging.Logger.getLogger(FrAlumnos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrAlumnos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrAlumnos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrAlumnos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrAlumnos().setVisible(true);
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
    private javax.swing.JLabel lblCorreo;
    private javax.swing.JLabel lblRegistro;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JTextField txtFieldCorreo;
    // End of variables declaration//GEN-END:variables
}
