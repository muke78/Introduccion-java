package letrasxy;

import java.util.*;//Libreria 

/**
 *
 * @author Erick Muke
 */
public class LetrasXY {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner kb = new Scanner(System.in);//Inicializacion del Scanner 
        char a;//Declaracion de la variable char

        System.out.println("------------------------Bienvenido--------------------------");

        System.out.println("Ingrese solo las letras X o Y: ");//Primer dato que se ingresa 
        a = kb.next().charAt(0);//Variable guardada en a

        //Condicion aprentada como switch 
        /*switch (a) {
            case 'x':
                System.out.println(" " + a);
                break;
            case 'X':
                System.out.println(" " + a);
                break;
            case 'y':
                System.out.println(" " + a);
                break;
            case 'Y':
                System.out.println(" " + a);
                break;
            default:
                System.out.println("Esa opcion no existe");
                break;
        }
         */
        if ('x' == a || 'X' == a) {//Condicion inicada if comparando valores X,x solamente 
            System.out.println("Es una letra correcta: " + a);

        } else if ('y' == a || 'Y' == a) {//Entonces si comprando valores Y,y solamente
            System.out.println("Es una letra correcta: " + a);
        } else {//Entonces
            System.out.println("Opcion no valida");//Ninguna de las anteriores(No es valido)
        }

    }

}
