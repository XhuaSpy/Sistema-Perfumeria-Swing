package com.perfumeria.controlador.navegacion;

import com.perfumeria.controlador.producto.ActualizarStockControlador;
import com.perfumeria.controlador.producto.CargarProductoControlador;
import com.perfumeria.controlador.producto.ListaProductoControlador;
import com.perfumeria.controlador.producto.StockProductoControlador;
import com.perfumeria.modelo.producto.Producto;
import com.perfumeria.vista.producto.IFrameActualizarStock;
import com.perfumeria.vista.producto.IFrameCargarProducto;
import com.perfumeria.vista.producto.IFrameListaProducto;
import com.perfumeria.vista.reporte.IFrameReporteStock;
import javax.swing.JDesktopPane;
import java.beans.PropertyVetoException;
import javax.swing.JOptionPane;

/**
 * Clase encargada de controlar la navegación entre las distintas ventanas
 * relacionadas con productos, dentro del escritorio principal de la aplicación.
 * 
 * Permite abrir vistas para listar productos, cargar nuevos, ver stock y actualizar existencias.
 * 
 * @author Jesus David Peraza
 */
public class NavegadorProducto {

    /**
     * Panel de escritorio donde se cargan las ventanas internas.
     */
    private final JDesktopPane escritorio;

    /**
     * Ventana para mostrar la lista de productos.
     */
    private IFrameListaProducto frameListaProducto;

    /**
     * Ventana para registrar un nuevo producto.
     */
    private IFrameCargarProducto frameCargarProducto;

    /**
     * Ventana para mostrar el reporte de stock.
     */
    private IFrameReporteStock frameReporteStock;

    /**
     * Ventana para actualizar el stock de un producto específico.
     */
    private IFrameActualizarStock frameActualizarStock;

    /**
     * Constructor que recibe el escritorio donde se mostrarán las ventanas.
     * 
     * @param escritorio escritorio principal de la interfaz
     */
    public NavegadorProducto(JDesktopPane escritorio) {
        this.escritorio = escritorio;
    }

    /**
     * Abre la ventana de lista de productos. Si ya está abierta, la trae al frente.
     */
    public void abrirListaProductos() {
        if (frameListaProducto == null) {
            frameListaProducto = new IFrameListaProducto();
        }

        if (!frameListaProducto.isVisible()) {
            escritorio.add(frameListaProducto);
            new ListaProductoControlador(frameListaProducto, this).iniciar();
            frameListaProducto.setVisible(true);
        } else {
            try {
                frameListaProducto.setSelected(true);
                frameListaProducto.toFront();
            } catch (PropertyVetoException e) {
                JOptionPane.showMessageDialog(frameListaProducto, "No se pudo activar la ventana.");
            }
        }
    }

    /**
     * Abre la ventana para registrar un nuevo producto. Si ya está abierta, la trae al frente.
     */
    public void abrirCargarProducto() {
        if (frameCargarProducto == null) {
            frameCargarProducto = new IFrameCargarProducto();
        }

        if (!frameCargarProducto.isVisible()) {
            escritorio.add(frameCargarProducto);
            new CargarProductoControlador(frameCargarProducto).iniciar();
            frameCargarProducto.setVisible(true);
        } else {
            try {
                frameCargarProducto.setSelected(true);
                frameCargarProducto.toFront();
            } catch (PropertyVetoException e) {
                JOptionPane.showMessageDialog(frameCargarProducto, "No se pudo activar la ventana.");
            }
        }
    }

    /**
     * Abre la ventana del reporte de stock de productos. Si ya está abierta, la trae al frente.
     */
    public void abrirStockProductos() {
        if (frameReporteStock == null) {
            frameReporteStock = new IFrameReporteStock();
        }

        if (!frameReporteStock.isVisible()) {
            escritorio.add(frameReporteStock);
            new StockProductoControlador(frameReporteStock, this).iniciar();
            frameReporteStock.setVisible(true);
        } else {
            try {
                frameReporteStock.setSelected(true);
                frameReporteStock.toFront();
            } catch (PropertyVetoException e) {
                JOptionPane.showMessageDialog(frameReporteStock, "No se pudo activar la ventana.");
            }
        }
    }

    /**
     * Abre la ventana para actualizar el stock de un producto específico.
     * Si ya está abierta, la trae al frente.
     * 
     * @param producto producto al que se desea actualizar el stock
     */
    public void abrirActualizarStockProductos(Producto producto) {
        if (frameActualizarStock == null) {
            frameActualizarStock = new IFrameActualizarStock();
        }

        if (!frameActualizarStock.isVisible()) {
            escritorio.add(frameActualizarStock);
            new ActualizarStockControlador(frameActualizarStock, producto).iniciar();
            frameActualizarStock.setVisible(true);
        } else {
            try {
                frameActualizarStock.setSelected(true);
                frameActualizarStock.toFront();
            } catch (PropertyVetoException e) {
                JOptionPane.showMessageDialog(frameActualizarStock, "No se pudo activar la ventana.");
            }
        }
    }
}
