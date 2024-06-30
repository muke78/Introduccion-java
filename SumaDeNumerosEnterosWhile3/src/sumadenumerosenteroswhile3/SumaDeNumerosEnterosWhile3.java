package sumadenumerosenteroswhile3;

/**
 *
 * @author Erick Muke
 */
public class SumaDeNumerosEnterosWhile3 {

    /**
     * @param args the command line arguments
     */
    //Metodo main
    public static void main(String[] args) {
        // TODO code application logic here
        //Declaracion de variables
        int i = 10, total = 0;
        //Inicializacion del ciclo de control while
        while (i <= 25) {
            //Impresion de la cadena 
            System.out.print(i + " ");
            //Suma del numero con seguundo y el tercero hasta llegar al 25(empieza en 10)
            total = total + i;
            //Progresion 
            i++;

        }
        //Salto de linea 
        System.out.println("\n");
        //Impresion del resultado
        System.out.println("El total de la suma es: " + total);

    }

}