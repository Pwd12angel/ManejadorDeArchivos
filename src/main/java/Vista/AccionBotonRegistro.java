package Vista;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AccionBotonRegistro implements ActionListener {

    public AccionBotonRegistro(){
        miPanelRegistro.regresar.addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == miPanelRegistro.regresar){
            ventana obj1 = new ventana();


            ventanaRegistro instanciaR = new ventanaRegistro(true);

        }

    }
}
