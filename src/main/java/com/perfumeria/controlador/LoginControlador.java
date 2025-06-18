package com.perfumeria.controlador;

import com.perfumeria.configuracion.Config;
import com.perfumeria.modelo.Usuario;
import com.perfumeria.vista.FrameLogin;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Jesus Peraza Royero
 */
public class LoginControlador implements ActionListener {

    private final FrameLogin frameLogin;

    public LoginControlador() {
        this.frameLogin = new FrameLogin();
    }
    
    public LoginControlador(FrameLogin frameLogin) {
        this.frameLogin = frameLogin;
    }

    public void iniciar() {
        this.frameLogin.setTitle("Login");
        this.frameLogin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.frameLogin.setLocationRelativeTo(null);
        
        this.frameLogin.getBtnLogin().addActionListener(this);
        
        this.frameLogin.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(frameLogin.getBtnLogin())) {
            actionBtnLogin();
        }
    }

    private void actionBtnLogin() {
        Usuario usuarioActivo = validarUsuario(
                frameLogin.getUsuario().getText(),
                frameLogin.getContrasenia().getText());

        if (usuarioActivo == null) {
            JOptionPane.showMessageDialog(frameLogin, "Usuario no encontrado: ",
                    "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        JOptionPane.showMessageDialog(frameLogin, "Se encontró el usuario",
                "Error", JOptionPane.PLAIN_MESSAGE);
    }

    private Usuario validarUsuario(String nombre, String contraseña) {
        for (Usuario u : Config.usuarioRepositorio.listar()) {
            if (u.loging(nombre, contraseña)) {
                return u;
            }
        }
        return null;
    }
}
