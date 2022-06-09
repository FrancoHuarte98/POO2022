package PARCIALES.RECUPERATORIO2021;

import java.time.LocalDate;

public abstract class Transaccion {
       Cuenta cuenta;
       LocalDate fecha;
       float monto;
       boolean realizada;


      public Cuenta getCuenta() {
            return cuenta;
      }

      public LocalDate getFecha() {
            return fecha;
      }

      public float getMonto() {
            return monto;
      }

      public void setMonto(float monto) {
            this.monto = monto;
      }

      public abstract void hacer();
      public abstract  void deshacer();


}
