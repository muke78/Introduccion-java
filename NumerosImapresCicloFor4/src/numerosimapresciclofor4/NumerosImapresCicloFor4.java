package numerosimapresciclofor4;

/**
 *
 * @author Erick Muke
 */
public class NumerosImapresCicloFor4 {

    /**
     * @param args the command line arguments
     */
    //Metodo main
    public static void main(String[] args) {

        // TODO code application logic here
        //Varibales enteras
        int total = 0, i;
        //Mensaje de para decir los numeros son
        System.out.println("Los numeros enteros son: ");
        //Inicizalizacion de la setencia de control for
        for (i = 1; i <= 150; i++) {
            //Impresion de numeros
            System.out.print(i + " ");
        }
        //Salto de linea
        System.out.println("\n");
        //Impresion del resultado
        System.out.println("Los imapres son: ");
        //Inicializacion de la segunda setencia de control for
        for (int j = 1; j <= 150; j = j + 2) {
            //Impresion de los numeros impares
            System.out.print(j + " ");
            //Suma de todos los numeros impares
            total = total + j;
        }
        //Salto de linea
        System.out.println("\n");
        //Impresion de la suma total de impares
        System.out.println("La suma de los impares es: " + total);

    }

}
