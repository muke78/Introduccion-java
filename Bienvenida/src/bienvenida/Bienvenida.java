
package bienvenida;

import java.util.*;//Libreria util para funciones basicas utiles 

/**
 *
 * @author Erick Muke
 */
public class Bienvenida {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner kb = new Scanner(System.in);//Inicializacion del Scanner 
        
        String nombre;//Declaracion de una variable de tipo cadena 

        System.out.println("----------------Programa de bienvenida---------------");

        System.out.println("Ingrese su nombre: ");//Primer dato que se pide 
        nombre = kb.nextLine();//variable guardada en nombre

        System.out.println("Hola " + nombre + " te damos la bienvenida!!! :3");//Impresion del resultado
    }

}
