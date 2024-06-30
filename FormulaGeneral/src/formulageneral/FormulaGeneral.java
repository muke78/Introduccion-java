package formulageneral;

import java.util.Scanner;

/**
 * objetivo: resolver ejercicios de 2 grado
 *
 * @author Jose Juan
 */
public class FormulaGeneral {
    static Scanner kb = new Scanner(System.in);
    static double a, b, c, x0, x1, num;
    static String s = null;

    public static double a1() {
        do {
            try {
                System.out.println("---------Ecuaciones de 2 Grado---------");
                System.out.print("Valor a: ");
                a = kb.nextDouble();
                System.out.print("Valor b: ");
                b = kb.nextDouble();
                System.out.print("Valor c: ");
                c = kb.nextDouble();
                double num = (b * b) - (4 * a * c);
                a2(num);

                System.out.println("¿Quieres repetir el proceso? (s,0/cualquier cosa Salir)");
                s = kb.next();
            } catch (Exception e) {
                System.out.println("No se aceptan letras (Cerrado) :(");
                System.exit(0);
            }
        } while (s.equals("S") || s.equals("s") || s.equals("0"));
        return num;
    }

    public static double a2(double num) {
        if (num > 0) {
            x0 = (-b + Math.sqrt(num)) / (2 * a);
            x1 = (-b - Math.sqrt(num)) / (2 * a);
            System.out.println("La ecuacion tiene dos soluciones");
            System.out.println("x1: " + x0);
            System.out.println("x2: " + x1);
        } else {
            if (num == 0) {
                x0 = (-b) / 2 * a;
                rel1(x0);
            } else {
                System.out.println("La ecuacion no tiene solucion");
            }
        }

        return x0;
    }

    public static void rel1(double x0) {
        System.out.println("La ecuacion tiene dos soluciones");
        System.out.println("La ecuacion tiene una solucion");
        System.out.println("x1: " + x0);
    }

    public static void main(String[] args) {
        a1();
    }

}