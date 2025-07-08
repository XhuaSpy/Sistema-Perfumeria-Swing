package com.perfumeria.vista.producto;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

/**
 *
 * @author Jesus Peraza Royero
 */
public class IFrameListaProducto extends javax.swing.JInternalFrame {
    
    public IFrameListaProducto() {
        initComponents();
    }

    public JButton getBtnAgregarProducto() {
        return btnAgregarProducto;
    }

    public void setBtnAgregarProducto(JButton btnAgregarProducto) {
        this.btnAgregarProducto = btnAgregarProducto;
    }

    public JButton getBtnRecargar() {
        return btnRecargar;
    }

    public void setBtnRecargar(JButton btnRecargar) {
        this.btnRecargar = btnRecargar;
    }

    public JScrollPane getjScrollPane1() {
        return jScrollPane1;
    }

    public void setjScrollPane1(JScrollPane jScrollPane1) {
        this.jScrollPane1 = jScrollPane1;
    }

    public JTable getProductosTabla() {
        return productosTabla;
    }

    public void setProductosTabla(JTable productosTabla) {
        this.productosTabla = productosTabla;
    }

    public JLabel getTituloLabel() {
        return tituloLabel;
    }

    public void setTituloLabel(JLabel tituloLabel) {
        this.tituloLabel = tituloLabel;
    }

    
        
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        productosTabla = new javax.swing.JTable();
        tituloLabel = new javax.swing.JLabel();
        btnRecargar = new javax.swing.JButton();
        btnAgregarProducto = new javax.swing.JButton();

        setClosable(true);

        productosTabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id ", "Codigo", "Nombre", "Tipo", "Categoria", "Precio", "Stock"
            }
        ));
        jScrollPane1.setViewportView(productosTabla);

        tituloLabel.setFont(new java.awt.Font("JetBrains Mono", 2, 24)); // NOI18N
        tituloLabel.setText("Tabla de Productos");

        btnRecargar.setText("Recargar");
        btnRecargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRecargarActionPerformed(evt);
            }
        });

        btnAgregarProducto.setText("Agregar producto");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnRecargar)
                        .addGap(18, 18, 18)
                        .addComponent(btnAgregarProducto))
                    .addComponent(tituloLabel)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 858, Short.MAX_VALUE))
                .addGap(36, 36, 36))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(tituloLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 462, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRecargar)
                    .addComponent(btnAgregarProducto))
                .addContainerGap(9, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRecargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRecargarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRecargarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarProducto;
    private javax.swing.JButton btnRecargar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable productosTabla;
    private javax.swing.JLabel tituloLabel;
    // End of variables declaration//GEN-END:variables
}
