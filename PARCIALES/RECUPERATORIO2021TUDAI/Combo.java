package PARCIALES.RECUPERATORIO2021TUDAI;

import PARCIALES.RECUPERATORIO2021TUDAI.CRITERIOS.Criterio;

import java.security.interfaces.ECKey;
import java.util.ArrayList;

public class Combo extends Elemento{
    private ArrayList<Elemento> elementos;
    private CalculaPrecio c;
    private Criterio cr;


    public Combo(CalculaPrecio c, Criterio cr){
        this.elementos=new ArrayList<Elemento>();
        this.c=c;
        this.cr=cr;
    }

    public CalculaPrecio getC() {
        return c;
    }

    public Criterio getCr() {
        return cr;
    }

    public ArrayList<Elemento> getEelementos(){
        ArrayList<Elemento> aux = new ArrayList<>();
        if(elementos.size()>0)
            for(Elemento a:elementos){
                aux.add(a);
            }
        return aux;
    }

    public void addElemento(Elemento e){
        if(cr.Cumple(e))
            elementos.add(e);
    }

    public void setC(CalculaPrecio c) {
        this.c = c;
    }

    public void setCr(Criterio cr) {
        this.cr = cr;
    }

    @Override
    public int getPeso() {
        int suma =0;
        for(Elemento e:elementos){
            suma += e.getPeso();
        }
        return suma;
    }

    @Override
    public ArrayList<String> getCategorias() {
        ArrayList<String> categoriasSinRepetir = new ArrayList<>();
        for(Elemento e:elementos){
            for(String c:e.getCategorias()){
                if(!categoriasSinRepetir.contains(c)){
                    categoriasSinRepetir.add(c);
                }
            }
        }
        return  categoriasSinRepetir;
    }

    @Override
    public float getPrecio() {
        float aux=0;
        for (Elemento indice:elementos)
         aux+=this.c.calcula(indice);
        return aux;
    }

    @Override
    public int getCantidad() {
        int valor=0;
        for(Elemento indice:elementos)
            valor+=indice.getCantidad();
        return valor;
    }

    public Producto getMenor(){
        Producto aux=null;
        int menor=9999999;
        for(Elemento indice:elementos){
            if(indice.getMenor().getPeso()<menor){
                aux=getMenor();
                menor=aux.getPeso();
            }
        }
        return aux;
    }

    @Override
    public ArrayList<Elemento> busqueda(Criterio c) {
        ArrayList<Elemento> aux = new ArrayList<>();
        if(c.Cumple(this))
            aux.add(this);
        else
            for(Elemento elm:elementos)
                aux.addAll(elm.busqueda(c));
        return aux;
    }


    @Override
    public Elemento getCopia(Criterio c) {
        Combo copia = new Combo(this.getC(), this.getCr());
        for(Elemento elm:elementos){
            if(c.Cumple(elm))
                copia.addElemento(elm.getCopia(c));
        }
        if(copia.getEelementos().size()>0)
            return copia;
        else
            return null;
    }
}
