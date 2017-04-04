package carro;

public class UberBuilder extends CarroBuilder {

    @Override
    public void buildMotor() {

        Motor motor = new Motor();
        motor.setNumero(608100121);
        motor.setPotencia("23 HP");
        carro.setMotor(motor);
    }

    public void buildModelo() {
        carro.setModelo("2009");
    }

    public void buildTipo() {
        carro.setTipo("Uber");
    }

    public void buildPuertas() {
        carro.setCantidadPuertas(2);
    }

    public void buildMarca() {
        carro.setMarca("Nissan");
    }
}
