package PRACTICOS.PRACTICO5.EJERCICIO5;

import java.util.ArrayList;

public class Combo_Postal extends Elemento{

    private ArrayList<Elemento> elementos;


    public Combo_Postal(int tracking){
        super(tracking);
        this.elementos = new ArrayList<Elemento>();

    }

    @Override
    public String getDestinatario() {
        return elementos.get(1).getDestinatario();
    }

    @Override
    public String getDireccion() {
        return elementos.get(1).getDireccion();
    }

    @Override
    public String getTipo_envio() {
        return elementos.get(1).getTipo_envio();
    }

    @Override
    public float getPeso() {
        float peso = 0;
        for (int i = 0; i < elementos.size(); i++){
            Elemento aux = this.elementos.get(i);
            peso += aux.getPeso();
        }
        return peso;
    }

    @Override
    public void setTracking(int tracking) {
        for(int i=0; i < elementos.size(); i++){
            Elemento aux = this.elementos.get(i);
            aux.setTracking(tracking);
        }
    }

    public void addElemento(Elemento elemento){
        if(this.getDireccion().equals(elemento.getDireccion())) {
            elemento.setTracking(this.getTracking());
            elementos.add(elemento);
        }
    }
}
