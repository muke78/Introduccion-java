package recursividadfactorial;
//Libreria

import java.util.Scanner;

/**
 *
 * @author Erick Muke
 */
public class RecursividadFactorial {

    /**
     * @param args the command line arguments
     */
//    Metodo main
    public static void main(String[] args) {
//        Metodo Scanner 
        Scanner kb = new Scanner(System.in);
//        Declaracionde una variable entera
        int a;
//        Creamos una nueva clase para mandarla a llamar en otra parte 
        RecursividadFactorial re = new RecursividadFactorial();
//        Ingreso de un dato para que calcule el factorial que quiera el usuario
//                a!=na*(n-1).....n-- = n !
        System.out.println("Ingrese el factorial que desee: ");
        a = kb.nextInt();
//        Impresion del resultado y mandar a llamar a la clase publica donde se va hacer la comprobacion
//        de el factorial
        System.out.println("El factorial de " + a + " mediante Metodo Recursivo es " + re.factorialRecursivo(a));
    }
//    Inicializacion de la clase factorialRecursivo 

    public int factorialRecursivo(int n) {
//        Si el numero enviado de a cachado como n es menor a 0 tendra que regresar un 0 como valor 
        if (n < 0) {
            return 0;
        } else {
//            Si es igual a 0 le tendremos que regresar un uno
//                    0! = 1
            if (n == 0) {
                return 1;
            } else {
//                Si no es ninguna de las anteriores caso se hace el factorial como se conoce

//                Se hace uso de la recursividad haciendo llamar el mismo objeto de factorialRecursivo multiplicandolo 
//                        por lo que llego de n restando uno cada vez que n sea multiplicado 
                return n * factorialRecursivo(n - 1);
            }
        }

    }

}