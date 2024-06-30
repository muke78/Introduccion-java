package seriefibonacciwhile5;

import java.util.Scanner;//Libreria

/**
 *
 * @author Erick Muke
 */
public class SerieFibonacciWhile5 {

    /**
     * @param args the command line arguments
     */
    //Metodo main 
    public static void main(String[] args) {
        // TODO code application logic here
        //Metodo Scanner 
        Scanner kb = new Scanner(System.in);
        //Declaracion de variables enteras 
        int n, x = 0, z = 1, y = 1;
        //Primer dato a ingresar 
        System.out.println("Ingrese cualquier numero para la sucession: ");
        n = kb.nextInt();
        //Declaracion de una variable entera inicializada en 0
        int i = 0;
        //Inicializacion del ciclo de control while
        while (i < n) {
            //Progresion
            i++;
            z = x + y;
            //Mostrar los resultados 
            System.out.println(z + " ");
            x = y;//Igualar x a uno-----------z=2-----Asignarle a x un uno-------------z=3
            y = z;//Guadar en la variable z un uno--------Mandarle un uno a z
        }
    }

}