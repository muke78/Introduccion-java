
package añodenacimientoyedad;

import java.util.*;//Libreria util para funciones basicas utiles 

/**
 *
 * @author Erick Muke
 */
public class AñoDeNacimientoYEdad {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner kb = new Scanner(System.in);//Incializacion del Scanner 

        int a, b, total = 0;//Declaracion de las variables enteras

        System.out.println("------------------Año de nacimiento y edad----------------------");

        System.out.println("Ingrese el año en que nacio: ");//Primer dato numero ingresado
        a = kb.nextInt();//Variable guardada en a
        System.out.println("Ingrese el año acual: ");//Segundo dato numerico ingresado
        b = kb.nextInt();//variable guardada en b

        total = b - a;// Operacion para el calculo

        System.out.println("La edad que tienes es de: " + total + " años ");//Impresion del resultado final
    }
}
