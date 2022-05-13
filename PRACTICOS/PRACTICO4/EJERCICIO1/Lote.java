package PRACTICOS.PRACTICO4.EJERCICIO1;

import java.util.ArrayList;

public class Lote {
    private ArrayList<Mineral> minerales;
    private int nro_lote;
    private int hectareas;

    public Lote( int hectareas, int nro_lote) {
        ArrayList<Mineral> minerales = new ArrayList<Mineral>();
        this.hectareas = hectareas;
        this.nro_lote = nro_lote;
    }

    public ArrayList<Mineral> getMinerales() {
        ArrayList<Mineral> copia = new ArrayList<Mineral>();
        for(int i=0;i<this.minerales.size();i++){
            copia.add(this.minerales.get(i));
        }
        return copia;
    }

    public void setMinerales(ArrayList<Mineral> minerales) {
        this.minerales = minerales;
    }

    public int getNro_lote() {
        return nro_lote;
    }

    public void setNro_lote(int nro_lote) {
        this.nro_lote = nro_lote;
    }

    public int getHectareas() {
        return hectareas;
    }

    public void setHectareas(int hectareas) {
        this.hectareas = hectareas;
    }


    public boolean cereal_apto (Cereal c){
        if(this.minerales.containsAll(c.getMinerales()))
            return true;
        else
            return false;
    }

    public boolean lote_especial() {
        for (int i = 0; i < this.minerales.size(); i++) {
            if (this.minerales.get(i).getTipo() == 1)
                return true;
            else
                return false;
        }
        return false;
    }
}
