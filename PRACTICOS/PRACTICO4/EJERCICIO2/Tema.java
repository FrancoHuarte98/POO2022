package PRACTICOS.PRACTICO4.EJERCICIO2;

public class Tema {
    private String nombre;
    private int tipo_tema;

    public Tema(String nombre, int tipo_tema) {
        this.nombre = nombre;
        this.tipo_tema = tipo_tema;
    }

    public String getNombre() {
        return nombre;
    }

    public int getTipo_tema() {
        return tipo_tema;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTipo_tema(int tipo_tema) {
        this.tipo_tema = tipo_tema;
    }
}

