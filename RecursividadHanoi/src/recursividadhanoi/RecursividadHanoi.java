package recursividadhanoi;
//Libreria
import java.util.Scanner;

/**
 *
 * @author Erick Muke
 */
public class RecursividadHanoi {

    /**
     * @param args the command line arguments
     */
//    Metodo Main 
    public static void main(String[] args) {
        // TODO code application logic here
//        Metodo Scanner 
        Scanner kb = new Scanner(System.in);
//        Creamos un nuevo metodo para mandarla a llamar en otra parte 
        RecursividadHanoi re = new RecursividadHanoi();
//        Inicializacion de dos variables enteras
        int a, total;
//        Primer dato que se pide para que el usuario decida cual quiere 
        System.out.println("Ingrese el numero de discos que desee: ");
        a = kb.nextInt();
//        Mandamos los datos al nuevo metodo que creamos
        re.TorresHanoi(a, 1, 2, 3);
//        ------------------Opcional-----------------------
//        (opcional)
//         Numero de pasos que se tuvieron que hacer para acabar el algoritmo
        total = (int) Math.pow(2, a) - 1;
        System.out.println("El numero de pasos fue: " + total);
//         ------------------Opcional-----------------------
        System.out.println("Juego terminado");
    }
//    Inicializacion del metodo que creamos TorresHanoi
    public void TorresHanoi(int discos, int torre1, int torre2, int torre3) {
//        Cuando solo se trate de un disco hacer este paso
        if (discos == 1) {
            System.out.println("Mover disco de Torre " + torre1 + " a Torre " + torre3);
        } else { 
//            Mover todas las fichas menos la más grande (n) a la varilla auxiliar
            TorresHanoi(discos - 1, torre1, torre3, torre2);
            System.out.println("Mover disco de Torre " + torre1 + " a Torre " + torre3);
//            Mover todas las fichas restantes, 1...n–1, encima de la ficha grande (n)
            TorresHanoi(discos - 1, torre2, torre1, torre3);
        }
    }

}