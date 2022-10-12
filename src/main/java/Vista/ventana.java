package Vista;

import javax.swing.*;

public class ventana extends JFrame {

    public ventana (){
        this.setSize(500,700);
        this.setResizable(false);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setTitle("Manejador de archivos");
        this.setVisible(true);

        colocarPanel();



    }

    private void colocarPanel(){
        miPanel obj = new miPanel();
        this.setContentPane(obj);

    }
}
