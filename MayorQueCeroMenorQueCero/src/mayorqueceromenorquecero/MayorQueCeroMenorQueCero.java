package mayorqueceromenorquecero;

import java.util.*;//Libreria util

/**
 *
 * @author Erick Muke
 */
public class MayorQueCeroMenorQueCero {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {//Inicializacion del menu
        // TODO code application logic here

        Scanner kb = new Scanner(System.in);//Metodo Scanner 

        int a, b, total = 0;//Inicializacion de variables enteras 

        System.out.println("---------------------Bienvenido----------------------");

        System.out.println("Ingresa el primer valor, procura que se a entero: ");//Primer dato que se desea ingresar 
        a = kb.nextInt();
        System.out.println("Ingrese el segundo valor, procura que sea entero: ");//Segundo dato que se desea ingresar 
        b = kb.nextInt();

        total = a + b;//Operacion con operador aritmetico(suma)

        System.out.println("El resultado es: " + total);//Impresion del resultado

        if (total > 0) {//Condicion if 
            System.out.println("El numero es mayor que cero");//Dato que sea mayor a cero
        } else {//Entonces/o si no
            System.out.println("El numero es menor que cero");//Dato que sea menor a cero 
        }
    }

}
