package Vista;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AccionBotonRegistro implements ActionListener {

    public AccionBotonRegistro(){
        miPanelRegistro.registro.addActionListener(this);
        miPanelRegistro.borrar.addActionListener(this);
        miPanelRegistro.cajaNumero.addActionListener(this);
        miPanelRegistro.cajaUsuario.addActionListener(this);
        miPanelRegistro.cajaPass.addActionListener(this);


    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == miPanelRegistro.registro){
            System.out.println("Boton registro precionado");
        }

        if (e.getSource() == miPanelRegistro.borrar){
            miPanelRegistro.cajaNumero.setText("");
            miPanelRegistro.cajaUsuario.setText("");
            miPanelRegistro.cajaPass.setText("");
        }
    }
}
