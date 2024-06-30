/*
Objetivo Imprimir el nombre que nos de en la consola
Autor:Erick Miguel Gonzalez Rivera
Fecha:2/11/2019
 */
package letrameses;

import java.util.*;

/**
 *
 * @author Erick Muke
 */
public class LetraMeses {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner kb = new Scanner(System.in);
        char mes;
        System.out.println("Ingrese una letra de algun mes");
        mes = kb.next().charAt(0);
        switch (mes) {
            case 'J':
            case 'j':
                System.out.println("Los meses son: Julio" + " y Junio");
                break;
            case 'A':
            case 'a':
                System.out.println("Los meses son: Abril" + " y Agosto");
                break;
            case 'M':
            case 'm':
                System.out.println("Los meses son: Mayo" + " y Marzo");
                break;
            case 'E':
            case 'e':
                System.out.println("Los meses son: Enero");
                break;
            case 'F':
            case 'f':
                System.out.println("Los meses son: Febrero");
                break;
            case 'S':
            case 's':
                System.out.println("Los meses son: Septiembre");
                break;
            case 'O':
            case 'o':
                System.out.println("Los meses son: Octubre");
                break;
            case 'N':
            case 'n':
                System.out.println("Los meses son: Noviembre");
                break;
            case 'D':
            case 'd':
                System.out.println("Los meses son: Diciembre");
                break;

            default:
                System.out.println("Esa opcion no existe");

        }
    }

}
