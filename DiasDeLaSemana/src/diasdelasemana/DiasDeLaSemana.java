package diasdelasemana;

import java.util.*;//Librerias

/**
 *
 * @author Erick Muke
 */
public class DiasDeLaSemana {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner kb = new Scanner(System.in);//Metodo Scanner inicializado
        //variable donde se va a guardar la palabra ingresada
        String op = " ";
        //Opciones en letra incial mayuscula
        String uno = "Lunes";
        String dos = "Viernes";
        String tres = "Sabado";
        String cua = "Domingo";
        //Opciones en letra incial minuscula
        String uno1 = "lunes";
        String dos1 = "viernes";
        String tres1 = "sabado";
        String cua1 = "domingo";

        System.out.println("--------------Bienvenido-------------");

        System.out.println("Ingrese un dia de la semana: ");//Primera cadena que se pide
        op = kb.nextLine();

        if (op.equals(uno) || op.equals(uno1)) {//Primera comparacion(palabra ingresada es igual a las varaibles uno y uno1) 
            System.out.println("El dia es correcto: " + uno);
        } else if (op.equals(dos) || op.equals(dos1)) {//Segunda comparacion(palabra ingresada es igual a las varaibles dos y dos1) 
            System.out.println("El dia es correcto: " + dos);
        } else if (op.equals(tres) || op.equals(tres1)) {//Tercera comparacion(palabra ingresada es igual a las varaibles tres y tres1)
            System.out.println("El dia es correcto: " + tres);
        } else if (op.equals(cua) || op.equals(cua1)) {//Cuarta comparacion(palabra ingresada es igual a las varaibles cua y cua1)
            System.out.println("El dia es correcto: " + cua);
        } else {//Entonces si ninguna de las anteriores se cumple 
            System.out.println("Opcion no valida");

        }
    }

}
