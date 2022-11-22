package modelo;        

import java.util.ArrayList;

public class Pasajero {    
    private String nombrePasajero;
    private String apellidoPaternoPasajero;
    private String apellidoMaternoPasajero;

    private ArrayList<Pasajero> listaPasajeros = new ArrayList<>();

    public void add(Pasajero pasajero){
        listaPasajeros.add(pasajero);
    }
    
    public String obtenerPasajero(){        
        String pasajero = "";
        for(int i = 0; i < listaPasajeros.size(); i++) {           
            String nombre = listaPasajeros.get(i).getNombrePasajero();
            String apellidoP = listaPasajeros.get(i).getApellidoPaternoPasajero();
            String apellidoM = listaPasajeros.get(i).getApellidoPaternoPasajero();;
            return "\nNombre: " + nombre
                 + "\nApellido Paterno: " + apellidoP 
                 + "\nApellido Materno: " + apellidoM;
        } 
        return pasajero;
    }  
        
    public String getNombrePasajero() {
        return nombrePasajero;
    }

    public void setNombrePasajero(String nombrePasajero) {
        this.nombrePasajero = nombrePasajero;
    }

    public String getApellidoPaternoPasajero() {
        return apellidoPaternoPasajero;
    }

    public void setApellidoPaternoPasajero(String apellidoPaternoPasajero) {
        this.apellidoPaternoPasajero = apellidoPaternoPasajero;
    }

    public String getApellidoMaternoPasajero() {
        return apellidoMaternoPasajero;
    }

    public void setApellidoMaternoPasajero(String apellidoMaternoPasajero) {
        this.apellidoMaternoPasajero = apellidoMaternoPasajero;
    }

    
    
}
