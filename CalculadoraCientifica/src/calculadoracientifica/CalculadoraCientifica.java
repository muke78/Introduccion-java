/*
Objetivo Imprimir el nombre que nos de en la consola
Autor:Erick Miguel Gonzalez Rivera
Fecha:2/11/2019
 */
package calculadoracientifica;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/**
 *
 * @author Erick Muke
 */
public class CalculadoraCientifica {

    static float a;
    static float b;
    static float total;

    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        BufferedReader funcion = new BufferedReader(new InputStreamReader(System.in));
        Scanner kb = new Scanner(System.in);
        String menu = null;

        int m = 0;

        do {
            System.out.println("---------------Calculadora Cientifica---------------------");
            System.out.println("(1)Suma");
            System.out.println("(2)Resta");
            System.out.println("(3)Multiplicacion");
            System.out.println("(4)Division");
            System.out.println("(5)Potencia");
            System.out.println("(6)Raiz Cuadrada");
            System.out.println("(7)Factorial");
            System.out.println("(8)Porcentaje");
            System.out.println("(9)Seno");
            System.out.println("(10)Coseno");
            System.out.println("(11)Tangente");
            System.out.println("(12)Logaritmo Natural");
            System.out.println("(13)Logaritmo");
            System.out.println("(14)PI");
            System.out.println("(15)e");
            System.out.println("(16)Potencia e");
            System.out.println("...............Elija el que desee.........................");
            menu = funcion.readLine();

            switch (menu) {
                case "1":
                case "Suma":
                case "suma":
                case "SUMA":
                    System.out.println("---------------Suma---------------------");
                    System.out.println("Ingrese el primer valor: ");
                    a = kb.nextFloat();
                    System.out.println("Ingrese el segundo valor: ");
                    b = kb.nextFloat();
                    total = a + b;
                    System.out.println("El resultado es: " + total);
                    m = 1;
                    break;
                case "2":
                case "Resta":
                case "resta":
                case "RESTA":
                    System.out.println("----------------Resta---------------------");
                    System.out.println("Ingrese el primer valor: ");
                    a = kb.nextFloat();
                    System.out.println("Ingrese el segundo valor: ");
                    b = kb.nextFloat();
                    total = a - b;
                    System.out.println("El resultado es: " + total);
                    m = 1;
                    break;
                case "3":
                case "Multiplicacion":
                case "multiplicacion":
                case "MULTIPLICACION":
                    System.out.println("----------------Multiplicacion---------------------");
                    System.out.println("Ingrese el primer valor: ");
                    a = kb.nextFloat();
                    System.out.println("Ingrese el segundo valor: ");
                    b = kb.nextFloat();
                    total = a * b;
                    System.out.println("El resultado es: " + total);
                    m = 1;
                    break;
                case "4":
                case "Division":
                case "division":
                case "DIVISION":
                    System.out.println("----------------Division---------------------");
                    System.out.println("Ingrese el primer valor: ");
                    a = kb.nextFloat();
                    System.out.println("Ingrese el segundo valor: ");
                    b = kb.nextFloat();
                    total = a / b;
                    System.out.println("El resultado es: " + total);
                    m = 1;
                    break;
                case "5":
                case "Potencia":
                case "potencia":
                case "POTENCIA":
                    System.out.println("----------------Potencia---------------------");
                    System.out.println("Ingrese el primer valor: ");
                    a = kb.nextFloat();
                    System.out.println("Ingrese el valor de la potencia: ");
                    b = kb.nextFloat();
                    total = (float) Math.pow(a, b);
                    System.out.println("El resultado es: " + total);
                    m = 1;
                    break;
                case "6":
                case "Raiz Cuadrada":
                case "raiz cuadrada":
                case "raiz":
                case "Raiz":
                case "RAIZ":
                case "RAIZ CUADRADA":
                    System.out.println("----------------Raiz Cuadrada---------------------");
                    System.out.println("Ingrese el valor: ");
                    a = kb.nextFloat();

                    total = (float) Math.sqrt(a);
                    System.out.println("El resultado es: " + total);
                    m = 1;
                    break;
                case "7":
                case "Factorial":
                case "factorial":
                case "FACTORIAL":
                    long h;
                    long factorial = 1;
                    System.out.println("----------------Factorial---------------------");
                    System.out.println("Ingrese el valor: ");
                    h = (long) kb.nextFloat();
                    for (int i = (int) h; i > 0; i--) {
                        factorial = (long) (factorial * i);
                    }
                    System.out.println("El factorial de " + a + " es: " + factorial);
                    m = 1;
                    break;
                case "8":
                case "Porcentaje":
                case "porcentaje":
                case "PORCENTAJE":

                    System.out.println("----------------Porcentaje---------------------");
                    System.out.println("Ingrese el primer valor: ");
                    a = kb.nextFloat();
                    System.out.println("Ingrese el porcentaje: ");
                    b = kb.nextFloat();

                    total = a * b;
                    System.out.println("El resultado es: " + total);
                    m = 1;
                    break;
                case "9":
                case "Seno":
                case "seno":
                case "SENO":

                    System.out.println("-----------------Seno--------------------");
                    System.out.println("Ingrese el valor: ");
                    a = kb.nextFloat();
                    double x = Math.toRadians(a);
                    total = (float) Math.sin(x);
                    System.out.println("El resultado es: " + total);
                    m = 1;
                    break;
                case "10":
                case "Coseno":
                case "coseno":
                case "COSENO":

                    System.out.println("----------------Coseno---------------------");
                    System.out.println("Ingrese el valor: ");
                    a = kb.nextFloat();
                    double b = Math.toRadians(a);
                    total = (float) Math.cos(b);
                    System.out.println("El resultado es: " + total);
                    m = 1;
                    break;
                case "11":
                case "Tangente":
                case "tangente":
                case "TANGENTE":

                    System.out.println("----------------Tangente---------------------");
                    System.out.println("Ingrese el valor: ");
                    a = kb.nextFloat();
                    double c = Math.toRadians(a);
                    total = (float) Math.tan(c);
                    System.out.println("El resultado es: " + total);
                    m = 1;
                    break;
                case "12":
                case "Logaritmo Natural":
                case "logaritmo natural":
                case "Natural":
                case "NATURAL":
                case "natural":
                case "LOGARITMO NATURAL":
                    System.out.println("----------------Logaritmo Natural---------------------");
                    System.out.println("Ingrese el valor: ");
                    a = kb.nextFloat();
                    total = (float) Math.log(a);
                    System.out.println("El resultado es: " + total);
                    m = 1;
                    break;
                case "13":
                case "Logaritmo":
                case "logaritmo":
                case "LOGARITMO":

                    System.out.println("----------------Logaritmo---------------------");
                    System.out.println("Ingrese el valor: ");
                    a = kb.nextFloat();
                    total = (float) Math.log10(a);
                    System.out.println("El resultado es: " + total);
                    m = 1;
                    break;
                case "14":
                case "Pi":
                case "pi":
                case "PI":
                    float pi = (float) 3.1415926536;
                    System.out.println("----------------Pi---------------------");
                    System.out.println("Ingrese el valor: ");
                    a = kb.nextFloat();
                    total = a * pi;
                    System.out.println("El resultado es: " + total);
                    m = 1;
                    break;
                case "15":
                case "E":
                case "e":
                    float e = (float) 2.7182818285;
                    System.out.println("----------------E---------------------");
                    System.out.println("Ingrese el valor: ");
                    a = kb.nextFloat();
                    total = a * e;
                    System.out.println("El resultado es: " + total);
                    m = 1;
                    break;
                case "16":
                case "Potencia e":
                case "potencia e":
                case "POTENCIA E":
                    float ex = (float) 2.7182818285;
                    System.out.println("----------------E---------------------");
                    System.out.println("Ingrese el valor: ");
                    a = kb.nextFloat();
                    total = (float) Math.pow(ex, a);
                    System.out.println("El resultado es: " + total);
                    m = 1;
                    break;
                default:
                    System.out.println("Esa opcion no es valida");
                    m = 1;
                    System.out.println("INTENTALO DE NUEVO");
                    break;

            }

        } while (m != 16);

    }

}
