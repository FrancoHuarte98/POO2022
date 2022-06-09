package PARCIALES.PARCIAL2022.CRITERIOS;

import PARCIALES.PARCIAL2022.Paciente;

public class CriterioAnd implements Criterio {

    Criterio c1;
    Criterio c2;

    public CriterioAnd(Criterio c1, Criterio c2) {
        this.c1 = c1;
        this.c2 = c2;
    }

    @Override
    public boolean Cumple(Paciente paciente) {
        return c1.Cumple(paciente) && c2.Cumple(paciente);
    }
}
