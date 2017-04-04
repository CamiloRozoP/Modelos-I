package Productos;

public abstract class FabricaAbstracta {

    Regla r;
    Lapiz l;

    public abstract Regla generarRegla();

    public abstract Lapiz generarLapiz();

    public static Fabrica tipo(int tipo) {
        Fabrica x;
        switch (tipo) {
            case 0:
                x = new Regla();
                break;
            case 1:
                x = new Lapiz();
                break;

            default:
                x = null;
        }

        return x;

 
    }
}