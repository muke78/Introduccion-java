package numeromayoracien;

import java.util.*;//Librearias

/**
 *
 * @author Erick Muke
 */
public class NumeroMayorACien {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){//Inicializacion del metodo main
        // TODO code application logic here
        Scanner kb = new Scanner(System.in);//Inicializacion de el metodo Scanner 
        int a, b, total = 0;//Inicializacion de las variables enteras 

        System.out.println("----------------------------Bienvenido---------------------");

        System.out.println("Ingrese un numero: ");//Primer dato que se ingresa 
        a = kb.nextInt();//Dato guardado   en la variable a 

        if (a <= 100) {//Inicializacion de if que a sea igual o menor que 100
            System.out.println("Es necesario introducir otro valor, pues tu número actual es menor que 100");
            b = kb.nextInt();//Dato guardado en b para que lo sume al valor ingresado

            total = a + b;//Suma de las dos variable ingresadas 

            System.out.println("El resultado es: " + total);//Impresion del resultado de la primera condicion
        }

        if (a >= 100) {//Inicializacion del segundo if que sea mayor a 100 
            System.out.println("Es necesario introducir otro valor, pues tu número actual es mayor que 100");
            b = kb.nextInt();//Dato guardado en b para que lo sume al valor ingresado

            total = a + b;//Suma de las dos variables ingresadas

            System.out.println("El resultado es: " + total);//Impresion del resultado de la primera condicion
        }

    }

}
