
package ordenarnumerosfor9;

import java.util.Scanner;

/**
 *
 * @author Erick Muke
 */
public class OrdenarNumerosFor9 {

    /**
     * @param args the command line arguments
     */
    //Metodo main
    public static void main(String[] args) {
        // TODO code application logic here
        //Metodo Scanner 
        Scanner kb = new Scanner(System.in);
        //Arreglo entero 
        int t[];
        //Llenar arreglo con 5 datos
        t = new int[5];
        //Inicializacion de la setencia for
        for (int i = 0; i < 5; i++) {
            //Primer dato a introducir
            System.out.print("Introduzca un número: ");
            t[i] = kb.nextInt();
        }
        //Impresion de los datos
        System.out.println("Los números son:");
        //Inicializacion de la segunda setencia for 
        for (int i = 0; i < 5; i++) {
            //Impresion de los datos acomodados 
            System.out.println(t[i]);
        }
    }

}
