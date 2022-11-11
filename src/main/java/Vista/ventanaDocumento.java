package Vista;

import javax.swing.*;

public class ventanaDocumento extends JFrame {

    public ventanaDocumento(){
        this.setSize(800,800);
        this.setResizable(false);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setTitle("Manejador de archivos");
        this.setVisible(false);


        //Minimizar Ventana
        //this.setExtendedState(ICONIFIED);

        colocarPanel();
    }

    private void colocarPanel() {
        miPanelDocumentos objp = new miPanelDocumentos();
        this.setContentPane(objp);
    }
}
