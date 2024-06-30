package sumadelprimeroysegundo;

import java.util.Scanner;//Libreria 

/**
 *
 * @author Erick Muke
 */
public class SumaDelPrimeroYSegundo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner kb = new Scanner(System.in);//Inicializacion del Scanner 
        int a, b, c;
        
        System.out.println("------------------------------Bienvenido---------------------------------");
        
        System.out.println("Ingrese el primer dato: ");//Ingresar el primer dato
        a = kb.nextInt();
        System.out.println("Ingrese el segundo dato: ");//Ingresar el segundo dato
        b = kb.nextInt();
        System.out.println("Ingrese el terceer dato: ");//Ingresar el tercer dato
        c = kb.nextInt();
        
        //Condicion if que hace la comprobacion de la suma y el resultado
        if (a + b == c) {
            System.out.println("El tercer numero SI es la suma de los primeros dos numeros");
        }else{//Entonces si no se cumple lo de arriba 
            System.out.println("El tercer numero NO es la suma de los primeros numeros");
        }
    }
    
}
