package nsueldomaximowhile13;

import java.util.Scanner;//Libreria

/**
 *
 * @author Erick Muke
 */
public class NSueldoMaximoWhile13 {

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
        //Declcracion de una variable entera i que incie en cero 
        int i = 0;
        //Inicializacion del ciclo de control while
        while (i < num) {
            //Segundo dato por introducir
            System.out.println("Introduce la cantidad de los sueldos: ");
            sue = kb.nextInt();
            //Incremento
            i++;
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