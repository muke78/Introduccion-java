/*
Objetivo Imprimir el nombre que nos de en la consola
Autor:Erick Miguel Gonzalez Rivera
Fecha:2/11/2019
 */
package numerodemeses;

import java.util.*;

/**
 *
 * @author Erick Muke
 */
public class NumeroDeMeses {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner kb = new Scanner(System.in);
        int mes = 0;
        System.out.println("Ingrese el numero de un mes[RANGO DEL 1 AL 12]");
        mes = kb.nextInt();

        switch (mes) {
            case 1:
                System.out.println("El mes es Enero");
                break;
            case 2:
                System.out.println("El mes es Febrero");
                break;
            case 3:
                System.out.println("El mes es Marzo");
                break;
            case 4:
                System.out.println("El mes es Abril");
                break;
            case 5:
                System.out.println("El mes es Mayo");
                break;
            case 6:
                System.out.println("El mes es Junio");
                break;
            case 7:
                System.out.println("El mes es Julio");
                break;
            case 8:
                System.out.println("El mes es Agosto");
                break;
            case 9:
                System.out.println("El mes es Septiembre");
                break;
            case 10:
                System.out.println("El mes es Octubre");
                break;
            case 11:
                System.out.println("El mes es Noviembre");
                break;
            case 12:
                System.out.println("El mes es Diciembre");
                break;

            default:System.out.println("Esa opcion no existe");

        }
    }

}
