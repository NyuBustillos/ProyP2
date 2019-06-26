package Modelo;

/**
 *
 * @author Obustillosh
 */
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import Modelo.Bean;
import Utilidades.*;

public class Dao {
    public Connection conn=null;
    public Statement st=null;
    public ResultSet rs=null;
    public boolean listo = false;
    public String id="";
    public String nombre="";
    public String precio="";
    
    public Dao(Bean producto) {
        super();
        try {
            conn = this.ObtenerConexion();
            st = conn.createStatement();
            id = producto.getIdProd();
            nombre =producto.getNombreProd();
            apellido =producto.getPrecioProd();
        } catch (SQLException ex) {
            Logger.getLogger(Dao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public boolean agrear(){ //1
        try{
            st.executeUpdate("insert into producto values('"+id+"','"+nombre+"','"+precio+"')");
            listo=true;
        } catch (SQLException ex){
            Logger.getLogger(Dao.class.getName()).log(Level.SEVERE,null,ex);
        }
        return listo;
    }
    public boolean borrar(){//2
        try{
            st.executeUpdate("delete from cliente where id_producto='"+id+"';");
            listo=true;
        } catch (SQLException ex) {
            Logger.getLogger(Dao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listo;    
    }
    public boolean actualizarRegistro() { //opcion 3.
        try {
            st.executeUpdate("update cliente setnom_producto='"+nombre+"',precio_producto='"+precio+"' where id_cliente='"+id+"';");
            listo=true;
        } catch (SQLException ex) {
            Logger.getLogger(Dao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listo;
    }

    
}
