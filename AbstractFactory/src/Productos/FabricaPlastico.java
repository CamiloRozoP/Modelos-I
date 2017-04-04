package Productos;

public class FabricaPlastico extends FabricaAbstracta {

    public Regla generarRegla() {
        ReglaPlastico pa = new ReglaPlastico();
        return pa;
    }

    public Lapiz generarLapiz() {
        Lapiz pb = new LapizPlastico();
        return pb;
    }

}
