package trycatch;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatch {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int valor = 0, fin = 0, c, prueba;
        String prog;
        boolean validacion = true, error = true;
        while (error == true) {
            System.out.println("Ingresa el valor incial: ");
            try {
                valor = kb.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("ERROR solo se aceptan numeros enteros");
                validacion = false;
                System.exit(0);
            }
            if (validacion == true) {
                System.out.println("Ingrese el valor final");
                try {
                    fin = kb.nextInt();
                } catch (InputMismatchException e) {
                    System.out.println("ERROR, solo se acpetan numeros enteros");
                    validacion = false;
                }
            }
        }
    }

}
