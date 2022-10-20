package Vista;

import Controlador.AccionBoton;

import javax.swing.*;
import java.awt.*;

public class miPanelRegistro extends JPanel {
    public static JLabel logo;
    public static JButton regresar,borrar;
    //Agregamos nueva fuente
    Font myFontEtiquetas = new Font("Arial", Font.BOLD, 16);
    public miPanelRegistro(){

        this.setLayout(null);
        this.setBackground(Color.white);



        crearBotones();




    }

    private void crearBotones() {
        regresar = new JButton("Regresar");

        regresar.setBounds(300,200,200,100);
        regresar.setFont(myFontEtiquetas);
        add(regresar);
    }

}
