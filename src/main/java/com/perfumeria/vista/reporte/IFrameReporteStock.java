package com.perfumeria.vista.reporte;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

/**
 *
 * @author Jesus David Peraza
 */
public class IFrameReporteStock extends javax.swing.JInternalFrame {

    public IFrameReporteStock() {
        initComponents();
    }

    public JButton getBtnActualizarStock() {
        return btnActualizarStock;
    }

    public void setBtnActualizarStock(JButton btnActualizarStock) {
        this.btnActualizarStock = btnActualizarStock;
    }

    public JButton getBtnGenerarPDF() {
        return btnGenerarPDF;
    }

    public void setBtnGenerarPDF(JButton btnGenerarPDF) {
        this.btnGenerarPDF = btnGenerarPDF;
    }

    public JButton getBtnRecargar() {
        return btnRecargar;
    }

    public void setBtnRecargar(JButton btnRecargar) {
        this.btnRecargar = btnRecargar;
    }

    public JLabel getReporteStockLabel() {
        return reporteStockLabel;
    }

    public void setReporteStockLabel(JLabel reporteStockLabel) {
        this.reporteStockLabel = reporteStockLabel;
    }

    public JScrollPane getReporteStockScrolePane() {
        return reporteStockScrolePane;
    }

    public void setReporteStockScrolePane(JScrollPane reporteStockScrolePane) {
        this.reporteStockScrolePane = reporteStockScrolePane;
    }

    public JTable getReporteStockTable() {
        return reporteStockTable;
    }

    public void setReporteStockTable(JTable reporteStockTable) {
        this.reporteStockTable = reporteStockTable;
    }

    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        reporteStockLabel = new javax.swing.JLabel();
        reporteStockScrolePane = new javax.swing.JScrollPane();
        reporteStockTable = new javax.swing.JTable();
        btnGenerarPDF = new javax.swing.JButton();
        btnActualizarStock = new javax.swing.JButton();
        btnRecargar = new javax.swing.JButton();

        reporteStockLabel.setFont(new java.awt.Font("JetBrains Mono", 2, 24)); // NOI18N
        reporteStockLabel.setText("Reporte Stock");

        reporteStockTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Id", "Tipo", "Nombre", "Cantidad por lote", "Cantidad Stock"
            }
        ));
        reporteStockScrolePane.setViewportView(reporteStockTable);

        btnGenerarPDF.setText("Generar Pdf");

        btnActualizarStock.setText("Actualizar stock");

        btnRecargar.setText("Recargar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(reporteStockLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnRecargar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnActualizarStock)
                        .addGap(18, 18, 18)
                        .addComponent(btnGenerarPDF))
                    .addComponent(reporteStockScrolePane, javax.swing.GroupLayout.DEFAULT_SIZE, 770, Short.MAX_VALUE))
                .addGap(59, 59, 59))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(reporteStockLabel)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnGenerarPDF)
                        .addComponent(btnActualizarStock)
                        .addComponent(btnRecargar)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(reporteStockScrolePane)
                .addGap(17, 17, 17))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizarStock;
    private javax.swing.JButton btnGenerarPDF;
    private javax.swing.JButton btnRecargar;
    private javax.swing.JLabel reporteStockLabel;
    private javax.swing.JScrollPane reporteStockScrolePane;
    private javax.swing.JTable reporteStockTable;
    // End of variables declaration//GEN-END:variables
}
