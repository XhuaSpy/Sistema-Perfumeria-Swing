package com.perfumeria.modelo;

import com.perfumeria.modelo.Producto;
import java.util.ArrayList;

/**
 *
 * @author coffeshell
 */
public class Venta {
    
    private Integer id;
    private String fecha;
    private Double cantidad;
    private TipoVenta tipo;

    private ArrayList<Producto> productos;
    
    public Venta() {
    }

    public Venta(Integer id, String fecha, Double cantidad, TipoVenta tipo) {
        this.id = id;
        this.fecha = fecha;
        this.cantidad = cantidad;
        this.tipo = tipo;
    }

    public void addProducto(Producto p) {
        this.productos.add(p);
    }
    
    public ArrayList<Producto> getProductos() {
        return productos;
    }

    public void setProductos(ArrayList<Producto> productos) {
        this.productos = productos;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public Double getCantidad() {
        return cantidad;
    }

    public void setCantidad(Double cantidad) {
        this.cantidad = cantidad;
    }

    public TipoVenta getTipo() {
        return tipo;
    }

    public void setTipo(TipoVenta tipo) {
        this.tipo = tipo;
    }
}
