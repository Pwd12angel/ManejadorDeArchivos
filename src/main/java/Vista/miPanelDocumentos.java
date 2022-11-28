package Vista;

import Controlador.AccionBotonDocumento;


import javax.swing.*;

import java.awt.*;

public class miPanelDocumentos extends JPanel {

    public static JLabel titulo,icono;
    public static JTextField ruta;
    public static JButton buscar;
    public static JTextArea documento;
    JScrollPane scroll;
    //Agregamos nueva fuente
    Font tituloD = new Font("Arial", Font.BOLD, 25);
    Font BotonD = new Font("Arial", Font.BOLD, 13);
    Font RutaD = new Font("Arial", Font.BOLD, 13);


    public miPanelDocumentos(){

            this.setLayout(null);
            this.setBackground(Color.white);

            crearEtiqueta();
            crearBotones();
            crearCajitas();
            crearTextos();

        AccionBotonDocumento instancia = new AccionBotonDocumento();

    }

    private void crearEtiqueta(){
        icono = new JLabel();
        try {
            icono.setBounds(150,150,140,140);

            ImageIcon img = new ImageIcon(getClass().getResource("/Vista/Imagenes/documento.png"));
            ImageIcon icon = new ImageIcon(img.getImage().getScaledInstance(icono.getWidth(),icono.getHeight(), Image.SCALE_DEFAULT));
            icono.setIcon(icon);

        }catch (Exception e){
            System.out.println(e);
        }



        add(icono);

    }
    private void crearTextos() {
        titulo = new JLabel();

        titulo = new JLabel("Manejador De Archivos");

        titulo.setBounds(250,0,400,100);
        titulo.setFont(tituloD);

        add(titulo);

    }

    private void crearCajitas() {
        ruta = new JTextField();

        documento = new JTextArea();

        ruta.setBounds(160,300,400,25);
        ruta.setFont(RutaD);

        scroll = new JScrollPane(documento);
        scroll.setBounds(160,350,500,300);
        documento.setLineWrap(true);

        add(ruta);
        //add(documento);
        add(scroll);
    }

    private void crearBotones() {
        buscar = new JButton("Buscar");

        buscar.setBounds(580,300,80,25);
        buscar.setFont(BotonD);
        this.add(buscar);

    }
}
