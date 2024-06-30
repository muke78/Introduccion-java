/*
Objetivo Imprimir el nombre que nos de en la consola
Autor:Erick Miguel Gonzalez Rivera
Fecha:2/11/2019
 */
package forinteractivo;

import java.util.*;

/**
 *
 * @author Erick Muke
 */
public class ForInteractivo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner kb = new Scanner(System.in);
        int prog;
        String opciones;
        long vi = 0;
        long vf = 0;

        System.out.println("Bienvendio");
        System.out.println("\n\n1.Incremento\n2.Decremento\n");
        opciones = kb.nextLine();
        System.out.println("Ingrese el valor incial: ");
        vi = kb.nextLong();
        System.out.println("Ingrese el valor final: ");
        vf = kb.nextLong();
        System.out.println("Diga la progresion: ");
        prog = kb.nextInt();

        switch (opciones) {
            case "Incremento":
            case "incremento":
            case "1":
                for (vi = vi; vi <= +vf; vi = vi = +prog) {
                    System.out.println(prog + " ");
                }

                break;
            case "Decremento":
            case "decremento":
            case "2":
                for (vi = vi; vi <= -vf; vi = vi = -prog) {
                    System.out.println(prog + " ");
                }

                break;

            default:
                System.out.println("Serie no valida a progresion");
                break;

        }
    }

}
