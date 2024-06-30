package numeromayor;

import java.util.*;//Libreria

/**
 *
 * @author Erick Muke
 */
public class NumeroMayor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner kb = new Scanner(System.in);//Inicializacion del metodo Scanner 

        int a, b, c = 0;

        System.out.println("-------------------------Bienvenido-------------------------");

        System.out.println("Ingrese el primer numero que desee: ");//Dato uno
        a = kb.nextInt();
        System.out.println("Ingrese el segundo numero que desee: ");//Dato dos
        b = kb.nextInt();
        System.out.println("Ingrese el tercer numero que desee: ");//Dato tres 
        c = kb.nextInt();

        if (a > b && a > c) {//Primera condicion de variable a
            System.out.println("El numero mayor es: " + a);
        }
        if (b > a && b > c) {//Segunda condicion de variable b
            System.out.println("El numero mayor es: " + b);
        }

        if (c > a && c > b) {//Tercera condicion de variable c
            System.out.println("El  numero mayor es: " + c);
        }

    }

}

