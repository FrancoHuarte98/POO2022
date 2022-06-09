package PARCIALES.RECUPERATORIO2021.CRITERIOS;

import PARCIALES.RECUPERATORIO2021.Transaccion;

public class CriterioNot implements Criterio {
    Criterio c;

    public CriterioNot(Criterio c) {
        this.c = c;
    }

    @Override
    public boolean Cumple(Transaccion t) { return !c.Cumple(t); }
}
