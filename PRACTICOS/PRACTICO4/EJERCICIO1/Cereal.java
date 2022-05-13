package PRACTICOS.PRACTICO4.EJERCICIO1;

import java.util.ArrayList;

public class Cereal {
        private String nombre;
        private int humedad;
        ArrayList<Mineral> minerales;


        public Cereal(String nombre, int humedad) {
            this.nombre = nombre;
            this.humedad = humedad;
            ArrayList<Mineral> minerales = new ArrayList<Mineral>();
        }
        public ArrayList<Mineral> getMinerales() {
            ArrayList<Mineral> copia = new ArrayList<Mineral>();
            copia = this.minerales;

            return copia;
        }

        public void addMinerales(Mineral m){
            if(!this.minerales.contains(m))
                minerales.add(m);
        }

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public int getHumedad() {
            return humedad;
        }

        public void setHumedad(int humedad) {
            this.humedad = humedad;
        }

        public boolean lote_apto (Lote l){
            if(this.minerales.containsAll(l.getMinerales()))
                return true;
            else
                return false;
        }


    }

}
