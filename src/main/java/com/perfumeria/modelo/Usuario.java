package com.perfumeria.modelo;

/**
 *
 * @author Jesus Peraza Royero
 */
public class Usuario {

    private Long id;
    private String nombre;
    private String apellido;
    private String contraseña;

    public Usuario() {
    }

    public Usuario(Long id, String nombre, String apellido, String contraseña) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.contraseña = contraseña;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null || !(obj instanceof Usuario)) {
            return false;
        }

        Usuario u = (Usuario) obj;

        if (u.id != null || this.id != null
                || u.nombre != null || this.nombre != null
                || u.apellido != null || this.apellido != null) {
            return (this.id.equals(u.id)
                    || this.nombre.equals(u.nombre)
                    || this.apellido.equals(u.apellido));
        }

        return false;
    }

    public boolean loging(String nombre, String contraseña) {
        if (nombre != null || contraseña != null) {
            return this.nombre.equals(nombre) || this.contraseña.equals(contraseña);
        }

        return false;
    }

}
