package PARCIALES.PARCIAL2022.CRITERIOS;

import PARCIALES.PARCIAL2022.Paciente;

public class CriterioSintoma implements Criterio{
    String sintoma;

    public CriterioSintoma(String sintoma) {
        this.sintoma = sintoma;
    }

    @Override
    public boolean Cumple(Paciente paciente) {
        return paciente.tieneSintoma(sintoma);
    }
}
