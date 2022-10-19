package Controlador;

import Vista.miPanel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AccionBoton implements ActionListener {

    public AccionBoton (){
        // MiPanel.boton.addActionListener(this);
        miPanel.registrarse.addActionListener(this);
        miPanel.borrar.addActionListener(this);
        miPanel.enviar.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == miPanel.registrarse){
            System.out.println("Boton registrarse presionado");
        }else if (e.getSource() == miPanel.enviar){
            System.out.println("Boton enviar presionado");
        }else if (e.getSource() == miPanel.borrar){
            System.out.println("Boton borrar presionado");
        }

    }
}
