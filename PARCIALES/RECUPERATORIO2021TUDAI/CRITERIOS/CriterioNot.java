package PARCIALES.RECUPERATORIO2021TUDAI.CRITERIOS;

import PARCIALES.RECUPERATORIO2021.Transaccion;
import PARCIALES.RECUPERATORIO2021TUDAI.Elemento;

public class CriterioNot implements Criterio {
    Criterio c;

    public CriterioNot(Criterio c) {
        this.c = c;
    }

    @Override
    public boolean Cumple(Elemento e) { return !c.Cumple(e); }
}
