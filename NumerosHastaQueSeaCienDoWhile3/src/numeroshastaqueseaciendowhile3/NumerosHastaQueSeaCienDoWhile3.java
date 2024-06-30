package numeroshastaqueseaciendowhile3;

import java.util.Scanner;//Libreria

/**
 *
 * @author Erick Muke
 */
public class NumerosHastaQueSeaCienDoWhile3 {

    /**
     * @param args the command line arguments
     */
    //Metodo main
    public static void main(String[] args) {
        // TODO code application logic here
        //Metodo Scanner 
        Scanner kb = new Scanner(System.in);
        //Declaracion de variable entera
        int a = 0;
        //Inicializacion del ciclo Do While
        do {
            //Primer dato a ingresar
            System.out.println("Ingrese un numero menor a 100: ");
            a = kb.nextInt();
            //Condicion que a sea menor que 100
        } while (a < 100);

    }

}
