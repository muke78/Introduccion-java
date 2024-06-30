
package kilometros.a.metros;

import java.util.*;//Libreria util para funciones basicas utiles 

/**
 *
 * @author Erick Muke
 */
public class KilometrosAMetros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner kb = new Scanner(System.in);//Inicializador de Scanner 

        int a, total = 0;//Declaracion de las variables enteras 

        System.out.println("-----------------Kilometros a metros-----------------");

        System.out.println("Ingrese el valor numerico en kilometros: ");//Primer dato solicititado
        a = kb.nextInt();//Dato guardado en la variable a

        total = a * 1000;//Operacion para convertir a metros

        System.out.println("El valor en metros es: " + total + " metros");//Impresion del resultado

    }
}
