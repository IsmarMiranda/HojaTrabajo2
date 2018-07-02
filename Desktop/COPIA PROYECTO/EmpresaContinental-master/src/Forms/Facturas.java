/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Forms;

import Clases.FichaClinica;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

    /**
 *
 * @author ismar
 */
public class Facturas extends javax.swing.JFrame {
        FichaClinica ficha = new FichaClinica();
        Ventas fac;
    /**
     * Creates new form cosa
     */
    public Facturas() throws SQLException {
        this.fac = new Ventas();
        initComponents();
        buttonGroup1.add(Credito);
        buttonGroup1.add(Contado);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtPaciente = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtNit = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtDireccion = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtTelefono1 = new javax.swing.JTextField();
        Credito = new javax.swing.JRadioButton();
        Contado = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        txtFecha = new javax.swing.JTextField();
        txtFechaInicio = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtFechaFin = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1051, 754));
        setMinimumSize(new java.awt.Dimension(1051, 754));
        setPreferredSize(new java.awt.Dimension(1051, 754));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 204));
        jLabel1.setText("DR. LUIS ALFREDO LORENZO SANCHEZ");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(320, 10, 370, 30);

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 51, 204));
        jLabel3.setText("CIRUJANO DENTISTA");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(390, 40, 210, 24);

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 51, 204));
        jLabel2.setText("CONCEPCION CHIQUIRICHAPA, QUETZALTENANGO");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(270, 70, 480, 24);

        txtPaciente.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        txtPaciente.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPacienteActionPerformed(evt);
            }
        });
        txtPaciente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPacienteKeyTyped(evt);
            }
        });
        getContentPane().add(txtPaciente);
        txtPaciente.setBounds(220, 130, 470, 30);

        jLabel4.setBackground(new java.awt.Color(51, 153, 255));
        jLabel4.setFont(new java.awt.Font("Arial Black", 0, 13)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 255));
        jLabel4.setText("Vendedor");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(880, 20, 80, 20);

        txtNit.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        txtNit.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(txtNit);
        txtNit.setBounds(740, 130, 190, 30);

        jLabel5.setBackground(new java.awt.Color(51, 153, 255));
        jLabel5.setFont(new java.awt.Font("Arial Black", 0, 13)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 255));
        jLabel5.setText("NOMBRE DEL PACIENTE: ");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(30, 130, 180, 20);

        jLabel6.setBackground(new java.awt.Color(51, 153, 255));
        jLabel6.setFont(new java.awt.Font("Arial Black", 0, 13)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 255));
        jLabel6.setText("DIRECCION:");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(30, 180, 130, 20);

        txtDireccion.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        txtDireccion.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(txtDireccion);
        txtDireccion.setBounds(140, 170, 310, 30);

        jLabel7.setBackground(new java.awt.Color(51, 153, 255));
        jLabel7.setFont(new java.awt.Font("Arial Black", 0, 13)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 255));
        jLabel7.setText("TELEFONO:");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(470, 180, 90, 20);

        txtTelefono1.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        txtTelefono1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(txtTelefono1);
        txtTelefono1.setBounds(560, 170, 180, 30);

        Credito.setText("Credito");
        getContentPane().add(Credito);
        Credito.setBounds(750, 170, 80, 30);

        Contado.setText("Contado");
        getContentPane().add(Contado);
        Contado.setBounds(850, 170, 80, 30);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Orden", "Pieza", "Tratamiento", "Valor"
            }
        ));
        jTable1.setRowHeight(35);
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(30, 270, 970, 380);

        jButton1.setText("GUARDAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(140, 650, 240, 40);

        jLabel8.setBackground(new java.awt.Color(51, 153, 255));
        jLabel8.setFont(new java.awt.Font("Arial Black", 0, 13)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 255));
        jLabel8.setText("FECHA:");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(30, 220, 90, 20);

        txtFecha.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        txtFecha.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(txtFecha);
        txtFecha.setBounds(140, 210, 140, 30);

        txtFechaInicio.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        txtFechaInicio.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(txtFechaInicio);
        txtFechaInicio.setBounds(430, 210, 110, 30);

        jLabel9.setBackground(new java.awt.Color(51, 153, 255));
        jLabel9.setFont(new java.awt.Font("Arial Black", 0, 13)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 255));
        jLabel9.setText("FECHA INICIO:");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(310, 220, 120, 20);

        txtFechaFin.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        txtFechaFin.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(txtFechaFin);
        txtFechaFin.setBounds(670, 210, 90, 30);

        jLabel10.setBackground(new java.awt.Color(51, 153, 255));
        jLabel10.setFont(new java.awt.Font("Arial Black", 0, 13)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 255));
        jLabel10.setText("---");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(870, 220, 90, 20);

        jButton2.setText("IMPRIMIR");
        getContentPane().add(jButton2);
        jButton2.setBounds(440, 650, 210, 40);

        jButton3.setText("ENVIIAR");
        getContentPane().add(jButton3);
        jButton3.setBounds(730, 650, 140, 40);

        jLabel11.setBackground(new java.awt.Color(51, 153, 255));
        jLabel11.setFont(new java.awt.Font("Arial Black", 0, 13)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 255));
        jLabel11.setText("FECHA FIN:");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(550, 220, 120, 20);

        jLabel12.setBackground(new java.awt.Color(51, 153, 255));
        jLabel12.setFont(new java.awt.Font("Arial Black", 0, 13)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 255));
        jLabel12.setText("Expediente");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(770, 220, 90, 20);

        jLabel13.setBackground(new java.awt.Color(51, 153, 255));
        jLabel13.setFont(new java.awt.Font("Arial Black", 0, 13)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 255));
        jLabel13.setText("NIT");
        getContentPane().add(jLabel13);
        jLabel13.setBounds(700, 130, 40, 20);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPacienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPacienteActionPerformed

    private void txtPacienteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPacienteKeyTyped

    }//GEN-LAST:event_txtPacienteKeyTyped

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        boolean estado = false;
        if (Credito.isSelected()) {
            estado = true;
        }
        if (Contado.isSelected()) {
            estado = false;
        }
        ficha.insertarFactura(txtPaciente.getText(), txtDireccion.getText(), txtTelefono1.getText(), txtNit.getText(), txtFecha.getText(),
        txtFechaInicio.getText(),txtFechaFin.getText(),estado, jTable1.getValueAt(0, 0).toString(), jTable1.getValueAt(0, 1).toString(),jTable1.getValueAt(0, 2).toString(), Double.parseDouble(jTable1.getValueAt(0, 3).toString()), Integer.parseInt(jLabel10.getText()));
        JOptionPane.showMessageDialog(null,"FACTURA INGRESADA CORRECTAMENTE");
        fac.recuperarFacturas();
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
       
    }//GEN-LAST:event_formWindowClosing

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowClosed

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
            java.util.logging.Logger.getLogger(Facturas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Facturas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Facturas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Facturas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Facturas().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(Facturas.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton Contado;
    private javax.swing.JRadioButton Credito;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    public javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTable jTable1;
    public javax.swing.JTextField txtDireccion;
    public javax.swing.JTextField txtFecha;
    public javax.swing.JTextField txtFechaFin;
    public javax.swing.JTextField txtFechaInicio;
    public javax.swing.JTextField txtNit;
    public javax.swing.JTextField txtPaciente;
    public javax.swing.JTextField txtTelefono1;
    // End of variables declaration//GEN-END:variables
}