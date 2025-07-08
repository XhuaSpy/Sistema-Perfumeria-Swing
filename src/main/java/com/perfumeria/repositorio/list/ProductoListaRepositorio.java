package com.perfumeria.repositorio.list;

import com.perfumeria.modelo.producto.CategoriaProducto;
import com.perfumeria.modelo.producto.EstadoProducto;
import com.perfumeria.modelo.producto.Producto;
import com.perfumeria.modelo.producto.TipoProducto;
import com.perfumeria.repositorio.Repositorio;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * Implementación en memoria del repositorio para objetos de tipo Producto.
 * Utiliza una lista para almacenar y manipular productos sin persistencia externa.
 * 
 * @author Jesus David Peraza
 */
public class ProductoListaRepositorio implements Repositorio<Producto> {

    /**
     * Lista que almacena los productos en memoria.
     */
    private final List<Producto> productos;

    /**
     * Constructor que inicializa el repositorio con una lista de productos precargados.
     */
    public ProductoListaRepositorio() {
        productos = new ArrayList<>();
        crear(new Producto(1, "Lavanda", "Aroma floral relajante", 150000D, TipoProducto.AROMA, CategoriaProducto.AAA, 0D, 250D, 0D));
        crear(new Producto(2, "Botella 100ml", "Envase de vidrio con tapa", 3000D, TipoProducto.ENVASE, CategoriaProducto.GENERICO, 0D, 10D, 100D));
        crear(new Producto(3, "Vainilla", "Aroma dulce clásico", 30000D, TipoProducto.AROMA, CategoriaProducto.AA, 0D, 250D, 190D));
        crear(new Producto(4, "Frasco plástico 250ml", "Envase económico y resistente", 20000D, TipoProducto.ENVASE, CategoriaProducto.A, 0D, 15D, 150D));
        crear(new Producto(5, "Cítrico", "Aroma refrescante y energético", 40000D, TipoProducto.AROMA, CategoriaProducto.A, 0D, 250D, 0D));
        crear(new Producto(6, "Mini Frasco", "uwu", 4000D, TipoProducto.ENVASE, CategoriaProducto.A, 0D, 20D, 200D));
    }

    /**
     * Retorna todos los productos almacenados en el repositorio.
     * 
     * @return colección de productos existentes.
     */
    @Override
    public Collection<Producto> listar() {
        return productos;
    }

    /**
     * Busca un producto por su identificador único.
     * 
     * @param id identificador del producto.
     * @return el producto encontrado o null si no existe.
     */
    @Override
    public Producto buscarPorId(Integer id) {
        if (id == null) {
            return null;
        }

        for (Producto p : productos) {
            if (p.getId().equals(id)) {
                return p;
            }
        }

        return null;
    }

    /**
     * Agrega un nuevo producto al repositorio.
     * 
     * @param repo objeto producto a agregar.
     */
    @Override
    public final void crear(Producto repo) {
        productos.add(repo);
    }

    /**
     * Actualiza un producto existente en la lista si su ID coincide.
     * 
     * @param repo producto con los datos actualizados.
     */
    @Override
    public void editar(Producto repo) {
        if (repo.getId() == null)
            return;
        
        Producto productoActualizado = buscarPorId(repo.getId());
        
        if (productoActualizado == null)
            return;
        
        productoActualizado = repo;
    }

    /**
     * Método no implementado para eliminar un producto por su ID.
     * 
     * @param id identificador del producto a eliminar.
     */
    @Override
    public void eliminar(Integer id) {
    }
}
