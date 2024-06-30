package rangodenumerosydigitosdowhile4;

import static java.lang.System.exit;//Libreria de manera estatica para la sentencia exit 
import java.util.Scanner;//Libreria

/**
 *
 * @author Erick Muke
 */
public class RangoDeNumerosYDigitosDoWhile4 {

    /**
     * @param args the command line arguments
     */
    //Metodo main
    public static void main(String[] args) {
        // TODO code application logic here
        //Inicializacion del Scanner 
        Scanner kb = new Scanner(System.in);
        //Declcracion de ua variable entera iniciada en  cero 
        int a = 0;
        //Inicializacion del ciclo Do While 
        do {
            //Primer dato a ingresar
            System.out.println("Ingrese numeros entre 1 y 599");
            a = kb.nextInt();
//
//            do {
//                System.out.println("Tiene tres digitos");
//            } while (a >= 100);
//
//            do {
//                System.out.println("Tiene dos digitos");
//            } while (a >= 10);
//
//            do {
//                System.out.println("Tiene un solo digito");
//            } while (a >= 1);
            //Si la condicion es mayor a 599 que termine el programa
            if (a >= 600) {
                exit(0);
                System.out.println("Solo se permite hasta el 599");
            }
            //Si la condicion es mayor a cien tiene tres digitos 
            if (a >= 100) {
                System.out.println("Tiene tres digitos");
                //Entonces si la condicion es mayor a diez tiene dos digitos 
            } else if (a >= 10) {
                System.out.println("Tiene dos digitos");
                //Entonces si la condicion es mayot a uno tiene un digito 
            } else if (a >= 1) {
                System.out.println("Solo tiene un digito");
            }
            //While tiene que ser mayor a cero para que ingrese numero mayores
            //Y acabe cuando se presione cero
        } while (a > 0);

    }

}