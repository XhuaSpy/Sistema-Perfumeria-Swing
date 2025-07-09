package com.perfumeria.modelo;

import java.util.ArrayList;

/**
 * Enumeración que representa las distintas categorías que puede tener un producto.
 * Las categorías indican la calidad o clasificación del producto dentro del sistema.
 * 
 * Categorías disponibles: AAA, AA, A, Generico.
 * 
 * @author Jesus David Peraza
 */
public enum CategoriaProducto {
    AAA("AAA"),
    AA("AA"),
    A("A"),
    GENERICO("Generico");

    /**
     * Nombre legible de la categoría.
     */
    final String categoria;

    /**
     * Constructor que asigna el nombre legible a la categoría.
     * 
     * @param categoria nombre de la categoría.
     */
    private CategoriaProducto(String categoria) {
        this.categoria = categoria;
    }

    /**
     * Retorna el nombre de la categoría como cadena de texto.
     * 
     * @return representación en texto de la categoría.
     */
    @Override
    public String toString() {
        return categoria;
    }

    /**
     * Obtiene la categoría correspondiente a un nombre.
     * 
     * @param nombre nombre exacto de la categoría.
     * @return la categoría correspondiente o null si no se encuentra.
     */
    public static CategoriaProducto getCategoria(String nombre) {
        for (CategoriaProducto categoriaProducto : CategoriaProducto.values()) {
            if (categoriaProducto.categoria.equals(nombre)) {
                return categoriaProducto;
            }
        }
        return null;
    }

    /**
     * Obtiene la categoría según su posición ordinal en el enum.
     * 
     * @param categoria índice numérico de la categoría.
     * @return la categoría correspondiente.
     */
    public static CategoriaProducto getCategoria(int categoria) {
        return CategoriaProducto.values()[categoria];
    }

    /**
     * Devuelve un arreglo con los nombres de todas las categorías disponibles.
     * 
     * @return arreglo de nombres de categorías.
     */
    public static String[] nombres() {
        ArrayList<String> nombres = new ArrayList<>();

        for (CategoriaProducto categoriaProducto : CategoriaProducto.values()) {
            nombres.add(categoriaProducto.toString());
        }

        return nombres.toArray(String[]::new);
    }
}
