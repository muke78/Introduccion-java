package tablasdemultplicarwhile14;

/**
 *
 * @author Erick Muke
 */
public class TablasDeMultplicarWhile14 {

    /**
     * @param args the command line arguments
     */
    //Metodo main
    public static void main(String[] args) {
        // TODO code application logic here
        //Bienvenida o titulo
        System.out.println("Tablas de multiplicar: ");
        //Declaracion de una variable entera i que inicie en 1
        int i = 1;
        //Inicializacion del ciclo de control while
        while (i < 10) {
            //Salto de linea 
            System.out.println("\n");
            //Incremento
            i++;
            //Titulo de cada tabla de multipliacar 
            System.out.println("Tabla de multiplicar del " + i);
            //Declaracion de una variable entera j que empiece en 1
            int j = 1;
            //Inicializacion del ciclo de control while
            while (j < 10) {
                //Incrememto 
                j++;
                //Impresion del resultado con formato 
                System.out.println(i + " X " + j + " = " + i * j);
            }
        }
    }

}