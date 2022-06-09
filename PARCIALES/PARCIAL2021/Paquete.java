package PARCIALES.PARCIAL2021;

import PARCIALES.PARCIAL2021.CRITERIOS.Criterio;

import java.time.LocalDate;
import java.util.ArrayList;

public class Paquete extends Elemento{

    private String ciudad_origen;
    private String ciudad_destino;
    private LocalDate fecha_pago;
    private ArrayList<String> datos_alojamiento;
    private double costo;

    public Paquete(int identificador, int cant_pasajeros, String ciudad_origen, String ciudad_destino, LocalDate fecha_pago, double costo) {
        super(identificador, cant_pasajeros);
        this.ciudad_origen = ciudad_origen;
        this.ciudad_destino = ciudad_destino;
        this.fecha_pago = fecha_pago;
        this.costo = costo;
        ArrayList<String> datos_alojamiento = new ArrayList<>();
    }



    public String getCiudad_origen() {
        return ciudad_origen;
    }

    public void setCiudad_origen(String ciudad_origen) {
        this.ciudad_origen = ciudad_origen;
    }

    public String getCiudad_destino() {
        return ciudad_destino;
    }

    public void setCiudad_destino(String ciudad_destino) {
        this.ciudad_destino = ciudad_destino;
    }

    public LocalDate getFecha_pago() {
        return fecha_pago;
    }

    public void setFecha_pago(LocalDate fecha_pago) {
        this.fecha_pago = fecha_pago;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public ArrayList<Elemento> busqueda(Criterio criterio){
        ArrayList<Elemento> aux = new ArrayList<Elemento>();
        if(criterio.Cumple(this)){
            aux.add(this);
        }
        return aux;
    }
}

