package modelo;

import java.rmi.RemoteException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JLabel;

public class Asiento {
    private int numeroAutobus;
    private int numeroAsiento;
    private int estado;
    
    ArrayList<Asiento> asientos = new ArrayList<>();            
    
    public int getNumeroAutobus() {
        return numeroAutobus;
    }

    public void setNumeroAutobus(int numeroAutobus) {
        this.numeroAutobus = numeroAutobus;
    }    
    
    public int getNumeroAsiento() {
        return numeroAsiento;
    }

    public void setNumeroAsiento(int numeroAsiento) {
        this.numeroAsiento = numeroAsiento;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }       
    
        
    public void add(Asiento asiento){           
        asientos.add(asiento);                      
    }
     
    public String obtenerAsientos(){
        String asientoS = "";
        String asientoAnterior = "";
        for(int i = 0; i < asientos.size(); i++) {
            int asiento = asientos.get(i).getNumeroAsiento();
            asientoS = String.valueOf(asiento); 
            if(asientoAnterior == ""){
                asientoAnterior = asientoS + asientoAnterior;
            }else{
                asientoAnterior = asientoAnterior + ", " + asientoS;
            }            
            System.out.println(asientoAnterior);            
        } 
        return asientoAnterior;
    }             
    
    public int asientoEspecifico(int posicion){        
        int asiento = 0;
        for(int i = 0; i < asientos.size(); i++) {
            if(asientos.size() == posicion){
                asiento = asientos.get(i).getNumeroAsiento();
                break;
            }                              
        } 
        return asiento;    
    }
    
    public boolean cambiarEstado(Asiento asiento){
        Conexion conn = new Conexion();
        Connection reg = conn.conectar(); 
        Connection con = reg;
        
        PreparedStatement ps = null;
        ResultSet rs = null;
        
        int res = 0;
        
        String sql = "UPDATE asiento SET estado = '" + asiento.getEstado() + "' WHERE numeroAutobus = '" + asiento.getNumeroAutobus() + "' AND numeroAsiento = '" + asiento.getNumeroAsiento() + "'";
        
        try{
 
            ps = reg.prepareStatement(sql);
            res = ps.executeUpdate();                   
            return true;            
        }catch(Exception e){
            System.out.println("Error en la consulta: " + e);
            return false;
        }     
    }
    
    public boolean cancelarAsiento(Asiento asiento){
        Conexion conn = new Conexion();
        Connection reg = conn.conectar(); 
        Connection con = reg;
        
        PreparedStatement ps = null;
        ResultSet rs = null;
        
        int res = 0;
        
        String sql = "UPDATE asiento SET estado = '1' WHERE numeroAutobus = '" + asiento.getNumeroAutobus() + "' AND numeroAsiento = '" + asiento.getNumeroAsiento() + "'";
        
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
