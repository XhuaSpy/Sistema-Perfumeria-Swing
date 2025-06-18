package com.perfumeria.repositorio.list;

import com.perfumeria.modelo.Usuario;
import com.perfumeria.repositorio.Repositorio;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 *
 * @author Jesus Peraza Royero
 */
public class UsuarioListaRepositorio implements Repositorio<Usuario> {

    private final List<Usuario> usuarios;

    public UsuarioListaRepositorio() {
        this.usuarios = new ArrayList<>();
        usuarios.add(new Usuario(0L, "admin", "admin", "123admin"));
        usuarios.add(new Usuario(0L, "vendedor", "vendedor", "123vendedor"));
    }

    @Override
    public Collection<Usuario> listar() {
        return usuarios;
    }

    @Override
    public Usuario buscarPorId(Long id) {
        for (Usuario u : usuarios) {
            if (u.getId().equals(id)) {
                return u;
            }
        }
        return null;
    }

    @Override
    public void crear(Usuario repo) {
        this.usuarios.add(repo);
    }

    @Override
    public void editar(Usuario repo) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void editarPorId(Long id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void eliminar(Long id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
