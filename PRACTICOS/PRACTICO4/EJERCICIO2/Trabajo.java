package PRACTICOS.PRACTICO4.EJERCICIO2;

import java.util.ArrayList;

public class Trabajo {
    protected ArrayList<Tema> palabras_claves;
    private int nro_trabajo;

    public Trabajo(int nro_trabajo) {
        this.nro_trabajo = nro_trabajo;
        ArrayList<String> palabras_claves = new ArrayList<String>();
    }

    public int getNro_trabajo() {
        return nro_trabajo;
    }

    public ArrayList<Tema> getPalabras_claves() {
        ArrayList<Tema> copia = new ArrayList<Tema>();
        copia = this.palabras_claves;

        return copia;
    }

    public void addPalabras(Tema palabra){
        if(!(this.palabras_claves.contains(palabra)))
            palabras_claves.add(palabra);
    }

    public boolean Evaluador_Apto(Evaluador evaluador){
        if(this.palabras_claves.containsAll(evaluador.getConocimientos()))
            return true;
        else
            return false;
    }
}
