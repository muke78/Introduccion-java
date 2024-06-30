/*
Objetivo Imprimir el nombre que nos de en la consola
Autor:Erick Miguel Gonzalez Rivera
Fecha:2/11/2019
*/
package numerosunoaldiez;

import java.util.*;

/**
 *
 * @author Erick Muke
 */
public class NumerosUnoAlDiez {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner kb = new Scanner(System.in);
        int numero = 0;
        boolean validar = false;

        do {
            validar = false;
            System.out.println("Ingrese un numero: ");
            numero = kb.nextInt();
            switch (numero) {
                case 0:
                    System.out.println("El numero es CERO " + 0);
                    break;
                case 1:
                    System.out.println("El numero es UNO " + 1);
                    break;
                case 2:
                    System.out.println("El numero es DOS " + 2);
                    break;
                case 3:
                    System.out.println("El numero es TRES " + 3);
                    break;
                case 4:
                    System.out.println("El numero es CUATRO " + 4);
                    break;
                case 5:
                    System.out.println("El numero es CINCO " + 5);
                    break;
                case 6:
                    System.out.println("El numero es SEIS " + 6);
                    break;
                case 7:
                    System.out.println("El numero es SIETE " + 7);
                    break;
                case 8:
                    System.out.println("El numero es OCHO " + 8);
                    break;
                case 9:
                    System.out.println("El numero es NUEVE " + 9);
                    break;
                case 10:
                    System.out.println("El numero es DIEZ " + 10);
                    break;
                default:
                    System.out.println("No se encuentra ese valor");
                    System.out.println("INTENTELO DE NUEVO");
                    validar = true;
            }
        } while (validar);
    }

}
