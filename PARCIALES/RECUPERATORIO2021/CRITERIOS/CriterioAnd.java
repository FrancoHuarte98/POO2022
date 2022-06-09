package PARCIALES.RECUPERATORIO2021.CRITERIOS;

import PARCIALES.RECUPERATORIO2021.Transaccion;

public class CriterioAnd implements Criterio{
    Criterio c1;
    Criterio c2;

    public CriterioAnd(Criterio c1, Criterio c2) {
        this.c1 = c1;
        this.c2 = c2;
    }

    @Override
    public boolean Cumple(Transaccion t) { return c1.Cumple(t) && c2.Cumple(t);}
}
