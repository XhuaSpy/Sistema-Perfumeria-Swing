/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package com.perfumeria.vista.producto;

import com.perfumeria.modelo.producto.CategoriaProducto;
import com.perfumeria.modelo.producto.TipoProducto;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

/**
 *
 * @author Jesus Peraza Royero
 */
public class IFrameCargarProducto extends javax.swing.JInternalFrame {

    /**
     * Creates new form JFrameCrearModificarProducto
     */
    public IFrameCargarProducto() {
        initComponents();
        categoria.setModel(new javax.swing.DefaultComboBoxModel<>(CategoriaProducto.nombres()));
        tipoProducto.setModel(new javax.swing.DefaultComboBoxModel<>(TipoProducto.nombres()));
    }

    public JTextField getUnidadesPorLote() {
        return unidadesPorLote;
    }

    public void setUnidadesPorLote(JTextField unidadesPorLote) {
        this.unidadesPorLote = unidadesPorLote;
    }

    public JLabel getUnidadesPorLoteLabel() {
        return unidadesPorLoteLabel;
    }

    public void setUnidadesPorLoteLabel(JLabel unidadesPorLoteLabel) {
        this.unidadesPorLoteLabel = unidadesPorLoteLabel;
    }

    public JPanel getAromaPane() {
        return aromaPane;
    }

    public void setAromaPane(JPanel aromaPane) {
        this.aromaPane = aromaPane;
    }

    public JButton getBtnCargar() {
        return btnCargar;
    }

    public void setBtnCargar(JButton btnCargar) {
        this.btnCargar = btnCargar;
    }

    public JTextField getCapacidadEnvase() {
        return capacidadEnvase;
    }

    public void setCapacidadEnvase(JTextField capacidadEnvase) {
        this.capacidadEnvase = capacidadEnvase;
    }

    public JLabel getCapacidadEnvaseLabel() {
        return capacidadEnvaseLabel;
    }

    public void setCapacidadEnvaseLabel(JLabel capacidadEnvaseLabel) {
        this.capacidadEnvaseLabel = capacidadEnvaseLabel;
    }

    public JComboBox<String> getCategoria() {
        return categoria;
    }

    public void setCategoria(JComboBox<String> categoria) {
        this.categoria = categoria;
    }

    public JLabel getCategoriaLabel() {
        return categoriaLabel;
    }

    public void setCategoriaLabel(JLabel categoriaLabel) {
        this.categoriaLabel = categoriaLabel;
    }

    public JTextField getCodigo() {
        return codigo;
    }

    public void setCodigo(JTextField codigo) {
        this.codigo = codigo;
    }

    public JLabel getCodigoLabel() {
        return codigoLabel;
    }

    public void setCodigoLabel(JLabel codigoLabel) {
        this.codigoLabel = codigoLabel;
    }

    public JTextField getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(JTextField descripcion) {
        this.descripcion = descripcion;
    }

    public JLabel getDescripcionLabel() {
        return descripcionLabel;
    }

    public void setDescripcionLabel(JLabel descripcionLabel) {
        this.descripcionLabel = descripcionLabel;
    }

    public JPanel getEnvasePane() {
        return envasePane;
    }

    public void setEnvasePane(JPanel envasePane) {
        this.envasePane = envasePane;
    }

    public JPanel getjPanel1() {
        return jPanel1;
    }

    public void setjPanel1(JPanel jPanel1) {
        this.jPanel1 = jPanel1;
    }

    public JScrollPane getjScrollPane1() {
        return jScrollPane1;
    }

    public void setjScrollPane1(JScrollPane jScrollPane1) {
        this.jScrollPane1 = jScrollPane1;
    }

    public JTextField getMililitros() {
        return mililitros;
    }

    public void setMililitros(JTextField mililitros) {
        this.mililitros = mililitros;
    }

    public JLabel getMililitrosLabel() {
        return mililitrosLabel;
    }

    public void setMililitrosLabel(JLabel mililitrosLabel) {
        this.mililitrosLabel = mililitrosLabel;
    }

    public JTextField getNombre() {
        return nombre;
    }

    public void setNombre(JTextField nombre) {
        this.nombre = nombre;
    }

    public JLabel getNombreLabel() {
        return nombreLabel;
    }

    public void setNombreLabel(JLabel nombreLabel) {
        this.nombreLabel = nombreLabel;
    }

    public JTextField getPrecio() {
        return precio;
    }

    public void setPrecio(JTextField precio) {
        this.precio = precio;
    }

    public JLabel getPrecioLabel() {
        return precioLabel;
    }

    public void setPrecioLabel(JLabel precioLabel) {
        this.precioLabel = precioLabel;
    }

    public JLabel getTipoLabel() {
        return tipoLabel;
    }

    public void setTipoLabel(JLabel tipoLabel) {
        this.tipoLabel = tipoLabel;
    }

    public JComboBox<String> getTipoProducto() {
        return tipoProducto;
    }

    public void setTipoProducto(JComboBox<String> tipoProducto) {
        this.tipoProducto = tipoProducto;
    }

    public JLabel getTituloLabel() {
        return tituloLabel;
    }

    public void setTituloLabel(JLabel tituloLabel) {
        this.tituloLabel = tituloLabel;
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
        jPanel1 = new javax.swing.JPanel();
        categoriaLabel = new javax.swing.JLabel();
        categoria = new javax.swing.JComboBox<>();
        nombreLabel = new javax.swing.JLabel();
        nombre = new javax.swing.JTextField();
        descripcionLabel = new javax.swing.JLabel();
        descripcion = new javax.swing.JTextField();
        precioLabel = new javax.swing.JLabel();
        precio = new javax.swing.JTextField();
        tipoLabel = new javax.swing.JLabel();
        aromaPane = new javax.swing.JPanel();
        mililitrosLabel = new javax.swing.JLabel();
        mililitros = new javax.swing.JTextField();
        envasePane = new javax.swing.JPanel();
        capacidadEnvaseLabel = new javax.swing.JLabel();
        capacidadEnvase = new javax.swing.JTextField();
        unidadesPorLoteLabel = new javax.swing.JLabel();
        unidadesPorLote = new javax.swing.JTextField();
        tipoProducto = new javax.swing.JComboBox<>();
        btnCargar = new javax.swing.JButton();
        codigoLabel = new javax.swing.JLabel();
        codigo = new javax.swing.JTextField();
        tituloLabel = new javax.swing.JLabel();

        categoriaLabel.setText("Categoria");

        categoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A", "AA", "AAA", "Generico" }));
        categoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                categoriaActionPerformed(evt);
            }
        });

        nombreLabel.setText("Nombre");

        nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreActionPerformed(evt);
            }
        });

        descripcionLabel.setText("Descripcion");

        precioLabel.setText("Precio");

        precio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                precioActionPerformed(evt);
            }
        });

        tipoLabel.setText("Tipo");

        mililitrosLabel.setText("Unidades por lote(ml)");

        javax.swing.GroupLayout aromaPaneLayout = new javax.swing.GroupLayout(aromaPane);
        aromaPane.setLayout(aromaPaneLayout);
        aromaPaneLayout.setHorizontalGroup(
            aromaPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(aromaPaneLayout.createSequentialGroup()
                .addComponent(mililitrosLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 79, Short.MAX_VALUE)
                .addComponent(mililitros, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        aromaPaneLayout.setVerticalGroup(
            aromaPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(aromaPaneLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(aromaPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mililitrosLabel)
                    .addComponent(mililitros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        capacidadEnvaseLabel.setText("Capacidad de Envases(ml)");

        unidadesPorLoteLabel.setText("Unidades por lotes");

        javax.swing.GroupLayout envasePaneLayout = new javax.swing.GroupLayout(envasePane);
        envasePane.setLayout(envasePaneLayout);
        envasePaneLayout.setHorizontalGroup(
            envasePaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(envasePaneLayout.createSequentialGroup()
                .addComponent(capacidadEnvaseLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 90, Short.MAX_VALUE)
                .addComponent(capacidadEnvase, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(envasePaneLayout.createSequentialGroup()
                .addComponent(unidadesPorLoteLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(unidadesPorLote, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        envasePaneLayout.setVerticalGroup(
            envasePaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(envasePaneLayout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(envasePaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(capacidadEnvaseLabel)
                    .addComponent(capacidadEnvase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(envasePaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(unidadesPorLote, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(unidadesPorLoteLabel))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tipoProducto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Aroma", "Envase" }));

        btnCargar.setFont(new java.awt.Font("JetBrains Mono", 1, 12)); // NOI18N
        btnCargar.setText("Cargar");
        btnCargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCargarActionPerformed(evt);
            }
        });

        codigoLabel.setText("codigo de producto");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(aromaPane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(envasePane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(categoriaLabel)
                            .addComponent(nombreLabel)
                            .addComponent(descripcionLabel)
                            .addComponent(precioLabel)
                            .addComponent(codigoLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(codigo, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(categoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
                                        .addComponent(tipoLabel))
                                    .addComponent(descripcion)
                                    .addComponent(nombre)
                                    .addComponent(precio))
                                .addGap(51, 51, 51)
                                .addComponent(tipoProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(45, 45, 45)
                .addComponent(btnCargar)
                .addContainerGap(236, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(categoriaLabel)
                    .addComponent(categoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tipoLabel)
                    .addComponent(tipoProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCargar))
                .addGap(43, 43, 43)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nombreLabel)
                    .addComponent(nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(descripcionLabel)
                    .addComponent(descripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(53, 53, 53)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(precioLabel)
                    .addComponent(precio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(codigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(codigoLabel))
                .addGap(32, 32, 32)
                .addComponent(aromaPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(envasePane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(130, Short.MAX_VALUE))
        );

        jScrollPane1.setViewportView(jPanel1);

        tituloLabel.setFont(new java.awt.Font("JetBrains Mono", 2, 24)); // NOI18N
        tituloLabel.setText("Cargar Producto");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(tituloLabel)
                .addContainerGap(438, Short.MAX_VALUE))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(tituloLabel)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 574, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombreActionPerformed

    private void precioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_precioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_precioActionPerformed

    private void btnCargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCargarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCargarActionPerformed

    private void categoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_categoriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_categoriaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel aromaPane;
    private javax.swing.JButton btnCargar;
    private javax.swing.JTextField capacidadEnvase;
    private javax.swing.JLabel capacidadEnvaseLabel;
    private javax.swing.JComboBox<String> categoria;
    private javax.swing.JLabel categoriaLabel;
    private javax.swing.JTextField codigo;
    private javax.swing.JLabel codigoLabel;
    private javax.swing.JTextField descripcion;
    private javax.swing.JLabel descripcionLabel;
    private javax.swing.JPanel envasePane;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField mililitros;
    private javax.swing.JLabel mililitrosLabel;
    private javax.swing.JTextField nombre;
    private javax.swing.JLabel nombreLabel;
    private javax.swing.JTextField precio;
    private javax.swing.JLabel precioLabel;
    private javax.swing.JLabel tipoLabel;
    private javax.swing.JComboBox<String> tipoProducto;
    private javax.swing.JLabel tituloLabel;
    private javax.swing.JTextField unidadesPorLote;
    private javax.swing.JLabel unidadesPorLoteLabel;
    // End of variables declaration//GEN-END:variables
}
