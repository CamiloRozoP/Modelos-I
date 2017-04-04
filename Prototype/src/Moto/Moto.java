package Moto;

public abstract class Moto implements Cloneable {

    private String marca;
    private int cilindraje;
    private String color;
    private double precio;
    boolean getPrecio;

    public Moto(String marca, int cilindraje, String color, double precio) {
        setMarca(marca);
        setCilindraje(cilindraje);
        setPrecio(precio);
        setColor(color);
    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getCilindraje() {
        return cilindraje;
    }

    public void setCilindraje(int cilindraje) {
        this.cilindraje = cilindraje;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
