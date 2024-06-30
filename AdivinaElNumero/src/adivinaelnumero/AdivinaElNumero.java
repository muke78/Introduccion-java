/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adivinaelnumero;

/**
 *
 * @author Erick Muke
 */
import java.io.*;

public class AdivinaElNumero {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        //TODO code application logic here
        BufferedReader funcion = new BufferedReader(new InputStreamReader(System.in));
        int a = 0;
        do {
            int numero = 0;
            String menu = "";
            int variable = 0;
            int intentos = 1;
            System.out.println("•••••••••Adivina el numero••••••••••");
            System.out.println("\n1) Basico       (1-10)");
            System.out.println("2) Intermedio   (1-100)");
            System.out.println("3) Avanzado     (1-1000)");
            System.out.println("4) God Mode     (1.10000)");
            System.out.println("5) Salir");
            menu = funcion.readLine();
            switch (menu) {
                case "1":
                    numero = (int) (Math.random() * 10) + 1;
                    System.out.println("-----Nivel Basico-----");
                    System.out.println("*Adivina un numero del 1 al 10*");
                    System.out.println("\n");
                    System.out.println("Reglas: Solo tienes 6 intentos");
                    while (intentos <= 6) {
                        variable = Integer.parseInt(funcion.readLine());
                        if (variable == numero) {
                            System.out.println("!FELICIDADES! ese es el numero= " + numero);
                            System.out.println("Intentos= " + intentos);
                            numero = 0;
                            variable = 0;
                            intentos = intentos + 6;
                        } else {
                            if (variable < numero) {
                                System.out.println("Escribe un numero mayor");
                            } else {
                                if (variable > numero) {
                                    System.out.println("Escribe un numero menor");
                                }
                            }
                            intentos++;
                            System.out.println("(" + (intentos - 1) + ")Intentalo de nuevo: ");
                        }
                    }
                    a = 1;
                    break;
                case "2":
                    numero = (int) (Math.random() * 100) + 1;
                    System.out.println("-----Nivel Intermedio-----");
                    System.out.println("*Adivina un numero del 1 al 100*");
                    System.out.println("\n");
                    System.out.println("Reglas: Solo tienes 18 intentos");
                    while (intentos <= 18) {
                        variable = Integer.parseInt(funcion.readLine());
                        if (variable == numero) {
                            System.out.println("!FELICIDADES! ese es el numero= " + numero);
                            System.out.println("Intentos= " + intentos);
                            numero = 0;
                            variable = 0;
                            intentos = intentos + 18;
                        } else {
                            if (variable < numero) {
                                System.out.println("Escribe un numero mayor");
                            } else {
                                if (variable > numero) {
                                    System.out.println("Escribe un numero menor");
                                }
                            }
                            intentos++;
                            System.out.println("(" + (intentos - 1) + ")Intentalo de nuevo: ");
                        }
                    }
                    a = 1;
                    break;
                case "3":
                    numero = (int) (Math.random() * 1000) + 1;
                    System.out.println("-----Nivel Avanzado-----");
                    System.out.println("*Adivina un numero del 1 al 1000*");
                    System.out.println("\n");
                    System.out.println("Reglas: Solo tienes 35 intentos");
                    while (intentos <= 35) {
                        variable = Integer.parseInt(funcion.readLine());
                        if (variable == numero) {
                            System.out.println("!FELICIDADES! ese es el numero= " + numero);
                            System.out.println("Intentos= " + intentos);
                            numero = 0;
                            variable = 0;
                            intentos = intentos + 35;
                        } else {
                            if (variable < numero) {
                                System.out.println("Escribe un numero mayor");
                            } else {
                                if (variable > numero) {
                                    System.out.println("Escribe un numero menor");
                                }
                            }
                            intentos++;
                            System.out.println("(" + (intentos - 1) + ")Intentalo de nuevo: ");
                        }
                    }
                    a = 1;
                    break;
                case "4":
                    numero = (int) (Math.random() * 10000) + 1;
                    System.out.println("-----Nivel God Mode-----");
                    System.out.println("*Adivina un numero del 1 al 10000*");
                    System.out.println("\n");
                    System.out.println("Reglas: Solo tienes 70 intentos");
                    while (intentos <= 70) {
                        variable = Integer.parseInt(funcion.readLine());
                        if (variable == numero) {
                            System.out.println("!FELICIDADES! ese es el numero= " + numero);
                            System.out.println("Intentos= " + intentos);
                            numero = 0;
                            variable = 0;
                            intentos = intentos + 70;
                        } else {
                            if (variable < numero) {
                                System.out.println("Escribe un numero mayor");
                            } else {
                                if (variable > numero) {
                                    System.out.println("Escribe un numero menor");
                                }
                            }
                            intentos++;
                            System.out.println("(" + (intentos - 1) + ")Intentalo de nuevo: ");
                        }
                    }
                    a = 1;
                    break;
                case "5":

                    System.out.println("Adios, espero regreses pronto");
                    a = 0;
                    break;
                default:
                    System.out.println("Opcion no valida");
                    a = 1;
                    break;
            }
        } while (a == 1);
    }
}
