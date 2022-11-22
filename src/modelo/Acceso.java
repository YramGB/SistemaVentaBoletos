package modelo;

import java.sql.*;

public class Acceso {
        
    private String codigoAcceso;
    private String contraseñaAcceso;
    Conexion conexion = new Conexion();

    public String getCodigoAcceso() {
        return codigoAcceso;
    }

    public void setCodigoAcceso(String codigoAcceso) {
        this.codigoAcceso = codigoAcceso;
    }

    public String getContraseñaAcceso() {
        return contraseñaAcceso;
    }

    public void setContraseñaAcceso(String contraseñaAcceso) {
        this.contraseñaAcceso = contraseñaAcceso;
    }     
    
    public boolean iniciarSesion(Acceso idAcceso){
        
        Conexion conn = new Conexion();
        Connection reg = conn.conectar();      
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = reg; 
 
        String sql = "SELECT codigoAcceso, contraseñaAcceso FROM login WHERE codigoAcceso = ?";
        
        try{
            
            ps = con.prepareStatement(sql);
            ps.setString(1, idAcceso.getCodigoAcceso());
            rs = ps.executeQuery();
            if(rs.next()){

                if((idAcceso.getCodigoAcceso().equals(rs.getString(1))) && ((idAcceso.getContraseñaAcceso().equals(rs.getString(2))))){
                    idAcceso.setCodigoAcceso(rs.getString(1));
                    idAcceso.setContraseñaAcceso(rs.getString(2));                   
                    return true;
                }else{
                    return false;
                }
            }else{
                return false;
            }               
        }catch(Exception e){
            System.out.println("Error en la consulta: " + e);
            return false;
        }       
    }
    
    public boolean registrarse(Acceso acceso){
        
        Conexion conn = new Conexion();
        Connection reg = conn.conectar(); 
        Connection con = reg;
        
        PreparedStatement ps = null;
        ResultSet rs = null;
        
        int res = 0;
        
        String sql = "INSERT INTO login (codigoAcceso, contraseñaAcceso) VALUES  ('" + acceso.getCodigoAcceso() + "', '" + acceso.getContraseñaAcceso() + "')";
        
        try{
 
            ps = reg.prepareStatement(sql);
            res = ps.executeUpdate();                   
            return true;            
        }catch(Exception e){
            System.out.println("Error en la consulta: " + e);
            return false;
        }     
    }
    
    public boolean cerrarSesion(){
      return true;  
    }
        
    public int cambiarContraseña(String codigo, String contraseñaNueva){
        Conexion conn = new Conexion();
        Connection reg = conn.conectar(); 
        Connection con = reg;
        
        PreparedStatement ps = null;
        ResultSet rs = null;
        
        int res = 0;
        
        String sql = "UPDATE login SET contraseñaAcceso = '" + contraseñaNueva + "' WHERE codigoAcceso = '" + codigo + "'";
        
        try{
 
            ps = reg.prepareStatement(sql);
            res = ps.executeUpdate();
            
            if((this.getContraseñaAcceso().equals(contraseñaNueva))){                            
                return 0;
            }else{
                return 1;
            }          
        }catch(Exception e){
            System.out.println("Error en la consulta: " + e);
            return 0;
        }     
    }              
}
