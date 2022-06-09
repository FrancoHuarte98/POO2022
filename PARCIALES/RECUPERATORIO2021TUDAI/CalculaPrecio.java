package PARCIALES.RECUPERATORIO2021TUDAI;

public class CalculaPrecio implements Calcula {
    private float descuento_por_producto;
    private float descuento_Maximo;

    public CalculaPrecio(float descuento_por_producto, float descuento_Maximo) {
        this.descuento_por_producto = descuento_por_producto;
        this.descuento_Maximo = descuento_Maximo;
    }

    public float getDescuento_Maximo() {
        return descuento_Maximo;
    }

    public float getDescuento_por_prodcuto() {
        return descuento_por_producto;
    }

    public void setDescuento_Maximo(float descuento_Maximo) {
        this.descuento_Maximo = descuento_Maximo;
    }

    public void setDescuento_por_producto(float descuento_por_producto) {
        this.descuento_por_producto = descuento_por_producto;
    }

    @Override
    public float calcula(Elemento elemento) {
        float aux=descuento_por_producto* elemento.getCantidad();
        if(aux<descuento_Maximo)
            return elemento.getPrecio()-((elemento.getPrecio()*aux)/100);
        else
            return elemento.getPrecio()-((elemento.getPrecio()*descuento_Maximo)/100);
    }
}
