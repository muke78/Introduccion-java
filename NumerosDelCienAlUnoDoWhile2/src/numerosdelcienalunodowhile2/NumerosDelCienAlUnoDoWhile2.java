package numerosdelcienalunodowhile2;

/**
 *
 * @author Erick Muke
 */
public class NumerosDelCienAlUnoDoWhile2 {

    /**
     * @param args the command line arguments
     */
    //Metodo main
    public static void main(String[] args) {
        // TODO code application logic here
        //Variable declarada entera inicializada en cien
        int i = 100;
        //Inicializacion del ciclo Do while
        do {
            //Impresion de los numeros
            System.out.print(i + ",");
            //Decrememto
            i--;
            //Condicion que i sea mayor o igual que uno
        } while (i >= 1);

    }
}