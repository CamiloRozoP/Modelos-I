package carro;

import java.util.function.Function;
import carro.Motor;

public class Carro {

    private static int cantidadPuertas;
    private static String modelo;
    private static String tipo;
    private static Motor motor;
    private static String marca;

    public static int getCantidadPuertas() {
        return cantidadPuertas;
    }

    public void setCantidadPuertas(int cantidadPuertas) {
        this.cantidadPuertas = cantidadPuertas;
    }

    public static String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public static String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public static String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public static Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        Motor auto = null;
        this.motor = auto;
    }

}
