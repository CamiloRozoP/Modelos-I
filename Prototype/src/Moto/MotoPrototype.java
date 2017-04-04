
package Moto;

import java.util.HashMap;


public class MotoPrototype {
    private HashMap<String, Moto> prototipos = new HashMap<String,Moto>();
public MotoPrototype(){
    Ninja ninja = new Ninja("Suzuki",150, "Roja",3999.999,3000.000);
    Carreras carreras = new Carreras("Kawazaki",250,"Amarillo",5999.999, 4500.000);
    prototipos.put("Ninja",ninja);
    prototipos.put("Carreras",carreras);
        
    
}
public Object prototipo(String tipo) throws CloneNotSupportedException{
    return prototipos.get(tipo).clone();
}
}
