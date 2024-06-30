/*
Objetivo Imprimir el nombre que nos de en la consola
Autor:Erick Miguel Gonzalez Rivera
Fecha:2/11/2019
 */
package impares;

/**
 *
 * @author Erick Muke
 */
public class Impares {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int i, suma = 0;
        for (i = 1; i <= 10; i += 2) {
            suma = suma + i;
            System.out.println(i + " ");
            suma = suma + i;
        }
        System.out.println("Los impares son " + suma);
    }

}
