package calculadoramodelos;

public class Cliente {

    public static void main(String[] args) {
        Entrada entrada;
        Salida salida;
        Conversor ad;
        Suma sumar;
        Resta restar;
        Multiplicacion multiplicar;
        Division dividir;
        entrada = new EntradaConsola();
        salida = new SalidaConsola();

        salida.salidaDatos("Calculadora");
        ad = new Conversor();
        sumar = new Suma();
        restar = new Resta();
        multiplicar = new Multiplicacion();
        dividir = new Division();

        salida.salidaDatos("Ingresa los numeros que desea operar");
        salida.salidaDatos("Número 1.");
        int n1 = ad.convertirEntero(entrada.CapturarDatos());
        salida.salidaDatos("Número 2.");
        int n2 = ad.convertirEntero(entrada.CapturarDatos());
        salida.resultadoSuma(ad.convertirCadena(sumar.sumaEnteros(n1, n2)));
        salida.resultadoResta(ad.convertirCadena(restar.restaEnteros(n1, n2)));
        salida.resultadoMultiplicacion(ad.convertirCadena(multiplicar.multiplicaEnteros(n1, n2)));
        salida.resultadoDivision(ad.convertirCadena(dividir.divideEnteros(n1, n2)));
    }
}
