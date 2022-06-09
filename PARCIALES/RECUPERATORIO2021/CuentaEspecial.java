package PARCIALES.RECUPERATORIO2021;

public class CuentaEspecial extends Cuenta{
    private float descubierto;

    public CuentaEspecial(int numero, String titular, float saldo, float descubierto) {
        super(numero, titular, saldo);
        this.descubierto = descubierto;
    }

    @Override
    public boolean extraer(float cant) {
        return ((this.getSaldo()-cant+descubierto)>=0);
    }
}
