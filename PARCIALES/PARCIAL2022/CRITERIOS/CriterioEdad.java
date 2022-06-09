package PARCIALES.PARCIAL2022.CRITERIOS;

import PARCIALES.PARCIAL2022.Paciente;

public class CriterioEdad implements Criterio{
    int edad;

    public CriterioEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public boolean Cumple(Paciente paciente) {
        return paciente.getEdad()>edad;
    }
}
