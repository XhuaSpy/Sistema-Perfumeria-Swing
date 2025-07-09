package com.perfumeria.modelo.exceptions;

/**
 * Excepción que surge cuando el usuario no ingresa la información pedida.
 * @author Jesus Peraza Royero
 */
public class InformacionIncompletaException extends RuntimeException {
    /**
     * Construye una instancia de <code>InformacionIncompletaException</code>
     * con el mensaje especificado.
     *
     * @param msg the detail message.
     */
    public InformacionIncompletaException(String msg) {
        super(msg);
    }
}
