package multiplicacionigualaltercero;

import java.util.*;//Libreria

/**
 *
 * @author Erick Muke
 */
public class MultiplicacionIgualAlTercero {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner kb = new Scanner(System.in);//Metodo Scanner inicializado
        int a, b, c;

        System.out.println("-------------------Bienvenido-------------------");

        System.out.println("Ingrese el primer valor: ");//Primer dato ingresado
        a = kb.nextInt();
        System.out.println("Ingrese el segundo valor: ");//Segundo dato ingresado
        b = kb.nextInt();
        System.out.println("Ingrese el tercer numero: ");//Tercer dato ingresado
        c = kb.nextInt();

        if (a * b == c) {//Condicion para ver si se cumple que a * b se igual a c 
            System.out.println("La multiplicacion SI es igual al tercer numero");
        } else {//Si entonces no se cumple
            System.out.println("La multiplicacion NO es igual al tercer numero");
        }
    }

}
