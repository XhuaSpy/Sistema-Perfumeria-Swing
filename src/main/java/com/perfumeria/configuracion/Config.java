package com.perfumeria.configuracion;

import com.perfumeria.modelo.Usuario;
import com.perfumeria.modelo.producto.Producto;
import com.perfumeria.repositorio.Repositorio;
import com.perfumeria.repositorio.list.ProductoListaRepositorio;
import com.perfumeria.repositorio.list.UsuarioListaRepositorio;

/**
 * Ésta clase pretende ser una clase donde se acceda a las configuraciones
 * principales de la aplicación, como la inicialización de acceso a la base de
 * datos.
 *
 * @author Jesus David Peraza
 */
public class Config {

    /**
     * Repositorio estático que permite el acceso y manipulación de los datos del modelo Usuario.
     */
    public static Repositorio<Usuario> usuarioRepositorio;

    /**
     * Repositorio estático que permite el acceso y manipulación de los datos del modelo Producto.
     */
    public static Repositorio<Producto> productoRepositorio;

    static {
        Config.usuarioRepositorio = new UsuarioListaRepositorio();
        Config.productoRepositorio = new ProductoListaRepositorio();
    }
}
