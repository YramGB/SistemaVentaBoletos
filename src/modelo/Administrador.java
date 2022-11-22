package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Administrador {
    public boolean agregarAutobus(Autobus datos){
        Conexion conn = new Conexion();
        Connection reg = conn.conectar(); 
        Connection con = reg;
        
        PreparedStatement ps = null;
        ResultSet rs = null;
        
        int res = 0;
        
        String sql = "INSERT INTO autobus (numeroAutobus, nombreOrigen, nombreDestino, precioViaje, fechaViaje, horarioViaje) VALUES  ('" + datos.getNumeroAutobus() + "', '" + datos.getNombreOrigen() + "', '" + datos.getNombreDestino() + "', '" + datos.getPrecioViaje() + "', '" + datos.getFechaViaje() + "', '" + datos.getHorarioViaje() + "')";
        
        try{
 
            ps = reg.prepareStatement(sql);
            res = ps.executeUpdate();                   
            return true;            
        }catch(Exception e){
            System.out.println("Error en la consulta: " + e);
            return false;
        }     
    }
    
    public boolean asignarAsientos(Asiento asiento){
        Conexion conn = new Conexion();
        Connection reg = conn.conectar(); 
        Connection con = reg;
        
        PreparedStatement ps = null;
        ResultSet rs = null;
        
        int res = 0;
        
        String sql = "INSERT INTO asiento (numeroAutobus, numeroAsiento, estado) VALUES ('" + asiento.getNumeroAutobus() + "', '" + asiento.getNumeroAsiento() + "', '" + asiento.getEstado() + "')";
        
        try{
 
            ps = reg.prepareStatement(sql);
            res = ps.executeUpdate();                   
            return true;            
        }catch(Exception e){
            System.out.println("Error en la consulta: " + e);
            return false;
        } 
    }
    
    public boolean agregarDescuento(Descuento datos){
        Conexion conn = new Conexion();
        Connection reg = conn.conectar(); 
        Connection con = reg;
        
        PreparedStatement ps = null;
        ResultSet rs = null;
        
        int res = 0;
        
        String sql = "INSERT INTO descuento (tipoDescuento, porcentajeDescuento) VALUES  ('" + datos.getTipoDescuento() + "', '" + datos.getPorcentajeDescuento() + "')";
        
        try{
 
            ps = reg.prepareStatement(sql);
            res = ps.executeUpdate();                   
            return true;            
        }catch(Exception e){
            System.out.println("Error en la consulta: " + e);
            return false;
        } 
    }
    
    public boolean modificarAutobus(Autobus datos){
        Conexion conn = new Conexion();
        Connection reg = conn.conectar(); 
        Connection con = reg;
        
        PreparedStatement ps = null;
        ResultSet rs = null;
        
        int res = 0;
        
        String sql = "UPDATE autobus SET nombreOrigen = '" + datos.getNombreOrigen() + "', nombreDestino = '" + datos.getNombreDestino() + "', precioViaje = '" + datos.getPrecioViaje() + "', fechaViaje = '" + datos.getFechaViaje() + "', horarioViaje = '" + datos.getHorarioViaje() + "' WHERE numeroAutobus = '" + datos.getNumeroAutobus() + "'";
        
        try{
 
            ps = reg.prepareStatement(sql);
            res = ps.executeUpdate();                   
            return true;            
        }catch(Exception e){
            System.out.println("Error en la consulta: " + e);
            return false;
        }     
    }
    
    public boolean modificarDescuento(Descuento datos){
        Conexion conn = new Conexion();
        Connection reg = conn.conectar(); 
        Connection con = reg;
        
        PreparedStatement ps = null;
        ResultSet rs = null;
        
        int res = 0;
        
        String sql = "UPDATE descuento SET porcentajeDescuento = '" + datos.getPorcentajeDescuento() + "' WHERE tipoDescuento = '" + datos.getTipoDescuento() + "'";
        
        try{
 
            ps = reg.prepareStatement(sql);
            res = ps.executeUpdate();                   
            return true;            
        }catch(Exception e){
            System.out.println("Error en la consulta: " + e);
            return false;
        } 
    }
    
    public boolean eliminarAutobus(Autobus datos){
        Conexion conn = new Conexion();
        Connection reg = conn.conectar(); 
        Connection con = reg;
        
        PreparedStatement ps = null;
        ResultSet rs = null;
        
        int res = 0;
        
        String sql = "DELETE FROM autobus WHERE numeroAutobus = " + datos.getNumeroAutobus();
        
        try{
 
            ps = reg.prepareStatement(sql);
            res = ps.executeUpdate();                   
            return true;            
        }catch(Exception e){
            System.out.println("Error en la consulta: " + e);
            return false;
        }     
    }
    
    public boolean eliminarAsientos(Asiento asiento){
        Conexion conn = new Conexion();
        Connection reg = conn.conectar(); 
        Connection con = reg;
        
        PreparedStatement ps = null;
        ResultSet rs = null;
        
        int res = 0;
        
        String sql = "DELETE FROM asiento WHERE numeroAutobus = " + asiento.getNumeroAutobus();
        
        try{
 
            ps = reg.prepareStatement(sql);
            res = ps.executeUpdate();                   
            return true;            
        }catch(Exception e){
            System.out.println("Error en la consulta: " + e);
            return false;
        } 
    }
    
    public boolean eliminarDescuento(Descuento datos){
        Conexion conn = new Conexion();
        Connection reg = conn.conectar(); 
        Connection con = reg;
        
        PreparedStatement ps = null;
        ResultSet rs = null;
        
        int res = 0;
        
        String sql = "DELETE FROM descuento WHERE tipoDescuento = '" + datos.getTipoDescuento() + "'";
        
        try{
 
            ps = reg.prepareStatement(sql);
            res = ps.executeUpdate();                   
            return true;            
        }catch(Exception e){
            System.out.println("Error en la consulta: " + e);
            System.out.println(sql);
            return false;
        } 
    }
    
    public boolean altaPersonal(PersonalVentas personal){
        Conexion conn = new Conexion();
        Connection reg = conn.conectar(); 
        Connection con = reg;
        
        PreparedStatement ps = null;
        ResultSet rs = null;
        
        int res = 0;
        
        String sql = "INSERT INTO personal_de_ventas (codigoPersonalVentas, nombrePersonalVentas, apellidoPaternoPersonalVentas, apellidoMaternoPersonalVentas, curpPersonalVentas) "
                + "VALUES ('" + personal.getCodigoPersonalVentas() + "', '" + personal.getNombrePersonalVentas() + "', '" + personal.getApellidoPaternoPersonalVentas() + "', '" + personal.getApellidoMaternoPersonalVentas() + "', '" + personal.getCurpPersonalVentas() + "')";
        
        try{
 
            ps = reg.prepareStatement(sql);
            res = ps.executeUpdate();                   
            return true;            
        }catch(Exception e){
            System.out.println("Error en la consulta: " + e);
            return false;
        }    
    }
}
