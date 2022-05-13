package PRACTICOS.PRACTICO4.EJERCICIO1;

import java.util.ArrayList;

public class Cosecha_Fina extends Cereal {
        private int tamaño;


        public Cosecha_Fina(String nombre, int humedad, int tamaño) {
            super(nombre,humedad);
            this.tamaño = tamaño;
        }
        public int getTamaño() {
            return tamaño;
        }

        public void setTamaño(int tamaño) {
            this.tamaño = tamaño;
        }


}

