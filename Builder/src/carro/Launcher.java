package carro;

import java.util.Scanner;

public class Launcher {

    static Cliente dueño;
    static Cliente cliente2;
    static Carro auto;
    static Scanner scanner = new Scanner(System.in);
    static int select = -1;
    static int num1 = 0, num2 = 0;

    public static void main(String[] args) throws Exception {

        dueño = new Cliente();
        cliente2 = new Cliente();

        dueño.setCarroBuilder(new TaxiBuilder());

        dueño.costruirCarro();

        cliente2.setCarroBuilder(new UberBuilder());
        cliente2.costruirCarro();
        auto = Cliente.getCarro();

        while (select != 0) {
            try {
                System.out.println("Elige el tipo de vehículo a construir:\n1.- Taxi"
                        + "\n2.- Uber\n"
                );

                select = Integer.parseInt(scanner.nextLine());

                switch (select) {
                    case 1:
                        dueño.setCarroBuilder(new TaxiBuilder());

                        dueño.costruirCarro();
                        break;
                    case 2:
                        cliente2.setCarroBuilder(new UberBuilder());
                        cliente2.costruirCarro();
                        break;

                }
            } catch (Exception e) {
                System.out.println("La embarró, idiota");
            }

            System.out.println("Tipo de Vehículo:" + "  " + Carro.getTipo());
            System.out.println("Modelo:" + "  " + Carro.getModelo());
            System.out.println("Número de puertas:" + "  " + Carro.getCantidadPuertas());
            System.out.println("Marca:" + "  " + Carro.getMarca());
            System.out.println("Especificaciones del motor:" + "  " + "*Numero de motor: " + Motor.getNumero() + " " + "*Potencia: " + Motor.getPotencia());
        }
    }
}
