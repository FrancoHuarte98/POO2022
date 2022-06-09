package PARCIALES.RECUPERATORIO2021;

public class Extraccion extends Transaccion{
    @Override
    public void hacer() {
        realizada = cuenta.extraer(monto);
    }

    @Override
    public void deshacer() {
        if(realizada){
            cuenta.depositar(monto);
            realizada = false;
        }
    }
}
