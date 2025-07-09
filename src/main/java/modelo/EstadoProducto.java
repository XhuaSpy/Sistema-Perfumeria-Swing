package com.perfumeria.modelo.producto;

/**
 * Enumeración que representa el estado de disponibilidad de un producto.
 * 
 * Los estados posibles son:
 * - SIN_STOCK: el producto no tiene unidades disponibles
 * - POR_ACABAR: el producto está próximo a agotarse
 * - ACTIVO: el producto se encuentra disponible normalmente
 * 
 * @author Jesus David Peraza
 */
public enum EstadoProducto {
    SIN_STOCK,
    POR_ACABAR,
    ACTIVO
}
