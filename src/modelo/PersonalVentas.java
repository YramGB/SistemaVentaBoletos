package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class PersonalVentas {
    private String codigoPersonalVentas;
    private String nombrePersonalVentas;
    private String apellidoPaternoPersonalVentas;
    private String apellidoMaternoPersonalVentas;
    private String curpPersonalVentas;

    public String getCodigoPersonalVentas() {
        return codigoPersonalVentas;
    }

    public void setCodigoPersonalVentas(String codigoPersonalVentas) {
        this.codigoPersonalVentas = codigoPersonalVentas;
    }

    public String getNombrePersonalVentas() {
        return nombrePersonalVentas;
    }

    public void setNombrePersonalVentas(String nombrePersonalVentas) {
        this.nombrePersonalVentas = nombrePersonalVentas;
    }

    public String getApellidoPaternoPersonalVentas() {
        return apellidoPaternoPersonalVentas;
    }

    public void setApellidoPaternoPersonalVentas(String apellidoPaternoPersonalVentas) {
        this.apellidoPaternoPersonalVentas = apellidoPaternoPersonalVentas;
    }

    public String getApellidoMaternoPersonalVentas() {
        return apellidoMaternoPersonalVentas;
    }

    public void setApellidoMaternoPersonalVentas(String apellidoMaternoPersonalVentas) {
        this.apellidoMaternoPersonalVentas = apellidoMaternoPersonalVentas;
    }

    public String getCurpPersonalVentas() {
        return curpPersonalVentas;
    }

    public void setCurpPersonalVentas(String curpPersonalVentas) {
        this.curpPersonalVentas = curpPersonalVentas;
    } 
}