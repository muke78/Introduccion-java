/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quimica;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Quimica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        BufferedReader funcion = new BufferedReader(new InputStreamReader(System.in));//Buffer necesario en ciclo menu
        Scanner kb = new Scanner(System.in);//Scanner 
        //Numeros cuanticos
        int n;
        int l;
        int m;
        String s = "";
        //Menu
        String menudos = "";
        String menu = "";
        //Cierre de variable menu
        System.out.println("\033[036m------------Elija una opcion-----------------");
        System.out.println("\n(1)Configuracion Electronica");
        System.out.println("(2)Numero de Oxidacion");
        System.out.println("\033[032m(3)Salir");
        menu = funcion.readLine();

        switch (menu) {
            case "1":
            case "configuracion electronica":
            case "CONFIGURACION ELECTRONICA":
            case "Configuracion electronica":
            case "configuracion Electronica":
                System.out.println("\033[036m------------Configuracion Electronica-----------------");
                System.out.println("Ingrese la sustancia quimica");
                System.out.println("\033[035mREGLA:Solo se permite hasta el elemento quimico Fermio(100)");
                menudos = funcion.readLine();

                switch (menudos) {
                    case "1":
                    case "H":
                    case "h":
                    case "Hidrogeno":
                    case "HIDROGENO":
                    case "hidrogeno":
                        System.out.println("\033[036m------------Hidrogeno-----------------");
                        System.out.println("La configuracion electronica del Hidrogeno es: \033[036m1s1 ");
                        System.out.println("Su elemento gas noble es Helio(He)");
                        System.out.println("n: 1");
                        System.out.println("l: 0");
                        System.out.println("m: 0");
                        System.out.println("s: Negativo -1/2");
                        break;

                    case "2":
                    case "Li":
                    case "li":
                    case "Litio":
                    case "LITIO":
                    case "litio":
                        System.out.println("\033[036m------------Litio-----------------");
                        System.out.println("La configuracion electronica del Litio es: (\033[036m1s2,2s1)");
                        System.out.println("Su elemento gas noble es Helio(He)");
                        System.out.println("n: 2");
                        System.out.println("l: 0");
                        System.out.println("m: 0");
                        System.out.println("s: Negativo -1/2");
                        break;

                    case "3":
                    case "Na":
                    case "na":
                    case "Sodio":
                    case "SODIO":
                    case "sodio":
                        System.out.println("\033[036m------------Sodio-----------------");
                        System.out.println("La configuracion electronica del Sodio es: (\033[036m1s2,2s2,2p6,3s1)");
                        System.out.println("Su elemento gas noble es Neon(Ne)");
                        System.out.println("n: 3");
                        System.out.println("l: 0");
                        System.out.println("m: 0");
                        System.out.println("s: Positivo +1/2");
                        break;

                    case "4":
                    case "K":
                    case "k":
                    case "Potasio":
                    case "POTASIO":
                    case "potasio":
                        System.out.println("\033[036m------------Potasio-----------------");
                        System.out.println("La configuracion electronica del Potasio es: (\033[036m1s2,2s2,2p6,3s2,3p6,4s1)");
                        System.out.println("Su elemento gas noble es Argon(Ar)");
                        System.out.println("n: 4");
                        System.out.println("l: 0");
                        System.out.println("m: 0");
                        System.out.println("s: Negativo -1/2");
                        break;

                    case "5":
                    case "Rb":
                    case "rb":
                    case "Rubidio":
                    case "RUBIDIO":
                    case "rubidio":
                        System.out.println("\033[036m------------Rubidio-----------------");
                        System.out.println("La configuracion electronica del Rubidio es: (\033[036m1s2,2s2,2p6,3s2,3p6,4s2,3d10,4p6,5s1)");
                        System.out.println("Su elemento gas noble es Kripton(Kr)");
                        System.out.println("n: 5");
                        System.out.println("l: 0");
                        System.out.println("m: 0");
                        System.out.println("s: Negativo -1/2");
                        break;

                    case "6":
                    case "Cs":
                    case "cs":
                    case "Cesio":
                    case "CESIO":
                    case "cesio":
                        System.out.println("\033[036m------------Cesio-----------------");
                        System.out.println("La configuracion electronica del Cesio es: (\033[036m1s2,2s2,2p6,3s2,3p6,4s2,3d10,4p6,5s2,4d10,5p6,6s1)");
                        System.out.println("Su elemento gas noble es Xenon(Xe)");
                        System.out.println("n: 6");
                        System.out.println("l: 0");
                        System.out.println("m: 0");
                        System.out.println("s: Negativo -1/2");
                        break;

                    case "7":
                    case "Fr":
                    case "fr":
                    case "Francio":
                    case "FRANCIO":
                    case "francio":
                        System.out.println("\033[036m------------Francio-----------------");
                        System.out.println("La configuracion electronica del Francio es: (\033[036m 1s2,2s2,2p6,3s2,3p6,4s2,3d10,4p6,5s2,4d10,5p6,6s2,4f14,5d10,6p6,7s1)");
                        System.out.println("Su elemento gas noble es Radon(Rn)");
                        System.out.println("n: 7");
                        System.out.println("l: 0");
                        System.out.println("m: 0");
                        System.out.println("s: Negativo -1/2");
                        break;

                }//Se cierra el segundo menu
                break;
        }//Se cierra el primer menu
    }

}
