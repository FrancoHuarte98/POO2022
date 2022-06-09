package PARCIALES.RECUPERATORIO2021;

public class Tranferencia extends Transaccion{
    private Cuenta c2;

    @Override
    public void hacer() {
        if(cuenta.extraer(monto)&& c2.depositar(monto)){
            realizada =true;
        }
    }

    @Override
    public void deshacer() {
        if(realizada){
            if(cuenta.depositar(monto)&& c2.extraer(monto)){
                realizada = false;
            }
        }
    }
}
