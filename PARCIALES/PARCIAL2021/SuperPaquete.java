package PARCIALES.PARCIAL2021;

import PARCIALES.PARCIAL2021.CRITERIOS.Criterio;


import java.time.LocalDate;
import java.util.ArrayList;

public class SuperPaquete extends Elemento{
    private ArrayList<Elemento> elementos;

    public SuperPaquete(int identificador, int cant_pasajeros) {
        super(identificador, cant_pasajeros);
        ArrayList<Elemento> elementos = new ArrayList<Elemento>();
    }

    public void addElemento(Elemento elemento){
        if (elementos==null)
            elementos.add(elemento);
        else
        if(elementos.get(elementos.size()-1).getCiudad_origen()==elemento.getCiudad_destino()&&elemento.getCant_pasajeros()==this.getCant_pasajeros())
            elementos.add(elemento);

    }

    @Override
    public String getCiudad_origen() {
        return elementos.get(0).getCiudad_origen();
    }

    @Override
    public String getCiudad_destino() {
        return elementos.get(elementos.size()-1).getCiudad_destino();
    }

    @Override
    public double getCosto() {
        double suma = 0.0;
        for(Elemento indice:elementos){
            suma+=indice.getCosto();
        }
        return suma;
    }

    @Override
    public LocalDate getFecha_pago() {
        int i = 0;
        LocalDate aux = null;
        while ((i < elementos.size()) && (elementos.get(i).getFecha_pago() != null)) {
            aux = elementos.get(i).getFecha_pago();
            i++;
        }
        return aux;
    }

    public ArrayList<Elemento> busqueda(Criterio criterio){
        ArrayList<Elemento> aux= new ArrayList<Elemento>();
        if( criterio.Cumple(this))
            aux.add(this);
        else
            for(Elemento indice:elementos)
                aux.addAll(indice.busqueda(criterio));
        return aux;
    }
}
