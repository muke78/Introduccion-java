/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioscondicionales;

//Paqueteria
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/**
 *
 * @author Erick Muke
 */
public class EjerciciosCondicionales {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        BufferedReader funcion = new BufferedReader(new InputStreamReader(System.in));//Buffer necesario en ciclo menu
        Scanner kb = new Scanner(System.in);//Scanner 
        int a = 0;
        do {//Apartura del ciclo menu

            String menu = "";
            System.out.println("\033[036m•••••••••Selecciona la Opcion••••••••••");
            System.out.println("\n1) CASO INVERSION");
            System.out.println("2) CASO CALIFICACION");
            System.out.println("3) CASO DESCUENTO");
            System.out.println("4) CASO DESCUENTO 2");
            System.out.println("\033[032m(5)SALIR");
            menu = funcion.readLine();

            switch (menu) {//Apertura del menu (Switch)
                case "1":
                case "CASO INVERSION":
                case "caso inversion":
                    int cantidad = 0;
                    System.out.println("\033[036m-----------------Caso Inversion-------------------");
                    System.out.println("Ingresa la cantidad: ");
                    cantidad = Integer.parseInt(funcion.readLine());
                    float inte = (float) 0.0;
                    cantidad = (int) (cantidad * 0.32);
                    System.out.println("El interes es de: " + cantidad);
                    if (cantidad > 10000) {//Primer if 
                        System.out.println("Invertir");
                    } else {//Primer else
                        System.out.println("No invertir");
                    }
                    a = 1;
                    /*int capital = 0;
                capital = (int) (capital + inte);*/

                    break;

                case "2":
                case "CASO CALIFICACION":
                case "caso calificacion":
                    String nombre = "";
                    float cal = 0,
                     suma = 0;
                    System.out.println("\033[036m-----------------Caso Calificacion-------------------");
                    System.out.println("\033[036m-----------Ingresa tu Nombre-----------------");
                    nombre = funcion.readLine();
                    int i;

                    for (i = 0; i < 3; i++) {//Ciclo de calificaciones

                        System.out.println("Ingresa la calificacion: " + i);
                        cal = kb.nextFloat();
                        suma = suma + cal;
                    }//Se cierra for
                    float promedio;
                    promedio = suma / (3);
                    if (promedio > 5.9) {//Segundo if
                        System.out.println("Si aprobaste");
                    } else {//Condicion else
                        System.out.println("No aprobaste");
                    }//Se cierra condicion else
                    System.out.println("Tu nombre es: " + nombre + " tu promedio es de: " + promedio);
                    a = 1;
                    break;

                case "3":
                case "CASO DESCUENTO":
                case "caso descuento":
                    float cant = (float) 0.0;
                    float total = (float) 0.0;
                    float cant1 = (float) 0.0;
                    System.out.println("\033[036m-----------------------Caso Descuento--------------------------");
                    System.out.println("Ingrese una cantidad: ");
                    cant1 = kb.nextFloat();
                    if (cant1 > 1000) {//Primer if
                        total = (float) (cant1 * 0.20);
                        System.out.println("El resultado es: " + total + " Y el descuento es del 20%");
                    } else {//Condicion else
                        System.out.println("El resultado es: " + cant1 + " No tuvo descuento");
                    }//Cierre else
                    a = 1;
                    break;

                case "4":
                case "CASO DESCUENTO 2":
                case "caso descuento 2":
                    String menutres = "";
                    System.out.println("\033[036m•••••••••Selecciona la Opcion••••••••••");
                    System.out.println("\n1) Manera sencilla");
                    System.out.println("2) Manera compleja");
                    menutres = funcion.readLine();
                    switch (menutres) {//Apertura menuTres (Switch)
                        case "1":
                        case "manera sencilla":
                        case "MANERA SENCILLA":
                        case "Manera sencilla":
                        case "manera Sencilla":
                            //Manera sencilla
                            int opcion;

                            float descuento = (float) 0.0;
                            System.out.println("\033[036m--------------Tienda Muke-----------------");
                            System.out.println("Seleccione una opcion: ");
                            System.out.println("\033[035mREGLA:Solo se aceptan numeros");
                            System.out.println("\033[031m(1) Playera");
                            System.out.println("\033[031m(2) Pantalon");
                            opcion = kb.nextInt();

                            if (opcion == 1) {//Primer if
                                double valor1 = 0.10;
                                System.out.println("\033[036m------------Playera-------------");
                                System.out.println("Tiene un costo de $300");
                                descuento = (float) (300 * valor1);
                                System.out.println("El precio que tendra con descuento es: " + descuento + " Su descuento fue de " + valor1);
                            } else if (opcion == 2) {//Condicion else if
                                double valor2 = 0.20;
                                System.out.println("\033[036m------------Pantalon-------------");
                                System.out.println("Tiene un costo de 1500");
                                descuento = (float) (1500 * valor2);
                                System.out.println("El precio que tendra con descuento es: " + descuento + " Su descuento fue de " + valor2);

                            }//Se cierra condicion else if
                            a = 1;
                            break;

                        case "2":
                        case "manera compleja":
                        case "MANERA COMPLEJA":
                        case "Manera COMPLEJA":
                        case "manera Compleja":

                            //Manera Compleja
                            String menudos = "";
                            System.out.println("\033[036m--------------Tienda Muke-----------------");
                            System.out.println("\033[036m•••••••••Seleccione una cosa del inventario••••••••••");
                            System.out.println("\nClave del producto 01");
                            System.out.println("\033[031m PLAYERA");
                            System.out.println("Clave del producto 02");
                            System.out.println("\033[031m PANTALON");
                            System.out.println("Clave del producto 03 ");
                            System.out.println("\033[031m CAMISA");
                            System.out.println("Clave del producto 04");
                            System.out.println("\033[031m BERMUDA");
                            System.out.println("Clave del producto 05");
                            System.out.println("\033[031m ABRIGO");
                            System.out.println("Clave del producto 06");
                            System.out.println("\033[031m CHAMARRA");
                            System.out.println("Clave del producto 07");
                            System.out.println("\033[031m LENTES");
                            System.out.println("Clave del producto 08 ");
                            System.out.println("\033[031m CALCETA");
                            System.out.println("Clave del producto 09");
                            System.out.println("\033[031m SACOS");
                            System.out.println("\033[032mSALIR");
                            System.out.println("\n");
                            menudos = funcion.readLine();

                            switch (menudos) {//Apertura menuDos (Switch)

                                case "01":
                                case "playera":
                                case "PLAYERA":
                                case "Playera":
                                case "playeras":
                                case "PLAYERAS":
                                case "Playeras":
                                    int precio = 300;
                                    double valor = (double) 0.10;
                                    System.out.println("\033[036m------------Playera-------------");
                                    System.out.println("Tiene un costo de $300");
                                    descuento = (float) (precio * valor);
                                    System.out.println("El precio que tendra con descuento es: " + descuento + " Y el descuento se hizo de " + valor);

                                    break;

                                case "02":
                                case "pantalon":
                                case "PANTALON":
                                case "Pantalon":
                                case "pantolones":
                                case "PANTALONES":
                                case "Pantalones":
                                    int precio2 = 1500;
                                    double valor2 = (double) 0.20;
                                    System.out.println("\033[036m------------Pantalon-------------");
                                    System.out.println("Tiene un costo de $1500");
                                    descuento = (float) (precio2 * valor2);
                                    System.out.println("El precio que tendra con descuento es: " + descuento + " Y el descuento se hizo de " + valor2);

                                    break;
                                case "03":
                                case "camisa":
                                case "CAMISA":
                                case "Camisa":
                                case "camisas":
                                case "CAMISAS":
                                case "Camisas":
                                    int precio3 = 2500;
                                    double valor3 = (double) 0.70;
                                    System.out.println("\033[036m------------Camisa-------------");
                                    System.out.println("Tiene un costo de $2500");
                                    descuento = (float) (precio3 * valor3);
                                    System.out.println("El precio que tendra con descuento es: " + descuento + " Y el descuento se hizo de " + valor3);

                                    break;

                                case "04":
                                case "bermuda":
                                case "BERMUDA":
                                case "Bermuda":
                                case "bermudas":
                                case "BERMUDAS":
                                case "Bermudas":
                                    int precio4 = 1000;
                                    double valor4 = (double) 0.80;
                                    System.out.println("\033[036m------------Bermuda-------------");
                                    System.out.println("Tiene un costo de $1000");
                                    descuento = (float) (precio4 * valor4);
                                    System.out.println("El precio que tendra con descuento es: " + descuento + " Y se hizo el descuento de" + valor4);

                                    break;

                                case "05":
                                case "abrigo":
                                case "ABRIGO":
                                case "Abrigo":
                                case "abrigos":
                                case "ABRIGOS":
                                case "Abrigos":
                                    int precio5 = 1300;
                                    double valor5 = (double) 0.70;
                                    System.out.println("\033[036m------------Abrigo-------------");
                                    System.out.println("Tiene un costo de $1300");
                                    descuento = (float) (precio5 * valor5);
                                    System.out.println("El precio que tendra con descuento es: " + descuento + " Y el descuento se hizo de " + valor5);

                                    break;

                                case "06":
                                case "chamarra":
                                case "CHAMARRA":
                                case "Chamarra":
                                case "chamarras":
                                case "CHAMARRAS":
                                case "Chamarras":
                                    int precio6 = 2150;
                                    double valor6 = (double) 0.50;
                                    System.out.println("\033[036m------------Chamarra-------------");
                                    System.out.println("Tiene un costo de $2150");
                                    descuento = (float) (precio6 * valor6);
                                    System.out.println("El precio que tendra con descuento es: " + descuento + " Y el descuento se hizo de " + valor6);

                                    break;

                                case "07":
                                case "lentes":
                                case "LENTES":
                                case "Lentes":
                                case "lente":
                                case "Lente":
                                case "LENTE":
                                    int precio7 = 5000;
                                    double valor7 = (double) 0.75;
                                    System.out.println("\033[036m------------Lentes-------------");
                                    System.out.println("Tiene un costo de $5000");
                                    descuento = (float) (precio7 * valor7);
                                    System.out.println("El precio que tendra con descuento es: " + descuento + " Y el descuento se hizo de " + valor7);

                                    break;

                                case "08":
                                case "calceta":
                                case "CALCETA":
                                case "Calceta":
                                case "calcetas":
                                case "CALCETAS":
                                case "Calcetas":
                                    int precio8 = 350;
                                    double valor8 = (double) 0.85;
                                    System.out.println("\033[036m------------Calcetas-------------");
                                    System.out.println("Tiene un costo de $350");
                                    descuento = (float) (precio8 * valor8);
                                    System.out.println("El precio que tendra con descuento es: " + descuento + " Y el descuento se hizo de " + valor8);

                                    break;

                                case "09":
                                case "sacos":
                                case "SACOS":
                                case "Sacos":
                                case "saco":
                                case "SACO":
                                case "Saco":
                                    int precio9 = 5500;
                                    double valor9 = (double) 0.60;
                                    System.out.println("\033[036m------------Saco-------------");
                                    System.out.println("Tiene un costo de $5500");
                                    descuento = (float) (precio9 * valor9);
                                    System.out.println("El precio que tendra con descuento es: " + descuento + " Y el descuento se hizo de " + valor9);
                                    a = 1;
                                    break;

                                case "5":
                                case "salir":
                                case "SALIR":
                                case "Salir":
                                    System.out.println("Espero regreses pronto");
                                    System.exit(0);

                                    break;

                                default:
                                    System.out.println("Esa opcion no existe");

                                    System.out.println("\n");
                                    break;

                            }//Se cierra segundo switch

                            a = 1;
                            break;
                    }//se cierra tercer switch

                    break;
                case "5":
                case "SALIR":
                case "salir":
                    System.out.println("Hasta pronto :3");
                    System.exit(0);
                    a = 0;

                    break;

                default:
                    System.out.println("Opcion no encontrada");
                    a = 1;
                    System.out.println("\n");
                    break;
            }//Cierre del switch
        } while (a != 5);//Cierre del menu en ciclo

    }//main

}//class

