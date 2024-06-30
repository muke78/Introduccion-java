
package numerosrandomfor7;

import java.util.Scanner;

/**
 *
 * @author Erick Muke
 */
public class NumerosRandomFor7 {

    /**
     * @param args the command line arguments
     */
    //Metodo main
    public static void main(String[] args) {
        // TODO code application logic here
        //Metodo Scanner
        Scanner kb = new Scanner(System.in);
        //Varibales enteras
        int val, resu;
        //Primer dato que se tiene que ingresar
        System.out.println("¿Cuanto numeros quiere?: ");
        val = kb.nextInt();
        //Inicializacion de la setencia de cntrol for
        for (int i = 1; i <= val; i++) {
            //Metodo random por rango de 1 a 10
            resu = (int) (Math.random() * 10);
            //Impresion del resultado
            System.out.println(resu + " ");
        }

    }

}
