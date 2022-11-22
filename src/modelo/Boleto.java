package modelo;

import com.mysql.cj.xdevapi.Statement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import vistas.VentanaAsiento;

public class Boleto {
        
    private int codigoBoleto;
    private int numeroAsiento;
    private double precioFinal;    
    
    public Boleto(){
    }
    
    public int getCodigoBoleto() {
        return codigoBoleto;
    }

    public void setCodigoBoleto(int codigoBoleto) {
        this.codigoBoleto = codigoBoleto;
    }

    public int getNumeroAsiento() {
        return numeroAsiento;
    }

    public void setNumeroAsiento(int numeroAsiento) {
        this.numeroAsiento = numeroAsiento;
    }
        
    
    public boolean iniciarNuevoBoleto(){
        return true;
    }

    public double getPrecioFinal() {
        return precioFinal;
    }

    public void setPrecioFinal(double precioFinal) {
        this.precioFinal = precioFinal;
    }        
    
    public void seleccionarOrigen(JTable tabla, String origen){
                     
        Conexion conn = new Conexion();
        Connection reg = conn.conectar();  
        Connection con = reg; 
         
        PreparedStatement ps = null;
        ResultSet rs = null;
               
        DefaultTableModel tablaAutobuses = new DefaultTableModel();
        tablaAutobuses.addColumn("No Autobus");
        tablaAutobuses.addColumn("Origen");
        tablaAutobuses.addColumn("Destino");
        tablaAutobuses.addColumn("Precio");
        tablaAutobuses.addColumn("Fecha");
        tablaAutobuses.addColumn("Hora");
        tabla.setModel(tablaAutobuses);
        
        String []datos = new String[6];
        
        String sql = "SELECT * FROM autobus WHERE nombreOrigen = '" + origen + "'";
        
        try{
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            
            while(rs.next()){
                datos[0] = rs.getString(1);
                datos[1] = rs.getString(2);
                datos[2] = rs.getString(3);
                datos[3] = rs.getString(4);
                datos[4] = rs.getString(5);
                datos[5] = rs.getString(6);
                tablaAutobuses.addRow(datos);
            }
            tabla.setModel(tablaAutobuses);
            
        }catch(Exception e){
            System.out.println("Error en la consulta: " + e);
            
        }      
    }
    
    public void seleccionarDestino(JTable tabla,String origen, String destino){
        
        Autobus viaje = new Autobus();
        
        Conexion conn = new Conexion();
        Connection reg = conn.conectar();  
        Connection con = reg; 
         
        PreparedStatement ps = null;
        ResultSet rs = null;
               
        DefaultTableModel tablaAutobuses = new DefaultTableModel();
        tablaAutobuses.addColumn("No Autobus");
        tablaAutobuses.addColumn("Origen");
        tablaAutobuses.addColumn("Destino");
        tablaAutobuses.addColumn("Precio");
        tablaAutobuses.addColumn("Fecha");
        tablaAutobuses.addColumn("Hora");
        tabla.setModel(tablaAutobuses);
        
        String []datos = new String[6];
        
        String sql = "SELECT * FROM autobus WHERE nombreOrigen = '" + origen + "' AND nombreDestino = '" + destino + "'";
        
        try{
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            
            while(rs.next()){
                datos[0] = rs.getString(1);
                datos[1] = rs.getString(2);
                datos[2] = rs.getString(3);
                datos[3] = rs.getString(4);
                datos[4] = rs.getString(5);
                datos[5] = rs.getString(6);
                tablaAutobuses.addRow(datos);               
            }
            tabla.setModel(tablaAutobuses);
            
        }catch(Exception e){
            System.out.println("Error en la consulta: " + e);
            
        }      
    }
    
    public void seleccionarFecha(JTable tabla,String origen, String destino, String fecha){
        
        Autobus viaje = new Autobus();
        
        Conexion conn = new Conexion();
        Connection reg = conn.conectar();  
        Connection con = reg; 
         
        PreparedStatement ps = null;
        ResultSet rs = null;
               
        DefaultTableModel tablaAutobuses = new DefaultTableModel();
        tablaAutobuses.addColumn("No Autobus");
        tablaAutobuses.addColumn("Origen");
        tablaAutobuses.addColumn("Destino");
        tablaAutobuses.addColumn("Precio");
        tablaAutobuses.addColumn("Fecha");
        tablaAutobuses.addColumn("Hora");
        tabla.setModel(tablaAutobuses);
        
        String []datos = new String[6];
        
        String sql = "SELECT * FROM autobus WHERE nombreOrigen = '" + origen + "' AND nombreDestino = '" + destino + "' AND fechaViaje = '" + fecha + "'";
        
        try{
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            
            while(rs.next()){
                datos[0] = rs.getString(1);
                datos[1] = rs.getString(2);
                datos[2] = rs.getString(3);
                datos[3] = rs.getString(4);
                datos[4] = rs.getString(5);
                datos[5] = rs.getString(6);
                tablaAutobuses.addRow(datos);               
            }
            tabla.setModel(tablaAutobuses);            
            
        }catch(Exception e){
            System.out.println("Error en la consulta: " + e);
            
        }      
    }                
        
    public void seleccionarDescuento(Descuento descuento){
        
        Autobus viaje = new Autobus();
        
        Conexion conn = new Conexion();
        Connection reg = conn.conectar();  
        Connection con = reg; 
         
        PreparedStatement ps = null;
        ResultSet rs = null;          
        
        String []datos = new String[2];
        
        String sql = "SELECT porcentajeDescuento FROM descuento WHERE tipoDescuento = '" + descuento.getTipoDescuento() + "'";
        
        try{
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            
            while(rs.next()){
                datos[0] = rs.getString(1);                                
                int porcentaje = Integer.parseInt(datos[0]);
                descuento.setPorcentajeDescuento(porcentaje);                
            }            
            
        }catch(Exception e){
            System.out.println("Error en la consulta: " + e);
            
        }      
    }                 
   
    public boolean generarBoleto(Pasajero pasajero, Boleto boleto, Autobus autobus, Descuento descuento){
        Conexion conn = new Conexion();
        Connection reg = conn.conectar(); 
        Connection con = reg;
        
        PreparedStatement ps = null;
        ResultSet rs = null;
        
        int res = 0;
        
        String sql = "INSERT INTO boleto (codigoBoleto, estado, numeroAutobus, tipoDescuento, nombre, apellidoPaterno, apellidoMaterno, numeroAsiento, precioFinal) VALUES  (NULL, 'Vendido', '" + autobus.getNumeroAutobus() + "', '" + descuento.getTipoDescuento() + "', '" + pasajero.getNombrePasajero() + "', '" + pasajero.getApellidoPaternoPasajero() + "', '" + pasajero.getApellidoMaternoPasajero() + "', '" + boleto.getNumeroAsiento()+ "', '" + boleto.getPrecioFinal() + "')";
        
        try{
            ps = reg.prepareStatement(sql);
            res = ps.executeUpdate();                   
            return true;            
        }catch(Exception e){
            System.out.println("Error en la consulta: " + e);
            return false;
        } 
    }           
    
    public boolean cancelarBolteto(Boleto boleto){
        Conexion conn = new Conexion();
        Connection reg = conn.conectar(); 
        Connection con = reg;
        
        PreparedStatement ps = null;
        ResultSet rs = null;
        
        int res = 0;
        
        String sql = "UPDATE boleto SET estado = 'Cancelado' WHERE codigoBoleto = '" + boleto.getCodigoBoleto() + "'";
        
        try{ 
            ps = reg.prepareStatement(sql);
            res = ps.executeUpdate();                   
            return true;            
        }catch(Exception e){
            System.out.println("Error en la consulta: " + e);
            return false;
        }     
    }
    
    public void consultarVentas(String estado, String origen, String destino, String fecha, JTable tabla){
        DefaultTableModel tablaAutobuses = new DefaultTableModel();
        tablaAutobuses.addColumn("Codigo");
        tablaAutobuses.addColumn("Estado");
        tablaAutobuses.addColumn("Autobus");
        tablaAutobuses.addColumn("Origen");
        tablaAutobuses.addColumn("Destino");
        tablaAutobuses.addColumn("Descuento");
        tablaAutobuses.addColumn("Nombre");
        tablaAutobuses.addColumn("A. Paterno"); 
        tablaAutobuses.addColumn("A. Materno");
        tablaAutobuses.addColumn("Asiento");
        tablaAutobuses.addColumn("Costo");
        tablaAutobuses.addColumn("Fecha");
        tabla.setModel(tablaAutobuses);
        
        Conexion conn = new Conexion();
        Connection reg = conn.conectar();  
        Connection con = reg; 
         
        PreparedStatement ps = null;
        ResultSet rs = null;
        
        String []datos = new String[15];
        
        if(estado == "Todos"){
            estado = "%";
        }
        
        String sql = "SELECT * FROM boleto INNER JOIN autobus" +
                    " ON boleto.numeroAutobus = autobus.numeroAutobus" +
                    " WHERE boleto.estado       LIKE '" + estado + "'" +
                    " AND autobus.nombreOrigen  LIKE '" + origen + "'" +
                    " AND autobus.nombreDestino LIKE '" + destino + "'" +
                    " AND autobus.fechaViaje    LIKE \"" + fecha + "\"";
        
        try{
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            
            while(rs.next()){
                datos[0] = rs.getString(1);
                datos[1] = rs.getString(2);
                datos[2] = rs.getString(3);                
                datos[3] = rs.getString(11);                
                datos[4] = rs.getString(12);                
                datos[5] = rs.getString(4);                  
                datos[6] = rs.getString(5);
                datos[7] = rs.getString(6);
                datos[8] = rs.getString(7);                
                datos[9] = rs.getString(8);                
                datos[10] = rs.getString(9);
                datos[11] = rs.getString(14);
                tablaAutobuses.addRow(datos);
            }
            tabla.setModel(tablaAutobuses);
            
        }catch(Exception e){
            System.out.println("Error en la consulta: " + e);
        }                   
    }

}

