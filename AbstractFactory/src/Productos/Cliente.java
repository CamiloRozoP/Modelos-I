package Productos;

import java.util.Scanner;

public class Cliente {

    /**
     * @param args the command line arguments
     */
    FabricaPlastico factory;

    public static void main(String[] args) {
        System.out.println("Bienvenido, escoja el producto a comprar:");
        System.out.println("1.Si desea una regla");
        System.out.println("2.Si desea un Lapiz");
        System.out.println("Digite el numero");
        Scanner s = new Scanner(System.in);
        Scanner sc = new Scanner(System.in);
        int opcion1 = 0;
        opcion1 = s.nextInt();
        int opcion2 = 0;
        opcion2 = sc.nextInt();
        System.out.println("Usted escogió el producto. " + opcion1);
        System.out.println("Escoja el material del producto.");

        System.out.println("1.Plástico");
        System.out.println("2.Metal");
        System.out.println("Digite el numero");
        int mat = s.nextInt();
        System.out.println("El producto escogido es" + opcion1 + "del material" + opcion2);

        Fabrica x = FabricaAbstracta.tipo(opcion1);
        System.out.println("Articulo: " + x.getNombre());
        System.out.println("Precio: " + x.getPrecio());

    }

}
