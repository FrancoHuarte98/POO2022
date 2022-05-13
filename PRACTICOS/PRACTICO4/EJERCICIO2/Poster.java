package PRACTICOS.PRACTICO4.EJERCICIO2;

import java.util.ArrayList;

public class Poster extends Trabajo {


    public Poster(int nro_trabajo) {
        super(nro_trabajo);
        ArrayList<String> palabras_claves = new ArrayList<String>();
    }

    @Override
    public boolean Evaluador_Apto(Evaluador evaluador) {
        if(this.palabras_claves.contains(evaluador.getConocimientos()))
            return true;
        else
            return false;
    }
}

