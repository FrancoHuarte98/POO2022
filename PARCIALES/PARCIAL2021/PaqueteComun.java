package PARCIALES.PARCIAL2021;

import java.time.LocalDate;

public class PaqueteComun extends Paquete{
    private int cant_miembros;

    public PaqueteComun(int identificador,int cant_pasajeros, String ciudad_origen, String ciudad_destino, LocalDate fecha_pago, double costo, int cant_miembros) {
        super(identificador,cant_pasajeros, ciudad_origen, ciudad_destino, fecha_pago, costo);
        this.cant_miembros = cant_miembros;
    }

    public int getCant_miembros() {
        return cant_miembros;
    }

    public void setCant_miembros(int cant_miembros) {
        this.cant_miembros = cant_miembros;
    }
}
