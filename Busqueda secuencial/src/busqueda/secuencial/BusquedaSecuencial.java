package busqueda.secuencial;

import java.util.Scanner;

public class BusquedaSecuencial {

    public static void main(String[] args) {
        Scanner KB = new Scanner(System.in);
        int h;
        String M, O;
        System.out.println("BÚSQUEDA SECUENCIAL\n");
        System.out.println("Escribe la palabra que quieras: ");
        M = KB.next();
        System.out.println("¿Que letra quieres buscar? ");
        O = KB.next();
        char[] vector = M.toCharArray();
        for (h = 0; h < M.length(); h++) {
            String let = String.valueOf(vector[h]);
            if (O.equalsIgnoreCase(let)) {
                System.out.println("La letra " + O + " se encuentra en la posición " + (h));
            }

        }
    }

}