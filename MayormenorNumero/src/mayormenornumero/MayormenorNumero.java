/*
Objetivo Imprimir el nombre que nos de en la consola
Autor:Erick Miguel Gonzalez Rivera
Fecha:2/11/2019
 */
package mayormenornumero;

import java.util.*;

/**
 *
 * @author Erick Muke
 */
public class MayormenorNumero {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner kb = new Scanner(System.in);
        float n1;
        float n2;
        System.out.println("Ingrese el primer valor: ");
        n1 = kb.nextFloat();
        System.out.println("Ingrese el segundo valor: ");
        n2 = kb.nextFloat();
        if (n1 > n2) {
            System.out.println("El numero mayor es: " + n1);
        }
        if (n1 < n2) {
            System.out.println("El numero mayor es: " + n2);
        }
        if (n1 == n2) {
            System.out.println("Los numeros son iguales: " + n1 + " y " +n2);
        }
    }

}
