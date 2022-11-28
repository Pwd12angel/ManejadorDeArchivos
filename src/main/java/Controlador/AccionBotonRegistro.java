package Controlador;

import Modelo.operaciones;
import Vista.miPanelRegistro;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AccionBotonRegistro implements ActionListener {

    Utilidad opEncript = new Utilidad();
    operaciones op = new operaciones();
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

            String pass = miPanelRegistro.cajaPass.getText();
            String num = miPanelRegistro.cajaNumero.getText();
            String usurio = miPanelRegistro.cajaUsuario.getText();

            if (pass.length() < 8 ){
                JOptionPane.showMessageDialog(null,"La contraseña"+
                "debe de tener almenos 8 caracteres");
            }else if (num.length() < 8){
                JOptionPane.showMessageDialog(null,"El numero de control debe de ser de almenos 8 numeros");
            }
            else {

                int control = Integer.parseInt(num);

                System.out.println("Datos registrados correctamente");
                String passwordEncriptado = opEncript.encriptar(pass);
                //String passwordEncriptado = Utilidad.encriptar(pass);
                System.out.println(passwordEncriptado);

                op.insertar(usurio,control,passwordEncriptado);
            }

        }

        if (e.getSource() == miPanelRegistro.borrar){
            miPanelRegistro.cajaNumero.setText("");
            miPanelRegistro.cajaUsuario.setText("");
            miPanelRegistro.cajaPass.setText("");
        }
    }
}
