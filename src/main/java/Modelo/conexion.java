package Modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class conexion {

    // libreria de mysql
    public String driver="com.mysql.cj.jdbc.Driver";
    //nombre de la BD
    public String bd="archivos";
    //host
    public String hostname= "localhost";
    //puerto
    public String puerto="3306";
    //ruta de nuestra BD
    public String url="jdbc:mysql://"+hostname+":"+puerto+"/"+bd+"?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatatimeCode=false&serverTimezone=UTC";
    //nombre del usuario
    public String usuario="root";
    //contrase�a
    public String pass="root123";

    public Connection get_connection(){
        Connection  conexion = null;
        try {
            conexion=DriverManager.getConnection(url,usuario,pass);
         //  conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/archivos","root","root123");

            if (conexion != null){
                System.out.printf("Conexion exitosa");
            }else {
                System.out.println("Conexion fallida");
            }
        }catch (SQLException e){
            System.out.println(e);
        }
        return conexion;
    }
}
