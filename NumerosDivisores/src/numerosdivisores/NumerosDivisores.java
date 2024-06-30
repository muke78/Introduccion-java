/*
Objetivo:Ingresar un numero y ver cuantos son divisores de este
Autor:Hernandez Morales Jesus Israel
Fecha:14/11/19
 */
package numerosdivisores;

import java.util.*;

public class NumerosDivisores {

    static Scanner kb = new Scanner(System.in);
    static int num;
    static boolean repetir = false;
    static String num_div = " ";

    public static void numeros() {
        boolean validar;
        do {
            validar = false;
            try {
                System.out.println("Ingrese un numero: ");
                num = kb.nextInt();
            } catch (Exception ) {
                System.out.println(" Solo se permiten numeros ");
                kb.next();
                validar = true;
            }
        } while (validar);

    }

    public static String calculo(int num) {
        String num_div = " ";
        for (int i = 1; i < (num + 1); i++) {
            if (num % i == 0) {
                num_div += i;
                if (i < num) {
                    num_div += ",";
                }

            }
        }

        System.out.println(
                "LOS NUMEROS DIVISORES SON: ");
        System.out.print(num_div
                + "  \n");
        return num_div;
    }

    public static void main(String[] args) {
        // TODO code application logic here
        String s = "s";
        System.out.println("      Bienvenido     ");
        do {
            repetir = false;
            numeros();
            calculo(num);
            System.out.println("Desea volver a repetirlo(s/Otra letra)");
            s = kb.next();
            repetir = s.equals("s");
        } while (repetir);
    }
}
