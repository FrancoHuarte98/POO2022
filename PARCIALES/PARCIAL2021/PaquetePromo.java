package PARCIALES.PARCIAL2021;

import java.time.LocalDate;

public class PaquetePromo extends Paquete{
    private int porcentaje_descuento;
    private LocalDate fecha_inicio;
    private LocalDate fecha_fin;

    public PaquetePromo(int identificador,int cant_pasajeros, String ciudad_origen, String ciudad_destino, LocalDate fecha_pago, double costo, int porcentaje_descuento, LocalDate fecha_inicio, LocalDate fecha_fin ) {
        super(identificador,cant_pasajeros, ciudad_origen, ciudad_destino, fecha_pago, costo);
        this.porcentaje_descuento = porcentaje_descuento;
        this.fecha_inicio = fecha_inicio;
        this.fecha_fin = fecha_fin;
    }

    public int getPorcentaje_descuento() {
        return porcentaje_descuento;
    }

    public void setPorcentaje_descuento(int porcentaje_descuento) {
        this.porcentaje_descuento = porcentaje_descuento;
    }

    public LocalDate getFecha_inicio() {
        return fecha_inicio;
    }

    public void setFecha_inicio(LocalDate fecha_inicio) {
        this.fecha_inicio = fecha_inicio;
    }

    public LocalDate getFecha_fin() {
        return fecha_fin;
    }

    public void setFecha_fin(LocalDate fecha_fin) {
        this.fecha_fin = fecha_fin;
    }

    @Override
    public double getCosto() {

        if(this.fecha_inicio.compareTo(LocalDate.now())<0&& fecha_fin.compareTo(LocalDate.now())>0)
            return (super.getCosto()*porcentaje_descuento)/100;
        else
            return super.getCosto();
    }
}
