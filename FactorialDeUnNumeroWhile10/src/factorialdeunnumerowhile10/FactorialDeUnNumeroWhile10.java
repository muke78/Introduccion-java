package factorialdeunnumerowhile10;

import java.util.Scanner;//Libreria

/**
 *
 * @author Erick Muke
 */
public class FactorialDeUnNumeroWhile10 {

    /**
     * @param args the command line arguments
     */
    //Metodo main
    public static void main(String[] args) {
        // TODO code application logic here
        //Declaracion de variables enteras
        int a, fact = 1;
        //Metodo Scanner 
        Scanner kb = new Scanner(System.in);
        //Primer dato a ingresar
        System.out.println("Ingrese el numero para factorial: ");
        a = kb.nextInt();
        //Declaracion de una variable entera asignandole lo que ingreso el usuario
        int i = a;
        //Inicializacion del  ciclo de control while
        while (i > 0) {
            //Mostrar la cadena de numeros
            System.out.print(i + "  ");
            //Operacion de factorial
            fact = (fact * i); 
            //Decremento
            i--;
        }
        
        //Salto de linea
        System.out.println("\n");
        //Impresion del resultado
        System.out.println("El factorial de " + a + " es: " + fact);
    }

}
