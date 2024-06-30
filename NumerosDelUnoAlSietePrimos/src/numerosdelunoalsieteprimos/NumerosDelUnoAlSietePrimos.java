package numerosdelunoalsieteprimos;

import static java.lang.System.exit;
import java.util.*;

/**
 *
 * @author Erick Muke
 */
public class NumerosDelUnoAlSietePrimos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner kb = new Scanner(System.in);

        int a, b;
        int n = 2;

        System.out.println("-----------------------Bienvenido---------------------------");

        System.out.println("Ingrese el primer dato: ");
        a = kb.nextInt();
        System.out.println("Ingrese el segundo dato: ");
        b = kb.nextInt();

        if (a <= 7 && b <= 7) {
            System.out.println("Los numeros estan en el rango de 1 a 7");
        } else {
            System.out.println("Solo puede llegar hasta 7");
            exit(0);
        }
        /*if (a % 2 == 0) {
            System.out.println("El numero no es primo: " + a);
        } else {
            System.out.println("El numero es primo: " + a);
        }

        if (b % 2 == 0) {
            System.out.println("El numero no es primo: " + b);
        } else {
            System.out.println("El numero es primo: " + b);
        }*/

        if (a % 2 == 0 || b % 2 == 0) {//Condicion que me dice si ambos numeros no son primos
            System.out.println("Ambos numeros no son primos: " + a + " y " + b);
        } else {//Entonces si no se cumple es que si son primos 
            System.out.println("Ambos numeros si son primos: " + a + " y " + b);
        }

    }

}
