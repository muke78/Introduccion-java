package ordenarnumeroswhile9;

import java.util.Scanner;

/**
 *
 * @author Erick Muke
 */
public class OrdenarNumerosWhile9 {

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
        //Declaracion de una variable entera asignandole un cero
        int i = 0;
        //Inicializacion del ciclo de control while
        while (i < 5) {
            //Primer dato a ingresar 
            System.out.print("Introduzca un número: ");
            t[i] = kb.nextInt();
            //Incremento 
            i++;
        }
        //Impresion de los datos
        System.out.println("Los números son: ");
        i = 0;
         //Inicializacion del el segundo ciclo de control while
        while (i < 5) {
            //Impresion de los datos acomodados 
            System.out.println(t[i]);
            //Incremento
            i++;
        }

    }

}