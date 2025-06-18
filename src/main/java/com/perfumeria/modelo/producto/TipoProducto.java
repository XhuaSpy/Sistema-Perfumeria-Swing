package com.perfumeria.modelo.producto;

import java.util.ArrayList;

/**
 * Enumeración que representa el tipo de producto en el sistema.
 * 
 * Los tipos disponibles son:
 * - AROMA: productos con fragancia o esencia
 * - ENVASE: recipientes o frascos para envasar productos
 * 
 * @author Jesus David Peraza
 */
public enum TipoProducto {
    AROMA("Aroma"),
    ENVASE("Envase");

    /**
     * Nombre legible del tipo de producto.
     */
    final String tipoProducto;

    /**
     * Constructor que asigna el nombre al tipo de producto.
     * 
     * @param categoria nombre del tipo.
     */
    private TipoProducto(String categoria) {
        this.tipoProducto = categoria;
    }

    /**
     * Devuelve el nombre del tipo de producto como texto.
     * 
     * @return nombre del tipo de producto.
     */
    @Override
    public String toString() {
        return tipoProducto;
    }

    /**
     * Busca el tipo de producto según su nombre.
     * 
     * @param nombre nombre del tipo.
     * @return tipo de producto correspondiente o null si no se encuentra.
     */
    public static TipoProducto getTipo(String nombre) {
        for (TipoProducto tipo : TipoProducto.values()) {
            if (tipo.tipoProducto.equals(nombre)) {
                return tipo;
            }
        }
        return null;
    }

    /**
     * Obtiene el tipo de producto según su posición en la enumeración.
     * 
     * @param tipo índice del tipo.
     * @return tipo de producto correspondiente.
     */
    public static TipoProducto getTipo(int tipo) {
        return TipoProducto.values()[tipo];
    }

    /**
     * Devuelve un arreglo con los nombres de todos los tipos de producto.
     * 
     * @return arreglo de nombres de tipos.
     */
    public static String[] nombres() {
        ArrayList<String> nombres = new ArrayList<>();

        for (TipoProducto tipo : TipoProducto.values()) {
            nombres.add(tipo.toString());
        }

        return nombres.toArray(String[]::new);
    }
}
