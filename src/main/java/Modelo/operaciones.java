package Modelo;

import Controlador.Utilidad;
import Vista.miPanelRegistro;

import javax.swing.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class operaciones {
    Utilidad op = new Utilidad();

    conexion conexion=new conexion();
    PreparedStatement sentencia=null;
    ResultSet resultados=null;

    int id=0 , numeroC=0;
    String usuario = null,pass = null;

    public void insertar (String usurio, int numeroContol, String pass){
        Connection con = conexion.get_connection();

        try {
            sentencia=con.prepareStatement("INSERT INTO usuarios (usuario, numeroControl, contrasena ) VALUES (?,?,?)");
            sentencia.setString(1,usurio);
            sentencia.setInt(2,numeroContol);
            sentencia.setString(3,pass);

            sentencia.executeUpdate();
            con.close();

            JOptionPane.showMessageDialog(null,"Datos agregados correctamente");

        }catch (SQLException e){
            System.out.println(e);
        }
    }
    public void consultar (String user, String passUser){
        Connection con=conexion.get_connection();

        try {
            sentencia=con.prepareStatement("SELECT * FROM usuarios WHERE usuario = ?");
            sentencia.setString(1,user);
            resultados=sentencia.executeQuery();



            while (resultados.next()){
                id = resultados.getInt("id");
                usuario = resultados.getString("usuario");
                numeroC = resultados.getInt("numeroControl");
                pass = resultados.getString("contrasena");

            }

            //Encriptamos la contraseña
            String passEncriptValidacion = op.encriptar(passUser);

            //validamos si existe el usuario
            if (user.equals(usuario) && passEncriptValidacion.equals(pass)){
                JOptionPane.showMessageDialog(null,"Bienvenido");
            }else {
                JOptionPane.showMessageDialog(null,"El usuario o la contraseña son incorrectos");
            }

            con.close();
        }catch (SQLException e){
           e.printStackTrace();
        }
    }

    //retornamos el usuario
    public String getUsuario() {
        return usuario;
    }

}
