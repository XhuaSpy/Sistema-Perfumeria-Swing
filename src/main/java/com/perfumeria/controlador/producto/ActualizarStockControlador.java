package com.perfumeria.controlador.producto;

import com.perfumeria.configuracion.Config;
import com.perfumeria.modelo.InformacionIncompletaException;
import com.perfumeria.modelo.Producto;
import com.perfumeria.modelo.FrameUtils;
import com.perfumeria.vista.producto.IFrameActualizarStock;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.PropertyVetoException;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 * Controlador encargado de manejar la lógica para actualizar el stock
 * de un producto desde la interfaz correspondiente.
 * 
 * @author Jesus David Peraza
 */
public class ActualizarStockControlador implements ActionListener {

    /**
     * Ventana interna para actualizar el stock.
     */
    private IFrameActualizarStock frameActualizar;

    /**
     * Producto sobre el cual se realizará la actualización de stock.
     */
    private Producto producto;

    /**
     * Constructor por defecto. Crea un nuevo frame y un producto vacío.
     */
    public ActualizarStockControlador() {
        this.frameActualizar = new IFrameActualizarStock();
        this.producto = new Producto();
    }

    /**
     * Constructor que recibe el frame y el producto a modificar.
     * 
     * @param frameActualizar ventana a mostrar
     * @param producto producto a actualizar
     */
    public ActualizarStockControlador(IFrameActualizarStock frameActualizar, Producto producto) {
        this.frameActualizar = frameActualizar;
        this.producto = producto;
    }

    /**
     * Inicializa la ventana, configura eventos y muestra los datos actuales del producto.
     */
    public void iniciar() {
        this.frameActualizar.setTitle("Login");
        this.frameActualizar.setClosable(true);
        this.frameActualizar.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.frameActualizar.getCantidadActual().setText(producto.getCantidadEnStock() + "");
        this.frameActualizar.getUnidadesPorLote().setText(producto.getUnidadesPorLote() + "");

        this.frameActualizar.getBtnActualizar().addActionListener(this);
        this.frameActualizar.getTipoActualzacion().addActionListener(this);

        this.frameActualizar.getPorLotePane().setVisible(true);
        this.frameActualizar.getPorCantidadEspecifica().setVisible(false);

        try {
            frameActualizar.setMaximum(true);
        } catch (PropertyVetoException ex) {
            // Silenciado
        }

        this.frameActualizar.setVisible(true);
    }

    /**
     * Captura eventos de la interfaz, como el tipo de actualización y el botón de acción.
     * 
     * @param e evento generado en la interfaz
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(frameActualizar.getTipoActualzacion())) {
            accionTipoActualizacion();
        }
        if (e.getSource().equals(frameActualizar.getBtnActualizar())) {
            accionActualizar();
        }
    }

    /**
     * Muestra u oculta los paneles de lote o cantidad específica según la selección del usuario.
     */
    private void accionTipoActualizacion() {
        switch (frameActualizar.getTipoActualzacion().getSelectedIndex()) {
            case 0 -> {
                this.frameActualizar.getPorLotePane().setVisible(true);
                this.frameActualizar.getPorCantidadEspecifica().setVisible(false);
            }
            case 1 -> {
                this.frameActualizar.getPorLotePane().setVisible(false);
                this.frameActualizar.getPorCantidadEspecifica().setVisible(true);
            }
        }
    }

    /**
     * Realiza la actualización del stock del producto, validando la entrada y guardando los cambios.
     */
    private void accionActualizar() {
        try {
            if ((frameActualizar.getTipoActualzacion().getSelectedIndex() == 0
                    && frameActualizar.getLotesAgregados().getText().isBlank())
                    || (frameActualizar.getTipoActualzacion().getSelectedIndex() == 1
                    && frameActualizar.getUnidadesAgregadas().getText().isBlank())) {
                throw new InformacionIncompletaException("informacion ingresada incompleta");
            }

            if (frameActualizar.getTipoActualzacion().getSelectedIndex() == 0) {
                producto.setUnidadesEnStock(producto.getUnidadesPorLote()
                        * Double.valueOf(frameActualizar.getLotesAgregados().getText()));
            } else {
                producto.setUnidadesEnStock(producto.getUnidadesPorLote()
                        + Double.valueOf(frameActualizar.getUnidadesAgregadas().getText()));
            }

            Config.productoRepositorio.editar(producto);
            FrameUtils.limpiarFormulario(frameActualizar);
            frameActualizar.setVisible(false);
        } catch (InformacionIncompletaException e) {
            JOptionPane.showMessageDialog(frameActualizar, "Error: " + e.getMessage(),
                    "Error", JOptionPane.ERROR_MESSAGE);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(frameActualizar,
                    "Error: uno de los datos numéricos es inválido.\n" + e.getMessage(),
                    "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}
