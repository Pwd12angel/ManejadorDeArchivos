package Modelo;

import Vista.miPanelRegistro;

import javax.swing.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class operaciones {
    conexion conexion=new conexion();
    PreparedStatement sentencia=null;
    ResultSet resultados=null;

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
    public void consultar (String user){
        Connection con=conexion.get_connection();

        try {
            sentencia=con.prepareStatement("SELECT * FROM usuarios WHERE usuario = ?");
            sentencia.setString(1,user);
            resultados=sentencia.executeQuery();

            int id , numeroC;
            String usuario,pass;

            while (resultados.next()){
                id = resultados.getInt("id");
                usuario = resultados.getString("usuario");
                numeroC = resultados.getInt("numeroControl");
                pass = resultados.getString("contrasena");

                System.out.println("El id es: "+id);
                System.out.println("El usuario es "+usuario);
                System.out.println("El numero de control es: "+numeroC);
                System.out.println("La contrasena es: "+pass);


            }
            con.close();
        }catch (SQLException e){
           e.printStackTrace();
        }
    }
}
