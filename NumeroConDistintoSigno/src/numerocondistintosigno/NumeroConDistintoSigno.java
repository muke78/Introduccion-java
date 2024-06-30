
package numerocondistintosigno;

import java.util.*;//Libreria util para funciones basicas utiles 

/**
 *
 * @author Erick Muke
 */
public class NumeroConDistintoSigno {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner kb = new Scanner(System.in);//Inicializador del Scanner 

        float a, total = 0;//Declaracion de las variables flotantes

        System.out.println("---------------Numero con distinto signo------------------");

        System.out.println("Ingrese un numero: ");//Primer dato que se quiere pedir 
        a = kb.nextInt();//Dato guardado en la variable a

        total = a * (-1);//Operacion multiplicado por un numero negativo 

        System.out.println("El valor con diferente signo es: " + total);//Impresion del resultado

    }
}
