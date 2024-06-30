package promediodeedadesdowhile8;

import static java.lang.System.exit;
;//Libreria de manera estatica para la sentencia exit 
import java.util.Scanner;//Libreria

/**
 *
 * @author Erick Muke
 */


public class PromedioDeEdadesDoWhile8 {

    /**
     * @param args the command line arguments
     */
//    Metodo main
    public static void main(String[] args) {
        // TODO code application logic here
//        Inicializacion del metodo Scanner 
        Scanner kb = new Scanner(System.in);
//        Declcracion de variables enteras
        int a = 0, suma = 0, cont = 0;
//        Declaracion de la variable promedio en flotante
        float pro = (float) 0.0;
//        Inicializacion del ciclo Do While
        do {
//            Primer dato a ingresar
            System.out.println("Ingrese la edad de la persona");
            a = kb.nextInt();
//            Si a es menor o igual a cero
            if (a <= 0) {
                System.out.println("Dato no valido");
                exit(0);
            }
//            Operacion suma
            suma = suma + a;
//            Contador para ir sumando cuandos numeros a ingresado
            cont = cont + 1;
//            Division para el promedio
            pro = suma / cont;
//            Impresion del resultado 
            System.out.println("El promedio es: " + pro);
//            Si promedio es mayor o igual a 27 que se rompa el ciclo 
            if (pro >= 27) {
                break;
            }
//            Asignacion de a que sea diferente o igual a 27
        } while (a != 27);
//        Si promedio es mayor o igual a 27 que termine el programa 
        if (pro >= 27) {
            System.out.println("El promedio es mayor que 27");
            exit(0);
        }
    }

}