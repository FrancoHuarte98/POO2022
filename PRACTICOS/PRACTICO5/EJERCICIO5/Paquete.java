package PRACTICOS.PRACTICO5.EJERCICIO5;

public class Paquete extends Elemento{
    private String destinatario;
    private String direccion;
    private String tipo_envio;
    private float peso;

    public Paquete(int tracking, String destinatario, String direccion, String tipo_envio, float peso) {
        super(tracking);
        this.destinatario = destinatario;
        this.direccion = direccion;
        this.tipo_envio = tipo_envio;
        this.peso = peso;
    }

    @Override
    public String getDestinatario() {
        return destinatario;
    }

    public void setDestinatario(String destinatario) {
        this.destinatario = destinatario;
    }

    @Override
    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public String getTipo_envio() {
        return tipo_envio;
    }

    public void setTipo_envio(String tipo_envio) {
        this.tipo_envio = tipo_envio;
    }

    @Override
    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }


}
