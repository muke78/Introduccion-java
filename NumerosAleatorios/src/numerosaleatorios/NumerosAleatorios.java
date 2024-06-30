/*
Objetivo G enerar una cadena de numeros dependiendo los que el usuario digite y ver cuales son impares y pares
Autor: Erick Miguel Gonzalez Rivera
Fecha:4/11/19
 */
package numerosaleatorios;

import java.util.*;

public class NumerosAleatorios {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner kb = new Scanner(System.in);
        String nombre = "", s = "";
        int num, rango, resultado;
        boolean validar = false;

        System.out.println("Ingrese su nombre: ");
        nombre = kb.nextLine();
        System.out.println("Bienvenido " + nombre);
        System.out.println("\n");
        System.out.println("-------------------Numeros Aleatorios---------------------");
        do {

            System.out.println("Ingrese cuantos numeros quiere: ");
            num = kb.nextInt();
            System.out.println("Ingrese el rango o el limite del numero: ");
            rango = kb.nextInt();
            resultado = 1 + (int) (Math.random() * rango);
            if (num >= rango) {
                System.out.println(resultado + " ");
            }

            for (int i = 1; i <= num; i += 2) {
                System.out.println("\033[031mImpares\033[0m");
                System.out.println(i + " ");

            }
            for (int j = 2; j <= num; j += 2) {
                System.out.println("\033[032mPares\033[0m");
                System.out.println(j + " ");

            }
            System.out.println("Quieres volver a repetir?:(S/Otra letra)");
            s = kb.next();
            validar = s.equals("s");

        } while (validar);
    }

}
