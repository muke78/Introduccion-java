package paresimpares;

import java.util.*;//Libreria 

/**
 *
 * @author Erick Muke
 */
public class ParesImpares {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner kb = new Scanner(System.in);//Metodo Scanner inicializado

        int a, b = 0;//Declaracion de variables 

        System.out.println("------------------Bienvendio-----------------");

        System.out.println("Ingrese el primer valor: ");//El primer dato se tiene que ingresar 
        a = kb.nextInt();
        System.out.println("Ingrese el segundo valor: ");//El segundo dato se tiene que ingresar 
        b = kb.nextInt();

        if (a % 2 == 0) {//Primera condicion para la variable a
            System.out.println("Es par: " + a);
        } else {//Si no se cumple la primera condicion
            System.out.println("No es par: " + a);
        }
        if (b % 2 == 0) {//Segunda condicion para la variable b
            System.out.println("Es par: " + b);
        } else {//Si no se cumple la primera condicion
            System.out.println("No es par: " + b);
        }
    }

}
