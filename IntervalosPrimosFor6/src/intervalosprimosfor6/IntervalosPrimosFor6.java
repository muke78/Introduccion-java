package intervalosprimosfor6;

import java.util.*;//Libreria

/**
 *
 * @author Erick Muke
 */
public class IntervalosPrimosFor6 {

    /**
     * @param args the command line arguments
     */
    //Metodo main
    public static void main(String[] args) {
        // TODO code application logic here
        //Metodo Scanner 
        Scanner kb = new Scanner(System.in);
        //Variables enteras 
        int var, var2;
        //Primer dato a ingresar del intervalo
        System.out.println("Ingrese el primer valor del intervalo: ");
        var = kb.nextInt();
        //Segundo dato para el fin del intervalo
        System.out.println("Ingrese el ultimo valor del intervalo: ");
        var2 = kb.nextInt();
        //Inicializacion de la setencia de control for
        for (int i = var; i <= var2; i++) {
            //Imprimir datos o cadena de numeros ingresados
            System.out.print(i + " ");
        }
        //Salto de linea
        System.out.println("\n");
        //Inicializacion de la segunda setencia de control for
        for (int i = var; i <= var2; i++) {
            //variable como contador de numeros 
            int count = 0;
            //Inicializador de la tercera setencia de control for
            for (int j = 1; j <= var2; j++) {
                //Sentencia if de modulo i de j para saber numeros primos 
                if (i % j == 0) {
                    //Contador en aumento
                    count++;
                }
            }
            //Sentencia if 
            if (count == 2) {
                System.out.println("El numero es primo: " + i);
            } else {//Entonces si no se cumple 
                System.out.println("El numero no es primo: " + i);
            }
        }
    }

}
