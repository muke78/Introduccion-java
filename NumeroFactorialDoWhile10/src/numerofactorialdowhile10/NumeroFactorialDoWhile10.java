package numerofactorialdowhile10;
//Libreria

import java.util.Scanner;

/**
 *
 * @author Erick Muke
 */
public class NumeroFactorialDoWhile10 {

    /**
     * @param args the command line arguments
     */
//    Metodo main
    public static void main(String[] args) {
//        TODO code application logic here
//        Inicializacion del metodo Scanner 
        Scanner kb = new Scanner(System.in);
//        Declaracion de variables enteras, una asignacion de cero y la otra en uno
        int a = 0, fact = 1;
//        Primer dato a ingresar
        System.out.println("Ingrese el numero para factorial");
        a = kb.nextInt();
//        Iniciailizacion de una variable i asignandole el valor introducido por el usuario 
        int i = a;
//        Inicializacion del ciclo Do While
        do {
//            Mostramos el resultado de la serie
            System.out.print(i + "  ");
//            Operacion del factorial
            fact = (fact * i);
//            Decremento 
            i--;
//            Asignacion de i que sea mayor a cero para que no salga resultado de cero
        } while (i > 0);
//        Salto de linea
        System.out.println("\n");
//        Impresion del resultado
        System.out.println("El factorial del numero " + a + " es: " + fact);

    }

}