/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patron_fabrica;

/**
 *
 * @author angom
 */
public class Fabrica_Regla extends Fabrica{
    

   public Producto getArticulo() {
        return new Producto_Regla();
    }

    public String getNombre_fabrica() {
        return "Fabrica de reglas";
    }
}
