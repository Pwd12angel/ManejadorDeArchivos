package Vista;

import Controlador.AccionBoton;

import javax.swing.*;
import java.awt.*;
import java.io.File;

public class miPanel extends JPanel {
    Image imagen;

    public static JLabel logo;
    public static JButton enviar,borrar,registrarse;
    public miPanel(){


        this.setLayout(null);
        this.setBackground(Color.white);

        crearEtiqueta();
        crearBotones();
        crearTexto();
        crearCajita();


        AccionBoton instancia = new AccionBoton();
    }


    private void crearEtiqueta() {
       logo = new JLabel();

        try {
            logo.setBounds(180,50,140,140);

            ImageIcon img = new ImageIcon(getClass().getResource("/Vista/Imagenes/login.png"));
            ImageIcon icon = new ImageIcon(img.getImage().getScaledInstance(logo.getWidth(),logo.getHeight(), Image.SCALE_DEFAULT));
            logo.setIcon(icon);

        }catch (Exception e){
            System.out.println(e);
        }
        //Escalamos la imagen a lo ancho y largo de nuestro boton
        System.out.println(getClass());



        add(logo);
    }

    private void crearCajita() {
        //Creamos cajas
        JTextField cajaNombre = new JTextField();
        JTextField cajaPass = new JTextField();


        //Damos propiedades
        cajaNombre.setBounds(100,230,300,40);
        cajaPass.setBounds(100,330,300,40);
        //agregamos
        this.add(cajaNombre);
        this.add(cajaPass);

    }

    private void crearTexto() {
        //Agregamos nueva fuente
        Font myFontEtiquetas = new Font("Arial", Font.BOLD, 16);


        //Creamos textos
        JLabel nombre = new JLabel("Usuario");
        JLabel password = new JLabel("Password");

        //Le damos propiedades
        nombre.setBounds(100,200,100,30);
        nombre.setFont(myFontEtiquetas);
        password.setBounds(100,300,100,30);
        password.setFont(myFontEtiquetas);

        //Lo agregamos
        this.add(nombre);
        this.add(password);
    }


    private void crearBotones() {
        //Agregamos nueva fuente
        Font myFontBotones = new Font("Arial", Font.BOLD, 14);

        //Creamos el boton
         enviar = new JButton();
         borrar = new JButton();
         registrarse = new JButton();

        //Le damos propiedades
        enviar.setBounds(100,420,100,50);
        enviar.setText("Enviar");
        enviar.setFont(myFontBotones);
        enviar.setBackground(Color.BLUE);

        borrar.setBounds(300,420,100,50);
        borrar.setText("Borrar");
        borrar.setFont(myFontBotones);
        borrar.setBackground(Color.red);

        registrarse.setBounds(100,490,300,50);
        registrarse.setText("Registrarse");
        registrarse.setBackground(Color.lightGray);
        registrarse.setFont(myFontBotones);

        //Lo agregamos al panel
        this.add(enviar);
        this.add(borrar);
        this.add(registrarse);
    }
}
