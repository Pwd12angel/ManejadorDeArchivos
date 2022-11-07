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
}
