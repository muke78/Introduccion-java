package sumadenumerosdowhile6;

import static java.lang.System.exit;//Libreria de manera estatica para la sentencia exit 
import java.util.Scanner;//Lbreria

/**
 *
 * @author Erick Muke
 */
public class SumaDeNumerosDoWhile6 {

    /**
     * @param args the command line arguments
     */
//    Metodo main
    public static void main(String[] args) {
        // TODO code application logic here
        //Metodo Scanner
        Scanner kb = new Scanner(System.in);
//        Variables declaradas de manera flotantes para ocupar decimales
        float a, suma = 0;
//        Inicializacion del ciclo Do While 
        do {
//            Ingresar el primer numero
            System.out.println("Ingrese los numeros que guste, ya sean positivos deciaml o negativos: ");
            a = kb.nextFloat();
//            Si la condicion es igual a noventa y nueve que acabe el programa 
            if (a == 99) {
                System.out.println("El programa finalizo");
                exit(0);
            }
//            Operacion para que valla sumando todo lo que ingrese el usuario 
            suma = suma + a;
//            Impresion del resultado 
            System.out.println("El resultado de la suma es: " + suma);
//            Si la suma es mayor que cero 
            if (suma > 0) {
                System.out.println("La suma es mayor que cero");
            } else {//Entonces
                System.out.println("La suma es menor que cero");
            }
//            Declcracion que a seria diferente o igual a 99 para que permita ingresar todo tipo de numeros
        } while (a != 99);

    }

}