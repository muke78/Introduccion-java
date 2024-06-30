/*
Objetivo generar numeros aleatorios dandome cuales son impares y sumandolos
Autor:Erick Miguel Gonzalez Rivera
Fecha 2/11/19
 */
package numerosrandom;

import java.util.*;

/**
 *
 * @author Muke
 */
public class NumerosRandom {

    static Scanner kb = new Scanner(System.in);
    static int suma = 0, suma2 = 0;

    public static void datos() {
        int rango = 0, num = 0;
        boolean validar = false;
        do {
            validar=false;
            try {
                System.out.println("Ingrese cuantos numeros quiere: ");
                num = kb.nextInt();
                System.out.println("Ingrese el limite o rango: ");
                rango = kb.nextInt();
            } catch (Exception e) {
                System.out.println("\033[036mSolo se permiten numeros");
                kb.next();
                validar = true;
            }
        } while (validar);
        int a[] = new int[num];
        int recibe[] = new int[num];
        recibe = operacion(num, rango, a);
        impar(recibe, num);

    }

    public static int[] operacion(int num, int rango, int[] a) {
        int num_ale;
        int i;
        for (i = 0; i < num; i++) {
            num_ale = 1 + (int) (Math.random() * rango);
            a[i] = num_ale;
        }
        return a;

    }

    public static void impar(int[] recibe, int num) {
        // Imprime el arreglo generado con los aleatorios
        int i, k;
        System.out.println("\nTODOS");

        for (i = 0; i < num; i++) {
            System.out.print(recibe[i] + "  ");

        }
        System.out.println("\nPARES");
        for (i = 0; i < recibe.length; i++) {
            if (recibe[i] % 2 == 0) {
                System.out.print(recibe[i] + "  ");
                suma = suma + recibe[i];
            }
        }

        System.out.println("\nIMPARES");
        for (k = 0; k < recibe.length; k++) {
            if (recibe[k] % 2 != 0) {
                System.out.print(recibe[k] + "  ");
                suma2 = suma2 + recibe[k];
            }
        }

    }

    public static void main(String[] args) {

        String s = null;
        boolean repetir = false;
        do {
            repetir = false;
            datos();

            System.out.println("\nSUMA PARES");
            System.out.print(suma + "  ");
            System.out.println("\nSUMA IMPARES");
            System.out.print(suma2 + "  ");
            System.out.println("\n");
            System.out.println("Quieres repetirlo(S/Otra letra)");
            s = kb.next();
            repetir = s.equals("s");

        } while (repetir);
    }

}
