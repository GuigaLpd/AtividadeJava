/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exerciciosFOR;
import java.util.Scanner;
/**
 *
 * @author Administrador
 */
public class ex29 {
        public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("digite um número: ");
        int num = input.nextInt();

        int contador = 0;

        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                contador++;
            }
        }
        if (contador == 2) {
            System.out.println(num + " é primo");
        } else {
            System.out.println(num + " não é primo");
        }

 }
}