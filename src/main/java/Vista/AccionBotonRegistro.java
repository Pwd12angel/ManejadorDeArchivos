package Vista;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AccionBotonRegistro implements ActionListener {

    public AccionBotonRegistro(){
        miPanelRegistro.regresar.addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == miPanelRegistro.regresar){
            
        }
    }
}
