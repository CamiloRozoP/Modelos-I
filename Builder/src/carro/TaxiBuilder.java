package carro;

public class TaxiBuilder extends CarroBuilder {

    public void buildMotor() {

        Motor motor = new Motor();
        motor.setNumero(3946813);
        motor.setPotencia("23 HP");
        carro.setMotor(motor);
    }

    public void buildModelo() {
        carro.setModelo("2009");
    }

    public void buildTipo() {
        carro.setTipo("Taxi");
    }

    public void buildPuertas() {
        carro.setCantidadPuertas(4);
    }

    public void buildMarca() {
        carro.setMarca("Renault");
    }
}
