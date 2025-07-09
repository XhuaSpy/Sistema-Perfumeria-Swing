package com.perfumeria.configuracion;

import com.perfumeria.modelo.producto.Producto;
import com.perfumeria.modelo.venta.Venta;
import com.perfumeria.repositorio.Repositorio;
import com.perfumeria.repositorio.sqlite.ProductoSqliteRepositorio;
import com.perfumeria.repositorio.sqlite.VentasSqliteRepositorio;

/**
 * Ésta clase pretende ser una clase donde se acceda a las configuraciones
 * principales de la aplicación, como la inicialización de acceso a la base de
 * datos.
 *
 * @author Jesus David Peraza
 */
public class Config {

    /**
     * Repositorio estático que permite el acceso y manipulación de los datos del modelo Producto.
     */
    public static Repositorio<Producto> productoRepositorio;
    public static Repositorio<Venta> ventaRepositorio;

    static {
        //Config.productoRepositorio = new ProductoListaRepositorio();
        Config.productoRepositorio = new ProductoSqliteRepositorio();
        Config.ventaRepositorio = new VentasSqliteRepositorio();
    }
}
