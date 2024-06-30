package tablasdemultiplicarfor14;

/**
 *
 * @author Erick Muke
 */
public class TablasDeMultiplicarFor14 {

    /**
     * @param args the command line arguments
     */
    //Metodo main
    public static void main(String[] args) {
        // TODO code application logic here
        //Bienvenida o titulo
        System.out.println("Tablas de multiplicar: ");
        //Salto de linea
        System.out.println("\n");
        //Inicializacion de la primera sentencia condicional for 
        for (int i = 1; i <= 10; i++) {
            //Salto de linea 
            System.out.println("\n");
            //Titulo de cada tabla de multipliacar
            System.out.println("Tabla de multiplicar del " + i);
            //Inicializacion de la segunda sentencia condicional for
            for (int j = 1; j <= 10; j++) {
                //Impresion del resultado con formato 
                System.out.println(i + " X " + j + " = " + i * j);
            }
        }
    }

}
