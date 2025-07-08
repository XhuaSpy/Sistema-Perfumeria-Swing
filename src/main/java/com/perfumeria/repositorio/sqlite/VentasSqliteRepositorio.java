package com.perfumeria.repositorio.sqlite;

import com.perfumeria.modelo.producto.CategoriaProducto;
import com.perfumeria.modelo.producto.Producto;
import com.perfumeria.modelo.producto.TipoProducto;
import com.perfumeria.modelo.venta.TipoVenta;
import com.perfumeria.repositorio.Repositorio;
import com.perfumeria.modelo.venta.Venta;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collection;

/**
 *
 * @author Jesus Peraza
 */
public class VentasSqliteRepositorio implements Repositorio<Venta> {

    private Connection getConeccion() {
        return SqliteConector.getInstancia();
    }

    @Override
    public Collection<Venta> listar() {

        String sqlVentas = "SELECT * FROM ventas";
        ArrayList<Venta> ventas = new ArrayList<>();

        try (Statement stmt = getConeccion().createStatement(); ResultSet rs = stmt.executeQuery(sqlVentas)) {
            Venta venta;

            while (rs.next()) {
                venta = null;

                venta = new Venta(
                        rs.getInt("id_venta"),
                        rs.getString("fecha_venta"),
                        rs.getDouble("monto"),
                        TipoVenta.VENTA_COMPLETA
                );

                ventas.add(venta);
            }
        } catch (SQLException ex) {
            System.err.println("Error al listar productos: " + ex.getMessage());
        }

        return ventas;
    }

    @Override
    public Venta buscarPorId(Integer id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void crear(Venta repo) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void editar(Venta repo) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void eliminar(Integer id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
