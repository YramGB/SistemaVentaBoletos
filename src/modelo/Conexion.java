package modelo;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
    
    private static Connection conexion;
    private static String url = "jdbc:mysql://localhost/sistema_autobuses";
    private static String usuario = "root";
    private static String contraseña = "";
    private static String clase = "com.mysql.cj.jdbc.Driver";
    
    public static Connection conectar(){
        conexion = null;
        try{
            Class.forName(clase);
            conexion = DriverManager.getConnection(url, usuario, contraseña);
            if(conexion != null){
                System.out.println("Conexión establecida");
            }
        }catch(ClassNotFoundException | SQLException e){
            System.out.println("Error de conexión" + e);
        }  
        return conexion;
    }

}