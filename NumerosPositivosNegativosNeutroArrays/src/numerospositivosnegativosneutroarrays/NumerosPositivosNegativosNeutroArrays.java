/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numerospositivosnegativosneutroarrays;

import java.util.Scanner;

/**
 *
 * @author Erick Muke
 */
public class NumerosPositivosNegativosNeutroArrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner kb = new Scanner(System.in);
        int b;
        System.out.println("Ingrese cuantos numeros quiere para evaluar: ");
        b = kb.nextInt();
        int a[];
        int i;
        a = new int[b];
        System.out.println("\n");
        for (i = 0; i < b; i++) {
            //Primer dato que se tiene que ingresar
            System.out.println(i + ".- Introduzca los numeros que desee para evaluar si es positivo negativo"
                    + "o cero ");
            a[i] = kb.nextInt();
            if (a[i] > 0) {
                System.out.println("Este numero es positivo: " + a[i]);

            }

            if (a[i] < 0) {
                System.out.println("Este numero es negativo: " + a[i]);
            }
            if (a[i] == 0) {
                System.out.println("Este numero es cero o neutro: " + a[i]);
            }

        }

    }

}
