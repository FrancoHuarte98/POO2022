package PARCIALES.PARCIAL2022.CRITERIOS;

import PARCIALES.PARCIAL2022.Paciente;

public class CriterioNecesita implements Criterio{
    String equipo;

    public CriterioNecesita(String equipo) {
        this.equipo = equipo;
    }

    @Override
    public boolean Cumple(Paciente paciente) {
        return paciente.requiereEquipo(equipo);
    }
}
