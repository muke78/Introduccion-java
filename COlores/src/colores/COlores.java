/*
Objetivo Imprimir el nombre que nos de en la consola
Autor:Erick Miguel Gonzalez Rivera
Fecha:2/11/2019
 */
package colores;

import java.util.*;

/**
 *
 * @author Erick Muke
 */
public class COlores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner kb = new Scanner(System.in);
        String frase;
        String color;
        System.out.println("----------------Manual de Colores----------------");
        System.out.println("Ingrese una frase: ");
        frase = kb.nextLine();
        System.out.println("\nColores Disponibles\n\033[032ml.-Verde\n\033[031m2.-Rojo\n\033[034m3.-Azul"
                + "\nIngrese un numero: ");
        color = kb.nextLine();

        switch (color) {
            case "1":
            case "verde":
            case "Verde":
                System.out.printf("\033[032m%s\n", frase);
                break;
            case "2":
            case "rojo":
            case "Rojo":
                System.out.printf("\033[031m%s\n", frase);
                break;
            case "3":
            case "azul":
            case "Azul":
                System.out.printf("\033[034m%s\n", frase);
                break;

            default:
                System.out.println("Color no valido");
                break;

        }

    }

}
