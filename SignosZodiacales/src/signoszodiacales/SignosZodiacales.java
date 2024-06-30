/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package signoszodiacales;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 *
 * @author Erick Muke
 */
public class SignosZodiacales {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        BufferedReader funcion = new BufferedReader(new InputStreamReader(System.in));
        Scanner kb = new Scanner(System.in);
        int suma;
        String mes;
        System.out.println("Ingrese el mes en que nacio: ");
        mes = funcion.readLine();

        switch (mes) {
            case "Marzo":
            case "marzo":
            case "Abril":
            case "abril":
                int a = 20;
                System.out.println("Ingrese el dia en que nacio: ");
                a = kb.nextInt();
                suma = a + 30;
                if (a >= 20 && a <= suma) {
                    System.out.println("Eres signo zodiacal Aries");
                }
                break;

        }
        switch (mes) {
            case "abril":
            case "Abril":
            case "Mayo":
            case "mayo":
                int a = 21;
                System.out.println("Ingrese el dia en que nacio: ");
                a = kb.nextInt();
                suma = a + 30;
                if (a >= 20 && a <= suma) {
                    System.out.println("Eres signo zodiacal Tauro");
                }
                break;
        }

    }
}
