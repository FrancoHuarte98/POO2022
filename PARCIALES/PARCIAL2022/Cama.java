package PARCIALES.PARCIAL2022;

import PARCIALES.PARCIAL2022.CRITERIOS.Criterio;

import java.util.ArrayList;

public class Cama extends ElementoSIS {
    private ArrayList<String> equipamientos;
    private Paciente paciente;

    /**
     * La cama puede ser ocupada por un paciente, si el paciente
     * cumple con este criterio
     */
    private Criterio criterioAceptacion;

    public Cama(Criterio criterio){
        equipamientos = new ArrayList<>();
        paciente = null;
        this.criterioAceptacion = criterio;
    }

    public boolean estaLibre(){
        return this.paciente == null;
    }

    @Override
    public int totalCamas() {return 1;}

    @Override
    public ArrayList<Cama> getCamas(Paciente paciente) {
        ArrayList<Cama> camasQueCumplen = new ArrayList<>();

        if (this.estaLibre() && this.criterioAceptacion.Cumple(paciente)){
            camasQueCumplen.add(this);
        }
        return camasQueCumplen;
    }

    public void setPaciente(Paciente p){
        if (this.estaLibre() && criterioAceptacion.Cumple(p))
            this.paciente = p;
    }
    public void addEquipamiento(String e){
        this.equipamientos.add(e);
    }

    @Override
    public ElementoSIS getCopia(Criterio condicion) {
        if(!this.estaLibre()) {
            if (condicion.Cumple(this.paciente)) {
                //return this;//NOO! PORQUE NO ES COPIAR ES DEVOLVERSE A SI MISMO
                Cama copia = new Cama(this.criterioAceptacion);//CREA LA CAMA CON EL CRITERIO
                copia.setPaciente(this.paciente.getCopia());//PIDE UNA COPIA CON EL PACIENTE
                for (String eq:this.equipamientos)//AGREGA UNO A UNO TODOS LOS EQUIPAMIENTOS
                    copia.addEquipamiento(eq);
                return copia;
            }
        }
        return null; //TENER CUIDADO DE CONTROLARLO EN EL COMPUESTO!!!
    }
}
