package PARCIALES.RECUPERATORIO2021.CRITERIOS;

import PARCIALES.RECUPERATORIO2021.Transaccion;

import java.time.LocalDate;

public class CriterioDia implements Criterio{
    private LocalDate date;

    public CriterioDia(LocalDate date) {
        this.date = date;
    }


    @Override
    public boolean Cumple(Transaccion t) {return this.date == t.getFecha();}
}
