
package numero.al.cubo;

import java.util.*;//Libreria util para funciones basicas utiles 

public class NumeroAlCubo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner kb = new Scanner(System.in);//Inicializador del Scanner
        float a, total = 0;//Declaracion de variables flotantes

        System.out.println("---------------Programa Numero al cubo--------------------");

        System.out.println("Ingrese un numero: ");//Primer dato que se quiere pedir
        a = kb.nextInt();//Dato guardado en la variable a
        total = a * a * a;//Operacion de la variable multiplicada por si misma 3 veces

        System.out.println("El numero es: " + total);//Impresion del resultado 

    }

}
