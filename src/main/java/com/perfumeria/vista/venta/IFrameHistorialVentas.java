package com.perfumeria.vista.venta;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JToolBar;

/**
 *
 * @author Jesus Peraza
 */
public class IFrameHistorialVentas extends javax.swing.JInternalFrame {

    /**
     * Creates new form IFrameHistorialVentas
     */
    public IFrameHistorialVentas() {
        initComponents();
    }

    public JToolBar getBarraHerramientas() {
        return barraHerramientas;
    }

    public void setBarraHerramientas(JToolBar barraHerramientas) {
        this.barraHerramientas = barraHerramientas;
    }

    public JButton getBtnGenerarFactura() {
        return btnGenerarFactura;
    }

    public void setBtnGenerarFactura(JButton btnGenerarFactura) {
        this.btnGenerarFactura = btnGenerarFactura;
    }

    public JButton getBtnRecagar() {
        return btnRecagar;
    }

    public void setBtnRecagar(JButton btnRecagar) {
        this.btnRecagar = btnRecagar;
    }

    public JButton getBtnVerDetalle() {
        return btnVerDetalle;
    }

    public void setBtnVerDetalle(JButton btnVerDetalle) {
        this.btnVerDetalle = btnVerDetalle;
    }

    public JTable getTablaHistorial() {
        return tablaHistorial;
    }

    public void setTablaHistorial(JTable tablaHistorial) {
        this.tablaHistorial = tablaHistorial;
    }

    public JScrollPane getTablaHistorialPane() {
        return tablaHistorialPane;
    }

    public void setTablaHistorialPane(JScrollPane tablaHistorialPane) {
        this.tablaHistorialPane = tablaHistorialPane;
    }

    public JLabel getTitulo() {
        return titulo;
    }

    public void setTitulo(JLabel titulo) {
        this.titulo = titulo;
    }
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        titulo = new javax.swing.JLabel();
        tablaHistorialPane = new javax.swing.JScrollPane();
        tablaHistorial = new javax.swing.JTable();
        barraHerramientas = new javax.swing.JToolBar();
        btnRecagar = new javax.swing.JButton();
        btnVerDetalle = new javax.swing.JButton();
        btnGenerarFactura = new javax.swing.JButton();

        titulo.setFont(new java.awt.Font("JetBrains Mono", 1, 18)); // NOI18N
        titulo.setText("Historial de ventas");

        tablaHistorial.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "id", "fecha", "monto", "productos"
            }
        ));
        tablaHistorialPane.setViewportView(tablaHistorial);

        barraHerramientas.setOrientation(javax.swing.SwingConstants.VERTICAL);
        barraHerramientas.setRollover(true);

        btnRecagar.setText("Recargar");
        btnRecagar.setFocusable(false);
        btnRecagar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnRecagar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        barraHerramientas.add(btnRecagar);

        btnVerDetalle.setText("Ver Detalle");
        btnVerDetalle.setFocusable(false);
        btnVerDetalle.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnVerDetalle.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        barraHerramientas.add(btnVerDetalle);

        btnGenerarFactura.setText("Generar Factura");
        btnGenerarFactura.setFocusable(false);
        btnGenerarFactura.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnGenerarFactura.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnGenerarFactura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerarFacturaActionPerformed(evt);
            }
        });
        barraHerramientas.add(btnGenerarFactura);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(titulo)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(tablaHistorialPane, javax.swing.GroupLayout.DEFAULT_SIZE, 587, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(barraHerramientas, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(barraHerramientas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tablaHistorialPane, javax.swing.GroupLayout.DEFAULT_SIZE, 452, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGenerarFacturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerarFacturaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnGenerarFacturaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToolBar barraHerramientas;
    private javax.swing.JButton btnGenerarFactura;
    private javax.swing.JButton btnRecagar;
    private javax.swing.JButton btnVerDetalle;
    private javax.swing.JTable tablaHistorial;
    private javax.swing.JScrollPane tablaHistorialPane;
    private javax.swing.JLabel titulo;
    // End of variables declaration//GEN-END:variables
}
