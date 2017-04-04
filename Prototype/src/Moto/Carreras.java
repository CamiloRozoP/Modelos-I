
package Moto;


public class Carreras extends Moto{
    private double costoFabricacion;
    
   public Carreras (String marca, int cilindraje, String color, double precio, double costoFabricacion){
       super(marca,cilindraje,color,precio);
       setCostoFabricacion(costoFabricacion);
       
   } 
private double getCostoFabricacion(){
        return costoFabricacion;
    }
    private void setCostoFabricacion(double costoFabricacion) {
this.costoFabricacion=costoFabricacion;
    }
}
