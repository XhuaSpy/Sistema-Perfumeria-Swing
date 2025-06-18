package com.perfumeria.controlador.producto;

import com.perfumeria.configuracion.Config;
import com.perfumeria.modelo.exceptions.InformacionIncompletaException;
import com.perfumeria.modelo.producto.CategoriaProducto;
import com.perfumeria.modelo.producto.Producto;
import com.perfumeria.modelo.producto.TipoProducto;
import com.perfumeria.utilidades.FrameUtils;
import com.perfumeria.vista.producto.IFrameCargarProducto;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.PropertyVetoException;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 * Controlador que gestiona la carga de nuevos productos desde el formulario.
 * Valida y registra productos tipo aroma o envase en el repositorio.
 * 
 * @author Jesus Peraza Royero
 */
public class CargarProductoControlador implements ActionListener {

    /**
     * Vista del formulario de carga de productos.
     */
    private final IFrameCargarProducto frameCargarProducto;

    /**
     * Constructor por defecto. Crea una nueva instancia del formulario.
     */
    public CargarProductoControlador() {
        this.frameCargarProducto = new IFrameCargarProducto();
    }

    /**
     * Constructor que recibe una instancia del formulario ya creada.
     * 
     * @param frameProducto formulario de carga de productos
     */
    public CargarProductoControlador(IFrameCargarProducto frameProducto) {
        this.frameCargarProducto = frameProducto;
    }

    /**
     * Inicializa el formulario, asigna eventos y muestra la interfaz.
     */
    public void iniciar() {
        this.frameCargarProducto.setTitle("Login");
        this.frameCargarProducto.setClosable(true);
        this.frameCargarProducto.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.frameCargarProducto.getTipoProducto().addActionListener(this);
        this.frameCargarProducto.getBtnCargar().addActionListener(this);

        this.frameCargarProducto.getAromaPane().setVisible(false);
        this.frameCargarProducto.getEnvasePane().setVisible(false);

        try {
            frameCargarProducto.setMaximum(true);
        } catch (PropertyVetoException ex) {
            // Silenciado
        }

        this.frameCargarProducto.setVisible(true);
    }

    /**
     * Maneja los eventos del formulario, como selección de tipo y botón de carga.
     * 
     * @param e evento capturado
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(frameCargarProducto.getTipoProducto())) {
            accionTipoProducto();
        }
        if (e.getSource().equals(frameCargarProducto.getBtnCargar())) {
            accionCargar();
        }
    }

    /**
     * Muestra el panel correspondiente según el tipo de producto seleccionado.
     */
    private void accionTipoProducto() {
        switch (frameCargarProducto.getTipoProducto().getSelectedIndex()) {
            case 0 -> {
                this.frameCargarProducto.getAromaPane().setVisible(true);
                this.frameCargarProducto.getEnvasePane().setVisible(false);
            }
            case 1 -> {
                this.frameCargarProducto.getAromaPane().setVisible(false);
                this.frameCargarProducto.getEnvasePane().setVisible(true);
            }
        }
    }

    /**
     * Valida los datos del formulario y crea un nuevo producto en el repositorio.
     * Muestra errores si hay datos faltantes o inválidos.
     */
    private void accionCargar() {
        try {
            if (frameCargarProducto.getNombre().getText().isBlank()
                    || frameCargarProducto.getDescripcion().getText().isBlank()
                    || frameCargarProducto.getPrecio().getText().isBlank()
                    || frameCargarProducto.getCodigo().getText().isBlank()
                    || (frameCargarProducto.getTipoProducto().getSelectedIndex() == 0
                    && frameCargarProducto.getMililitros().getText().isBlank())
                    || (frameCargarProducto.getTipoProducto().getSelectedIndex() == 1
                    && frameCargarProducto.getCapacidadEnvase().getText().isBlank())) {
                throw new InformacionIncompletaException("informacion ingresada incompleta");
            }

            Producto p = new Producto(
                    0,
                    frameCargarProducto.getCodigo().getText(),
                    frameCargarProducto.getNombre().getText(),
                    frameCargarProducto.getDescripcion().getText(),
                    TipoProducto.getTipo(frameCargarProducto.getTipoProducto().getSelectedIndex()),
                    CategoriaProducto.getCategoria(frameCargarProducto.getCategoria().getSelectedIndex()),
                    Double.valueOf(frameCargarProducto.getPrecio().getText())
            );

            if (p.getTipo() == TipoProducto.AROMA) {
                p.setUnidadesEnStock(Double.valueOf(frameCargarProducto.getMililitros().getText()));
            } else {
                p.setUnidadesEnStock(Double.valueOf(frameCargarProducto.getUnidadesPorLote().getText()));
                p.setCapacidadEnvase(Double.valueOf(frameCargarProducto.getCapacidadEnvase().getText()));
            }

            Config.productoRepositorio.crear(p);
            FrameUtils.limpiarFormulario(frameCargarProducto);
            frameCargarProducto.setVisible(false);
        } catch (InformacionIncompletaException e) {
            JOptionPane.showMessageDialog(frameCargarProducto, "Error: " + e.getMessage(),
                    "Error", JOptionPane.ERROR_MESSAGE);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(frameCargarProducto,
                    "Error: uno de los datos numéricos es inválido.\n" + e.getMessage(),
                    "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}
