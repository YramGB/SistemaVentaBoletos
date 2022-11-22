package modelo;

import java.util.ArrayList;

public class Autobus {
    private int numeroAutobus;
    private String nombreOrigen;
    private String nombreDestino;
    private String fechaViaje;
    private double precioViaje;
    private String horarioViaje;

    public int getNumeroAutobus() {
        return numeroAutobus;
    }

    public void setNumeroAutobus(int numeroAutobus) {
        this.numeroAutobus = numeroAutobus;
    }

    public String getNombreOrigen() {
        return nombreOrigen;
    }

    public void setNombreOrigen(String nombreOrigen) {
        this.nombreOrigen = nombreOrigen;
    }

    public String getNombreDestino() {
        return nombreDestino;
    }

    public void setNombreDestino(String nombreDestino) {
        this.nombreDestino = nombreDestino;
    }

    public String getFechaViaje() {
        return fechaViaje;
    }

    public void setFechaViaje(String fechaViaje) {
        this.fechaViaje = fechaViaje;
    }

    public double getPrecioViaje() {
        return precioViaje;
    }

    public void setPrecioViaje(double precioViaje) {
        this.precioViaje = precioViaje;
    }

    public String getHorarioViaje() {
        return horarioViaje;
    }

    public void setHorarioViaje(String horarioViaje) {
        this.horarioViaje = horarioViaje;
    }   
}

