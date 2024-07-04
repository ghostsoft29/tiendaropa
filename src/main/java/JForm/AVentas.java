/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package JForm;

import Class.VentaLog;
import javax.swing.JOptionPane;

/**
 *
 * @author GHOSTSOFT
 */
public class AVentas extends javax.swing.JInternalFrame {
    VentaLog vl=new VentaLog();
    /**
     * Creates new form AVentas
     */
    public AVentas() {
        initComponents();
        vl.listar1(txtArea);
        txtArea.disable();
        txtCodigoV.disable();
        vl.ini();
        txtCodigoV.setText(String.valueOf(vl.getCodv1()));
        txtCodVf.setText(String.valueOf(vl.getCodvf1()));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        txtArea = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        txtCodigoV = new javax.swing.JTextField();
        btnAtender = new javax.swing.JButton();
        btnCerrar1 = new javax.swing.JButton();
        btnListar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        txtCodVf = new javax.swing.JTextField();

        txtArea.setColumns(20);
        txtArea.setRows(5);
        txtArea.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jScrollPane1.setViewportView(txtArea);

        jLabel1.setText("CODIGO VENTA");

        txtCodigoV.setDisabledTextColor(new java.awt.Color(0, 0, 0));

        btnAtender.setText("ATENDER COLA");
        btnAtender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtenderActionPerformed(evt);
            }
        });

        btnCerrar1.setBackground(new java.awt.Color(255, 51, 51));
        btnCerrar1.setText("X");
        btnCerrar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrar1ActionPerformed(evt);
            }
        });

        btnListar.setText("LISTAR");
        btnListar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListarActionPerformed(evt);
            }
        });

        jButton1.setText("PRECIO");

        jButton2.setText("ATENDER PILA");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnListar)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 376, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtCodigoV)
                            .addComponent(txtCodVf))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton2)
                            .addComponent(btnAtender))
                        .addGap(110, 110, 110)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 96, Short.MAX_VALUE)
                        .addComponent(btnCerrar1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jButton1)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnCerrar1)
                        .addGap(19, 19, 19)
                        .addComponent(jButton1)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCodigoV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnAtender))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton2)
                            .addComponent(txtCodVf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(jLabel1)))
                .addGap(21, 21, 21)
                .addComponent(btnListar)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAtenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtenderActionPerformed
        
        vl.setCodv(Integer.parseInt(txtCodigoV.getText()));
        vl.setEstado("Atendido");
        vl.CambiarDetalle();
        vl.dequeue(txtArea);
        JOptionPane.showMessageDialog(null, "Venta Atendida");
        vl.listar1(txtArea);
        txtCodigoV.setText(String.valueOf(vl.getCodv1()));
    }//GEN-LAST:event_btnAtenderActionPerformed

    private void btnCerrar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrar1ActionPerformed
        hide();
    }//GEN-LAST:event_btnCerrar1ActionPerformed

    private void btnListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListarActionPerformed
        vl.listar1(txtArea);
    }//GEN-LAST:event_btnListarActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        vl.setCodv(Integer.parseInt(txtCodVf.getText()));
        vl.setEstado("Atendido");
        vl.CambiarDetalle();
        vl.pop(txtArea);
        JOptionPane.showMessageDialog(null, "Venta Atendida");
        vl.listar1(txtArea);
        txtCodVf.setText(String.valueOf(vl.getCodvf1()));
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtender;
    private javax.swing.JButton btnCerrar1;
    private javax.swing.JButton btnListar;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txtArea;
    private javax.swing.JTextField txtCodVf;
    private javax.swing.JTextField txtCodigoV;
    // End of variables declaration//GEN-END:variables
}
