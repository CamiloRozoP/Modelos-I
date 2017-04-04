package Circuitos;

public abstract class Circuito implements Cloneable {

    private String compuerta1;
    private String compuerta2;
    private String nombre;

    public Circuito(String compuerta1, String compuerta2,String nombre) {
        setCompuerta1(compuerta1);
        setCompuerta2(compuerta2);
        setNombre(nombre);
    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public String getCompuerta1() {
        return compuerta1;
    }

    public void setCompuerta1(String compuerta1) {
        this.compuerta1 = compuerta1;
    }
    
    public String getCompuerta2() {
        return compuerta2;
    }

    public void setCompuerta2(String compuerta2) {
        this.compuerta2 = compuerta2;
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;       
}
}