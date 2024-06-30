/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edad;

import static java.lang.System.exit;
import java.util.Scanner;

/**
 *
 * @author Erick Muke
 */
public class Edad {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int dia, año, dia2, año2, mes, mes2;
        double suma, suma2, suma3, suma4, suma5, suma6, suma7;
        Scanner kb = new Scanner(System.in);

        System.out.println("Ingrese el numero del mes de nacimiento: ");
        mes = kb.nextInt();
        if (mes > 12) {
            System.out.println("Mes invalido");
            exit(0);
        }
        System.out.println("Ingrese du dia de nacimiento: ");
        dia = kb.nextInt();
        System.out.println("Ingrese su año de nacimiento: ");
        año = kb.nextInt();
        System.out.println("Ingrese el numero de mes actual: ");
        mes2 = kb.nextInt();
        if (mes2 > 12) {
            System.out.println("Mes invalido");
            exit(0);
        }

        System.out.println("Ingrese el dia actual: ");
        dia2 = kb.nextInt();
        System.out.println("Ingrese el año actual: ");
        año2 = kb.nextInt();

        System.out.println("EDAD: ");
        System.out.println("\n");
        suma = (año2 - año);
        System.out.println(suma + " Años");
        suma2 = 12 - mes2;
        System.out.println(suma2 + " Meses");

        suma3 = suma + (suma2 * 0.10);
        System.out.println(suma3 + " Años");

        suma4 = suma3 * 12;
        System.out.println(suma4 + " Meses");

        suma5 = suma3 * 365;
        System.out.println(suma5 + " Dias");
        System.out.println("SIGUIENTE CUMPLEAÑOS: ");
        System.out.println("\n");
        suma6 = 12 - mes2;
        System.out.println(suma6 + " Meses");
        suma7 = 365 - (mes2 * dia2);
        System.out.println(suma7 + " ");

    }

}
