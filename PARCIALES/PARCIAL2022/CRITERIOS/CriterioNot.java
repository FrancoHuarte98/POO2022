package PARCIALES.PARCIAL2022.CRITERIOS;

import PARCIALES.PARCIAL2022.Paciente;

public class CriterioNot implements Criterio{
    Criterio c;

    public CriterioNot(Criterio c) {
        this.c = c;
    }

    @Override
    public boolean Cumple(Paciente paciente) {
        return !c.Cumple(paciente);
    }
}
