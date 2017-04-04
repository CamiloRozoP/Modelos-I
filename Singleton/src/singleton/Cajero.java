
package singleton;

public class Cajero {
    private static Cajero ocupado;
    private String disponibilidad;
    
    private Cajero(){
        
    }
    public static Cajero getInstance(){
        Cajero Disponible = null;
        if (ocupado == Disponible){
            ocupado=new Cajero();
            System.out.println("Cajero creado");
        }
        return ocupado;
    }
    public String getDisponibilidad(){
        return disponibilidad;
    }
    public void setDisponibilidad(String disponibilidad){
        this.disponibilidad = disponibilidad;
    }
}
