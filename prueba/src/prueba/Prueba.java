/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba;

import java.util.Scanner;

/**
 *
 * @author Erick Muke
 */
public class Prueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner kb = new Scanner(System.in);
        int n, i;
        System.out.println("Ingrese una cantidad para la tabla de multplicar: ");
        n = kb.nextInt();
        for (i = 1; i <= 10; i++) {
            System.out.println(i + " X " + n + " = " + i * n);
        }

    }
}
