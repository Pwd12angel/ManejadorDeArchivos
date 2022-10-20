package Vista;

import Controlador.AccionBoton;

import javax.swing.*;
import java.awt.*;

public class miPanelRegistro extends JPanel {
    public static JLabel titulo,usaurio, pass,numeroControl;
    public static JButton registro,borrar;
    public static JTextField cajaUsuario,cajaNumero,cajaPass;
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

        pass.setBounds(100,220,100,50);
        pass.setFont(myFontEtiquetas);

        numeroControl.setBounds(450,125,100,50);
        numeroControl.setFont(myFontEtiquetas);

        add(titulo);
        add(usaurio);
        add(pass);
        add(numeroControl);
    }

    private void crearCajitas() {
        cajaUsuario = new JTextField();
        cajaPass = new JTextField();
        cajaNumero = new JTextField();

        cajaUsuario.setBounds(100,170,200,30);
        cajaPass.setBounds(100,265,200,30);
        cajaNumero.setBounds(450,170,200,30);


        add(cajaUsuario);
        add(cajaPass);
        add(cajaNumero);
    }

    private void crearBotones() {
        registro = new JButton("Registrar");
        borrar = new JButton("Borrar");

        registro.setBounds(450,350,150,40);
        registro.setBorderPainted(false);
        registro.setBackground(Color.green);

        borrar.setBounds(200,350,150,40);
        borrar.setBorderPainted(false);
        borrar.setBackground(Color.GRAY);

        add(registro);
        add(borrar);
    }

}
