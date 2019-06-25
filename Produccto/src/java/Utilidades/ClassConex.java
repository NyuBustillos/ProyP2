package Utilidades;

/**
 *
 * @author Obustillosh
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ClassConex {
    
    public String driver, urlbd,usrbd,passbd;
    public Connection conexion;
    public ClassConex(){
        driver="com.mysql.jdbc.Driver";
        usrbd="root";
        passbd="";
        urlbd="jdbc:mysql://localhost/proyectobd";
        
        try
        {
            Class.forName(driver).newInstance();
            conexion=DriverManager.getConnection(urlbd,usrbd,passbd);
            System.out.println("Conexion exitosa");
        }
        catch (Exception e){
            System.out.println("Conexion fallida");
        }
    }
    
    public Connection ObtenerConexion()
    {
        return conexion;
    }
    
    public Connection CerrarConexion() throws SQLException
    {
        conexion.close();
        conexion=null;
        return conexion;
    }
    
    
}
