package seriefibonaccidowhile11;
//Libreria
import java.util.Scanner;

/**
 *
 * @author Erick Muke
 */
public class SerieFibonacciDoWhile11 {

    /**
     * @param args the command line arguments
     */
//    Metodo main
    public static void main(String[] args) {
        // TODO code application logic here
//        Inicializacion del metodo Scanner 
        Scanner kb = new Scanner(System.in);
//        Declcracion de variables enteras una en cero y las demas en uno
        int a = 0, x = 0, y = 1, z = 1;
//        Primer dato a ingresar
        System.out.println("Ingrese cualquier numero para la sucession: ");
        a = kb.nextInt();
//        Inicializacion de una variable i asignandole cero 
        int i = 0;
//        Inicializacion de el ciclo Do While
        do {
//            Progresion
            i++;
            z = x + y;
//            Mostrar los resultados 
            System.out.println(z + " ");
            x = y;//Igualar x a uno-----------z=2-----Asignarle a x un uno-------------z=3
            y = z;//Guadar en la variable z un uno--------Mandarle un uno a z
//            Asignacion de la variable i para que acabe hasta el numero que ingreso el ususario
        } while (i < a);

    }

}