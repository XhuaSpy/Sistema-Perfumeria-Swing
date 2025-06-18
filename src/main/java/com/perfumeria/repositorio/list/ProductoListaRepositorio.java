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
        crear(new Producto(1L, "A001", "Lavanda", 150000D, "Aroma floral relajante", TipoProducto.AROMA, CategoriaProducto.AAA, EstadoProducto.ACTIVO, 0D, 250D, 0D));
        crear(new Producto(2L, "E001", "Botella 100ml", 3000D, "Envase de vidrio con tapa", TipoProducto.ENVASE, CategoriaProducto.GENERICO, EstadoProducto.ACTIVO, 0D, 10D, 100D));
        crear(new Producto(3L, "A002", "Vainilla", 30000D, "Aroma dulce clásico", TipoProducto.AROMA, CategoriaProducto.AA, EstadoProducto.ACTIVO, 0D, 250D, 190D));
        crear(new Producto(4L, "E002", "Frasco plástico 250ml", 20000D, "Envase económico y resistente", TipoProducto.ENVASE, CategoriaProducto.A, EstadoProducto.ACTIVO, 0D, 15D, 150D));
        crear(new Producto(5L, "A003", "Cítrico", 40000D, "Aroma refrescante y energético", TipoProducto.AROMA, CategoriaProducto.A, EstadoProducto.ACTIVO, 0D, 250D, 0D));
        crear(new Producto(6L, "B984", "Mini Frasco", 4000D, "", TipoProducto.ENVASE, CategoriaProducto.A, EstadoProducto.ACTIVO, 0D, 20D, 200D));
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
    public Producto buscarPorId(Long id) {
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
     * Método no implementado para editar un producto por su ID.
     * 
     * @param id identificador del producto a editar.
     */
    @Override
    public void editarPorId(Long id) {
    }

    /**
     * Método no implementado para eliminar un producto por su ID.
     * 
     * @param id identificador del producto a eliminar.
     */
    @Override
    public void eliminar(Long id) {
    }
}
