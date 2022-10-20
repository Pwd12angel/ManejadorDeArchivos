package Vista;

import Controlador.AccionBoton;

import javax.swing.*;
import java.awt.*;

public class miPanelRegistro extends JPanel {
    public static JLabel titulo,usaurio, pass,numeroControl;
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
        Font tituloR = new Font("Arial", Font.BOLD, 25);
        Font myFontEtiquetas = new Font("Arial", Font.BOLD, 16);

        titulo = new JLabel("Registro Manejador De Archivos");
        usaurio = new JLabel("Usuario");
        pass = new JLabel("Password");
        numeroControl = new JLabel("No. Control");

        titulo.setBounds(200,0,400,100);
        titulo.setFont(tituloR);

        usaurio.setBounds(100,125,100,50);
        usaurio.setFont(myFontEtiquetas);

        pass.setBounds(100,250,100,50);
        pass.setFont(myFontEtiquetas);

        numeroControl.setBounds(500,125,100,50);
        numeroControl.setFont(myFontEtiquetas);

        add(titulo);
        add(usaurio);
        add(pass);
        add(numeroControl);
    }

    private void crearCajitas() {

    }

    private void crearBotones() {
        regresar = new JButton("Regresar");


    }

}
