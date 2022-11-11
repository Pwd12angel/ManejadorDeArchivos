package Vista;

import Controlador.AccionBotonRegistro;

import javax.swing.*;
import java.awt.*;

public class miPanelDocumentos extends JPanel {

    public static JLabel titulo;
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
        Font tituloD = new Font("Arial", Font.BOLD, 25);
        titulo = new JLabel("Manejador De Archivos");

        titulo.setBounds(270,0,400,100);
        titulo.setFont(tituloD);

        add(titulo);
    }

    private void crearCajitas() {
    }

    private void crearBotones() {
    }
}
