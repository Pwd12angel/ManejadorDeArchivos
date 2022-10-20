package Vista;

import Controlador.AccionBoton;

import javax.swing.*;
import java.awt.*;

public class miPanelRegistro extends JPanel {
    public static JLabel usaurio, pass,numeroControl;
    public static JButton regresar,borrar;
    public static 
    //Agregamos nueva fuente
    Font myFontEtiquetas = new Font("Arial", Font.BOLD, 16);
    public miPanelRegistro(){

        this.setLayout(null);
        this.setBackground(Color.white);



        crearBotones();
        crearCajitas();
        crearTextos();

        AccionBotonRegistro instancia = new AccionBotonRegistro();
    }

    private void crearTextos() {
    }

    private void crearCajitas() {

    }

    private void crearBotones() {
        regresar = new JButton("Regresar");

        regresar.setBounds(300,200,200,100);
        regresar.setFont(myFontEtiquetas);
        add(regresar);
    }

}
