package PARCIALES.RECUPERATORIO2021TUDAI;

import PARCIALES.RECUPERATORIO2021TUDAI.CRITERIOS.Criterio;

import java.util.ArrayList;

public abstract class Elemento {

    public abstract int getPeso();
    public abstract float getPrecio();
    public abstract ArrayList<String> getCategorias();
    public abstract int getCantidad();
    public abstract Producto getMenor();
    public abstract ArrayList<Elemento> busqueda(Criterio c);
    public abstract Elemento getCopia(Criterio c);

}
