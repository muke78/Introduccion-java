package multiplosdosalcincuentawhile2;

/**
 *
 * @author Erick Muke
 */
public class MultiplosDosAlCincuentaWhile2 {

    /**
     * @param args the command line arguments
     */
    //Metodo main
    public static void main(String[] args) {
        // TODO code application logic here
        //Declaracion de variable entera asignandole un valor dos
        int n = 2;
        //Inicializacion del ciclo de control while
        while (n <= 50) {
            //Impresion de los numeros
            System.out.print(n + ",");
            //Progresion de dos en dos
            n += 2;
        }
    }

}