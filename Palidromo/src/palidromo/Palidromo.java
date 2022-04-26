/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package palidromo;

/**
 *
 * @author SALA H
 */
public class Palidromo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String texto = "Ana";
        palidrome(texto);
    }

    public static boolean palidrome(String s) {
        if (s.length() <= 1) {
            return true;
        } else {
            if (s.charAt(0) == s.chartAt(s.length() - 1)) {
                return palidrome(s.substring(1, s.length() - 1));

            } else {
                return false;
            }
        }
    }
}
