package PARCIALES.PARCIAL2022;

import java.util.ArrayList;

public class Paciente {
    private String nombre;
    private int edad;
    private ArrayList<String> sintomas;
    private ArrayList<String> equipamiento;

    public Paciente(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
        this.sintomas = new ArrayList<>();
        this.equipamiento = new ArrayList<>();
    }

    public String getNombre() {return nombre;}

    public void setNombre(String nombre) {this.nombre = nombre;}

    public int getEdad() {return edad;}

    public void setEdad(int edad) {this.edad = edad;}

    public boolean tieneSintoma(String sintoma) {
        return this.sintomas.contains(sintoma);
    }

    public void addSintoma(String sintoma) {
        this.sintomas.add(sintoma);
    }

    public boolean requiereEquipo(String equipo) {
        return equipamiento.contains(equipo);
    }

    public void addEquipoRequerido(String equipoRequerido) {
        this.equipamiento.add(equipoRequerido);
    }

    //COPIA AL PACIENTE
    public Paciente getCopia() {
        Paciente copia = new Paciente(this.nombre, this.edad);
        for(String sintoma:sintomas){
            copia.addSintoma(sintoma);
        }
        for(String eq:equipamiento){
            copia.addEquipoRequerido(eq);
        }
        return copia;
    }
}
