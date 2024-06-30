package numerosrandomwhile7;

import java.util.Scanner;//Librerias

/**
 *
 * @author Erick Muke
 */
public class NumerosRandomWhile7 {

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
        //Declaracion de una variable entera llenadola con un uno
        int i = 1;
        //Inicializacion del ciclo de control while
        while (i <= val) {
            //Progresion 
            i++;
            //Formula random
            resu = (int) (Math.random() * 10);
            //Imprimir cadena de caracteres 
            System.out.println(resu + " ");
            
        }
    }

}
