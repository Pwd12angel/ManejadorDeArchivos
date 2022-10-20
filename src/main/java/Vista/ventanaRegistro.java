package Vista;

import javax.swing.*;


public class ventanaRegistro extends JFrame {

    public ventanaRegistro (){
        this.setSize(800,500);
        this.setResizable(false);
        //this.setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setTitle("Registro");

        colocarPanel();
    }
    public ventanaRegistro(boolean estado){
        if (estado) {
            this.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
        }
    }


    public void colocarPanel() {
        miPanelRegistro obj1 = new miPanelRegistro();
        this.setContentPane(obj1);
    }



}


