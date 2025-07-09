package com.perfumeria.controlador.venta;

import com.perfumeria.configuracion.Config;
import com.perfumeria.modelo.Producto;
import com.perfumeria.modelo.Venta;
import com.perfumeria.vista.venta.IFrameHistorialVentas;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.PropertyVetoException;
import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author coffeshell
 */
public class HistorialVentasControlador implements ActionListener {

    /**
     * Ventana para mostrar el reporte de stock.
     */
    private IFrameHistorialVentas historialVentas;

    public HistorialVentasControlador() {
        this.historialVentas = new IFrameHistorialVentas();
    }

    public HistorialVentasControlador(IFrameHistorialVentas historialVentas) {
        this.historialVentas = historialVentas;
    }

    public IFrameHistorialVentas getHistorialVentas() {
        return historialVentas;
    }

    public void setHistorialVentas(IFrameHistorialVentas historialVentas) {
        this.historialVentas = historialVentas;
    }

    public void iniciar() {
        this.historialVentas.setTitle("Login");
        this.historialVentas.setClosable(true);
        this.historialVentas.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.historialVentas.getBtnRecagar().addActionListener(this);

        try {
            historialVentas.setMaximum(true);
        } catch (PropertyVetoException ex) {

        }

        this.historialVentas.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(historialVentas.getBtnRecagar())) {
            accionRecargar();
        }
    }

    private void accionRecargar() {
        DefaultTableModel plantilla = (DefaultTableModel) historialVentas.getTablaHistorial().getModel();

        plantilla.setRowCount(0); // Limpia la tabla

        for (Venta venta : Config.ventaRepositorio.listar()) {

            Object[] datos = {
                venta.getId(),
                venta.getFecha().toString(),
                venta.getCantidad(),
                venta.getTipo().toString(),
            };

            plantilla.addRow(datos);
        }
    }
}
