package com.perfumeria.repositorio.sqlite;

import com.perfumeria.modelo.CategoriaProducto;
import com.perfumeria.modelo.Producto;
import com.perfumeria.modelo.TipoProducto;
import com.perfumeria.repositorio.Repositorio;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collection;

/**
 * Implementación en memoria del repositorio para objetos de tipo Producto.
 * Utiliza una lista para almacenar y manipular productos sin persistencia
 * externa.
 *
 * @author Jesus David Peraza
 */
public class ProductoSqliteRepositorio implements Repositorio<Producto> {

    private Connection getConeccion() {
        return SqliteConector.getInstancia();
    }

    /**
     * Retorna todos los productos almacenados en el repositorio.
     *
     * @return colección de productos existentes.
     */
    @Override
    public Collection<Producto> listar() {

        String sql = "SELECT * FROM productos";
        ArrayList<Producto> productos = new ArrayList<>();

        try (Statement stmt = getConeccion().createStatement(); ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                productos.add(new Producto(
                        rs.getInt("id_producto"),
                        rs.getString("nombre"),
                        rs.getString("descripcion"),
                        rs.getDouble("precio"),
                        TipoProducto.getTipo(rs.getString("tipo")),
                        CategoriaProducto.getCategoria(rs.getString("categoria")),
                        rs.getDouble("cantidad_disponible"),
                        rs.getDouble("cantidad_por_lote"),
                        rs.getDouble("capacidad_envase"))
                );
            }
        } catch (SQLException ex) {
            System.err.println("Error al listar productos: " + ex.getMessage());
        }

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
        String sql = "SELECT * FROM productos WHERE id_producto = ?";
        Producto producto = null;

        try {
            PreparedStatement stmt;
            stmt = getConeccion().prepareStatement(sql);
            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                producto = new Producto(
                        rs.getInt("id_producto"),
                        rs.getString("nombre"),
                        rs.getString("descripcion"),
                        rs.getDouble("precio"),
                        TipoProducto.getTipo(rs.getString("tipo")),
                        CategoriaProducto.getCategoria(rs.getString("categoria")),
                        rs.getDouble("cantidad_disponible"),
                        rs.getDouble("cantidad_por_lote"),
                        rs.getDouble("capacidad_envase")
                );
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return producto;
    }

    /**
     * Agrega un nuevo producto al repositorio.
     *
     * @param producto Objeto producto a agregar.
     */
    @Override
    public final void crear(Producto producto) {
        String sql = "INSERT INTO productos ("
                + "id_producto, nombre, descripcion, precio, tipo, categoria,"
                + "cantidad_disponible, cantidad_por_lote, capacidad_envase"
                + ") VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?);";

        try (PreparedStatement stmt = getConeccion().prepareStatement(sql)) {
            stmt.setInt(1, producto.getId());
            stmt.setString(2, producto.getNombre());
            stmt.setString(3, producto.getDescripcion());
            stmt.setDouble(4, producto.getPrecio());
            stmt.setString(5, producto.getTipo().toString());
            stmt.setString(6, producto.getCategoria().toString());
            stmt.setDouble(7, producto.getCantidadEnStock());
            stmt.setDouble(8, producto.getUnidadesPorLote());
            stmt.setDouble(9, producto.getCapacidadEnvase());

            stmt.executeUpdate();
        } catch (SQLException ex) {
            System.err.println("Error al insertar producto: " + ex.getMessage());
        }
    }

    /**
     * Actualiza un producto existente en la base de datos si su ID coincide.
     *
     * @param producto producto con los datos actualizados.
     */
    @Override
    public void editar(Producto producto) {
        String sql = "UPDATE productos SET "
                + "nombre = ?, "
                + "descripcion = ?, "
                + "precio = ?, "
                + "tipo = ?, "
                + "categoria = ?, "
                + "cantidad_disponible = ?, "
                + "cantidad_por_lote = ?, "
                + "capacidad_envase = ? "
                + "WHERE id_producto = ?;";

        try (PreparedStatement stmt = getConeccion().prepareStatement(sql)) {
            stmt.setString(1, producto.getNombre());
            stmt.setString(2, producto.getDescripcion());
            stmt.setDouble(3, producto.getPrecio());
            stmt.setString(4, producto.getTipo().toString());
            stmt.setString(5, producto.getCategoria().toString());
            stmt.setDouble(6, producto.getCantidadEnStock());
            stmt.setDouble(7, producto.getUnidadesPorLote());
            stmt.setDouble(8, producto.getCapacidadEnvase());
            stmt.setInt(9, producto.getId()); // Aquí actualizamos por ID

            stmt.executeUpdate();

        } catch (SQLException ex) {
            System.err.println("Error al actualizar el producto: " + ex.getMessage());
        }
    }

    /**
     * Elimina un producto de la base de datos según su ID.
     *
     * @param id identificador del producto a eliminar.
     */
    @Override
    public void eliminar(Integer id) {
        String sql = "DELETE FROM productos WHERE id_producto = ?;";

        try (PreparedStatement stmt = getConeccion().prepareStatement(sql)) {
            stmt.setInt(1, id);

            int filasAfectadas = stmt.executeUpdate();
            if (filasAfectadas == 0) {
                System.out.println("No se encontró ningún producto con el ID: " + id);
            } else {
                System.out.println("Producto con ID " + id + " eliminado exitosamente.");
            }
        } catch (SQLException ex) {
            System.err.println("Error al eliminar el producto: " + ex.getMessage());
        }
    }

}
