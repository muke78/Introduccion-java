package cinconumerosmayormenor;
                      
import java.util.*;//Libreria        

/**
 *
 * @author Erick Muke
 */
public class CincoNumerosMayorMenor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner kb = new Scanner(System.in);//Inicializacion del Scanner                           
        float a, b, c, d, e;

        System.out.println("-----------------------------Bienvenido-------------------------");

        System.out.println("Ingrese el primer numero: ");//Primer dato que se debe de ingresar 
        a = kb.nextFloat();
        System.out.println("Ingrese el segundo numero: ");//Segundo dato que se debe ingresar 
        b = kb.nextFloat();
        System.out.println("Ingrese el tercer numero: ");//Tercer dato que se debe ingresar 
        c = kb.nextFloat();
        System.out.println("Ingrese el cuarto numero: ");//Cuarto dato que se debe ingresar 
        d = kb.nextFloat();
        System.out.println("Ingrese el quinto numero: ");//Quinto dato que se debe ingresar 
        e = kb.nextFloat();

        //Condicion de mayor que con todas las combinaciones posibles
        if (a > b && a > c && a > d && a > e) {
            System.out.println("El numero mayor es: " + a);
        } else if (b > a && b > c && b > d && b > e) {
            System.out.println("El numero mayor es: " + b);
        } else if (c > a && c > b && c > d && c > e) {
            System.out.println("EL numero mayor es: " + c);
        } else if (d > a && d > b && d > c && d > e) {
            System.out.println("El numero mayor es: " + d);
        } else if (e > a && e > b && e > c && e > d) {
            System.out.println("El numero mayor es: " + e);
        }
        //Condicion de menor que con todas las combinaciones posibles
        if (a < b && a < c && a < d && a < e) {
            System.out.println("El numero menor es: " + a);
        } else if (b < a && b < c && b < d && b < e) {
            System.out.println("El numero menor es: " + b);
        } else if (c < a && c < b && c < d && c < e) {
            System.out.println("EL numero menor es: " + c);
        } else if (d < a && d < b && d < c && d < e) {
            System.out.println("El numero menor es: " + d);
        } else if (e < a && e < b && e < c && e < d) {
            System.out.println("El numero menor es: " + e);
        }

    }

}
