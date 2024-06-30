/*
Objetivo hacer un numero que se suba la potencia
Autor Erick Miguel Gonzalez Rivera
Fecha 31/10/19
 */
package exponentes;

import java.util.Scanner;

public class Exponentes {

    static Scanner kb = new Scanner(System.in);
    static float resultado;

    public static float operacion(float a, float b) {

        resultado = (float) Math.pow(a, b);

        return (float) resultadoF(a, b);

    }

    public static float resultadoF(float a, float b) {
        System.out.println("-------------------Su resultado fue---------------------");
        System.out.println(" " + resultado);

        return 0;
    }

    public static void main(String[] args) {
        // TODO code application logic here
        float a = 0, b = 0;
        String s = null;
        String nombre = null;

        boolean repetir = false;
        boolean validar = false;
        System.out.println("Ingrese su nombre: ");
        nombre = kb.nextLine();
        System.out.println("Bienvenido " + nombre);
        System.out.println("\n");
        do {
            System.out.println("\033[036m----------------Programa con potencias--------------");
            do {
                validar = false;
                try {
                    System.out.println("Ingrese el primer numero: ");
                    a = kb.nextFloat();
                    System.out.println("Ingrese el numero para la potencia: ");
                    b = kb.nextFloat();
                } catch (Exception e) {
                    System.out.println("\033[035mHubo un error solo se permiten numeros");
                    validar = true;
                    kb.next();
                }

            } while (validar);
            operacion(a, b);
            System.out.println("Quieres volver a repetirlo(S/Otra letra=No)");
            s = kb.next();
            repetir = s.equals("s");

        } while (repetir);

    }

}
