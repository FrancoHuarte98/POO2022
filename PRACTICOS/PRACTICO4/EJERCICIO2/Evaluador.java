package PRACTICOS.PRACTICO4.EJERCICIO2;

import java.util.ArrayList;

public class Evaluador {
    private int nro_evaluador;
    private int cantidad_trabajos;
    private ArrayList<Tema> conocimientos;


    public Evaluador(int nro_evaluador, int cantidad_trabajos) {
        this.nro_evaluador = nro_evaluador;
        this.cantidad_trabajos = cantidad_trabajos;
        ArrayList<Tema> temas = new ArrayList<Tema>();
    }

    public int getNro_evaluador() {
        return nro_evaluador;
    }

    public int getCantidad_trabajos() {
        return cantidad_trabajos;
    }

    public ArrayList<Tema> getConocimientos() {
        ArrayList<Tema> copia = new ArrayList<Tema>();
        copia = this.conocimientos;

        return copia;
    }

    public void addConocimientos(Tema conocimiento){
        if(!this.conocimientos.contains(conocimiento))
            conocimientos.add(conocimiento);
    }

    public boolean Trabajos_Aptos(Trabajo trabajo){
        if(this.conocimientos.containsAll(trabajo.getPalabras_claves()))
            return true;
        else
            return false;
    }

    public boolean Evaluador_Experto(){
        for(int i = 0; i < conocimientos.size(); i++){
            if(this.conocimientos.get(i).getTipo_tema() == 1)
                return true;
            else
                return false;
        }
        return false;
    }
}

