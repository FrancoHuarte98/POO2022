package PARCIALES.RECUPERATORIO2021;

public class Deposito extends Transaccion{

    @Override
    public void hacer() {
        realizada = cuenta.depositar(monto);
    }

    @Override
    public void deshacer() {
        if(realizada){
            cuenta.extraer(monto);
            realizada = false;
        }
    }
}
