package Vista;

import javax.swing.*;
import java.awt.*;

public class miPanel extends JApplet {
    Image imagen;

    public miPanel(){
        JButton enviar;
        JButton borrar;
        JButton registrar;

        this.setLayout(null);
        this.setBackground(Color.white);

        crearBotones();
        crearTexto();
        crearCajita();


    }

    private void crearCajita() {
    }

    private void crearTexto() {
    }


    private void crearBotones() {
        //Creamos el boton
        JButton enviar = new JButton();
        JButton borrar = new JButton();
        JButton registrase = new JButton();

        //Le damos propiedades
        enviar.setBounds(100,350,100,50);
        enviar.setText("Enviar");
        enviar.setBackground(Color.GRAY);

        borrar.setBounds(300,350,100,50);
        borrar.setText("Borrar");
        borrar.setBackground(Color.red);

        registrase.setBounds(100,420,300,50);
        registrase.setText("Registrarse");
        registrase.setBackground(Color.white);

        //Lo agregamos al panel
        this.add(enviar);
        this.add(borrar);
        this.add(registrase);
    }
}
