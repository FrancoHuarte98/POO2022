package PARCIALES.RECUPERATORIO2021TUDAI.CRITERIOS;

import PARCIALES.RECUPERATORIO2021.Transaccion;
import PARCIALES.RECUPERATORIO2021TUDAI.Elemento;

import java.time.LocalDate;

public class CriterioCategoria implements Criterio {
    private String categoria;

    public CriterioCategoria(String categoria) {
        this.categoria = categoria;
    }


    @Override
    public boolean Cumple(Elemento e) {return e.getCategorias().contains(categoria);}
}
