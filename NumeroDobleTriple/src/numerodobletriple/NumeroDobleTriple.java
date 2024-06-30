
package numerodobletriple;

import java.util.*;//Libreria util para funciones basicas utiles 

/**
 *
 * @author Erick Muke
 */
public class NumeroDobleTriple {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here   
        Scanner kb = new Scanner(System.in);//Inicializador del Scanner 
        float a, total, total2 = 0;//Delcaracion de variables flotantes
     

        System.out.println("--------------El doble de un numero y el triple--------------");

        System.out.println("Ingrese el numero: ");//Primer dato que se quiere ingresar 
        a = kb.nextFloat();//Dato que se guarda en la variable a 

        total = a * a;//Operacion de la variable al doble
        total2 = a * a * a;//Operacion de la variable al triple

        System.out.println("El numero original es: " + a);//Impresion del numero original
        System.out.println("El numero al doble es: " + total);//Impresion de el numero doble
        System.out.println("El numero al triple es: " + total2);//Impresion de el numero triple 

    }

}
