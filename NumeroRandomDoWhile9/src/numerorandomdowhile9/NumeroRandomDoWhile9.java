package numerorandomdowhile9;
//Librerias
import java.io.BufferedReader;//Clase de Java para leer el texto de una secuencia de entrada
import java.io.IOException;//Tipo de excepcion por tipos de error
import java.io.InputStreamReader;//Clase para leer bytes
import static java.lang.System.exit;;//Libreria de manera estatica para la sentencia exit

/**
 *
 * @author Erick Muke
 */
public class NumeroRandomDoWhile9 {

    /**
     * @param args the command line arguments
     */
//    Metodo main con una excepcion de error
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
//        Se carga una funcion de leer los datos que se ingresen
        BufferedReader funcion = new BufferedReader(new InputStreamReader(System.in));
//        Declaracipn de variables enteras iniciadas en cero 
        int num = 0, var = 0;
//        Ocupar una funcion matematica para sacar los numeros random 
        num = (int) (Math.random() * 5) + 1;
        
        System.out.println("*Adivina un numero del 1 al 5*");
//       Inicio del ciclo Do While
        do {
//            Si var es mayor o igual a 6 es un numero incorrecto
            if (var >= 6) {
                System.out.println("Numero incorrecto, es mayor a 5");
                exit(0);
            }
//            Lector de datos para que todo lo que se ingrese lo leea
            var = Integer.parseInt(funcion.readLine());
//            Si var es igual al numero ingresado
            if (var == num) {
                System.out.println("!FELICIDADES! ese es el numero = " + num);
//                Se restablecen los datos 
                num = 0;
                var = 0;
//               Entonces
            } else {
//                Si var es menor a num
                if (var < num) {
                    System.out.println("Escribe un numero mayor");
                } else {//Entonces
//                        Si var es mayor a numero
                    if (var > num) {
                        System.out.println("Escribe un numero menor");
                    }
                }

            }
//            Asignacion de numero tiene que ser mayor a cero 
        } while (num > 0);

    }

}