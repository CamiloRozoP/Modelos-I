package calculadoramodelos;

public class Conversor {

    public int convertirEntero(String a) {
        return Integer.parseInt(a);
    }

    public double convertirDoble(String b) {
        return Double.parseDouble(b);
    }

    public float convertirFlotante(String c) {
        return Float.parseFloat(c);
    }

    public String convertirCadena(float t) {
        return String.valueOf(t);

    }

}
