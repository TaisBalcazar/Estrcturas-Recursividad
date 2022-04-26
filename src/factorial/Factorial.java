/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package factorial;

import java.util.Scanner;

/**
 *
 * @author SALA H
 */
public class Factorial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        int numero;
        System.out.println("Ingrese el valor factorial");
        numero = entrada.nextInt();
        System.out.printf("El resultado es : %d\n",factorial(numero));

    }

    public static int factorial(int numero) {
        if (numero == 0) {
            return 1;
        } else {
            return numero * factorial(numero - 1);
        }
    }
}
