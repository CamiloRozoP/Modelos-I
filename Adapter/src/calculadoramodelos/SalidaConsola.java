package calculadoramodelos;

public class SalidaConsola extends Salida {

    Salida salida = new Salida() {
        @Override
        public void salidaDatos(String x) {
            System.out.println(x);
        }

        @Override

        public void resultadoSuma(String b) {
            salida.salidaDatos("La suma de ambos números es:" + b);

        }

        @Override
        public void resultadoResta(String r) {
            salida.salidaDatos("La resta de ambos números es:" + r);
        }

        @Override
        public void resultadoDivision(String d) {
            salida.salidaDatos("La división de ambos números es:" + d);
        }

        @Override
        public void resultadoMultiplicacion(String m) {
            salida.salidaDatos("La multiplicación de ambos números es:" + m);
        }

    };

    public void salidaDatos(String x) {
        System.out.println(x);
    }

    @Override
    public void resultadoSuma(String b) {
        salida.salidaDatos("La suma de ambos números es:" + b);

    }

    @Override
    public void resultadoResta(String r) {
        salida.salidaDatos("La resta de ambos números es:" + r);
    }

    @Override
    public void resultadoDivision(String d) {
        salida.salidaDatos("La Divisiòn de ambos números es:" + d);
    }

    @Override
    public void resultadoMultiplicacion(String m) {
        salida.salidaDatos("La multiplicación de ambos números es:" + m);
    }

}
