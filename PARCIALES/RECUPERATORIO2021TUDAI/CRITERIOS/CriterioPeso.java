package PARCIALES.RECUPERATORIO2021TUDAI.CRITERIOS;

import PARCIALES.RECUPERATORIO2021TUDAI.Elemento;

public class CriterioPeso implements Criterio{
    private int peso;

    public CriterioPeso(int peso) {
        this.peso = peso;
    }

    @Override
    public boolean Cumple(Elemento e) {
        return e.getPeso()>this.peso;
    }
}
