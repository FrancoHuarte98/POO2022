package PARCIALES.RECUPERATORIO2021TUDAI.CRITERIOS;

import PARCIALES.RECUPERATORIO2021TUDAI.Elemento;

public class CriterioPrecioMenorA implements Criterio {
    private float precio;

    public CriterioPrecioMenorA(float precio) {
        this.precio = precio;
    }

    @Override
    public boolean Cumple(Elemento e) {return e.getPrecio() < this.precio;}
}
