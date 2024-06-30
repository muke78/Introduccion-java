
package numerofactorialfor10;

import java.util.*;//Librerias

/**
 *
 * @author Erick Muke
 */
public class NumeroFactorialFor10 {

    /**
     * @param args the command line arguments
     */
    //Metodo main
    public static void main(String[] args) {
        // TODO code application logic here
        //Declaracion de variables enteras
        int a, fact = 1;
        //Metodo Scanner 
        Scanner kb = new Scanner(System.in);
        //Primer dato a ingresar
        System.out.println("Ingrese el numero para factorial: ");
        a = kb.nextInt();
        //Inicializacion de la sentencia de control for
        for (int i = a; i > 0; i--) {
            //Impresion de los numeros
            System.out.print(i + "  ");
            //Operacion de factorial
            fact = (fact * i);
        }
        //Salto de linea
        System.out.println("\n");
        //Impresion del resultado final 
        System.out.println("El resultado de factorial de " + a + " es: " + fact);
    }

}
