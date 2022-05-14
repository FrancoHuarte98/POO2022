package PRACTICOS.PRACTICO5.EJERCICIO5;

public abstract class Elemento {
    private int tracking;

    public Elemento(int tracking) {
        this.tracking = tracking;
    }

    public int getTracking() {
        return tracking;
    }

    public void setTracking(int tracking) {
        this.tracking = tracking;
    }

    public abstract float getPeso();
    public abstract String getDireccion();
    public abstract String getDestinatario();
    public abstract String getTipo_envio();

}
