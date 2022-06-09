package PARCIALES.RECUPERATORIO2021TUDAI.CRITERIOS;

import PARCIALES.RECUPERATORIO2021.Transaccion;
import PARCIALES.RECUPERATORIO2021TUDAI.Elemento;

public class CriterioAnd implements Criterio {
    Criterio c1;
    Criterio c2;

    public CriterioAnd(Criterio c1, Criterio c2) {
        this.c1 = c1;
        this.c2 = c2;
    }

    @Override
    public boolean Cumple(Elemento e) { return c1.Cumple(e) && c2.Cumple(e);}
}
