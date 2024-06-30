
package intercambiodevalores;

import java.util.*;//Libreria util para funciones basicas utiles 

/**
 *
 * @author Erick Muke
 */
public class IntercambioDeValores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner kb = new Scanner(System.in);//Inicializacion del Scanner 
        
        int a, b, c, d = 0;//Declaracion de variables enteras

        System.out.println("-------------------Intercambio de valores--------------------");

        System.out.println("Ingrese el primer valor: ");//Primer dato que se va a ingresar
        a = kb.nextInt();//Variable guardada en a
        System.out.println("Ingrese el segundo valor: ");//Segundo dato que se va a ingresar
        b = kb.nextInt();//variable guardada en b
        System.out.println("Intercambiar el primer valor: ");//Dato que se va a intercambiar por el primero
        c = kb.nextInt();//Variable guardada en c
        System.out.println("Intercambiar el segundo valor: ");//Dato que se a intercambiar por el segundo
        d = kb.nextInt();//Variable guardada en d

        System.out.println("Los numeros reales son: " + a + " " + b);//Impreson de numeros originales 
        System.out.println("Los numeros intercambiados son: " + c + " " + d);//Impresion de numeros intercambiados 

    }

}
