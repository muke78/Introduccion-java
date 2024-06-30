package intervalosprimoswhile6;

import java.util.Scanner;//Libreria

/**
 *
 * @author Erick Muke
 */
public class IntervalosPrimosWhile6 {

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

        System.out.println("Ingrese el primer valor del intervalo: ");
        var = kb.nextInt();
        //Primer dato a ingresar del intervalo
        //Segundo dato para el fin del intervalo
        System.out.println("Ingrese el ultimo valor del intervalo: ");
        var2 = kb.nextInt();
        //Declaracion de Una variable entera llenandola con lo que ingreso el usuario
        int i = var;
        //Inicializacion del ciclo de control while
        while (i <= var2) {
            //Impresion del resultado
            System.out.print(i + " ");
            //Progresion
            i++;
        }
        //Salto de linea
        System.out.println("\n");
        //Declaracion de una variable entera llenandola con lo que ingreso el usuario
        i = var;
        //Inicializacion del ciclo de control while
        while (i <= var2) {
            //Declaracion de variables enteras
            int a = 0;
            int b = 0;
             //Inicializacion del segundo ciclo de control while
            while (a != var2) {
                //Progresion
                a++;
                //Estructura de control if modulo de un numero
                if (i % a == 0) {
                    //Progresion
                    b++;
                }
            }
            //Segunda estructura de control if modulo de un numero
            if (b == 2) {
                //Si se cumple
                System.out.println("Es un numero primo: " + i);
            } else {
                //SI no se cumple
                System.out.println("No es un numero primo: " + i);
            }
            //Progresion de i 
            i++;
        }
    }

}