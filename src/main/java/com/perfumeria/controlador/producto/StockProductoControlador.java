package com.perfumeria.controlador.producto;

import com.perfumeria.configuracion.Config;
import com.perfumeria.controlador.navegacion.NavegadorProducto;
import com.perfumeria.modelo.ArchivoPDF;
import com.perfumeria.modelo.Producto;
import com.perfumeria.modelo.FrameUtils;
import com.perfumeria.vista.reporte.IFrameReporteStock;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.PropertyVetoException;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 * Controlador que gestiona el reporte de stock de productos.
 * Permite recargar la tabla de productos y abrir el formulario para actualizar stock.
 * 
 * @author Jesus Peraza Royero
 */
public class StockProductoControlador implements ActionListener {

    /**
     * Vista que muestra el reporte de stock.
     */
    public IFrameReporteStock frameReporteStock;

    /**
     * Navegador para cambiar entre vistas relacionadas con productos.
     */
    public NavegadorProducto navegadorProducto;

    /**
     * Constructor por defecto. Crea la vista internamente.
     */
    public StockProductoControlador() {
        this.frameReporteStock = new IFrameReporteStock();
    }

    /**
     * Constructor que recibe la vista del reporte y el navegador asociado.
     * 
     * @param frameReporteStock vista del reporte de stock
     * @param navegadorProducto controlador de navegación de productos
     */
    public StockProductoControlador(IFrameReporteStock frameReporteStock, NavegadorProducto navegadorProducto) {
        this.frameReporteStock = frameReporteStock;
        this.navegadorProducto = navegadorProducto;
    }

    /**
     * Inicializa el formulario, configura comportamiento y lo muestra.
     */
    public void iniciar() {
        this.frameReporteStock.setTitle("Login");
        this.frameReporteStock.setClosable(true);
        this.frameReporteStock.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        FrameUtils.iniciarListener(frameReporteStock, this);

        try {
            frameReporteStock.setMaximum(true);
        } catch (PropertyVetoException ex) {
            // Silenciado
        }

        this.frameReporteStock.setVisible(true);
    }

    /**
     * Maneja los eventos de botones: recargar y actualizar stock.
     * 
     * @param e evento de acción capturado
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(frameReporteStock.getBtnRecargar())) {
            accionRacargar();
        }
        
        if (e.getSource().equals(frameReporteStock.getBtnGenerarPDF())) {
            new ArchivoPDF().CrearPDFReporteStock();
        }

        if (e.getSource().equals(frameReporteStock.getBtnActualizarStock())) {
            JTable tabla = frameReporteStock.getReporteStockTable();
            int filaSeleccionada = tabla.getSelectedRow();

            if (filaSeleccionada != -1) {
                Object valorId = tabla.getValueAt(filaSeleccionada, 0);
                try {
                    Integer id = Integer.parseInt(valorId.toString());
                    Producto producto = Config.productoRepositorio.buscarPorId(id);

                    if (producto != null) {
                        navegadorProducto.abrirActualizarStockProductos(producto);
                    } else {
                        JOptionPane.showMessageDialog(frameReporteStock, "No se encontró el producto con ID: " + id);
                    }

                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(frameReporteStock, "ID inválido en la tabla.");
                }
            } else {
                JOptionPane.showMessageDialog(frameReporteStock, "Seleccione un producto de la tabla.");
            }
        }
    }

    /**
     * Recarga los datos del repositorio y los muestra en la tabla de la vista.
     */
    private void accionRacargar() {
        DefaultTableModel plantilla = (DefaultTableModel) frameReporteStock.getReporteStockTable().getModel();

        plantilla.setRowCount(0); // Limpia la tabla

        for (Producto producto : Config.productoRepositorio.listar()) {
            Object[] datos = {
                producto.getId(),
                producto.getTipo().toString(),
                producto.getNombre(),
                producto.getUnidadesPorLote().toString(),
                producto.getCantidadEnStock().toString(),
            };

            plantilla.addRow(datos);
        }
    }
}
