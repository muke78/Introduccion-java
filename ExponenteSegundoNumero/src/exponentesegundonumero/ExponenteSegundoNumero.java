package exponentesegundonumero;

import java.util.*;//Libreria util para funciones basicas utiles 

/**
 *
 * @author Erick Muke
 */
public class ExponenteSegundoNumero {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner kb = new Scanner(System.in);//inicializacion del Scanner 
        float a, b, total = 0;//Delcaracion de las variables float 

        System.out.println("Ingrese el primer numero: ");//Primer dato que se pide
        a = kb.nextFloat();//variable se guarda en a
        System.out.println("Ingrese el segundo numero para exponente: ");//Segundo dato que se pide
        b = kb.nextFloat();//Variable se guarda en b

        total = (float) Math.pow(a, b);//Operacion matematica con funcion Math pow para realizar el exponente

        System.out.println("El resultado es: " + total);//Impresion del resultado 
    }

}
