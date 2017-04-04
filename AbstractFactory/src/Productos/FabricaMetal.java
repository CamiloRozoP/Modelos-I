package Productos;

public abstract class FabricaMetal extends FabricaAbstracta {

    public Regla generarRegla() {
        Regla pam = new ReglaMetal();
        return pam;
    }

    public Lapiz generarLapiz() {
        Lapiz pbm = new LapizMetal();
        return pbm;
    }

}
