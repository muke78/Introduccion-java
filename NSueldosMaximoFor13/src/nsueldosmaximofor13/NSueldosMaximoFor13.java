package nsueldosmaximofor13;

import java.util.Scanner;

/**
 *
 * @author Erick Muke
 */
public class NSueldosMaximoFor13 {

    /**
     * @param args the command line arguments
     */
    //Metodo main
    public static void main(String[] args) {
        // TODO code application logic here
        //Metodo Scanner 
        Scanner kb = new Scanner(System.in);
        //Declaracion de variables enteras 
        int sue, sueMax = 0, num;
        //Primer dato que se tiene que ingresar
        System.out.println("Introduce el numero de sueldos que desea obtener: ");
        num = kb.nextInt();
        //Inicializacion de la primera sentencia for
        for (int i = 0; i < num; i++) {
            //Segundo dato por introducir
            System.out.println("Introduce la cantidad de los sueldos: ");
            sue = kb.nextInt();
            //Condional if
            if (sue > sueMax) {
                //Igualacion de sueldos con el sueldo maximo
                sueMax = sue;
            }
        }
        //Impresion del resultado final
        System.out.println("El sueldo maximo es: " + sueMax);
    }

}