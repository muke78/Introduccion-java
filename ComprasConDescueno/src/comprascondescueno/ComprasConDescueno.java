package comprascondescueno;

import java.util.*;//Libreria 

/**
 *
 * @author Erick Muke
 */
public class ComprasConDescueno {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {//Metodo main
        // TODO code application logic here
        Scanner kb = new Scanner(System.in);//Inicializacion del metodo Scanner 

        float a, b, total, re1, re2 = 0;//Inicializacion de variables flotantes 

        System.out.println("-----------------------Bienvenido--------------------------");

        System.out.println("Ingrese la cantidad de articulos que desea comprar: ");//Datos que se desean comprar 
        a = kb.nextInt();
        System.out.println("Cual es el costo de la compra?: ");//Datos del costo que se pide
        b = kb.nextInt();

        total = a * b;//Operacion para multiplicar el costo por la cantidad

        if (a <= 10) {//Primera condicion de if(la cantidad de compra sea menor o igual)
            System.out.println("A su compra se le va a aplicar un 15%");

            re1 = (float) (total * 0.15);//Operacion de descuento
            re2 = total - re1;//Operacion de resta del descuento y el resultado del precio

            System.out.println("EL resultado es: " + re2);//Resultado de el primer condicional if

        }

        if (a > 10) {//Segunda condicion de if(la cantidad de compra sea mayor a 10)
            System.out.println("A su compra se le va a aplicar un 20%");

            re1 = (float) (total * 0.20);//Operacion de descuento
            re2 = total - re1;//Operacion de resta del descuento y el resultado del precio

            System.out.println("EL resultado es: " + re2);//Resultado de el segundo condicional if
        }

    }

}
