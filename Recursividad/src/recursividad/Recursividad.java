/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursividad;

import java.util.Scanner;

/**
 *
 * @author Erick Muke
 */
public class Recursividad {

    /**
     * @param args the command line arguments
     */
    void imprimir(int x) {

        if (x > 0) {
            imprimir(x - 1);
            System.out.println(x);
        }
    }

    public static void main(String[] args) {
        // TODO code application logic here
        Recursividad re = new Recursividad();
        int a;
        Scanner kb = new Scanner(System.in);
        System.out.println("Introduce el numero de repeticion: ");
        a = kb.nextInt();
        System.out.println("La serie es: ");
        re.imprimir(a);

    }

}
