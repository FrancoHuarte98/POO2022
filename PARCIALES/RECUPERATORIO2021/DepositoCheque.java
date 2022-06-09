package PARCIALES.RECUPERATORIO2021;

public class DepositoCheque extends Transaccion{
    private int cheque;
    private float impuesto;

    public DepositoCheque(int cheque, float impuesto) {
        this.cheque = cheque;
        this.impuesto = impuesto;
    }

    @Override
    public void hacer() {
       realizada = cuenta.depositar(monto-(monto*impuesto));
       EMailServer.sendMail("afip@gov.ar", "deposito cheque", "12"+ cheque+ impuesto);
    }

    @Override
    public void deshacer() {
        if(realizada){
            cuenta.extraer(monto-(monto*impuesto));
            realizada = false;
            EMailServer.sendEmail("afip@gov.ar", "cancelacion cheque", "12"+ cheque);
        }

    }
}
