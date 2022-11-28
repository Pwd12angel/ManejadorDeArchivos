package Controlador;

import Vista.miPanelDocumentos;


import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class AccionBotonDocumento implements ActionListener {
    public AccionBotonDocumento(){
        miPanelDocumentos.buscar.addActionListener(this);


    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == miPanelDocumentos.buscar){
            //Nos permitira abrir la ventana de documentos
            JFileChooser ob = new JFileChooser();
            //Nos abre el cuadro de dialogo
            ob.showOpenDialog(null);

            File documento = ob.getSelectedFile();

            //Estructura para no desvordar el programa
            try {
                //le pasamos lo que tenga la variable documento
                FileReader file = new FileReader(documento);
                //Hacemos el espacio de memoria para que la mantenga y puedamos manipular la informacion
                BufferedReader br = new BufferedReader(file);

                String texto = " ";
                String linea = " ";

                //hasta que nuestra variable linea sea diferente de null va a agregarle
                //toda la linea que lello mas un salto de linea a la veriable texto en la primer pasada
                //mantendra y seguira sumandolo
                while ((linea = br.readLine()) != null ){
                    texto += linea+ "\n";
                }
                //Mandamos toda la informacion que tenemos almacenada en nuesta area de texto
                miPanelDocumentos.documento.setText(texto);

                JOptionPane.showMessageDialog(null,"Archivo agregado correctamente");

                //Mostramos la ruta en la que se encuentra Ubicado el documento
                //Obtenemos la ruta donde se encuentra el archivo
                miPanelDocumentos.ruta.setText(documento.getPath());


            }catch (Exception e1){

                System.out.println(e1);
            }


        }
    }
}
