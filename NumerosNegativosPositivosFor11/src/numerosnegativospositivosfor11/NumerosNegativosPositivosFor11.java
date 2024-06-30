
package numerosnegativospositivosfor11;

import java.util.*;

/**
 *
 * @author Erick Muke
 */
public class NumerosNegativosPositivosFor11 {

    /**
     * @param args the command line arguments
     */
    //Metodo main
    public static void main(String[] args) {
        // TODO code application logic here
        //Metodo Scanner 
        Scanner kb = new Scanner(System.in);
        //Declaracion de arreglos enteros
        int t[];
        int a[];
        //Declaracion de variables enteras
        int suma = 0;
        int sum2 = 0;
        int media = 0;
        int med2 = 0;
        //Llenar el arreglo con 10 cada uno 
        t = new int[10];
        a = new int[10];
        //Inicializacion de la sentencia de control for positivos
        for (int i = 0; i < 10; i++) {
            //Primer dato que se tiene que ingresar
            System.out.println(i + ".- Introduzca un número positivo: ");
            t[i] = kb.nextInt();
        }
        //Inicializacion de la segunda sentencia de control for positivos
        for (int i = 0; i < 10; i++) {
            //Impresion de enumeros 
            System.out.print(t[i] + " ");
            //Operacion para sumar los numeros positivos
            suma = suma + t[i];
            //Operacion de sacar promedio o media
            media = suma / 10;
        }
        //Resultado de la suma
        System.out.println("La suma es: " + suma);
        //Resultado de la media
        System.out.println("La media es: " + media);
        //Inicializacion de la tercera sentencia de control for negativos
        for (int j = 0; j < 10; j++) {
            //Segundo dato que se tiene que ingresar
            System.out.println(j + ".- Introduzca un número negativo: ");
            a[j] = kb.nextInt();
        }
        //Inicializacion de la cuarta sentencia de control for negativos
        for (int j = 0; j < 10; j++) {
            //Impresion de los numeros
            System.out.print(a[j] + " ");
            //Suma de negativos
            sum2 = sum2 + a[j];
            //Sacar media o promedio
            med2 = sum2 / 10;
        }
        //Resultado final de la suma de negativos
        System.out.println("La suma es: " + sum2);
        //Resultado de la media 
        System.out.println("La media es: " + med2);

    }

}
