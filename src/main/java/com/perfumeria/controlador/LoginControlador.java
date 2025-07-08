package com.perfumeria.controlador;

import com.perfumeria.vista.FrameLogin;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;

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

    private void actionBtnLogin() {}
}
