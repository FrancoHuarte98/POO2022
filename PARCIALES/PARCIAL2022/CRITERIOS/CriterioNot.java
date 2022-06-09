package PARCIALES.PARCIAL2022.CRITERIOS;

import PARCIALES.PARCIAL2022.Paciente;

public class CriterioNot implements Criterio{
    Criterio c;

    @Override
    public boolean Cumple(Paciente paciente) {
        return !c.Cumple(paciente);
    }
}
