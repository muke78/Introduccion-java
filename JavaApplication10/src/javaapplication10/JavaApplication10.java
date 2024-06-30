/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication10;

import java.util.*;

/**
 *
 * @author Erick Muke
 */
public class JavaApplication10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int opcion;
        float descuento = (float) 0.0;
        System.out.println("\033[034m--------------Tienda Muke-----------------");
        System.out.println("Seleccione una opcion: ");
        System.out.println("1)Playera");
        System.out.println("2)Pantalon");
        opcion = kb.nextInt();

        if (opcion == 1) {
            System.out.println("\033[034m------------Playera-------------");
            System.out.println("Tiene un costo de $300");
            descuento = (float) (300 * 0.10);
            System.out.println("El precio que tendra con descuento es: " + descuento);
        } else if (opcion == 2) {
            System.out.println("\033[034m------------Pantalon-------------");
            System.out.println("Tiene un costo de 1000");
            descuento = (float) (1000 * 0.20);
            System.out.println("El precio que tendra con descuento es: " + descuento);

        }

    }//main

}//Class

