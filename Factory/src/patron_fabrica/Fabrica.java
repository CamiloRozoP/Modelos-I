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
public abstract class Fabrica {
    // entienda fabrica como producto de utiles escolares
    String nombre_fabrica;
    Producto articulo;

    public abstract Producto getArticulo(); 

    public abstract String getNombre_fabrica() ;

}
