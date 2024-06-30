
package sumadenumerosenterosfor3;

/**
 *
 * @author Erick Muke
 */
public class SumaDeNumerosEnterosFor3 {

    /**
     * @param args the command line arguments
     */
//Metodo main
    public static void main(String[] args) {
        // TODO code application logic here
        //variables enteras
        int total = 0;
        //Inicializador de la setencia de control for
        for (int i = 10; i <= 25; i++) {
            //Impresion del resultado
            System.out.print(i + " ");
            //Suma de todos los numeros
            total = total + i;
        }
        //Salto de linea
        System.out.println("\n");
        //La suma total
        System.out.println("La suma es: " + total);
    }

}
