package Controlador;

import Modelo.operaciones;
import Vista.*;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AccionBoton implements ActionListener {
    operaciones op = new operaciones();
    public AccionBoton (){
        // MiPanel.boton.addActionListener(this);
        miPanel.registrarse.addActionListener(this);
        miPanel.borrar.addActionListener(this);
        miPanel.enviar.addActionListener(this);
        miPanel.cajaNombre.addActionListener(this);
        miPanel.cajaPass.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == miPanel.registrarse){

           ventanaRegistro obj = new ventanaRegistro();
            obj.setVisible(true);


            System.out.println("Boton registrarse presionado");
        }else if (e.getSource() == miPanel.enviar){
            String nom = miPanel.cajaNombre.getText();
            String con = miPanel.cajaPass.getText();

            System.out.println(con);
            System.out.println(nom);


            op.consultar(nom,con);

            System.out.println(op.entrada());

            if (op.entrada()){
                ventanaDocumento objD = new ventanaDocumento();
                objD.setVisible(true);
            }





            System.out.println("Boton enviar presionado");
        }else if (e.getSource() == miPanel.borrar){
            System.out.println("Boton borrar presionado");
            miPanel.cajaNombre.setText("");
            miPanel.cajaPass.setText("");
        }

    }
}
