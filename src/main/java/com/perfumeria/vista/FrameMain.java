package com.perfumeria.vista;

import javax.swing.JButton;
import javax.swing.JDesktopPane;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;
import javax.swing.JToolBar;

/**
 *
 * @author Jesus Peraza Royero
 */
public class FrameMain extends javax.swing.JFrame {

    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(FrameMain.class.getName());

    public FrameMain() {
        initComponents();
    }

    public JLabel getInformesLabel() {
        return InformesLabel;
    }

    public void setInformesLabel(JLabel InformesLabel) {
        this.InformesLabel = InformesLabel;
    }

    public JMenu getInventarioMenu() {
        return InventarioMenu;
    }

    public void setInventarioMenu(JMenu InventarioMenu) {
        this.InventarioMenu = InventarioMenu;
    }

    public JMenu getPerfilMenu() {
        return PerfilMenu;
    }

    public void setPerfilMenu(JMenu PerfilMenu) {
        this.PerfilMenu = PerfilMenu;
    }

    public JMenuItem getAcercaDeMenuItem() {
        return acercaDeMenuItem;
    }

    public void setAcercaDeMenuItem(JMenuItem acercaDeMenuItem) {
        this.acercaDeMenuItem = acercaDeMenuItem;
    }

    public JMenuItem getAgregarProductoMenuItem() {
        return agregarProductoMenuItem;
    }

    public void setAgregarProductoMenuItem(JMenuItem agregarProductoMenuItem) {
        this.agregarProductoMenuItem = agregarProductoMenuItem;
    }

    public JMenuItem getAjusteInventarioMenuItem() {
        return ajusteInventarioMenuItem;
    }

    public void setAjusteInventarioMenuItem(JMenuItem ajusteInventarioMenuItem) {
        this.ajusteInventarioMenuItem = ajusteInventarioMenuItem;
    }

    public JMenu getAyudaMenu() {
        return ayudaMenu;
    }

    public void setAyudaMenu(JMenu ayudaMenu) {
        this.ayudaMenu = ayudaMenu;
    }

    public JToolBar getBarraHerramientas() {
        return barraHerramientas;
    }

    public void setBarraHerramientas(JToolBar barraHerramientas) {
        this.barraHerramientas = barraHerramientas;
    }

    public JMenuBar getBarraJMenu() {
        return barraJMenu;
    }

    public void setBarraJMenu(JMenuBar barraJMenu) {
        this.barraJMenu = barraJMenu;
    }

    public JButton getBtnAusteInv() {
        return btnAusteInv;
    }

    public void setBtnAusteInv(JButton btnAusteInv) {
        this.btnAusteInv = btnAusteInv;
    }

    public JButton getBtnHistorialVentas() {
        return btnHistorialVentas;
    }

    public void setBtnHistorialVentas(JButton btnHistorialVentas) {
        this.btnHistorialVentas = btnHistorialVentas;
    }

    public JButton getBtnProductos() {
        return btnProductos;
    }

    public void setBtnProductos(JButton btnProductos) {
        this.btnProductos = btnProductos;
    }

    public JButton getBtnReabastecimiento() {
        return btnReabastecimiento;
    }

    public void setBtnReabastecimiento(JButton btnReabastecimiento) {
        this.btnReabastecimiento = btnReabastecimiento;
    }

    public JButton getBtnRecarcaPerfume() {
        return btnRecarcaPerfume;
    }

    public void setBtnRecarcaPerfume(JButton btnRecarcaPerfume) {
        this.btnRecarcaPerfume = btnRecarcaPerfume;
    }

    public JButton getBtnReporteStock() {
        return btnReporteStock;
    }

    public void setBtnReporteStock(JButton btnReporteStock) {
        this.btnReporteStock = btnReporteStock;
    }

    public JButton getBtnReporteVentas() {
        return btnReporteVentas;
    }

    public void setBtnReporteVentas(JButton btnReporteVentas) {
        this.btnReporteVentas = btnReporteVentas;
    }

    public JButton getBtnVentaPerfume() {
        return btnVentaPerfume;
    }

    public void setBtnVentaPerfume(JButton btnVentaPerfume) {
        this.btnVentaPerfume = btnVentaPerfume;
    }

    public JMenuItem getCerrarSecionMenuItem() {
        return cerrarSecionMenuItem;
    }

    public void setCerrarSecionMenuItem(JMenuItem cerrarSecionMenuItem) {
        this.cerrarSecionMenuItem = cerrarSecionMenuItem;
    }

    public JMenu getContabilidadMenu() {
        return contabilidadMenu;
    }

    public void setContabilidadMenu(JMenu contabilidadMenu) {
        this.contabilidadMenu = contabilidadMenu;
    }

    public JLabel getControlInventarioLabel() {
        return controlInventarioLabel;
    }

    public void setControlInventarioLabel(JLabel controlInventarioLabel) {
        this.controlInventarioLabel = controlInventarioLabel;
    }

    public JMenuItem getEstadoProductosMenuItem() {
        return estadoProductosMenuItem;
    }

    public void setEstadoProductosMenuItem(JMenuItem estadoProductosMenuItem) {
        this.estadoProductosMenuItem = estadoProductosMenuItem;
    }

    public JMenuItem getFacturasMenuItem() {
        return facturasMenuItem;
    }

    public void setFacturasMenuItem(JMenuItem facturasMenuItem) {
        this.facturasMenuItem = facturasMenuItem;
    }

    public JMenuItem getHistorialVentasMenuItem() {
        return historialVentasMenuItem;
    }

    public void setHistorialVentasMenuItem(JMenuItem historialVentasMenuItem) {
        this.historialVentasMenuItem = historialVentasMenuItem;
    }

    public JMenuItem getInfoSucMenuItem() {
        return infoSucMenuItem;
    }

    public void setInfoSucMenuItem(JMenuItem infoSucMenuItem) {
        this.infoSucMenuItem = infoSucMenuItem;
    }

    public JMenuItem getInventarioProductosMenuItem() {
        return inventarioProductosMenuItem;
    }

    public void setInventarioProductosMenuItem(JMenuItem inventarioProductosMenuItem) {
        this.inventarioProductosMenuItem = inventarioProductosMenuItem;
    }

    public JDesktopPane getEscritorio() {
        return escritorio;
    }

    public void setEscritorio(JDesktopPane escritorio) {
        this.escritorio = escritorio;
    }

    public JMenu getjMenu10() {
        return jMenu10;
    }

    public void setjMenu10(JMenu jMenu10) {
        this.jMenu10 = jMenu10;
    }

    public JMenu getjMenu3() {
        return jMenu3;
    }

    public void setjMenu3(JMenu jMenu3) {
        this.jMenu3 = jMenu3;
    }

    public JMenu getjMenu4() {
        return jMenu4;
    }

    public void setjMenu4(JMenu jMenu4) {
        this.jMenu4 = jMenu4;
    }

    public JMenuBar getjMenuBar2() {
        return jMenuBar2;
    }

    public void setjMenuBar2(JMenuBar jMenuBar2) {
        this.jMenuBar2 = jMenuBar2;
    }

    public JMenuItem getjMenuItem1() {
        return jMenuItem1;
    }

    public void setjMenuItem1(JMenuItem jMenuItem1) {
        this.jMenuItem1 = jMenuItem1;
    }

    public JMenuItem getjMenuItem12() {
        return jMenuItem12;
    }

    public void setjMenuItem12(JMenuItem jMenuItem12) {
        this.jMenuItem12 = jMenuItem12;
    }

    public JMenuItem getjMenuItem2() {
        return jMenuItem2;
    }

    public void setjMenuItem2(JMenuItem jMenuItem2) {
        this.jMenuItem2 = jMenuItem2;
    }

    public JMenuItem getjMenuItem3() {
        return jMenuItem3;
    }

    public void setjMenuItem3(JMenuItem jMenuItem3) {
        this.jMenuItem3 = jMenuItem3;
    }

    public JToolBar.Separator getjSeparator1() {
        return jSeparator1;
    }

    public void setjSeparator1(JToolBar.Separator jSeparator1) {
        this.jSeparator1 = jSeparator1;
    }

    public JToolBar.Separator getjSeparator2() {
        return jSeparator2;
    }

    public void setjSeparator2(JToolBar.Separator jSeparator2) {
        this.jSeparator2 = jSeparator2;
    }

    public JToolBar.Separator getjSeparator3() {
        return jSeparator3;
    }

    public void setjSeparator3(JToolBar.Separator jSeparator3) {
        this.jSeparator3 = jSeparator3;
    }

    public JPopupMenu.Separator getjSeparator4() {
        return jSeparator4;
    }

    public void setjSeparator4(JPopupMenu.Separator jSeparator4) {
        this.jSeparator4 = jSeparator4;
    }

    public JLabel getModuloDeVentasLabel() {
        return moduloDeVentasLabel;
    }

    public void setModuloDeVentasLabel(JLabel moduloDeVentasLabel) {
        this.moduloDeVentasLabel = moduloDeVentasLabel;
    }

    public JMenu getNotificacionesMenu() {
        return notificacionesMenu;
    }

    public void setNotificacionesMenu(JMenu notificacionesMenu) {
        this.notificacionesMenu = notificacionesMenu;
    }

    public JMenuItem getRecargaPerfumeMenuItem() {
        return recargaPerfumeMenuItem;
    }

    public void setRecargaPerfumeMenuItem(JMenuItem recargaPerfumeMenuItem) {
        this.recargaPerfumeMenuItem = recargaPerfumeMenuItem;
    }

    public JMenuItem getReporteVentasMenuItem() {
        return reporteVentasMenuItem;
    }

    public void setReporteVentasMenuItem(JMenuItem reporteVentasMenuItem) {
        this.reporteVentasMenuItem = reporteVentasMenuItem;
    }

    public JMenuItem getVentaPerfumeMenuItem() {
        return ventaPerfumeMenuItem;
    }

    public void setVentaPerfumeMenuItem(JMenuItem ventaPerfumeMenuItem) {
        this.ventaPerfumeMenuItem = ventaPerfumeMenuItem;
    }

    public JMenu getVentasMenu() {
        return ventasMenu;
    }

    public void setVentasMenu(JMenu ventasMenu) {
        this.ventasMenu = ventasMenu;
    }

    public JMenuItem getVerPerfilMenuItem() {
        return verPerfilMenuItem;
    }

    public void setVerPerfilMenuItem(JMenuItem verPerfilMenuItem) {
        this.verPerfilMenuItem = verPerfilMenuItem;
    }

    public JToolBar getProductoBarraHerramientas() {
        return productoBarraHerramientas;
    }

    public void setProductoBarraHerramientas(JToolBar productoBarraHerramientas) {
        this.productoBarraHerramientas = productoBarraHerramientas;
    }

    public JButton getBtnVerStockItemBH() {
        return btnVerStockItemBH;
    }

    public void setBtnVerStockItemBH(JButton btnVerStockItemBH) {
        this.btnVerStockItemBH = btnVerStockItemBH;
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu10 = new javax.swing.JMenu();
        jMenuItem12 = new javax.swing.JMenuItem();
        barraHerramientas = new javax.swing.JToolBar();
        controlInventarioLabel = new javax.swing.JLabel();
        btnProductos = new javax.swing.JButton();
        btnAusteInv = new javax.swing.JButton();
        btnReabastecimiento = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JToolBar.Separator();
        moduloDeVentasLabel = new javax.swing.JLabel();
        btnVentaPerfume = new javax.swing.JButton();
        btnRecarcaPerfume = new javax.swing.JButton();
        btnHistorialVentas = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JToolBar.Separator();
        InformesLabel = new javax.swing.JLabel();
        btnReporteVentas = new javax.swing.JButton();
        btnReporteStock = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JToolBar.Separator();
        escritorio = new javax.swing.JDesktopPane();
        productoBarraHerramientas = new javax.swing.JToolBar();
        btnBorrarMenu_1 = new javax.swing.JButton();
        jSeparator5 = new javax.swing.JToolBar.Separator();
        btnVerListaProductoItemBH = new javax.swing.JButton();
        jSeparator6 = new javax.swing.JToolBar.Separator();
        btnVerStockItemBH = new javax.swing.JButton();
        barraJMenu = new javax.swing.JMenuBar();
        PerfilMenu = new javax.swing.JMenu();
        verPerfilMenuItem = new javax.swing.JMenuItem();
        cerrarSecionMenuItem = new javax.swing.JMenuItem();
        jSeparator4 = new javax.swing.JPopupMenu.Separator();
        infoSucMenuItem = new javax.swing.JMenuItem();
        ventasMenu = new javax.swing.JMenu();
        ventaPerfumeMenuItem = new javax.swing.JMenuItem();
        recargaPerfumeMenuItem = new javax.swing.JMenuItem();
        historialVentasMenuItem = new javax.swing.JMenuItem();
        facturasMenuItem = new javax.swing.JMenuItem();
        InventarioMenu = new javax.swing.JMenu();
        inventarioProductosMenuItem = new javax.swing.JMenuItem();
        agregarProductoMenuItem = new javax.swing.JMenuItem();
        ajusteInventarioMenuItem = new javax.swing.JMenuItem();
        contabilidadMenu = new javax.swing.JMenu();
        reporteVentasMenuItem = new javax.swing.JMenuItem();
        notificacionesMenu = new javax.swing.JMenu();
        estadoProductosMenuItem = new javax.swing.JMenuItem();
        ayudaMenu = new javax.swing.JMenu();
        acercaDeMenuItem = new javax.swing.JMenuItem();

        jMenu3.setText("File");
        jMenuBar2.add(jMenu3);

        jMenu4.setText("Edit");
        jMenuBar2.add(jMenu4);

        jMenuItem1.setText("jMenuItem1");

        jMenuItem2.setText("jMenuItem2");

        jMenuItem3.setText("jMenuItem3");

        jMenu10.setText("jMenu10");

        jMenuItem12.setText("jMenuItem12");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        barraHerramientas.setOrientation(javax.swing.SwingConstants.VERTICAL);
        barraHerramientas.setRollover(true);

        controlInventarioLabel.setText("Control de inventario");
        barraHerramientas.add(controlInventarioLabel);

        btnProductos.setText("Productos");
        btnProductos.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnProductos.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProductosActionPerformed(evt);
            }
        });
        barraHerramientas.add(btnProductos);

        btnAusteInv.setText("Ajuste de inventario");
        btnAusteInv.setFocusable(false);
        btnAusteInv.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnAusteInv.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        barraHerramientas.add(btnAusteInv);

        btnReabastecimiento.setText("Reabastecimiento ");
        btnReabastecimiento.setFocusable(false);
        btnReabastecimiento.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnReabastecimiento.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnReabastecimiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReabastecimientoActionPerformed(evt);
            }
        });
        barraHerramientas.add(btnReabastecimiento);
        barraHerramientas.add(jSeparator1);

        moduloDeVentasLabel.setText("Modulo de ventas");
        barraHerramientas.add(moduloDeVentasLabel);

        btnVentaPerfume.setText("Venta de perfume");
        btnVentaPerfume.setFocusable(false);
        btnVentaPerfume.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnVentaPerfume.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnVentaPerfume.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVentaPerfumeActionPerformed(evt);
            }
        });
        barraHerramientas.add(btnVentaPerfume);

        btnRecarcaPerfume.setText("Recarga de esencia");
        btnRecarcaPerfume.setFocusable(false);
        btnRecarcaPerfume.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnRecarcaPerfume.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        barraHerramientas.add(btnRecarcaPerfume);

        btnHistorialVentas.setText("Historial de ventas");
        btnHistorialVentas.setFocusable(false);
        btnHistorialVentas.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnHistorialVentas.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        barraHerramientas.add(btnHistorialVentas);
        barraHerramientas.add(jSeparator2);

        InformesLabel.setText("Informes");
        barraHerramientas.add(InformesLabel);

        btnReporteVentas.setText("Reporte de ventas");
        btnReporteVentas.setFocusable(false);
        btnReporteVentas.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnReporteVentas.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        barraHerramientas.add(btnReporteVentas);

        btnReporteStock.setText("Reporte de stock");
        btnReporteStock.setFocusable(false);
        btnReporteStock.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnReporteStock.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        barraHerramientas.add(btnReporteStock);
        barraHerramientas.add(jSeparator3);

        javax.swing.GroupLayout escritorioLayout = new javax.swing.GroupLayout(escritorio);
        escritorio.setLayout(escritorioLayout);
        escritorioLayout.setHorizontalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 781, Short.MAX_VALUE)
        );
        escritorioLayout.setVerticalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        productoBarraHerramientas.setRollover(true);

        btnBorrarMenu_1.setText("Borrar menú");
        btnBorrarMenu_1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnBorrarMenu_1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        productoBarraHerramientas.add(btnBorrarMenu_1);
        productoBarraHerramientas.add(jSeparator5);

        btnVerListaProductoItemBH.setText("Ver Lista Producto");
        btnVerListaProductoItemBH.setFocusable(false);
        btnVerListaProductoItemBH.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnVerListaProductoItemBH.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        productoBarraHerramientas.add(btnVerListaProductoItemBH);
        productoBarraHerramientas.add(jSeparator6);

        btnVerStockItemBH.setText("Ver Stock");
        btnVerStockItemBH.setFocusable(false);
        btnVerStockItemBH.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnVerStockItemBH.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnVerStockItemBH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerStockItemBHActionPerformed(evt);
            }
        });
        productoBarraHerramientas.add(btnVerStockItemBH);

        PerfilMenu.setText("Perfil");

        verPerfilMenuItem.setText("ver perfil");
        verPerfilMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verPerfilMenuItemActionPerformed(evt);
            }
        });
        PerfilMenu.add(verPerfilMenuItem);

        cerrarSecionMenuItem.setText("cerrar seción");
        PerfilMenu.add(cerrarSecionMenuItem);
        PerfilMenu.add(jSeparator4);

        infoSucMenuItem.setText("Informacion de sucursal");
        PerfilMenu.add(infoSucMenuItem);

        barraJMenu.add(PerfilMenu);

        ventasMenu.setText("Ventas");

        ventaPerfumeMenuItem.setText("venta de perfume");
        ventasMenu.add(ventaPerfumeMenuItem);

        recargaPerfumeMenuItem.setText("recarga de esencia");
        ventasMenu.add(recargaPerfumeMenuItem);

        historialVentasMenuItem.setText("historial de ventas");
        ventasMenu.add(historialVentasMenuItem);

        facturasMenuItem.setText("facturas");
        ventasMenu.add(facturasMenuItem);

        barraJMenu.add(ventasMenu);

        InventarioMenu.setText("Inventario");

        inventarioProductosMenuItem.setText("Productos");
        InventarioMenu.add(inventarioProductosMenuItem);

        agregarProductoMenuItem.setText("Agregar nuevo producto");
        InventarioMenu.add(agregarProductoMenuItem);

        ajusteInventarioMenuItem.setText("Ajuste de inventario");
        InventarioMenu.add(ajusteInventarioMenuItem);

        barraJMenu.add(InventarioMenu);

        contabilidadMenu.setText("Contabilidad");

        reporteVentasMenuItem.setText("reporte de ventas");
        contabilidadMenu.add(reporteVentasMenuItem);

        barraJMenu.add(contabilidadMenu);

        notificacionesMenu.setText("notificaciones");
        notificacionesMenu.setToolTipText("");

        estadoProductosMenuItem.setText("Estado de productos");
        notificacionesMenu.add(estadoProductosMenuItem);

        barraJMenu.add(notificacionesMenu);

        ayudaMenu.setText("ayuda");

        acercaDeMenuItem.setText("Acerca de..");
        acercaDeMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                acercaDeMenuItemActionPerformed(evt);
            }
        });
        ayudaMenu.add(acercaDeMenuItem);

        barraJMenu.add(ayudaMenu);

        setJMenuBar(barraJMenu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(barraHerramientas, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(escritorio)
                    .addComponent(productoBarraHerramientas, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(productoBarraHerramientas, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(escritorio))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(barraHerramientas, javax.swing.GroupLayout.DEFAULT_SIZE, 730, Short.MAX_VALUE)
                        .addContainerGap())))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProductosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnProductosActionPerformed

    private void btnVentaPerfumeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVentaPerfumeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnVentaPerfumeActionPerformed

    private void btnReabastecimientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReabastecimientoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnReabastecimientoActionPerformed

    private void verPerfilMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verPerfilMenuItemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_verPerfilMenuItemActionPerformed

    private void acercaDeMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_acercaDeMenuItemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_acercaDeMenuItemActionPerformed

    private void btnVerStockItemBHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerStockItemBHActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnVerStockItemBHActionPerformed

    public JButton getBtnVerListaProductoItemBH() {
        return btnVerListaProductoItemBH;
    }

    public void setBtnVerListaProductoItemBH(JButton btnVerListaProductoItemBH) {
        this.btnVerListaProductoItemBH = btnVerListaProductoItemBH;
    }

    public JButton getBtnBorrarMenu_1() {
        return btnBorrarMenu_1;
    }

    public void setBtnBorrarMenu_1(JButton btnBorrarMenu_1) {
        this.btnBorrarMenu_1 = btnBorrarMenu_1;
    }

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel InformesLabel;
    private javax.swing.JMenu InventarioMenu;
    private javax.swing.JMenu PerfilMenu;
    private javax.swing.JMenuItem acercaDeMenuItem;
    private javax.swing.JMenuItem agregarProductoMenuItem;
    private javax.swing.JMenuItem ajusteInventarioMenuItem;
    private javax.swing.JMenu ayudaMenu;
    private javax.swing.JToolBar barraHerramientas;
    private javax.swing.JMenuBar barraJMenu;
    private javax.swing.JButton btnAusteInv;
    private javax.swing.JButton btnBorrarMenu_1;
    private javax.swing.JButton btnHistorialVentas;
    private javax.swing.JButton btnProductos;
    private javax.swing.JButton btnReabastecimiento;
    private javax.swing.JButton btnRecarcaPerfume;
    private javax.swing.JButton btnReporteStock;
    private javax.swing.JButton btnReporteVentas;
    private javax.swing.JButton btnVentaPerfume;
    private javax.swing.JButton btnVerListaProductoItemBH;
    private javax.swing.JButton btnVerStockItemBH;
    private javax.swing.JMenuItem cerrarSecionMenuItem;
    private javax.swing.JMenu contabilidadMenu;
    private javax.swing.JLabel controlInventarioLabel;
    private javax.swing.JDesktopPane escritorio;
    private javax.swing.JMenuItem estadoProductosMenuItem;
    private javax.swing.JMenuItem facturasMenuItem;
    private javax.swing.JMenuItem historialVentasMenuItem;
    private javax.swing.JMenuItem infoSucMenuItem;
    private javax.swing.JMenuItem inventarioProductosMenuItem;
    private javax.swing.JMenu jMenu10;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem12;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JToolBar.Separator jSeparator1;
    private javax.swing.JToolBar.Separator jSeparator2;
    private javax.swing.JToolBar.Separator jSeparator3;
    private javax.swing.JPopupMenu.Separator jSeparator4;
    private javax.swing.JToolBar.Separator jSeparator5;
    private javax.swing.JToolBar.Separator jSeparator6;
    private javax.swing.JLabel moduloDeVentasLabel;
    private javax.swing.JMenu notificacionesMenu;
    private javax.swing.JToolBar productoBarraHerramientas;
    private javax.swing.JMenuItem recargaPerfumeMenuItem;
    private javax.swing.JMenuItem reporteVentasMenuItem;
    private javax.swing.JMenuItem ventaPerfumeMenuItem;
    private javax.swing.JMenu ventasMenu;
    private javax.swing.JMenuItem verPerfilMenuItem;
    // End of variables declaration//GEN-END:variables
}
