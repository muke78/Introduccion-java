
package dieznumerosmayoresacienfor12;
//Libria ocupada para el metodo Scanner

import java.util.*;

/**
 *
 * @author Erick Muke
 */
public class DiezNumerosMayoresACienFor12 {

    /**
     * @param args the command line arguments
     */
//Inicializacion del metodo main 
    public static void main(String[] args) {
        // TODO code application logic here
        //Inicializacion del Scanner 
        Scanner kb = new Scanner(System.in);
        //Variables enteras a ocupar
        int num, suma = 0;
        //Inicializacion de la setencia de control for
        for (int i = 0; i < 10; i++) {
            //Primer dato que le daremos al programa
            System.out.println("Introduce un numero: ");
            num = kb.nextInt();
            suma = suma + num;
            //Iniciador de la setencia de control if
            if (num > 100) {
                System.out.println("El numero es mayor que cien");
            } else {//Entonces si no se cumple
                System.out.println("El numero es menor que cien");
            }
            //Suma total
            System.out.println("La suma es: " + suma);
        }

    }

}
