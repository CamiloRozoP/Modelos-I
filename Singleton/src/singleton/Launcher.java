
package singleton;

/**
 *
 * @author luchoman
 */
public class Launcher {

    
    public static void main(String[] args) {
     
        Cajero cajero = Cajero.getInstance();
        cajero.setDisponibilidad("Ocupado");
        System.out.println("Cajero 1:" +cajero.getDisponibilidad() );
        
        Cajero cajero2 = Cajero.getInstance();
       System.out.println("Cajero 2:"+cajero2.getDisponibilidad());
        
       Cajero cajero3 = Cajero.getInstance();
       System.out.println("Cajero 3:"+cajero3.getDisponibilidad());
        
       cajero3.setDisponibilidad("Disponible");
       System.out.println("Cajero 1:"+cajero.getDisponibilidad());
       
       Cajero cajero4 =Cajero.getInstance();
       System.out.println("Cajero 2:"+cajero4.getDisponibilidad());
       
       cajero4.setDisponibilidad("Ocupado");
       System.out.println("Cajero 3:"+cajero2.getDisponibilidad());
    }
    
}
