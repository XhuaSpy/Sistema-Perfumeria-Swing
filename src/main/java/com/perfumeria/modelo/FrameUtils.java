package com.perfumeria.modelo;

import java.awt.Component;
import java.awt.Container;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JMenu;
import javax.swing.JTextField;

/**
 * Clase de utilidades para los JFrame y los JInternalFrame, no hace falta 
 * instanciar un objeto de la clase pues todos sus métodos son static 
 * 
 * @author Jesus Peraza Royero
 */
public class FrameUtils {

    /**
     * Limpia todos los campos de texto en el contenedor dado.
     *
     * @param container contenedor que puede tener JTextField y otros
     * componentes
     */
    public static void limpiarFormulario(Container container) {
        for (Component c : container.getComponents()) {
            if (c instanceof JTextField) {
                ((JTextField) c).setText("");
            } else if (c instanceof Container hijoContenedor) {
                limpiarFormulario(hijoContenedor);
            }
        }
    }
    
    /**
     * Asocia este controlador como listener de todos los botones y menús del
     * contenedor.
     *
     * @param container contenedor base (ej. JFrame o JPanel) donde buscar
     * componentes
     * @param listener el ActionLisener asociado, sera el que escucha los eventos
     * de los componentes.
     */
    public static void iniciarListener(Container container, ActionListener listener) {
        for (Component c : container.getComponents()) {
            if (c instanceof JButton) {
                ((JButton) c).addActionListener(listener);
            } else if (c instanceof JMenu) {
                for (int i = 0; i < ((JMenu) c).getItemCount(); i++) {
                    if (((JMenu) c).getItem(i) != null) {
                        ((JMenu) c).getItem(i).addActionListener(listener);
                    }
                }
            } else if (c instanceof Container) {
                iniciarListener((Container) c, listener);
            }
        }
    }
}
