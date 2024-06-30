package sumaconciclos;

import java.util.*;

public class SumaConCiclos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        // TODO code application logic here
        float valor1 = (float) 0;
        float total = 0f;
        boolean repetir;
        int P = 0;
        int opcion;
        while (P != 5) {
            System.out.println("1. While");
            System.out.println("2. Do-While");
            System.out.println("3. If");
            System.out.println("4. For");
            System.out.println("5. Exit");
            System.out.println("Elige una opcion: ");
            opcion = kb.nextInt();

            switch (opcion) {
                case 1:

                    System.out.println("Regla:Para finalizar digita: 99");
                    while (valor1 != 99) {
                        System.out.println("Anota un valor numerico: ");
                        valor1 = kb.nextFloat();
                        total = total + valor1;
                    }
                    System.out.println("El total es: " + (total - 99));
                    total = 0;
                    break;

                case 2:
                    do {
                        System.out.println("Anota un numero: ");
                        valor1 = kb.nextFloat();
                        total = total + valor1;
                    } while (valor1 != 99);
                    System.out.println("El total es: " + (total - 99));
                    total = 0;
                    break;

                case 3:

                    boolean validar;
                    do {  
                        System.out.println("Anota un numero: ");
                        validar = false;
                        if (valor1 != 99) {
                          
                            valor1 = kb.nextFloat();
                            total = total + valor1;
                            validar = true;
                        }//cierra if
                    } while (validar);
                    System.out.println("el total es: " + (total - 99));
                    total = 0;
                    break;

                case 4:
                    int i,
                     n;
                    System.out.println("Cuantas veces se repite: ");
                    n = kb.nextInt();
                    for (i = 0; i < n; i++) {
                        System.out.println("(" + (i + 1) + ")Anota un numero: ");
                        valor1 = kb.nextFloat();
                        total = total + valor1;
                    }
                    System.out.println("El resultado es: " + total);
                    total = 0;
                    break;

                case 5:
                    System.out.println("Adios");

                    System.exit(0);

                    break;

                default:
                    System.out.println("Opcion no valida");
                    break;
            }

        }
    }

}//main

