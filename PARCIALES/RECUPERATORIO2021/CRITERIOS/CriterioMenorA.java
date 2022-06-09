package PARCIALES.RECUPERATORIO2021.CRITERIOS;

import PARCIALES.RECUPERATORIO2021.Transaccion;

public class CriterioMenorA implements Criterio {
    private float monto;

    public CriterioMenorA(float monto) {
        this.monto = monto;
    }

    @Override
    public boolean Cumple(Transaccion t) {return t.getMonto() < this.monto;}
}
