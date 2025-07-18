package com.perfumeria.modelo;

/**
 * Clase que representa un producto dentro del sistema de perfumería. Contiene
 * información como código, nombre, precio, descripción, tipo, categoría,
 * estado, cantidad en stock, unidades por lote y capacidad del envase.
 *
 * @author Jesus David Peraza
 */
public class Producto {

    /**
     * Identificador único del producto.
     */
    private Integer id;

    /**
     * Código interno del producto.
     */
    private String codigoProducto;

    /**
     * Nombre del producto.
     */
    private String nombre;

    /**
     * Precio de venta del producto.
     */
    private Double precio;

    /**
     * Descripción general del producto.
     */
    private String descripcion;

    /**
     * Tipo de producto (por ejemplo, Aroma o Envase).
     */
    private TipoProducto tipo;

    /**
     * Categoría asignada al producto.
     */
    private CategoriaProducto categoria;

    /**
     * Estado actual del producto (activo, sin stock, etc.).
     */
    private EstadoProducto estado;

    /**
     * Cantidad disponible en inventario.
     */
    private Double cantidadEnStock;

    /**
     * Número de unidades por lote.
     */
    private Double unidadesPorLote;

    /**
     * Capacidad del envase en mililitros.
     */
    private Double capacidadEnvase;

    /**
     * Constructor por defecto. Inicializa los atributos con valores vacíos o
     * cero.
     */
    public Producto() {
        this.id = 0;
        this.codigoProducto = "";
        this.nombre = "";
        this.precio = 0D;
        this.descripcion = "";
        this.tipo = null;
        this.categoria = null;
        this.estado = null;
        this.cantidadEnStock = 0D;
        this.capacidadEnvase = 0D;
    }

    /**
     * Constructor que permite crear un producto con datos básicos.
     *
     * @param codigoProducto código del producto
     * @param nombre nombre del producto
     * @param descripcion descripción del producto
     * @param tipo tipo del producto
     * @param categoria categoría del producto
     * @param unidades
     * @param precio precio del producto
     */
    public Producto(String nombre, String descripcion, TipoProducto tipo, 
            CategoriaProducto categoria, Double precio, Double unidades) {
        this.id = 0;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.tipo = tipo;
        this.categoria = categoria;
        this.precio = precio;
        this.unidadesPorLote = unidades;
        this.estado = null;
        this.cantidadEnStock = 0D;
        this.capacidadEnvase = 0D;
    }

    /**
     * Constructor que incluye identificador y datos básicos.
     *
     * @param id identificador del producto
     * @param codigoProducto código del producto
     * @param nombre nombre del producto
     * @param descripcion descripción del producto
     * @param tipo tipo del producto
     * @param categoria categoría del producto
     * @param precio precio del producto
     */
    public Producto(int id, String nombre, String descripcion, TipoProducto tipo, 
            CategoriaProducto categoria, Double precio) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.tipo = tipo;
        this.categoria = categoria;
        this.precio = precio;
        this.estado = null;
        this.cantidadEnStock = 0D;
        this.capacidadEnvase = 0D;
    }

    /**
     * Constructor completo que inicializa todos los atributos del producto.
     *
     * @param id identificador
     * @param codigoProducto código del producto
     * @param nombre nombre del producto
     * @param precio precio del producto
     * @param descripcion descripción del producto
     * @param tipo tipo del producto
     * @param categoria categoría del producto
     * @param estado estado del producto
     * @param cantidadEnStock cantidad disponible
     * @param unidadesPorLote unidades por lote
     * @param capacidadEnvase capacidad del envase
     */
    public Producto(Integer id, String nombre, String descripcion, Double precio,
            TipoProducto tipo, CategoriaProducto categoria,Double cantidadEnStock,
            Double unidadesPorLote) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
        this.tipo = tipo;
        this.categoria = categoria;
        this.cantidadEnStock = cantidadEnStock;
        this.unidadesPorLote = unidadesPorLote;
    }

    /* Constructor completo que inicializa todos los atributos del producto.
     *
     * @param id identificador
     * @param codigoProducto código del producto
     * @param nombre nombre del producto
     * @param precio precio del producto
     * @param descripcion descripción del producto
     * @param tipo tipo del producto
     * @param categoria categoría del producto
     * @param estado estado del producto
     * @param cantidadEnStock cantidad disponible
     * @param unidadesPorLote unidades por lote
     * @param capacidadEnvase capacidad del envase
     */
    public Producto(Integer id, String nombre, String descripcion, Double precio,
            TipoProducto tipo, CategoriaProducto categoria,Double cantidadEnStock,
            Double unidadesPorLote, Double capacidadEnvase) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
        this.tipo = tipo;
        this.categoria = categoria;
        this.cantidadEnStock = cantidadEnStock;
        this.unidadesPorLote = unidadesPorLote;
        this.capacidadEnvase = capacidadEnvase;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public TipoProducto getTipo() {
        return tipo;
    }

    public void setTipo(TipoProducto tipo) {
        this.tipo = tipo;
    }

    public CategoriaProducto getCategoria() {
        return categoria;
    }

    public void setCategoria(CategoriaProducto categoria) {
        this.categoria = categoria;
    }

    public EstadoProducto getEstado() {
        return estado;
    }

    public void setEstado(EstadoProducto estado) {
        this.estado = estado;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public Double getCantidadEnStock() {
        return cantidadEnStock;
    }

    public void setUnidadesEnStock(Double cantidadEnStock) {
        this.cantidadEnStock = cantidadEnStock;
    }

    public Double getUnidadesPorLote() {
        return unidadesPorLote;
    }

    public void setCantidadPorLote(Double cantidadPorLote) {
        this.unidadesPorLote = cantidadPorLote;
    }

    public Double getCapacidadEnvase() {
        return capacidadEnvase;
    }

    public void setCapacidadEnvase(Double capacidadEnvase) {
        this.capacidadEnvase = capacidadEnvase;
    }
}
