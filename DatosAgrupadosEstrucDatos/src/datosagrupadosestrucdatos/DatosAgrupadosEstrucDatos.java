package datosagrupadosestrucdatos;

import java.util.Scanner;
import java.util.Stack;


public class DatosAgrupadosEstrucDatos {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        String entrada = kb.next();
        Stack<Character> p = new <Character> Stack();
        int i = 0;
        int tam = entrada.length();
        while (i < tam) {
            if (entrada.charAt(i) == '(') {
                p.push('(');
            } else {
                if (p.isEmpty()) {
                    break;
                }else{
                    p.pop();
                }
            }

            i++;
        }
         while (i < tam) {
            if (entrada.charAt(i) == '[') {
                p.push('[');
            } else {
                if (p.isEmpty()) {
                    break;
                }else{
                    p.pop();
                }
            }

            i++;
        }
          while (i < tam) {
            if (entrada.charAt(i) == '{') {
                p.push('{');
            } else {
                if (p.isEmpty()) {
                    break;
                }else{
                    p.pop();
                }
            }

            i++;
        }
        if (p.isEmpty()& i==tam) {
            System.out.println("Correcto");
        }else{
            System.out.println("Incorrecta");
        }

    }
}
