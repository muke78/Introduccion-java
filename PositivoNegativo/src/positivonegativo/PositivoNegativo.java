/*
Objetivo Imprimir el nombre que nos de en la consola
Autor:Erick Miguel Gonzalez Rivera
Fecha:2/11/2019
 */
package positivonegativo;

import java.util.*;

/**
 *
 * @author Erick Muke
 */
public class PositivoNegativo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner kb = new Scanner(System.in);
        int numero;
        System.out.println("Ingrese un numero: ");
        numero = kb.nextInt();
        if (numero > 0) {
            System.out.println("El numero " + numero + " es positivo");
        }
        if (numero < 0) {
            System.out.println("El numero " + numero + " es negativo");
        }
        if (numero == 0) {
            System.out.println("El numero " + numero + " es neutro");
        }
    }

}
