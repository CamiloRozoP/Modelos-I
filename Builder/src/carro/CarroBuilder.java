package carro;

public abstract class CarroBuilder {

    protected Carro carro;

    public Carro getCarro() {
        return carro;
    }

    public void crearCarro() {
        carro = new Carro();
    }

    public abstract void buildMotor();

    public abstract void buildModelo();

    public abstract void buildTipo();

    public abstract void buildPuertas();

    public abstract void buildMarca();
}
