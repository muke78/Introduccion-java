
package areadelcirculo;

import java.util.*;//Libreria util para funciones basicas utiles 

/**
 *
 * @author Erick Muke
 */
public class AreaDelCirculo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner kb = new Scanner(System.in);//Inicializacion del Scanner 
        float r, total = 0;//Declaracion de variables flotantes
        System.out.println("-----------------Area de un circulo----------------------");

        System.out.println("Inserte el valor del radio: ");//Primer dato numero ingresado
        r = kb.nextFloat();//Variable guardada en r

        total = (float) (Math.PI * (r) * (r));//Operacion matematica con la funcion Math para sacar el calculo de PI exacto
        System.out.println("El resultado es: " + total);//Impresion del resultado final
    }

}
