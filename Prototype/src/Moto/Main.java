package Moto;

import java.util.Scanner;

public class Main {
    static MotoPrototype moto;
    static Moto mn;
    static Scanner scanner = new Scanner(System.in);
    static int select = -1;
    static int num1 = 0, num2 = 0;
    public static void main(String[] args) throws Exception {
 
        MotoPrototype mp = new MotoPrototype();
        Moto motico = (Moto) mp.prototipo("ninja");
        System.out.println(motico.getPrecio);
  
    }

}
