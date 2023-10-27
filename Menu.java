
package menu;

import java.util.Scanner;

public class Menu {

    public static void main(String[] args) {
    
      Scanner Scanner = new Scanner (System.in);
        
        System.out.println("¿Quieres sumar o multiplicar los valores? ");
        System.out.println("a: Sumar: ");
        System.out.println("b: Multiplicar: ");
        
        int lectura = Scanner.nextInt();
        int (opc1 >= 3);
        
        int a = 0;
        int b = 0;
        
        int opc1 = a;
        int opc2 = b;
        double num1 = 20.5;
        double num2= 40.6;
        double num3= 78.4;
        double num4 = 94.7;
        double num5 = 55.3;
        double num6 = 22.6;
        double num7 = 84.3;
        double suma = num1 + num2 + num3 + num4 + num5 + num6 + num7;
        double mult = num1 * num2 * num3 * num4 * num5 * num6 * num7 ;
        
        switch (opc1){
            case 1:
            System.out.println ("Suma"+ suma);
            break;
            case 2:
            System.out.println ("Suma"+ mult);
            break;
            case 3:
            System.out.println ("Salir");      
            default:
            System.out.println ("Opcion no disponible");   
        }
        System.out.println("La multiplicacion de los valores es: "+ suma);
        System.out.println("La multiplicacion de los valores es: "+ mult);
      }
}
