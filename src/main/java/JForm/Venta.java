/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package JForm;


import Class.*;

/**
 *
 * @author GHOSTSOFT
 */
public class Venta extends javax.swing.JFrame {
    ProductoLog pl=new ProductoLog(); 
    VentaLog vl=new VentaLog();
    ClienteLog cl=new ClienteLog();
    
    public Venta() {
       
            initComponents();
            pl.listar(txtArea);
            lblUsuario.setText(cl.getUser1());
            
            
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        txtArea = new javax.swing.JTextArea();
        btnComprar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtCantidad = new javax.swing.JTextField();
        txtCodigo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnListar = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtVenta = new javax.swing.JTextArea();
        btnCerrar1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        lblUsuario = new javax.swing.JLabel();

        txtArea.setColumns(20);
        txtArea.setRows(5);
        jScrollPane2.setViewportView(txtArea);

        btnComprar.setText("Comprar");
        btnComprar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComprarActionPerformed(evt);
            }
        });

        jLabel1.setText("Comprar por Codigo del Producto");

        jLabel2.setText("Codigo Producto");

        jLabel3.setText("Cantidad");

        btnListar.setText("LISTAR");
        btnListar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListarActionPerformed(evt);
            }
        });

        txtVenta.setColumns(20);
        txtVenta.setRows(5);
        jScrollPane3.setViewportView(txtVenta);

        btnCerrar1.setBackground(new java.awt.Color(255, 51, 51));
        btnCerrar1.setText("X");
        btnCerrar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrar1ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("Usuario:");

        lblUsuario.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblUsuario.setText("1234");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtCodigo, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCantidad, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(24, 24, 24)
                .addComponent(btnComprar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 88, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 491, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56)
                .addComponent(btnListar)
                .addGap(83, 83, 83))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblUsuario))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 1056, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(58, 58, 58))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(btnCerrar1)
                            .addGap(19, 19, 19)))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(btnCerrar1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 373, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(lblUsuario))
                        .addGap(36, 36, 36)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnComprar)
                            .addComponent(jLabel3)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnListar))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnComprarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnComprarActionPerformed
        vl.setCodc(cl.getUu());
        vl.setCodproducto(String.valueOf(txtCodigo.getText()));
        vl.setCantidad(Integer.parseInt(txtCantidad.getText()));
        pl.setCodproducto(String.valueOf(txtCodigo.getText()));
        pl.setCantidad(Integer.parseInt(txtCantidad.getText()));
        vl.setEstado("En Proceso");
        vl.AgregarVenta();
        pl.CambiarCant();
        
        pl.listar(txtArea);
        vl.listar(txtVenta);
        
    }//GEN-LAST:event_btnComprarActionPerformed

    private void btnListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListarActionPerformed
        pl.listar(txtArea);
        vl.listar(txtVenta);
    }//GEN-LAST:event_btnListarActionPerformed

    private void btnCerrar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrar1ActionPerformed
        MasterC ms=new MasterC();
        ms.show();
        hide();
    }//GEN-LAST:event_btnCerrar1ActionPerformed

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
    private javax.swing.JButton btnListar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JTextArea txtArea;
    private javax.swing.JTextField txtCantidad;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextArea txtVenta;
    // End of variables declaration//GEN-END:variables
}
