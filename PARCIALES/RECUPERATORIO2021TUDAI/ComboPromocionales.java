package PARCIALES.RECUPERATORIO2021TUDAI;

import PARCIALES.RECUPERATORIO2021TUDAI.CRITERIOS.Criterio;

public class ComboPromocionales extends Combo{

    public ComboPromocionales(CalculaPrecio c, Criterio cr) {
        super(c, cr);
    }

    @Override
    public float getPrecio() {
        float aux=0;
        int divisor=this.getCantidad();
        for (Elemento indice:this.getEelementos()){
           aux += indice.getPrecio();
        }
        return aux/divisor;
    }
}
