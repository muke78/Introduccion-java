package numerosimapreswhile4;

/**
 *
 * @author Erick Muke
 */
public class NumerosImapresWhile4 {

    /**
     * @param args the command line arguments
     */
    //Metodo main
    public static void main(String[] args) {
        // TODO code application logic here
        //Variables declaradas enteras 
        int a = 0, b = 0;
        //Inicializacion del ciclo de control while
        while (b < 150) {
            //Progresion
            b++;
            //Inicializacion de la sentencia if
            if (b % 2 == 0) {
                //Solo hay una condicion que se cumple
            } else {
                //Impresion de los numeros
                System.out.print(b + " ");
                //Suma de cada uno de los numeros
                a = a + b;
            }

        }
        //Salto de linea
        System.out.println("\n");
        //Impresion de la suma
        System.out.println("La suma de los numeros impares es: " + a);
    }

}
