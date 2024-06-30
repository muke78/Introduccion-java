/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edadnacimiento;

/**
 *
 * @author Erick Muke
 */
import java.util.Scanner;

public class EdadNacimiento {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner read = new Scanner(System.in);
        int n, n2, n3;
        String name = "";
        System.out.println("Ingrese su nombre: ");
        name = read.nextLine();
        System.out.println("Ingrese la fecha en la que nacio: ");
        n = read.nextInt();
        System.out.println("Ingrese el año actual: ");
        n2 = read.nextInt();
        n3 = n2 - n;
       

        System.out.println("Su edad " + name + " es de: " + n3); 
        if (n3 >= 18) {
            System.out.println("Eres mayor de edad");
        }else{
            System.out.println("No eres mayor de edad");
        }

    }

}
