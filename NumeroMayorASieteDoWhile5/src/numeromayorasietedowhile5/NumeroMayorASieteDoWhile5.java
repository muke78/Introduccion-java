package numeromayorasietedowhile5;

import static java.lang.System.exit;
;//Libreria de manera estatica para la sentencia exit 
import java.util.Scanner;//Libreria 

/**
 *
 * @author Erick Muke
 */


public class NumeroMayorASieteDoWhile5 {

    /**
     * @param args the command line arguments
     */
    //Metodo main
    public static void main(String[] args) {
        // TODO code application logic here
        //Inicializacion del metodo Scanner 
        Scanner kb = new Scanner(System.in);
        //Declaracion de una variable entera
        int a;
        //Inicializacion del ciclo Do While 
        do {
            //Primer dato a ingresar 
            System.out.println("Ingrese un numero: ");
            a = kb.nextInt();
            //Si la condicion es mayor a siete
            if (a >= 7) {
                //El numero es mayor a siete
                //Continua el programa
                System.out.println("El numero es mayor que siete:");
            } else {//Entonces
                //Si es menor a 7 termina el programa 
                System.out.println("El numero no es mayor que 7");
                exit(0);
            }
            //La variable a tiene que ser mayor a siete para que siga el ciclo
            //Y acabe cuando se presione un numero bajo 
        } while (a > 7);

    }

}