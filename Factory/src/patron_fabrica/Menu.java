
package patron_fabrica;

import java.util.Scanner;


public class Menu {

    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        int opcion = 1;

        Fabrica x = null;
        Producto y = null;
        Entrada entra=new Entrada();
        Salida sale= new Salida();

        sale.salidaDatos("Opcion: \n 0 si quiere un cuaderno \n 1 si quiere una regla");

        opcion = entra.CapturarDatos();

        switch (opcion) {
            case 0:
                x = new Fabrica_Cuaderno();
            break;
            case 1:
                x = new Fabrica_Regla();
            break;
        }

        y = x.getArticulo();

        sale.salidaDatos("Fabrica: " + x.getNombre_fabrica()+"\nArticulo: " + y.getNombre()+"\nPrecio: " + y.getPrecio());
        

    }

}
