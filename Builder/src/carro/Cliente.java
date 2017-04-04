package carro;

public class Cliente {

    private static CarroBuilder carroBuilder;

    public void costruirCarro() {
        carroBuilder.crearCarro();
        carroBuilder.buildTipo();
        carroBuilder.buildModelo();
        carroBuilder.buildMotor();
        carroBuilder.buildPuertas();
        carroBuilder.buildMarca();
    }

    public void setCarroBuilder(CarroBuilder ab) {
        carroBuilder = ab;
    }

    public static Carro getCarro() {
        return carroBuilder.getCarro();
    }

}
