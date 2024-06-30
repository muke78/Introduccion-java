package numerodelasuerte;

import java.util.*;//Libreria

/**
 *
 * @author Erick Muke
 */
public class NumeroDeLaSuerte {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner kb = new Scanner(System.in);//Inicializacion del metodo Scanner

        int dia, mes, año, ci1, total, ci2, ci3, ci4, total2 = 0;//Inicializacion e las variables enteras 

        System.out.println("----------------------Bievenido----------------------");

        System.out.println("Ingrese su dia de nacimiento: ");//Dato dia 
        dia = kb.nextInt();
        System.out.println("Ingrese el mes en el que nacio: ");//Dato mes
        mes = kb.nextInt();
        System.out.println("Ingrese el año en que nacio: ");//Dato año
        año = kb.nextInt();

        total = dia + mes + año;//Suma de dia mes y año

        ci1 = total / 1000;//Primera cifra del numero
        ci2 = total / 100 % 10;//Segunda cifra de el numero
        ci3 = total / 10 % 10;//Tercera cifra del numero
        ci4 = total % 10;//Cuarta cifra del numero

        total2 = ci1 + ci2 + ci3 + ci4;//Suma de cada numero resultante de dia mes y año

        System.out.println("Su numero de la suerte es: " + total2);//Impresion del resultado 

    }

}
