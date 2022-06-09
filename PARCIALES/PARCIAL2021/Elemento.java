package PARCIALES.PARCIAL2021;

import PARCIALES.PARCIAL2021.CRITERIOS.Criterio;

import java.time.LocalDate;
import java.util.ArrayList;

public abstract class Elemento {
    private int identificador;
    private int cant_pasajeros;

    public Elemento(int identificador, int cant_pasajeros) {
        this.identificador = identificador;
        this.cant_pasajeros = cant_pasajeros;
    }


    public int getIdentificador() {
        return identificador;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    public int getCant_pasajeros() {
        return cant_pasajeros;
    }

    public void setCant_pasajeros(int cant_pasajeros) {
        this.cant_pasajeros = cant_pasajeros;
    }

    public abstract LocalDate getFecha_pago();
    public  abstract double getCosto();
    public abstract String getCiudad_destino();
    public abstract String getCiudad_origen();
    public abstract ArrayList<Elemento> busqueda(Criterio criterio);


}

