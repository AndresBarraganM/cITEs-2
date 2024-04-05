/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vista;

import cites.Alumno;

/**
 *
 * @author PC
 */
public class FrCitasRegistradas extends javax.swing.JFrame {
    
    Alumno usuario;

    /**
     * Creates new form FrAlumnos
     */
    public FrCitasRegistradas() {
        this.usuario = usuario;
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
        lblCites = new javax.swing.JLabel();
        lblBienvenida = new javax.swing.JLabel();
        BtnRegresar = new javax.swing.JButton();
        BtnAceptar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jpanelFondoRefe.setBackground(new java.awt.Color(153, 204, 255));
        jpanelFondoRefe.setMinimumSize(new java.awt.Dimension(1024, 768));
        jpanelFondoRefe.setPreferredSize(new java.awt.Dimension(1024, 768));
        jpanelFondoRefe.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblCites.setFont(new java.awt.Font("Eras Bold ITC", 0, 48)); // NOI18N
        lblCites.setText("cITEs");
        jpanelFondoRefe.add(lblCites, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 10, -1, -1));

        lblBienvenida.setFont(new java.awt.Font("Eras Bold ITC", 0, 24)); // NOI18N
        lblBienvenida.setText("Citas registradas");
        jpanelFondoRefe.add(lblBienvenida, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 90, -1, -1));

        BtnRegresar.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        BtnRegresar.setText("REGRESAR");
        BtnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnRegresarActionPerformed(evt);
            }
        });
        jpanelFondoRefe.add(BtnRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 630, 150, 50));

        BtnAceptar.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        BtnAceptar.setText("ACEPTAR");
        BtnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAceptarActionPerformed(evt);
            }
        });
        jpanelFondoRefe.add(BtnAceptar, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 630, 150, 50));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Nombre", "ID", "Coordinacion", "Horario", "Fecha", "Estado", "Motivo"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jpanelFondoRefe.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 130, 860, 470));

        getContentPane().add(jpanelFondoRefe, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1030, 770));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnRegresarActionPerformed(java.awt.event.ActionEvent evt) {                                            
        // TODO add your handling code here:
        FrMenuAlumnos menuAlumno = new FrMenuAlumnos(this.usuario);

        //Mostramos la interfaz del menu principal
        menuAlumno.setVisible(true);

        //Para que se cierre la ventana
        this.dispose();
    }                                           

    private void BtnAceptarActionPerformed(java.awt.event.ActionEvent evt) {                                           
        // TODO add your handling code here:
        FrMenuAlumnos menuAlumno = new FrMenuAlumnos(this.usuario);

        //Mostramos la interfaz del menu principal
        menuAlumno.setVisible(true);

        //Para que se cierre la ventana
        this.dispose();
    }                                         

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
            java.util.logging.Logger.getLogger(FrCitasRegistradas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrCitasRegistradas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrCitasRegistradas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrCitasRegistradas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrCitasRegistradas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnAceptar;
    private javax.swing.JButton BtnRegresar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JPanel jpanelFondoRefe;
    private javax.swing.JLabel lblBienvenida;
    private javax.swing.JLabel lblCites;
    // End of variables declaration//GEN-END:variables
}
