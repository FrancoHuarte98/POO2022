package PARCIALES.RECUPERATORIO2021;

import PARCIALES.RECUPERATORIO2021.CRITERIOS.Criterio;

import java.util.ArrayList;

public class Banco {
    private ArrayList<Cuenta> cuentas;
    private ArrayList<Transaccion> transacciones;
    private float impCheque;

    public Banco( float impCheque) {
        ArrayList<Cuenta> cuentas = new ArrayList<>();
        ArrayList<Transaccion> transacciones = new ArrayList<>();
        this.impCheque = impCheque;
    }

    public float getImpCheque() {
        return impCheque;
    }

    public void setImpCheque(float impCheque) {
        this.impCheque = impCheque;
    }

    public ArrayList<Cuenta> agregarCuenta(Cuenta c) {

        if(!cuentas.contains(c)){
           cuentas.add(c);
        }
        return cuentas;
    }

    public ArrayList<Cuenta> quitarCuenta(Cuenta c){
        if(cuentas.contains(c)){
            cuentas.remove(c);
        }
        return cuentas;
    }

    public void agregarTransaccion(Transaccion t) {
       t.hacer();
       transacciones.add(t);
    }

    public ArrayList<Transaccion> buscar(Criterio c){
        ArrayList<Transaccion> aux = new ArrayList<>();

        for(Transaccion t:transacciones){
            if(c.Cumple(t)){
                aux.add(t);
            }
        }
        return aux;
    }

    public void deshacer(Criterio c){
        for(Transaccion t:transacciones){
            if(c.Cumple(t)){
                t.deshacer();
            }
        }
    }
}
