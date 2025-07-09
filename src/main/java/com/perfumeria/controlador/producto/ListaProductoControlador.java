package com.perfumeria.controlador.producto;

import com.perfumeria.configuracion.Config;
import com.perfumeria.controlador.navegacion.NavegadorProducto;
import com.perfumeria.modelo.Producto;
import com.perfumeria.vista.producto.IFrameListaProducto;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.PropertyVetoException;
import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;

/**
 * Controlador para la interfaz que lista los productos.
 * Permite recargar la tabla y acceder al formulario para agregar un nuevo producto.
 * 
 * Autor: Jesus Peraza Royero
 */
public class ListaProductoControlador implements ActionListener {

    /**
     * Vista interna que muestra la lista de productos.
     */
    private final IFrameListaProducto frameListaProducto;

    /**
     * Navegador que permite abrir otras vistas relacionadas con productos.
     */
    private NavegadorProducto navegadorProducto;

    /**
     * Constructor por defecto. Crea la vista sin interacción con otras.
     */
    public ListaProductoControlador() {
        frameListaProducto = new IFrameListaProducto();
    }

    /**
     * Constructor que recibe la vista de lista y un navegador para cambiar de vistas.
     * 
     * @param frameListaProducto instancia de la vista lista de productos
     * @param navegadorProducto manejador de navegación
     */
    public ListaProductoControlador(IFrameListaProducto frameListaProducto, NavegadorProducto navegadorProducto) {
        this.frameListaProducto = frameListaProducto;
        this.navegadorProducto = navegadorProducto;
    }

    /**
     * Inicializa y muestra la vista de lista de productos.
     * También configura los eventos asociados a los botones.
     */
    public void iniciar() {
        this.frameListaProducto.setTitle("Lita Producto");
        this.frameListaProducto.setClosable(true);
        this.frameListaProducto.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.frameListaProducto.getBtnAgregarProducto().addActionListener(this);
        this.frameListaProducto.getBtnRecargar().addActionListener(this);

        try {
            frameListaProducto.setMaximum(true);
        } catch (PropertyVetoException ex) {
            // Silenciado
        }

        this.frameListaProducto.setVisible(true);
    }

    /**
     * Maneja los eventos de la vista: recarga de datos y apertura del formulario de carga.
     * 
     * @param e evento de acción capturado
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(frameListaProducto.getBtnRecargar())) {
            accionRacargar();
        }

        if (e.getSource().equals(frameListaProducto.getBtnAgregarProducto())) {
            navegadorProducto.abrirCargarProducto();
        }
    }

    /**
     * Recarga la tabla de productos desde el repositorio.
     */
    private void accionRacargar() {
        DefaultTableModel plantilla = (DefaultTableModel) frameListaProducto.getProductosTabla().getModel();

        plantilla.setRowCount(0); // Limpia la tabla

        for (Producto producto : Config.productoRepositorio.listar()) {

            Object[] datos = {
                producto.getId(),
                producto.getCategoria().toString(),
                producto.getNombre(),
                producto.getTipo().toString(),
                producto.getCategoria().toString(),
                producto.getPrecio().toString(),
                0 // Columna adicional reservada (puede representar stock o selección)
            };

            plantilla.addRow(datos);
        }
    }
}
