package PARCIALES.PARCIAL2022;

import PARCIALES.PARCIAL2022.CRITERIOS.Criterio;

import java.util.ArrayList;

public class Sala extends ElementoSIS{
    private ArrayList<ElementoSIS> elementos;


    public Sala(){
        elementos = new ArrayList<>();
    }

    public void addElemento(ElementoSIS e){
        elementos.add(e);
    }

    @Override
    public int totalCamas(){
        int contador = 0;
        for(ElementoSIS e:elementos) {
            contador += e.totalCamas();
        }
        return contador;
    }

    public ArrayList<Cama> getCamas(Paciente paciente) {
        ArrayList<Cama> camasQueCumplen = new ArrayList<>();

        for(ElementoSIS e:elementos)
            camasQueCumplen.addAll(e.getCamas(paciente));//DELEGA

        return camasQueCumplen;
    }

    public boolean tieneElementos(){
        return this.elementos.size() > 0;
    }

    public ElementoSIS getCopia(Criterio condicion) {
        Sala copia = new Sala();
        for (ElementoSIS e : elementos) {
            ElementoSIS copiaHijo = e.getCopia(condicion);
            if (copiaHijo != null)
                copia.addElemento(copiaHijo);
        }
        if (copia.tieneElementos()) //SI TIENE ALGUN ELEMENTO LO DEVUELVO SINO VACIO
            return copia;
        return null;
    }



}
