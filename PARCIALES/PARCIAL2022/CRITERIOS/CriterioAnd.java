package PARCIALES.PARCIAL2022.CRITERIOS;

import PARCIALES.PARCIAL2022.Paciente;

public class CriterioAnd implements Criterio {

    Criterio c1;
    Criterio c2;


    @Override
    public boolean Cumple(Paciente paciente) {
        return c1.Cumple(paciente) && c2.Cumple(paciente);
    }
}
