package Vista;

import Modelo.conexion;


import java.sql.Connection;
import java.sql.SQLException;

public class main {
    public static void main(String[] args) {
        conexion con = new conexion();

        try (Connection cnx = con.get_connection()){


        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
