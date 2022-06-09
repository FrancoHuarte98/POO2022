package PARCIALES.RECUPERATORIO2021TUDAI;

import PARCIALES.RECUPERATORIO2021TUDAI.CRITERIOS.Criterio;

import java.util.ArrayList;

public class Producto extends Elemento{
    private ArrayList<String> categorias;
    private int peso;
    private float precio;

    public Producto(int peso, float precio) {
        this.peso = peso;
        this.precio = precio;
        this.categorias = new ArrayList<>();
    }

    @Override
    public float getPrecio() {
        return precio;
    }

    @Override
    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public void addCategorias(String categoria) {
        if(categorias.contains(categoria)){
            categorias.add(categoria);
        }
    }

    @Override
    public ArrayList<String> getCategorias() {
        ArrayList<String> aux = new ArrayList<>();
        for(String a:categorias){
            aux.add(a);
        }
        return aux;
    }

    public int getCantidad(){
        return 1;
    }

    public Producto getMenor(){
        Producto aux= this;
        return aux;
    }

    @Override
    public ArrayList<Elemento> busqueda(Criterio c) {
        ArrayList<Elemento> aux=new ArrayList<Elemento>();
        if(c.Cumple(this))
            aux.add(this);
        return aux;
    }

    @Override
    public Elemento getCopia(Criterio c) {
        Elemento copia = new Producto(this.getPeso(), this.getPrecio());
        if(c.Cumple(this)){
            return copia;}
        else
            return null;

    }



}

