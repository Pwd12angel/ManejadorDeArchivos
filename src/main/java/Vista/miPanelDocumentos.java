package Vista;

import Controlador.AccionBotonRegistro;

import javax.swing.*;
import java.awt.*;

public class miPanelDocumentos extends JPanel {

    public static JTextField prueba;
    //Agregamos nueva fuente
    Font myFontEtiquetas = new Font("Arial", Font.BOLD, 16);

    public miPanelDocumentos(){

            this.setLayout(null);
            this.setBackground(Color.white);

            crearBotones();
            crearCajitas();
            crearTextos();

    }

    private void crearTextos() {
        prueba = new JTextField();

        prueba.setText("Bienvenido");
        prueba.setBounds(300,300,50,10);

        add(prueba);
    }

    private void crearCajitas() {
    }

    private void crearBotones() {
    }
}
