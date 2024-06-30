package cuentasdebancodowhile7;

import java.util.Scanner;//Libreria

/**
 *
 * @author Erick Muke
 */
public class CuentasDebancoDoWhile7 {

    /**
     * @param args the command line arguments
     */
//    Metodo main
    public static void main(String[] args) {
        // TODO code application logic here
//        Inicializacion de el metodo Scanner 
        Scanner kb = new Scanner(System.in);
//        Declaracion de variables largas
        long a, b;
//        Inicializacion del ciclo Do While
        do {
//            Primer numero que se va ingresar 
            System.out.println("Ingrese su numero de cuenta: ");
            a = kb.nextLong();
//            Segundo numero que se va a ingresar
            System.out.println("Ingrese su saldo de su cuenta: ");
            b = kb.nextLong();
//            Si a es menor que cero
            if (a < 0) {
                System.out.println("No se permiten numeros o datos negativos");
            }
//            Si b es menor que cero
            if (b < 0) {
                System.out.println("No se permiten numeros o datos negativos");
            }
//            Si a es mayor que cero y b es mayor que cero
            if (a > 0 && b > 0) {
                System.out.println("Su cuenta es: " + a);
                System.out.println("Su saldo es: " + b);
            }
//            a tiene que ser mayor de cero para poder hacer el ciclo 
        } while (a > 0 && b > 0);
        
    }
    
}