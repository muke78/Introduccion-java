/*
Objetivo Imprimir el nombre que nos de en la consola
Autor:Erick Miguel Gonzalez Rivera
Fecha:2/11/2019
 */
package solicitarnombre;

import java.util.*;

/**
 *
 * @author Erick Muke
 */
public class SolicitarNombre {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner kb = new Scanner(System.in);
        String nombre = null;
        System.out.println("Ingrese su nombre: ");
        nombre = kb.nextLine();
        System.out.println("Su nombre que ingreso fue: " + nombre);
    }

}
