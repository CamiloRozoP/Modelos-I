package calculadoramodelos;

import java.util.Scanner;

public class EntradaConsola extends Entrada {

    @Override
    public String CapturarDatos() {

        Scanner sc = new Scanner(System.in);
        String cad1 = sc.nextLine();
        return cad1;

    }

}
