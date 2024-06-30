package numerosnegativospositivoswhile11;

import java.util.Scanner;//Libreria

/**
 *
 * @author Erick Muke
 */
public class NumerosNegativosPositivosWhile11 {

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
        //Declaracion de variable entera asigandole 0 
        int i = 0;
        //Inicializacion del ciclo de control while
        while (i < 10) {
            //Primer dato que se tiene que ingresar
            System.out.println(i + ".- Introduzca un número positivo: ");
            t[i] = kb.nextInt();
            //Incremento 
            i++;
        }
        //Asignandole a i el valor de empezar en 0
        i = 0;
        //Inicializacion del segundo ciclo de control while
        while (i < 10) {
            //Impresion de enumeros 
            System.out.print(t[i] + " ");
            //Operacion para sumar los numeros positivos
            suma = suma + t[i];
            //Operacion de sacar promedio o media
            media = suma / 10;
            i++;
        }
        //Resultado de la suma
        System.out.println("La suma es: " + suma);
        //Resultado de la media
        System.out.println("La media es: " + media);
        //Asignandole a j que empiece en cero
        int j = 0;
        //Inicializacion del tercer ciclo de control while
        while (j < 10) {
            //Primer dato que se tiene que ingresar
            System.out.println(j + ".- Introduzca un número positivo: ");
            a[j] = kb.nextInt();
            //Incremento
            j++;
        }
        //Asignandole a j que empiece en 0
        j = 0;
        //Inicializacion del cuarto ciclo de control while
        while (j < 10) {
            //Impresion de enumeros 
            System.out.print(a[j] + " ");
            //Operacion para sumar los numeros positivos
            sum2 = sum2 + a[j];
            //Operacion de sacar promedio o media
            med2 = sum2 / 10;
            //Incrememto
            j++;
        }
        //Resultado de la suma
        System.out.println("La suma es: " + sum2);
        //Resultado de la media
        System.out.println("La media es: " + med2);
    }

}