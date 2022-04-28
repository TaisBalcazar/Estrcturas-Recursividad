/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package palindrome;

import java.util.Scanner;

/**
 *
 * @author SALA A
 */
public class Palindrome {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        boolean res;
        String palabra;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese la palabra a verificar");
        palabra = entrada.nextLine();
        res = palindromo(palabra);
        if (res == true) {
            System.out.println("Si es palindromo");
        } else {
            if (res == false) {
                System.out.println("No es palindromo");
            }
        }

    }

    public static boolean palindromo(String s) {
        if (s.length() == 0 || s.length() == 1) {
            return true;
        } else {
            if (s.charAt(0) == s.charAt(s.length() - 1)) {
                return palindromo(s.substring(1, s.length() - 1));
            } else {
                return false;
            }

        }

    }
}
