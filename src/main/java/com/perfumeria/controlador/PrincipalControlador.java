package com.perfumeria.controlador;

import com.perfumeria.controlador.navegacion.NavegadorProducto;
import com.perfumeria.controlador.navegacion.NavegadorVentas;
import com.perfumeria.utilidades.FrameUtils;
import com.perfumeria.vista.FrameMain;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;

/**
 * Clase encargada de controlar la lógica principal de la aplicación.
 * Gestiona la interacción entre la ventana principal y los eventos de la interfaz.
 * 
 * @author Jesus David Peraza
 */
public class PrincipalControlador implements ActionListener {

    /**
     * Ventana principal de la aplicación.
     */
    private FrameMain framePrincipal;

    /**
     * Navegador que permite la navegación entre vistas relacionadas con productos.
     */
    private NavegadorProducto navegadorProductos;

    /**
     * Navegador que permite la navegación entre vistas relacionadas con ventas.
     */
    private NavegadorVentas navegadorVentas;

    /**
     * Constructor que inicializa la ventana principal y el navegador de productos.
     */
    public PrincipalControlador() {
        this.framePrincipal = new FrameMain();
        this.navegadorProductos = new NavegadorProducto(framePrincipal.getEscritorio());
        this.navegadorVentas = new NavegadorVentas(framePrincipal.getEscritorio());
    }

    /**
     * Método que configura e inicia la interfaz principal.
     */
    public void iniciar() {
        this.framePrincipal.setTitle("Login");
        this.framePrincipal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.framePrincipal.setLocationRelativeTo(null);

        FrameUtils.iniciarListener(framePrincipal, this);

        this.framePrincipal.getProductoBarraHerramientas().setVisible(false);
        this.framePrincipal.setVisible(true);
    }

    /**
     * Maneja los eventos producidos por botones y elementos de menú.
     * 
     * @param e evento de acción capturado
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(framePrincipal.getBtnProductos())
                || e.getSource().equals(framePrincipal.getInventarioMenu())) {
            this.framePrincipal.getProductoBarraHerramientas().setVisible(true);
        }
        if (e.getSource().equals(framePrincipal.getBtnVerListaProductoItemBH())) {
            navegadorProductos.abrirListaProductos();
        }
        if (e.getSource().equals(framePrincipal.getBtnBorrarMenu_1())) {
            cerrarBarraMenu();
        }
        if (e.getSource().equals(framePrincipal.getAgregarProductoMenuItem())) {
            navegadorProductos.abrirCargarProducto();
        }
        if (e.getSource().equals(framePrincipal.getBtnVerStockItemBH())) {
            navegadorProductos.abrirStockProductos();
        }
        if (e.getSource().equals(framePrincipal.getBtnReporteStock())) {
            navegadorProductos.abrirStockProductos();
        }
        if (e.getSource().equals(framePrincipal.getBtnHistorialVentas())) {
            navegadorVentas.abrirListaProductos();
        }  
    }

    /**
     * Oculta la barra de herramientas de productos en la interfaz.
     */
    public void cerrarBarraMenu() {
        this.framePrincipal.getProductoBarraHerramientas().setVisible(false);
    }
}
