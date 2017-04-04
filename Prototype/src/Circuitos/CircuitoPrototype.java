
package Circuitos;

import java.util.HashMap;


public class CircuitoPrototype {
    private final HashMap<String, Circuito> prototipos = new HashMap<>();
public CircuitoPrototype(){
    Nor nor = new Nor("Se ensamblo una compuerta OR", "Se ensamblo una compuerta NOT","Se creo una circuito NOR");
    Nand nand = new Nand("Se ensamblo una compuerta AND","Se ensamblo una compuerta NOT","Se creo un circuito NAND");
    prototipos.put("Nor",nor);
    prototipos.put("Nand",nand);
        
    
}
public Object prototipo(String tipo) throws CloneNotSupportedException{
    return prototipos.get(tipo).clone();
}
}
