package dieznumerosmayoresacienwhile12;

import java.util.Scanner;//Libreria

/**
 *
 * @author Erick Muke
 */
public class DiezNumerosMayoresACienWhile12 {

    /**
     * @param args the command line arguments
     */
    //Metodo main
    public static void main(String[] args) {
        // TODO code application logic here
        //Inicializacion del Scanner 
        Scanner kb = new Scanner(System.in);
        //Variables enteras a ocupar
        int num, suma = 0;
        //Declaracion de una variable entera i que inicie en 0
        int i = 0;
        //Inicializacion del ciclo de control while
        while (i < 10) {
            //Primer dato que le daremos al programa
            System.out.println("Introduce un numero: ");
            num = kb.nextInt();
            suma = suma + num;
            //Incrememto
            i++;
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