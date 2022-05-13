package PRACTICOS.PRACTICO4.EJERCICIO1;

import java.util.ArrayList;

public class Mineral {
    private String nombre;
    private int tipo;

    public Mineral(String nombre, int tipo) {
        this.nombre = nombre;
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }
}
