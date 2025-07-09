package com.perfumeria;

import com.perfumeria.controlador.PrincipalControlador;
import com.perfumeria.repositorio.sqlite.SqliteConector;

/**
 * Clase principal del sistema de gestión de perfumería.
 * 
 * Permite iniciar la ejecución del programa mediante la clase controladora principal.
 * 
 * @author Jesus David Peraza
 */
public class Perfumeria {

    /**
     * Método principal que lanza la aplicación.
     * Crea una instancia del controlador principal y ejecuta su método iniciar().
     * 
     * @param args Argumentos de línea de comandos (no utilizados).
     */
    public static void main(String[] args) {
        new PrincipalControlador().iniciar();
    }
}
