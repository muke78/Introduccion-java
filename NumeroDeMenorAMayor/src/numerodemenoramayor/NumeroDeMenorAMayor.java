package numerodemenoramayor;

import java.util.*;//Libreria

/**
 *
 * @author Erick Muke
 */
public class NumeroDeMenorAMayor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner kb = new Scanner(System.in);//Metodo Scanner iniciado

        int a, b, c;//Varibles enteras declaradas
        System.out.println("-----------------------Bienvenido-------------------------");

        System.out.println("Primer número: ");//Primer dato
        a = kb.nextInt();
        System.out.println("Segundo numero: ");//Segundo dato
        b = kb.nextInt();
        System.out.println("Tercer numero: ");//Tercer dato
        c = kb.nextInt();

        System.out.println("Los números ordenados de mayor a menor son: ");//Aviso de orden de numeros
        if (a <= b && b <= c) {//Primera condicion 
            System.out.println(" " + a + " " + b + " " + c + " ");
        } else if (a <= c && c <= b) {//Segunda condicion

            System.out.println(" " + a + " " + c + "" + b + "");
        } else if (b <= a && a <= c) {//Tercera condicion

            System.out.println(" " + b + " " + a + " " + c + " ");
        } else if (b <= c && c <= a) {//Cuarta condicion

            System.out.println(" " + b + " " + c + " " + a + " ");
        } else if (c <= a && a <= b) {//Quinta condicion

            System.out.println(" " + c + " " + a + " " + b + " ");

        } else {//Entonces ultima condicion si las demas no se cumplen 
            System.out.println(" " + c + " " + b + " " + a + " ");

        }

    }

}
