package candidatosvotaciones;

import java.util.*;

/**
 *
 * @author Erick Muke
 */
public class CandidatosVotaciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner kb = new Scanner(System.in);

        char o = ' ';
        char a = 'A';
        char b = 'B';
        char c = 'C';
        char a1 = 'a';
        char b1 = 'b';
        char c1 = 'c';

        System.out.println("------------------Bienvenido------------------");

        System.out.println("Ingrese una letra para votar por un cantidato(SOLO SE PERMITE A B C): ");
        o = kb.next().charAt(0);

        if (o == a || o == a1) {
            System.out.println("Votaste por el canditado \033[031mA");
            System.out.println("\033[031mVoto Guardado");
        }

        if (o == b || o == b1) {
            System.out.println("Votaste por el canditado \033[032mB");
            System.out.println("\033[032mVoto Guardado");
        }
        
        if (o == c || o == c1) {
            System.out.println("Votaste por el canditado \033[034mC");
            System.out.println("\033[034mVoto Guardado");
        }else{
            System.out.println("Candidato no encontrado");
        }

    }

}
