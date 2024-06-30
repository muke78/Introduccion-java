
package area.del.triangulo;

import java.util.*;//Libreria util para funciones basicas utiles 

/**
 *
 * @author Erick Muke
 */
public class AreaDelTriangulo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner kb = new Scanner(System.in);//Inicializacion del Scanner 

        float a, b, total = 0;//Declaracion de variables flotantes

        System.out.println("----------------Area de un triangulo--------------------");

        System.out.println("Ingrese el valor de la altura del triangulo: ");//Primer dato numerico ingresado
        a = kb.nextFloat();//Variable guardada en a 
        System.out.println("Ingrese el valor de la base del triangulo: ");//Segundo dato numerico ingresado
        b = kb.nextFloat();//Variable guardada en b

        total = a * b / 2;//Operacion de la primera variable por la segunda entre dos(procesopara sacar el area)

        System.out.println("El resultado del area es: " + total);//Impresion del resultado final

    }

}
