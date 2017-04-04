/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patron_fabrica;


import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author angom
 */
public class Entrada {

    public int texto(){
    String x = JOptionPane.showInputDialog(null,"ingresa el valor","Elija una opción",JOptionPane.QUESTION_MESSAGE);
       
      return Integer.parseInt(x);
    }
   public int CapturarDatos() {

        Scanner sc = new Scanner(System.in);
        String cad1 = sc.nextLine();
        return Integer.parseInt(cad1);

    }
}
