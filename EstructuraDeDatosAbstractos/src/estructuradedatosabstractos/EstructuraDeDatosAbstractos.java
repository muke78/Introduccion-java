package estructuradedatosabstractos;

import java.util.Scanner;

/**
 *
 * @author Erick Muke
 */
public class EstructuraDeDatosAbstractos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner kb = new Scanner(System.in);
        int a, i, b, pos, aux;
        System.out.println("------------------Numeros Ascendentes y Descedentes-----------------------");
        System.out.println("Cuantos numeros desea evaluar:");
        a = kb.nextInt();
        int array[] = new int[a];
        System.out.println("Ingrese los numeros:");
        for (i = 0; i < array.length; i++) {
            array[i] = kb.nextInt();
        }
        for (i = 0; i < a; i++) {
            pos = i;
            aux = array[i];
            while ((pos > 0) && (array[pos - 1] > aux)) {
                array[pos] = array[pos - 1];
                pos--;
            }
            array[pos] = aux;
        }
        System.out.println("Como quiere sus numeros");
        System.out.println("1.- Ascendente\n"
                + "2.- Descendente\n"
                + "3.- Salir");
        b = kb.nextInt();
        switch (b) {
            case 1:
                System.out.println("Ascendente");
                for (i = 0; i < array.length; i++) {
                    System.out.print(array[i] + " - ");
                }
                break;
            case 2:
                System.out.println("Descendente");
                for (i = array.length - 1; i >= 0; i--) {
                    System.out.print(array[i] + " - ");
                }
                break;
            case 3:
                System.exit(0);
                break;

            default:
                System.out.println("Esa opcion no existe");
                break;
        }

    }

}
