package Controlador;

import Vista.miPanel;
import Vista.miPanelRegistro;
import Vista.ventana;
import Vista.ventanaRegistro;


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

           ventanaRegistro obj = new ventanaRegistro();
            obj.setVisible(true);

            ventana obj1 = new ventana();
            obj1.setVisible(false);
           // obj1.dispose();


            System.out.println("Boton registrarse presionado");
        }else if (e.getSource() == miPanel.enviar){
            System.out.println("Boton enviar presionado");
        }else if (e.getSource() == miPanel.borrar){
            System.out.println("Boton borrar presionado");
        }

    }
}
