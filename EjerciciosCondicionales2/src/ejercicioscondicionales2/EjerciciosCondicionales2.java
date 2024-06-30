/*
 * Objetivo: Recibe Retorna
 * Autor: Erick Gonzalez Rivera
 * Fecha:24/10/2019
 */
package ejercicioscondicionales2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/**
 *
 * @author Muke
 */
public class EjerciciosCondicionales2 {

    static int a = 0;
    static String menu = "";
    static boolean v;
    static float cant = (float) 0.0;
    static float total = (float) 0.0;
    static float cant1 = (float) 0.0;
    static String prenda = "";
    static String color = null;
    static String marca = null;
    static int clave;
    static int costo;

    static BufferedReader funcion = new BufferedReader(new InputStreamReader(System.in));//Buffer necesario en ciclo menu
    static Scanner kb = new Scanner(System.in);//Scanner

    public static void calificacion() throws IOException {
        switch (menu) {
            case "2":
            case "CASO CALIFICACION":
            case "caso calificacion":
                String nombre = "";
                float cal = 0,
                 cal1 = 0,
                 cal2 = 0,
                 cal3 = 0,
                 suma = 0;
                System.out.println("\033[036m-----------------Caso Calificacion-------------------");
                System.out.println("\033[036m-----------Ingresa tu Nombre-----------------");
                nombre = funcion.readLine();

                do {
                    v = false;
                    try {
                        System.out.println("Ingresa una calificacion");
                        cal1 = kb.nextInt();
                        while (cal1 <= -1 || cal1 >= 11) {
                            System.out.println("\033[031mSolo se permiten numeros del 1 al 10");
                            System.out.println("Ingresa una calificacion");
                            cal1 = kb.nextInt();
                        }

                        System.out.println("Ingresa una calificacion");
                        cal2 = kb.nextInt();
                        while (cal2 <= -1 || cal2 >= 11) {
                            System.out.println("\033[031mSolo se permiten numeros del 1 al 10");
                            System.out.println("Ingresa una calificacion");
                            cal2 = kb.nextInt();
                        }
                        System.out.println("Ingresa una calificacion");
                        cal3 = kb.nextInt();
                        while (cal3 <= -1 || cal3 >= 11) {
                            System.out.println("\033[031mSolo se permiten numeros del 1 al 10");
                            System.out.println("Ingresa una calificacion");
                            cal3 = kb.nextInt();
                        }
                    } catch (Exception e) {
                        System.out.println("Hubo un error solo se aceptan numeros");
                        v = true;
                        kb.next();

                    }
                } while (v);
                suma = cal1 + cal2 + cal3;
                float promedio;
                promedio = suma / (3);
                if (promedio > 7) {//Segundo if
                    System.out.println("Si aprobaste");
                } else {//Condicion else
                    System.out.println("No aprobaste");
                }//Se cierra condicion else
                System.out.println("Tu nombre es: " + nombre + " tu promedio es de: " + promedio);
                a = 1;
                break;

        }
    }

    public static void descuento() {
        switch (menu) {
            case "3":
            case "CASO DESCUENTO":
            case "caso descuento":
                if (cant1 > 1000) {//Primer if
                    total = (float) (cant1 * 0.20);
                    System.out.println("El resultado es: " + total + " Y el descuento es del 20%");
                } else {//Condicion else
                    System.out.println("El resultado es: " + cant1 + " No tuvo descuento");
                }//Cierre else
                a = 1;
                break;
        }
    }

    public static void descuento2(String prenda, String color, String marca, int clave, int costo) {
        switch (menu) {
            case "4":
            case "CASO DESCUENTO 2":
            case "caso descuento 2":
                if (clave == 01) {
                    costo = (int) (costo * 0.10);
                }
                if (clave == 02) {
                    costo = (int) (costo * 0.20);
                }
                resultado(prenda, color, marca, clave, costo);
                break;

        }
    }

    public static void resultado(String prenda, String color, String marca, int clave, int costo) {
        System.out.println("La prenda que elejiste fue " + prenda + " el color es " + color
                + " la marca es " + marca + " la clave es " + "0" + clave + " y el costo es " + costo);
    }

    public static void salir() {

        switch (menu) {
            case "5":
            case "salir":
            case "SALIR":
            case "Salir":
                System.out.println("Espero regreses pronto");
                System.exit(0);

                break;

        }
    }

    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        do {//Apartura del ciclo menu
            System.out.println("\033[036m•••••••••Selecciona la Opcion••••••••••");
            System.out.println("\n1) CASO INVERSION");
            System.out.println("2) CASO CALIFICACION");
            System.out.println("3) CASO DESCUENTO");
            System.out.println("4) CASO DESCUENTO 2");
            System.out.println("\033[032m(5)SALIR");
            menu = funcion.readLine();
            switch (menu) {
                case "1":
                    int cantidad = 0;
                    System.out.println("\033[036m-----------------Caso Inversion-------------------");
                    System.out.println("Ingresa la cantidad: ");
                    System.out.println("\033[036mSiempre que sea mayor a 10'000 se invertira ");
                    cantidad = kb.nextInt();

                    System.out.println("El interes es de: " + cantidad);
                    if (cantidad >= 10000) {//Primer if 
                        System.out.println("Invertir");
                        cantidad = (int) (cantidad * 0.32);
                    } else {//Primer else
                        System.out.println("No invertir");
                    }

            }
            calificacion();
            switch (menu) {
                case "3":
                case "CASO DESCUENTO":
                case "caso descuento":
                    System.out.println("\033[036m-----------------------Caso Descuento--------------------------");
                    do {
                        v = false;
                        try {
                            System.out.println("Ingrese una cantidad: ");
                            cant1 = kb.nextFloat();
                        } catch (Exception e) {
                            System.out.println("Solo se permiten numeros");
                            v = true;
                            kb.next();
                        }
                    } while (v);

                    descuento();
                    break;
            }

            switch (menu) {
                case "4":
                case "CASO DESCUENTO 2":
                case "caso descuento 2":
                    System.out.println("\033[036m-----------------------Caso Descuento2--------------------------");
                    System.out.println("\033[036mLa clave 01 tendra un descuento del 10% y la clave 02 tendra un descuento del 20%");
                    String prenda = null;
                    System.out.println("Ingrese que prenda eligio: ");
                    prenda = kb.nextLine();
                    System.out.println("Ingrese el color de la prenda que eligio: ");
                    color = kb.nextLine();
                    System.out.println("Ingrese la marca de la prenda que escogio: ");
                    marca = kb.nextLine();
                    do {
                        v = false;
                        try {
                            System.out.println("Ingrese la clave del producto: ");
                            clave = kb.nextInt();
                        } catch (Exception e) {
                            System.out.println("Hubo un error solo se aceptan numeros");
                            v = true;
                            kb.next();
                        }
                    }while(v);
                    System.out.println("Ingrese el COSTO de la prenda que escogio: ");
                    costo = kb.nextInt();

                    descuento2(prenda, color, marca, clave, costo);

                    break;
            }

            salir();

        } while (a != 5);

    }

}
