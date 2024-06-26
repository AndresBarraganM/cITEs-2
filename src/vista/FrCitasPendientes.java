/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vista;

import cites.Coordinador;
import database.SqlCitas;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author PC
 */
public class FrCitasPendientes extends javax.swing.JFrame {
    Coordinador usuario;

    /**
     * Creates new form FrAlumnos
     * @param usuario
     */
    public FrCitasPendientes(Coordinador usuario) {
        this.usuario = usuario;
        initComponents();
        mostrarCitasPendientes(); // Verifica si se llama correctamente a este método
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
        BtnSeleccionar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        BtnBorrar = new javax.swing.JButton();
        BtnAceptar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jpanelFondoRefe.setBackground(new java.awt.Color(15, 35, 50));
        jpanelFondoRefe.setMinimumSize(new java.awt.Dimension(1024, 768));
        jpanelFondoRefe.setPreferredSize(new java.awt.Dimension(1024, 768));
        jpanelFondoRefe.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblCites.setFont(new java.awt.Font("Eras Bold ITC", 0, 48)); // NOI18N
        lblCites.setForeground(new java.awt.Color(255, 255, 255));
        lblCites.setText("cITEs");
        jpanelFondoRefe.add(lblCites, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 10, -1, -1));

        lblBienvenida.setFont(new java.awt.Font("Eras Demi ITC", 0, 24)); // NOI18N
        lblBienvenida.setForeground(new java.awt.Color(255, 255, 255));
        lblBienvenida.setText("Citas pendientes");
        jpanelFondoRefe.add(lblBienvenida, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 100, 210, -1));

        BtnRegresar.setFont(new java.awt.Font("Eras Demi ITC", 0, 14)); // NOI18N
        BtnRegresar.setText("REGRESAR");
        BtnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnRegresarActionPerformed(evt);
            }
        });
        jpanelFondoRefe.add(BtnRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 630, 150, 50));

        BtnSeleccionar.setFont(new java.awt.Font("Eras Demi ITC", 0, 14)); // NOI18N
        BtnSeleccionar.setText("SELECCIONAR");
        BtnSeleccionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSeleccionarActionPerformed(evt);
            }
        });
        jpanelFondoRefe.add(BtnSeleccionar, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 300, 150, 50));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Nombre del alumno", "ID. Cita", "Motivo", "Carrera", "Hora"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jpanelFondoRefe.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 740, 380));

        BtnBorrar.setFont(new java.awt.Font("Eras Demi ITC", 0, 14)); // NOI18N
        BtnBorrar.setText("BORRAR");
        BtnBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnBorrarActionPerformed(evt);
            }
        });
        jpanelFondoRefe.add(BtnBorrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 390, 150, 50));

        BtnAceptar.setFont(new java.awt.Font("Eras Demi ITC", 0, 14)); // NOI18N
        BtnAceptar.setText("ACEPTAR");
        BtnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAceptarActionPerformed(evt);
            }
        });
        jpanelFondoRefe.add(BtnAceptar, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 630, 150, 50));

        getContentPane().add(jpanelFondoRefe, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1030, 770));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mostrarCitasPendientes(){
        System.out.println("Mostrando citas pendientes...");

        // Coloca puntos de interrupción aquí para depurar el código
        if (usuario != null) {
            String idCoordinador = usuario.getId(); // Verifica el ID del coordinador

            char estadoChar = 'p'; // Asegúrate de utilizar el estado correcto

            SqlCitas sqlCitas = new SqlCitas();
            DefaultTableModel tableModel = sqlCitas.consultarCitasPorCoordinador(idCoordinador, estadoChar);

            if (tableModel != null) {
                System.out.println("Se obtuvo un modelo de tabla válido");
                jTable1.setModel(tableModel); // Asigna el modelo a la tabla
            } else {
                System.out.println("No se encontraron citas pendientes");
                JOptionPane.showMessageDialog(null, "No se encontraron citas pendientes para este coordinador", "Sin Citas", JOptionPane.INFORMATION_MESSAGE);
            }
        } else {
            System.out.println("El objeto Coordinador es nulo");
        }
    }
    
    private void BtnRegresarActionPerformed(java.awt.event.ActionEvent evt) {                                            
        // TODO add your handling code here:
        FrMenuCoords menuCoords = new FrMenuCoords(this.usuario);
        
        //Mostramos la interfaz del menu principal
        menuCoords.setVisible(true);
        
        //Para que se cierre la ventana 
        this.dispose();
    }                                           
}
    
    private void BtnBorrarActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
            int[] selectedRows = jTable1.getSelectedRows();
            SqlCitas sqlCitas = new SqlCitas();
            DefaultTableModel model = (DefaultTableModel) jTable1.getModel();

            // Iterar sobre las filas seleccionadas para eliminar de la tabla y de la base de datos
            for (int i = selectedRows.length - 1; i >= 0; i--) {
                int idCita = (int) model.getValueAt(selectedRows[i], 1); // Obtener el ID de la cita desde la segunda columna (ID. Cita)
                model.removeRow(selectedRows[i]); // Eliminar la fila de la tabla visual

                // Llamar al método eliminarCita para eliminar la cita de la base de datos
                sqlCitas.eliminarCita(idCita);
            }
    }                                         
    private void BtnAceptarActionPerformed(java.awt.event.ActionEvent evt) {                                           
        // TODO add your handling code here:
        int[] selectedRows = jTable1.getSelectedRows();
        SqlCitas sqlCitas = new SqlCitas();
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
            for (int i = selectedRows.length - 1; i >= 0; i--) {
                int idCita = (int) model.getValueAt(selectedRows[i], 1); // Obtener el ID de la cita desde la segunda columna (ID. Cita)
                // Llamar al método de la base de datos para cambiar el estado de la cita a "aceptado"
                sqlCitas.cambiarEstadoCita(Integer.toString(idCita), 'c'); // 'c' representa el estado "aceptado"
            }
        JOptionPane.showMessageDialog(null, "Las citas seleccionadas han sido aceptadas", "Citas Aceptadas", JOptionPane.INFORMATION_MESSAGE);
    }                                          

    private void BtnSeleccionarActionPerformed(java.awt.event.ActionEvent evt) {                                               
        // TODO add your handling code here:
        int[] selectedRows = jTable1.getSelectedRows();
        for (int i = 0; i < selectedRows.length; i++) {
            System.out.println("Fila seleccionada: " + selectedRows[i]);
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
            java.util.logging.Logger.getLogger(FrCitasPendientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrCitasPendientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrCitasPendientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrCitasPendientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Coordinador cord = new Coordinador();
                new FrCitasPendientes(cord).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnAceptar;
    private javax.swing.JButton BtnBorrar;
    private javax.swing.JButton BtnRegresar;
    private javax.swing.JButton BtnSeleccionar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JPanel jpanelFondoRefe;
    private javax.swing.JLabel lblBienvenida;
    private javax.swing.JLabel lblCites;
    // End of variables declaration//GEN-END:variables
}
