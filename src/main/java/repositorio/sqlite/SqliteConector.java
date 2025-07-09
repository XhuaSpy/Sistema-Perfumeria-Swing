package com.perfumeria.repositorio.sqlite;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SqliteConector {

    // Ruta a la base de datos SQLite
    private static final String url = "jdbc:sqlite:db/perfumeria.db"; // Ajusta el nombre si usas otro
    private static Connection connection;

    public static Connection getInstancia() {
        if (connection == null) {
            try {
                connection = DriverManager.getConnection(url);
                System.out.println("Conexión a SQLite establecida.");
                System.out.println("Objeto conexión: " + connection);
            } catch (SQLException e) {
                System.out.println("Error al conectar con la base de datos: " + e.getMessage());
            }
        }
        return connection;
    }

}
