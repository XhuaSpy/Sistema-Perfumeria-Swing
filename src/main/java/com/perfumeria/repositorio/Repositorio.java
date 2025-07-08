package com.perfumeria.repositorio;

import java.util.Collection;

/**
 * Interfaz genérica Repositorio que define operaciones básicas para la gestión
 * de datos persistentes.
 *
 * Modela una base para los repositorios facilitando la abstrabción de clases y
 * entidades, ayudando en una correcta implementación de las practicas DAO
 *
 * @param <T> tipo de objeto a manejar en el repositorio
 *
 * @author coffeshell
 */
public interface Repositorio<T> {

    /**
     * Retorna una colección con todos los elementos del repositorio.
     *
     * @return colección de elementos
     */
    Collection<T> listar();

    /**
     * Busca un elemento por su identificador único.
     *
     * @param id identificador del objeto
     * @return objeto correspondiente o null si no existe
     */
    T buscarPorId(Integer id);

    /**
     * Crea un nuevo registro en el repositorio.
     *
     * @param repo objeto a almacenar
     */
    void crear(T repo);

    /**
     * Edita un objeto existente.
     *
     * @param repo objeto actualizado
     */
    void editar(T repo);

    /**
     * Elimina un objeto del repositorio según su identificador.
     *
     * @param id identificador del objeto
     */
    void eliminar(Integer id);
}
