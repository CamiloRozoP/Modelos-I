package Circuitos;

import java.util.Scanner;

public class Main {
    static CircuitoPrototype circuito;
  
    
    public static void main(String[] args) throws Exception {
        String opcion;
        String construccion = null;
        CircuitoPrototype mp = new CircuitoPrototype();
        Muestra m = new Muestra();
        Captura a = new Captura();
        
        m.mostrar("1 para crear un circuito NAND , 2 para crear un circuito NOR");
         opcion  = a.capturar();
         if(null != opcion)
        switch (opcion) {
            case "1":
        construccion = "Nand";
                break;
            case "2":
        construccion = "Nor";       
                break;
                default:
                m.mostrar("Usted ingreso una opcion no valida, intente de nuevo");
                break;
       
        }
        Circuito c = (Circuito) mp.prototipo(construccion);
        m.mostrar(c.getCompuerta1());
        m.mostrar(c.getCompuerta2());
        m.mostrar(c.getNombre());
        }
        
    

}
