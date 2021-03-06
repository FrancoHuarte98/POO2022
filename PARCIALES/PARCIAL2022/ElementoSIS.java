package PARCIALES.PARCIAL2022;

import PARCIALES.PARCIAL2022.CRITERIOS.Criterio;

import java.util.ArrayList;

public abstract class ElementoSIS {
    public abstract int totalCamas();
    public abstract ArrayList<Cama> getCamas(Paciente paciente);
    public abstract ElementoSIS getCopia(Criterio condicion);

}
