/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vista;

import Controlador.FacturaControl;
import Modelo.Factura;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author Gus-Gus
 */
public class VistaFactura extends javax.swing.JFrame {

    /**
     * Creates new form VistaFactura
     */
    public VistaFactura() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtnf = new javax.swing.JTextField();
        txtFe = new javax.swing.JTextField();
        txtTo = new javax.swing.JTextField();
        txtCan = new javax.swing.JTextField();
        txtDur = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblFactura = new javax.swing.JTable();
        jButtonGUARDAR = new javax.swing.JButton();
        jButtonMODIFICAR = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jButtonELIMIAR = new javax.swing.JButton();
        jButtonLISTAR = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Numero Factura:");

        jLabel2.setText("Direccion:");

        jLabel3.setText("Fecha:");

        jLabel4.setText("Total:");

        jLabel5.setText("Cantidad:");

        txtnf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnfActionPerformed(evt);
            }
        });

        txtFe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFeActionPerformed(evt);
            }
        });

        txtTo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtToActionPerformed(evt);
            }
        });

        txtCan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCanActionPerformed(evt);
            }
        });

        txtDur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDurActionPerformed(evt);
            }
        });

        tblFactura.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "N. Factura", "Direccion", "Fecha", "Total", "Cantidad"
            }
        ));
        jScrollPane1.setViewportView(tblFactura);

        jButtonGUARDAR.setText("GUARDAR");
        jButtonGUARDAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGUARDARActionPerformed(evt);
            }
        });

        jButtonMODIFICAR.setText("MODIFICAR");
        jButtonMODIFICAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMODIFICARActionPerformed(evt);
            }
        });

        jLabel6.setText("VISTA FACTURA");

        jButtonELIMIAR.setText("ELIMINAR");
        jButtonELIMIAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonELIMIARActionPerformed(evt);
            }
        });

        jButtonLISTAR.setText("LISTAR");
        jButtonLISTAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLISTARActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtFe, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtnf, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDur, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtTo, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jButtonELIMIAR))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtCan, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(90, 90, 90)
                                        .addComponent(jButtonGUARDAR)))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButtonMODIFICAR)
                                    .addComponent(jButtonLISTAR)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(274, 274, 274)
                        .addComponent(jLabel6)))
                .addContainerGap(55, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtnf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(txtDur, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(txtFe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(43, 43, 43)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtTo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(43, 43, 43)
                        .addComponent(jLabel5))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonELIMIAR)
                            .addComponent(jButtonLISTAR))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonGUARDAR)
                            .addComponent(jButtonMODIFICAR))))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 266, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtnfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnfActionPerformed
        // TODO add your handling code here:
        String arg =this.txtnf.getText();
        Factura factura = this.facturaControl.buscarFactura(arg);
        this.txtDur.setText(factura.getDireccion());
        this.txtFe.setText(String.valueOf(factura.getFecha()));
        this.txtTo.setText(String.valueOf(factura.getTotal()));
        this.txtCan.setText(String.valueOf(factura.getCantidad()));
    }//GEN-LAST:event_txtnfActionPerformed

    private void txtFeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFeActionPerformed

    private void txtToActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtToActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtToActionPerformed

    private void txtCanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCanActionPerformed

    private void txtDurActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDurActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDurActionPerformed

    private void jButtonGUARDARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGUARDARActionPerformed
        // TODO add your handling code here:
        String []args=new String[5];
        args[0]=this.txtnf.getText();
        args[1]=this.txtDur.getText();
        args[2]=this.txtFe.getText();
        args[3]=this.txtTo.getText();
        args[4]=this.txtCan.getText();
        
        facturaControl.crearFactura(args);
        this.actualizarTablaFactura();
    }//GEN-LAST:event_jButtonGUARDARActionPerformed

    private void jButtonMODIFICARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMODIFICARActionPerformed
        // TODO add your handling code here:
        String []args=new String[5];
        args[0]=this.txtnf.getText();
        args[1]=this.txtDur.getText();
        args[2]=this.txtFe.getText();
        args[3]=this.txtTo.getText();
        args[4]=this.txtCan.getText();
        
        this.facturaControl.modificar(args);
    }//GEN-LAST:event_jButtonMODIFICARActionPerformed

    private void jButtonELIMIARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonELIMIARActionPerformed
        // TODO add your handling code here:
        String arg;
        arg = this.txtnf.getText();
        this.facturaControl.eliminar(arg);
    }//GEN-LAST:event_jButtonELIMIARActionPerformed

    private void jButtonLISTARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLISTARActionPerformed
        // TODO add your handling code here:
        this.actualizarTablaFactura();
    }//GEN-LAST:event_jButtonLISTARActionPerformed

    public void actualizarTablaFactura(){
        String[] encabezado = new String [5];
        encabezado[0]="Numero Factura";
        encabezado[1]="Direccion";
        encabezado[2]="Fecha";
        encabezado[3]="Total";
        encabezado[4]="Cantidad";
        
        var datos = new Object[this.facturaControl.listar().size()][5];
        var i = 0;
        for(var factura:this.facturaControl.listar()){
            datos[i][0]=factura.getCodigo();
            datos[i][1]=factura.getDireccion();
            datos[i][2]=factura.getFecha();
            datos[i][3]=factura.getTotal();
            datos[i][4]=factura.getCantidad();
            i++;
        }
        this.modeloTabla=new DefaultTableModel(datos, encabezado);
        this.tblFactura.setModel(modeloTabla);
        
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
            java.util.logging.Logger.getLogger(VistaFactura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaFactura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaFactura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaFactura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new VistaFactura().setVisible(true);
            }
        });
    }
    private FacturaControl facturaControl = new FacturaControl();
    private TableModel modeloTabla;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonELIMIAR;
    private javax.swing.JButton jButtonGUARDAR;
    private javax.swing.JButton jButtonLISTAR;
    private javax.swing.JButton jButtonMODIFICAR;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblFactura;
    private javax.swing.JTextField txtCan;
    private javax.swing.JTextField txtDur;
    private javax.swing.JTextField txtFe;
    private javax.swing.JTextField txtTo;
    private javax.swing.JTextField txtnf;
    // End of variables declaration//GEN-END:variables
}