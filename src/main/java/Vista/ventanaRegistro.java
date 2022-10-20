package Vista;

import javax.swing.*;

public class ventanaRegistro extends JFrame {

    public ventanaRegistro (){
        this.setSize(700,500);
        this.setResizable(false);
        this.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setTitle("Registro");
        this.setVisible(false);

        colocarPanel();



    }

    public void colocarPanel() {
        miPanelRegistro obj1 = new miPanelRegistro();
        this.setContentPane(obj1);
    }


}


