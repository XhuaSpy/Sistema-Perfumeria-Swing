package com.perfumeria.controlador.navegacion;

import com.perfumeria.controlador.venta.HistorialVentasControlador;
import com.perfumeria.vista.venta.IFrameHistorialVentas;
import java.beans.PropertyVetoException;
import javax.swing.JDesktopPane;
import javax.swing.JOptionPane;

/**
 * Clase encargada de controlar la navegación entre las distintas ventanas
 * relacionadas con ventas, dentro del escritorio principal de la aplicación.
 *
 * Permite abrir vistas para historial de ventas, gestionar carrito de compra,
 * cargar productos al carrito.
 *
 * @author Jesus David Peraza
 */
public class NavegadorVentas {

    /**
     * Panel de escritorio donde se cargan las ventanas internas.
     */
    private final JDesktopPane escritorio;

    /**
     * Ventana para mostrar el reporte de stock.
     */
    private IFrameHistorialVentas historialVentas;

    /**
     * Constructor que recibe el escritorio donde se mostrarán las ventanas.
     *
     * @param escritorio escritorio principal de la interfaz
     */
    public NavegadorVentas(JDesktopPane escritorio) {
        this.escritorio = escritorio;
    }

    /**
     * Abre la ventana de lista de productos. Si ya está abierta, la trae al frente.
     */
    public void abrirListaProductos() {
        if (historialVentas == null) {
            historialVentas = new IFrameHistorialVentas();
        }

        if (!historialVentas.isVisible()) {
            escritorio.add(historialVentas);
            new HistorialVentasControlador(historialVentas).iniciar();
            historialVentas.setVisible(true);
        } else {
            try {
                historialVentas.setSelected(true);
                historialVentas.toFront();
            } catch (PropertyVetoException e) {
                JOptionPane.showMessageDialog(historialVentas, "No se pudo activar la ventana.");
            }
        }
    }
}
