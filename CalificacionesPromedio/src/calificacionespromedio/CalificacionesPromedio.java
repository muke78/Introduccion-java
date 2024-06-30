/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calificacionespromedio;

import java.util.*;

/**
 *
 * @author Rigo Jesus
 */
public class CalificacionesPromedio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner kb = new Scanner(System.in);

        String nombre;
        float cal = 0, suma = 0;
        System.out.println("-----------Ingresa tu nombre-----------------");
        nombre = kb.nextLine();
        int i;
        for (i = 1; i < 3; i++) {
            System.out.println("Ingresa tu calificacion: " + cal + ":");
            cal = kb.nextFloat();
            suma = suma + cal;

        }
        float promedio;
        promedio = suma / (3);
        System.out.println("Tu nombre es: " + nombre + " tu promedio es de: " + promedio);
    }

}
