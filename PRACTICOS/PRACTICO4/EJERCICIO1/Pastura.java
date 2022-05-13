package PRACTICOS.PRACTICO4.EJERCICIO1;

import java.util.ArrayList;

public class Pastura extends Cereal{
    private int tamaño;
    private int hecatareas_minimas;

    public Pastura(String nombre, int humedad, int tamaño, int hecatareas_minimas) {
        super(nombre, humedad);
        this.tamaño = tamaño;
        this.hecatareas_minimas = hecatareas_minimas;
    }

    public int getTamaño() {
        return tamaño;
    }

    public void setTamaño(int tamaño) {
        this.tamaño = tamaño;
    }

    public int getHecatareas_minimas() {
        return hecatareas_minimas;
    }

    public void setHecatareas_minimas(int hecatareas_minimas) {
        this.hecatareas_minimas = hecatareas_minimas;
    }

    @Override
    public boolean lote_apto(Lote l) {
        if(this.minerales.containsAll(l.getMinerales())) {
            if (l.getHectareas() >= this.hecatareas_minimas)
                return true;
            else
                return false;
        }
        else
            return false;
    }
}

