
package seriefibonaccifor5;

import java.util.Scanner;//Librerias

/**
 *
 * @author Erick Muke
 */
public class SerieFibonacciFor5 {

    /**
     * @param args the command line arguments
     */
    //Metodo main
    public static void main(String[] args) {
        // TODO code application logic here
        //Inicializacion del metodo Scanner 
        Scanner kb = new Scanner(System.in);
        //Varibales 
        long n, x = 0, y = 1, z = 1;
        //Primer dato que se ingrese para determinar un fin de intervalos 
        System.out.println("Ingrese cualquier numero para la sucession: ");
        n = kb.nextLong();
        //Impresion del 0 
        System.out.println("0");
        //Impresion del 1
        System.out.println("1");
        //Inicializacion de la sentencia de control for
        for (int i = 0; i <= n; i++) {
            //Suma de las variables ocupadas 
            z = x + y;
            //Impresion del resultado
            System.out.println(z + " ");
            x = y;//La variable x se le asigna un numero 1
            y = z;//La variable y se le asigna un valor (x+y=1),(z=1)(x+y=2)(z=2)
        }
    }

}
