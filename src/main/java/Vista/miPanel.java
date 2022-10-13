package Vista;

import javax.swing.*;
import java.awt.*;

public class miPanel extends JApplet {
    Image imagen;

    public miPanel(){
        this.setLayout(null);
        this.setBackground(Color.white);

        crearBotones();
        crearTexto();
        crearCajita();


    }

    private void crearCajita() {
    }

    private void crearTexto() {
        //Agregamos nueva fuente
        Font myFontEtiquetas = new Font("Arial", Font.BOLD, 16);

        //Creamos textos
        JLabel nombre = new JLabel("Usuario");
        JLabel password = new JLabel("Password");

        //Le damos propiedades
        nombre.setBounds(100,100,100,30);
        nombre.setFont(myFontEtiquetas);
        password.setBounds(100,120,100,30);
        password.setFont(myFontEtiquetas);

        //Lo agregamos
        this.add(nombre);
        this.add(password);
    }


    private void crearBotones() {
        //Agregamos nueva fuente
        Font myFontBotones = new Font("Arial", Font.BOLD, 14);

        //Creamos el boton
        JButton enviar = new JButton();
        JButton borrar = new JButton();
        JButton registrase = new JButton();

        //Le damos propiedades
        enviar.setBounds(100,350,100,50);
        enviar.setText("Enviar");
        enviar.setFont(myFontBotones);
        enviar.setBackground(Color.GRAY);

        borrar.setBounds(300,350,100,50);
        borrar.setText("Borrar");
        borrar.setFont(myFontBotones);
        borrar.setBackground(Color.red);

        registrase.setBounds(100,420,300,50);
        registrase.setText("Registrarse");
        registrase.setBackground(Color.white);
        registrase.setFont(myFontBotones);

        //Lo agregamos al panel
        this.add(enviar);
        this.add(borrar);
        this.add(registrase);
    }
}
