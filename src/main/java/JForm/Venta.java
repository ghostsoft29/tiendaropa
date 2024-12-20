/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package JForm;

import Class.*;
import java.util.HashSet;
import javax.swing.JOptionPane;

/**
 *
 * @author INFORMATICA
 */
public class Venta extends javax.swing.JFrame {

    /**
     * Creates new form ssss
     */
    ComidaLog cll = new ComidaLog();
    CompraLog cpl = new CompraLog();
    ClienteLog cl = new ClienteLog();

    ProductoLog pl = new ProductoLog();
    VentaLog vl = new VentaLog();
    int c = 0;
    String usu;

    public Venta() {

        initComponents();
        this.setTitle("Clientes");
        cll.listar(txtArea);
        lblUsuario.setText(cl.getUser1());
        //usu=cl.getUser1();
        this.setLocationRelativeTo(null);
        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        lblUsuario = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        btnComprar = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtCarrito = new javax.swing.JTextArea();
        btnPagar = new javax.swing.JButton();
        btnCerrar1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtArea = new javax.swing.JTextArea();
        btnQuitar = new javax.swing.JButton();

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("Usuario:");

        lblUsuario.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblUsuario.setText("1234");

        jLabel1.setText("Bienvenido escoja su pedidos a llevar:");

        jLabel2.setText("Codigo Producto");

        btnComprar.setText("Agregar");
        btnComprar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComprarActionPerformed(evt);
            }
        });

        txtCarrito.setColumns(20);
        txtCarrito.setRows(5);
        jScrollPane3.setViewportView(txtCarrito);

        btnPagar.setText("PAGAR");
        btnPagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPagarActionPerformed(evt);
            }
        });

        btnCerrar1.setBackground(new java.awt.Color(255, 51, 51));
        btnCerrar1.setText("X");
        btnCerrar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrar1ActionPerformed(evt);
            }
        });

        txtArea.setColumns(20);
        txtArea.setRows(5);
        jScrollPane2.setViewportView(txtArea);

        btnQuitar.setText("Quitar");
        btnQuitar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuitarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnPagar))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(430, 430, 430)
                                .addComponent(btnCerrar1))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(lblUsuario))
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 401, Short.MAX_VALUE)
                                    .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel2)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(jLabel1))
                                        .addGap(43, 43, 43)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(btnComprar)
                                            .addComponent(btnQuitar))))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(btnCerrar1)
                .addGap(9, 9, 9)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(lblUsuario))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(btnComprar)
                        .addGap(11, 11, 11)
                        .addComponent(btnQuitar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnPagar))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnComprarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnComprarActionPerformed

        //ct = Integer.parseInt(txtCantidad.getText());
        cll.setPlato(String.valueOf(txtCodigo.getText()));
        cll.comparadorComidaP();

        if (cll.isA() == true) {

            cll.setCodComida(String.valueOf(txtCodigo.getText()));

            cll.AgregarComidaC();
            c = c + 1;
            txtCodigo.setText(null);

            txtCodigo.requestFocus();
            cll.listar2(txtCarrito);
        } else {
            JOptionPane.showMessageDialog(null, "No existe codigo de Comida");
            txtCodigo.setText(null);

            txtCodigo.requestFocus();
        }

    }//GEN-LAST:event_btnComprarActionPerformed

    private void btnPagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPagarActionPerformed
        cll.ValidadorC();
        if (cll.isB() == true) {
            cpl.setCantidad(c);
            cpl.setCodcliente(cl.getUu());
            cll.Pago();
            cpl.PagarComida();
            cpl.setCodcli(cl.getUser1());
            cpl.sumac();
            cpl.setCantidadcli(cpl.getCantidadcli() + 1);
            cpl.sumad();
            Pagar ms = new Pagar();
            ms.show();
            hide();
        } else {
            JOptionPane.showMessageDialog(null, "No hay pedidos en el carrito");
            txtCodigo.setText(null);
            txtCodigo.requestFocus();
        }
    }//GEN-LAST:event_btnPagarActionPerformed

    private void btnCerrar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrar1ActionPerformed
        MasterC ms = new MasterC();
        ms.show();
        hide();
    }//GEN-LAST:event_btnCerrar1ActionPerformed

    private void btnQuitarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuitarActionPerformed
        cll.setPlato(String.valueOf(txtCodigo.getText()));
        cll.comparadorComidaC();
        if (cll.isA() == true) {
            cll.setCodComida(String.valueOf(txtCodigo.getText()));
            cll.EliminarComidaC();
            c = c - 1;
            txtCodigo.setText(null);
            txtCodigo.requestFocus();
            cll.listar2(txtCarrito);
        } else {
            JOptionPane.showMessageDialog(null, "No existe codigo de Comida");
            txtCodigo.setText(null);

            txtCodigo.requestFocus();
        }
    }//GEN-LAST:event_btnQuitarActionPerformed

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
            java.util.logging.Logger.getLogger(Venta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Venta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Venta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Venta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Venta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCerrar1;
    private javax.swing.JButton btnComprar;
    private javax.swing.JButton btnPagar;
    private javax.swing.JButton btnQuitar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JTextArea txtArea;
    private javax.swing.JTextArea txtCarrito;
    private javax.swing.JTextField txtCodigo;
    // End of variables declaration//GEN-END:variables
}
