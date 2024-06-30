package sumadenumerosdowhile1;

import java.util.Scanner;//Libreria

/**
 *
 * @author Erick Muke
 */
public class SumaDeNumerosDoWhile1 {

    /**
     * @param args the command line arguments
     */
    
    //Metodo main
    public static void main(String[] args) {
        // TODO code application logic here
        //Metodo Scanner 
        Scanner kb = new Scanner(System.in);
        //Declaracion de variables enteras 
        int a, total = 0;
        //Inicializacion deñ ciclo Do While 
        do {
            //Primer dato a ingresar
            System.out.println("Ingrese un numero: ");
            a = kb.nextInt();
            //Operacion
            total = total + a;
            //Mostrar resultado
            System.out.println("La suma de todos los numeros es: " + total);
            //Condicion para que se termine cuando el usuario ingrese cero
        } while (a != 0);

    }

}